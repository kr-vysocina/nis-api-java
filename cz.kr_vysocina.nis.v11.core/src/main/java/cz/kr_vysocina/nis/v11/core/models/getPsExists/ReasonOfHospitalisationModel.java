package cz.kr_vysocina.nis.v11.core.models.getPsExists;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "reasonOfHospitalisation")
@XmlAccessorType(XmlAccessType.FIELD)
public class ReasonOfHospitalisationModel {

    @XmlElement(name = "code")
    protected String code;

    @XmlElement(name = "codingScheme")
    protected String codingScheme;

    @XmlElement(name = "text")
    protected String text;

    public ReasonOfHospitalisationModel() {
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodingScheme() {
        return codingScheme;
    }

    public void setCodingScheme(String codingScheme) {
        this.codingScheme = codingScheme;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
