package softuni.exam.models.dto;

import com.google.gson.annotations.Expose;

import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;


public class CountriesImportDto {

    //•	country name – accepts char sequence (between 2 to 60 inclusive). The values are unique in the database. Cannot be null.
    //•	currency – accepts char sequences (between 2 and 20 inclusive). Cannot be null.
    @Expose
    @Size(min = 2, max = 60)
    private String countyName;
    @Expose
    @Size(min = 2, max = 20)
    private String currency;

    public String getCountyName() {
        return countyName;
    }

    public void setCountyName(String countyName) {
        this.countyName = countyName;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
