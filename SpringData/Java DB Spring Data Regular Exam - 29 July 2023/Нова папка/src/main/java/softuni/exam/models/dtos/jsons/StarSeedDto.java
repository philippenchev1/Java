package softuni.exam.models.dtos.jsons;

import com.google.gson.annotations.Expose;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

public class StarSeedDto {

//    •	name - accepts char sequence (between 2 to 30 inclusive). The values are unique in the database.
//•	light years - The distance from Earth in light years. Accepts only positive number.
//            •	description - a long and detailed description about the star with a character length value higher than or equal to 6.
//            •	star type - categorization of the stars. String enumeration, one of the following – RED_GIANT, WHITE_DWARF, NEUTRON_STAR
//•	observers – a collection with all the astronomers that are studying the star.

    @Expose
    @NotNull
    @Size(min = 6)
    private String description;
    @Expose
    @NotNull
    @Positive
    private Double lightYears;
    @Expose
    @NotNull
    @Size(min = 2,max = 30)
    private String name;
    @Expose
    @NotNull
    private String starType;
    @Expose
    @NotNull
    private long constellation;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Double getLightYears() {
        return lightYears;
    }

    public void setLightYears(Double lightYears) {
        this.lightYears = lightYears;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStarType() {
        return starType;
    }

    public void setStarType(String starType) {
        this.starType = starType;
    }

    public long getConstellation() {
        return constellation;
    }

    public void setConstellation(long constellation) {
        this.constellation = constellation;
    }
}
