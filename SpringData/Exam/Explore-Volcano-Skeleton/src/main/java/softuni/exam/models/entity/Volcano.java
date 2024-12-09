package softuni.exam.models.entity;

import softuni.exam.models.enums.VolcanoType;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Set;

@Entity
@Table(name = "volcanoes")
public class Volcano extends BaseEntity{

//    •	id – accepts integer values, a primary identification field, an auto incremented field.
//•	name - accepts char sequence (between 2 to 30 both inclusive). The values are unique in the database. It cannot be nullable.
//            •	elevation - The highest point of the volcano. Accepts only positive numbers. It cannot be nullable.
//            •	volcano type - categorization of the volcanoes. String enumeration, one of the following – CINDER_CONE, STRATOVOLCANO, SHIELD_VOLCANO, LAVA_DOME, CALDERA. It can be nullable.
//            •	is active – accepts a true or false, representing whether the volcano is active or not. It cannot be nullable.
//            •	last eruption – indicates when the last eruption occurred. It can be nullable.
//            •	Constraint: The volcanoes table has a relation with the countries table. It can be nullable.
    @Column(unique = true,nullable = false)
    private String name;
    @Column(nullable = false)
    private int elevation;
    @Enumerated(EnumType.STRING)
    @Column(name = "volcano_type",nullable = true)
    private VolcanoType volcanoType;
    @Column(name = "is_active",nullable = false)
    private Boolean isActive;
    @Column(name = "last_eruption",nullable = true)
    private LocalDate lastEruption;
    @ManyToOne
    @JoinColumn(name = "country_id")
    private Country country;

    @OneToMany(mappedBy = "volcano")
    private Set<Volcanologist> volcanologists;

    public Set<Volcanologist> getVolcanologists() {
        return volcanologists;
    }

    public void setVolcanologists(Set<Volcanologist> volcanologists) {
        this.volcanologists = volcanologists;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getElevation() {
        return elevation;
    }

    public void setElevation(int elevation) {
        this.elevation = elevation;
    }

    public VolcanoType getVolcanoType() {
        return volcanoType;
    }

    public void setVolcanoType(VolcanoType volcanoType) {
        this.volcanoType = volcanoType;
    }

    public Boolean getActive() {
        return isActive;
    }

    public void setActive(Boolean active) {
        isActive = active;
    }

    public LocalDate getLastEruption() {
        return lastEruption;
    }

    public void setLastEruption(LocalDate lastEruption) {
        this.lastEruption = lastEruption;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }


}
