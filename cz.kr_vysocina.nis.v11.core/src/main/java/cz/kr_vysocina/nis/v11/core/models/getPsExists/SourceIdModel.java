package cz.kr_vysocina.nis.v11.core.models.getPsExists;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "SourceId")
@XmlAccessorType(XmlAccessType.FIELD)
public class SourceIdModel {

    @XmlElement(name = "sourceIdType")
    protected List<String> sourceIdTypeList;

    @XmlElement(name = "sourceIdValue")
    protected List<String> sourceIdValueList;

    public SourceIdModel() {
    }

    public List<String> getSourceIdTypeList() {
        return sourceIdTypeList;
    }

    public void setSourceIdTypeList(List<String> sourceIdTypeList) {
        this.sourceIdTypeList = sourceIdTypeList;
    }

    public List<String> getSourceIdValueList() {
        return sourceIdValueList;
    }

    public void setSourceIdValueList(List<String> sourceIdValueList) {
        this.sourceIdValueList = sourceIdValueList;
    }
}

