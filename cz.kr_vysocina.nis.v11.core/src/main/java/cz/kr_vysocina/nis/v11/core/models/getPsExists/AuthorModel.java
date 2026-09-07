package cz.kr_vysocina.nis.v11.core.models.getPsExists;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementWrapper;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "author")
@XmlAccessorType(XmlAccessType.FIELD)
public class AuthorModel {

    @XmlElement(name = "person")
    protected String person;

    @XmlElementWrapper(name = "specialities")
    @XmlElement(name = "speciality")
    protected List<String> specialities;

    public AuthorModel() {
    }

    public String getPerson() {
        return person;
    }

    public void setPerson(String person) {
        this.person = person;
    }

    public List<String> getSpecialities() {
        return specialities;
    }

    public void setSpecialities(List<String> specialities) {
        this.specialities = specialities;
    }
}
