package softuni.exam.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;

@Entity
@Table(name = "countries")
public class Country extends BaseEntity{

//    •	id – accepts integer values, a primary identification field, and an auto incremented field.
//            •	name – accepts char sequence (between 3 to 30 both inclusive). The values are unique in the database. It cannot be nullable.
//            •	capital - accepts char sequence (between 3 to 30 both inclusive). It can be nullable.
//            •	Constraint: The countries table has a relation with the volcanoes table. It can be nullable.


    @Column(name = "name")
    private String name;

    // Getters and setters...

    // Override toString() method to return the country name
    @Override
    public String toString() {
        return name;
    }

    @Column(nullable = true)
    private String capital;

    @OneToMany(mappedBy = "country")
    private Set<Volcano> volcanoes;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public Set<Volcano> getVolcanoes() {
        return volcanoes;
    }

    public void setVolcanoes(Set<Volcano> volcanoes) {
        this.volcanoes = volcanoes;
    }
}
