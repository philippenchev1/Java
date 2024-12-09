package softuni.exam.models.dto;

import softuni.exam.util.LocalDateAdapter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.time.LocalDate;

@XmlRootElement(name = "volcanologist")
@XmlAccessorType(XmlAccessType.FIELD)
public class VolcanologistSeedDto {

    //•	first name - accepts char sequence (between 2 to 30 both inclusive). Unique, it can not be nullable.
//•	last name - accepts char sequence (between 2 to 30 both inclusive). Unique, it can not be nullable.
//•	salary - accepts positive number values. It can not be nullable.
//•	age - accepts number values that are between 18 and 80 both inclusive. It can not be nullable.
//•	exploring from - a date in the "yyyy-MM-dd" format. It can be nullable.
//            •	Constraint: The volcanologists table has a relation with volcanoes table. It can be nullable.

    @XmlElement(name = "first_name")
    @Size(min = 2,max = 30)
    private String firstName;
    @XmlElement(name = "last_name")
    @Size(min = 2,max = 30)
    private String lastName;
    @XmlElement
    private Double salary;
    @XmlElement
    @Min(18)
    @Max(80)
    private Integer age;
    @XmlElement(name = "exploring_from")
    @XmlJavaTypeAdapter(LocalDateAdapter.class)
    private LocalDate exploringFrom;
    @XmlElement(name = "exploring_volcano_id")
    private Long volcano;


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

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public LocalDate getExploringFrom() {
        return exploringFrom;
    }

    public void setExploringFrom(LocalDate exploringFrom) {
        this.exploringFrom = exploringFrom;
    }

    public Long getVolcano() {
        return volcano;
    }

    public void setVolcano(Long volcano) {
        this.volcano = volcano;
    }
}
