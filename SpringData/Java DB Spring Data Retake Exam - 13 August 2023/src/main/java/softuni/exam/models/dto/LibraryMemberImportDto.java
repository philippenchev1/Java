package softuni.exam.models.dto;

import com.google.gson.annotations.Expose;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class LibraryMemberImportDto {

//•	first name - accepts char sequence (between 2 to 30 inclusive).
//•	last name - accepts char sequence (between 2 to 30 inclusive).
//•	address - accepts char sequence (between 2 to 40 inclusive). Can be nullable.
//•	phone number - accepts char sequence (between 2 to 20 inclusive). The values are unique in the database.
    @Expose
    @Size(min = 2,max = 40)
    private String address;
    @Expose
    @Size(min = 2,max = 30)
    @NotNull
    private String firstName;
    @Expose
    @Size(min = 2,max = 30)
    private String lastName;
    @Expose
    @Size(min = 2,max = 20)
    private String phoneNumber;


    public String getAddress() {
        return address;
    }

    public LibraryMemberImportDto setAddress(String address) {
        this.address = address;
        return this;
    }

    public String getFirstName() {
        return firstName;
    }

    public LibraryMemberImportDto setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }

    public String getLastName() {
        return lastName;
    }

    public LibraryMemberImportDto setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public LibraryMemberImportDto setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
        return this;
    }
}
