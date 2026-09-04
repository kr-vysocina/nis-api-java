package cz.kr_vysocina.nis.v11.core.models.sayHello;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "sayHello")
@XmlAccessorType(XmlAccessType.FIELD)
@Schema(name = "SayHello", description = "This class contains message returned from service")
public class SayHelloModel {

    @XmlElement(name = "description")
    protected String description;

    @XmlElement(name = "wave")
    protected String wave;

    @XmlElement(name = "ridOnly")
    protected Boolean ridOnly;

    @XmlElement(name = "servertime")
    protected String servertime;

    @XmlElement(name = "isName")
    protected String isName;

    @XmlElement(name = "isVersion")
    protected String isVersion;

    @XmlElement(name = "environment")
    protected String environment;

    @XmlElement(name = "cdaIgVersion")
    protected String cdaIgVersion;

    @XmlElement(name = "fhirIgVersion")
    protected String fhirIgVersion;

    @XmlElement(name = "mvcVersion")
    protected String mvcVersion;

    @XmlElementWrapper(name = "LiveSourceList")
    @XmlElement(name = "LiveSource")
    protected List<LiveSourceModel> liveSourceList;

    public SayHelloModel() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getWave() {
        return wave;
    }

    public void setWave(String wave) {
        this.wave = wave;
    }

    public Boolean getRidOnly() {
        return ridOnly;
    }

    public void setRidOnly(Boolean ridOnly) {
        this.ridOnly = ridOnly;
    }

    public String getServertime() {
        return servertime;
    }

    public void setServertime(String servertime) {
        this.servertime = servertime;
    }

    public String getIsName() {
        return isName;
    }

    public void setIsName(String isName) {
        this.isName = isName;
    }

    public String getIsVersion() {
        return isVersion;
    }

    public void setIsVersion(String isVersion) {
        this.isVersion = isVersion;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getCdaIgVersion() {
        return cdaIgVersion;
    }

    public void setCdaIgVersion(String cdaIgVersion) {
        this.cdaIgVersion = cdaIgVersion;
    }

    public String getFhirIgVersion() {
        return fhirIgVersion;
    }

    public void setFhirIgVersion(String fhirIgVersion) {
        this.fhirIgVersion = fhirIgVersion;
    }

    public String getMvcVersion() {
        return mvcVersion;
    }

    public void setMvcVersion(String mvcVersion) {
        this.mvcVersion = mvcVersion;
    }

    public List<LiveSourceModel> getLiveSourceList() {
        return liveSourceList;
    }

    public void setLiveSourceList(List<LiveSourceModel> liveSourceList) {
        this.liveSourceList = liveSourceList;
    }
}
