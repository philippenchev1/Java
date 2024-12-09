package softuni.exam.models.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class LibraryMemberDto {
    private long id;

    public long getId() {
        return id;
    }

    public LibraryMemberDto setId(long id) {
        this.id = id;
        return this;
    }
}
