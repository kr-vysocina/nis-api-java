package cz.kr_vysocina.nis.v11.core.models.getPsExists;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "document")
@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentMetadataModel {

    @XmlElement(name = "type")
    protected String type;

    @XmlElement(name = "label")
    protected String label;

    @XmlElement(name = "id")
    protected String id;

    @XmlElement(name = "oid")
    protected String oid;

    @XmlElement(name = "effectiveTime")
    protected String effectiveTime;

    public DocumentMetadataModel() {
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOid() {
        return oid;
    }

    public void setOid(String oid) {
        this.oid = oid;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }
}
