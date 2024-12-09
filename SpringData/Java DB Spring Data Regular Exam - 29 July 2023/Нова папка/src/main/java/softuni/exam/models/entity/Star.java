package softuni.exam.models.entity;

import softuni.exam.models.entity.Astronomer;
import softuni.exam.models.entity.BaseEntity;
import softuni.exam.models.entity.Constellation;
import softuni.exam.models.enums.StarType;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "stars")
public class Star extends BaseEntity {

    private String name;
    private Double lightYears;
    private Constellation constellation;
    private String description;
    private Set<Astronomer> observers = new HashSet<>();
    private StarType starType;



    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    public StarType getStarType() {
        return starType;
    }

    public Star setStarType(StarType dayOfWeek) {
        this.starType = dayOfWeek;
        return this;
    }

    @Column(unique = true, nullable = false)
    public String getName() {
        return name;
    }

    public Star setName(String cityName) {
        this.name = cityName;
        return this;
    }

    @Column(nullable = false)
    public Double getLightYears() {
        return lightYears;
    }

    public Star setLightYears(Double distanceLightYears) {
        this.lightYears = distanceLightYears;
        return this;
    }


    @ManyToOne()
    @JoinColumn(name = "constellation_id")
    public Constellation getConstellation() {
        return constellation;
    }

    public Star setConstellation(Constellation constellation) {
        this.constellation = constellation;
        return this;
    }

    @Column(columnDefinition = "TEXT", nullable = false)
    public String getDescription() {
        return description;
    }

    public Star setDescription(String description) {
        this.description = description;
        return this;
    }

    @OneToMany(mappedBy = "observingStar", fetch = FetchType.EAGER)
    public Set<Astronomer> getObservers() {
        return observers;
    }

    public Star setObservers(Set<Astronomer> observers) {
        this.observers = observers;
        return this;
    }
}
