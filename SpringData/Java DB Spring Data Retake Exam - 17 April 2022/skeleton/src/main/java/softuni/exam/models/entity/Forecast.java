package softuni.exam.models.entity;

import org.apache.tomcat.jni.Local;

import javax.persistence.*;
import java.sql.Time;
import java.time.LocalTime;

@Entity
@Table(name = "forecasts")
public class Forecast extends BaseEntity {
//
//•	day of week – enumerated value, one of the following – FRIDAY, SATURDAY, SUNDAY. Cannot be null.
//            •	max temperature – a floating point number. Must be between -20 and 60 (both numbers are INCLUSIVE). Cannot be null.
//            •	min temperature – a floating point number. Must be between -50 and 40 (both numbers are INCLUSIVE). Cannot be null.
//            •	sunrise – time of the sunrise. Cannot be null.
//            •	sunset – time of the sunset. Cannot be null.
//            •	Constraint: The forecasts table has а relation with the cities table.
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private DayOfWeek dayOfWeek;

    @Column(nullable = false)
    private Double maxTemperature;
    @Column(nullable = false)
    private Double minTemperature;

    @Column(nullable = false)
    private LocalTime sunrise;
    @Column(nullable = false)
    private LocalTime sunset;

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

}
