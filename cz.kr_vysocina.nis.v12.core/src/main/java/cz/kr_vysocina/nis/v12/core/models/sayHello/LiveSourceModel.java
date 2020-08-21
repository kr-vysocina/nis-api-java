package cz.kr_vysocina.nis.v12.core.models.sayHello;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "LiveSource")
@XmlAccessorType(XmlAccessType.FIELD)
public class LiveSourceModel {

    @XmlElement(name = "sourceName")
    protected String sourceName;

    @XmlElement(name = "sourceIco")
    protected String sourceIco;

    @XmlElement(name = "status")
    protected String status;

    public LiveSourceModel() {
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getSourceIco() {
        return sourceIco;
    }

    public void setSourceIco(String sourceIco) {
        this.sourceIco = sourceIco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
