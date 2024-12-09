package softuni.exam.models.entity;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "volcanologists")
public class Volcanologist extends BaseEntity{

//    •	id - accepts integer values, a primary identification field, an auto incremented field.
//•	first name - accepts char sequence (between 2 to 30 both inclusive). Unique, it can not be nullable.
//•	last name - accepts char sequence (between 2 to 30 both inclusive). Unique, it can not be nullable.
//•	salary - accepts positive number values. It can not be nullable.
//•	age - accepts number values that are between 18 and 80 both inclusive. It can not be nullable.
//•	exploring from - a date in the "yyyy-MM-dd" format. It can be nullable.
//            •	Constraint: The volcanologists table has a relation with volcanoes table. It can be nullable.

    @Column(name = "first_name",nullable = false,unique = true)
    private String firstName;
    @Column(name = "last_name",nullable = false,unique = true)
    private String lastName;
    @Column(nullable = false)
    private Double salary;
    @Column(nullable = false)
    private int age;
    @Column(name = "exploring_from",nullable = true)
    private LocalDate exploringFrom;
    @ManyToOne
    @JoinColumn(name = "exploring_volcano_id")
    private Volcano volcano;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public LocalDate getExploringFrom() {
        return exploringFrom;
    }

    public void setExploringFrom(LocalDate exploringFrom) {
        this.exploringFrom = exploringFrom;
    }

    public Volcano getVolcano() {
        return volcano;
    }

    public void setVolcano(Volcano volcano) {
        this.volcano = volcano;
    }
}
