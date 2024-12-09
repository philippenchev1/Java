package softuni.exam.config.config;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Service;
import softuni.exam.service.AstronomerService;
import softuni.exam.service.ConstellationService;
import softuni.exam.service.StarService;

import javax.xml.bind.JAXBException;
import java.io.IOException;

@Service
public class Init implements CommandLineRunner {
    private final ConstellationService constellationService;
    private final StarService starService;
    private final AstronomerService astronomerService;

    public Init(ConstellationService constellationService, StarService starService, AstronomerService astronomerService) {
        this.constellationService = constellationService;
        this.starService = starService;
        this.astronomerService = astronomerService;
    }

    @Override
    public void run(String... args) throws Exception {
//        initializeConstellations();
//        initializeStars();
//        initializeAstronomers();
//        exportStars();
    }

    private void exportStars() {
        starService.exportStars();
    }

    private void initializeAstronomers() throws IOException, JAXBException {
        astronomerService.importAstronomers();
    }

    private void initializeStars() throws IOException {
        starService.importStars();
    }

    private void initializeConstellations() throws IOException {
        constellationService.importConstellations();
    }
}

