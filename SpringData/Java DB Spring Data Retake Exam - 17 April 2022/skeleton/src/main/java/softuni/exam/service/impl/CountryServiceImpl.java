package softuni.exam.service.impl;

import com.google.gson.Gson;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import softuni.exam.models.dto.CountriesImportDto;
import softuni.exam.models.entity.Country;
import softuni.exam.repository.CityRepository;
import softuni.exam.repository.CountryRepository;
import softuni.exam.service.CountryService;
import softuni.exam.util.ValidationUtils;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;

@Service
public class CountryServiceImpl implements CountryService {
    private static final String COUNTRIES_FILE_PATH = "src/main/resources/files/json/countries.json";
    private final CountryRepository countryRepository;
    private final ValidationUtils validationUtils;
    private final ModelMapper modelMapper;
    private final Gson gson;

    public CountryServiceImpl(CountryRepository countryRepository, ValidationUtils validationUtils, ModelMapper modelMapper, Gson gson) {
        this.countryRepository = countryRepository;
        this.validationUtils = validationUtils;
        this.modelMapper = modelMapper;
        this.gson = gson;
    }

    @Override
    public boolean areImported() {
        return this.countryRepository.count() > 0;
    }

    @Override
    public String readCountriesFromFile() throws IOException {
        return Files.readString(Path.of(COUNTRIES_FILE_PATH));
    }

    @Override
    public String importCountries() throws IOException {
        StringBuilder sb = new StringBuilder();

        Arrays.stream(gson
                        .fromJson(readCountriesFromFile(), CountriesImportDto[].class))
                .filter(countryImportDto -> {
                    boolean isValid = validationUtils.isValid(countryImportDto);

                    Optional<Country> countryByCountryName = countryRepository.findCountriesByCountryName(countryImportDto.getCountyName());
                    if (countryByCountryName.isPresent()){
                        isValid = false;
                    }

                    sb.append(isValid
                                    ? String.format("Successfully imported country %s - %s", countryImportDto.getCountyName()
                                    , countryImportDto.getCurrency())
                                    : "Invalid country")
                            .append(System.lineSeparator());

                    return isValid;
                })
                .map(countryImportDto -> modelMapper.map(countryImportDto, Country.class))
                .forEach(countryRepository::save);

        return sb.toString().trim();
    }


    public Country findCountryByName(String countryName) {

        return countryRepository.findCountriesByCountryName(countryName).orElse(null);
    }


    public Optional<Country> getCountryById(Long countryId) {
        return countryRepository.findById(countryId);
    }

}


