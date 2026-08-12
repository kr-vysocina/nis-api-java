package cz.kr_vysocina.nis.v11.core.models.getPsExists;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
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
