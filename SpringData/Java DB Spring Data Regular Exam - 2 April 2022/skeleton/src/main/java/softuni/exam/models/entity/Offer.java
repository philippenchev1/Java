package softuni.exam.models.entity;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
@Table(name = "offers")
public class Offer extends BaseEntity{


//	price – accepts a positive number.
//	published on – a date in the "dd/MM/yyyy" format.
//	Constraint: The offers table has a relation with the apartments table.
// Constraint: The offers table has a relation with the agents table.

    @Column(nullable = false)
    private BigDecimal price;

    @Column(nullable = false)
    private Date date;

    @ManyToOne
    @JoinColumn(name = "agent_id")
    private Agent agent;

    @ManyToOne
    @JoinColumn(name = "apartment_id")
    private Apartment apartment;

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public Apartment getApartment() {
        return apartment;
    }

    public void setApartment(Apartment apartment) {
        this.apartment = apartment;
    }
}
