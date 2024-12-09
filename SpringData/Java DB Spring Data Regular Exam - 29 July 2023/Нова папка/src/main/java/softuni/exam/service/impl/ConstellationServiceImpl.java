package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import org.springframework.validation.ValidationUtils;
import softuni.exam.models.dtos.jsons.ConstellationSeedDto;
import softuni.exam.models.entity.Constellation;
import softuni.exam.repository.ConstellationRepository;
import softuni.exam.service.ConstellationService;
import softuni.exam.util.ValidationUtil;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ConstellationServiceImpl implements ConstellationService {
   private static final String CONSTELLATIONS_FILE_PATH = "src/main/resources/files/json/constellations.json";

    private final ConstellationRepository constellationRepository;
    private final ValidationUtil validationUtil;

    private final ModelMapper modelMapper;
    private final Gson gson;

    public ConstellationServiceImpl(ConstellationRepository constellationRepository, ValidationUtil validationUtil, ModelMapper modelMapper, Gson gson) {
        this.constellationRepository = constellationRepository;
        this.validationUtil = validationUtil;
        this.modelMapper = modelMapper;
        this.gson = gson;
    }

    @Override
    public boolean areImported() {
        return this.constellationRepository.count() > 0;
    }

    @Override
    public String readConstellationsFromFile() throws IOException {
        return Files.readString(Path.of(CONSTELLATIONS_FILE_PATH));
    }

    @Override
    public String importConstellations() throws IOException {
        StringBuilder sb = new StringBuilder();

        List<ConstellationSeedDto> constellationSeedDtoList =
                Arrays.stream(this.gson.fromJson(readConstellationsFromFile(), ConstellationSeedDto[].class))
                        .collect(Collectors.toList());

        for (ConstellationSeedDto constellationSeedDto : constellationSeedDtoList) {
            sb.append(System.lineSeparator());

            if (this.constellationRepository.findByName(constellationSeedDto.getName()).isPresent() ||
            !this.validationUtil.isValid(constellationSeedDto)) {
                sb.append("Invalid constellation");
                continue;
            }

            this.constellationRepository.save(modelMapper.map(constellationSeedDto, Constellation.class));

            sb.append(String.format("Successfully imported constellation %s - %s",constellationSeedDto.getName(),
                    constellationSeedDto.getDescription()));

        }



        return sb.toString().trim();
    }
}
