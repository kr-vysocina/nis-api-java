package cz.kr_vysocina.nis.v12.core.models.sayHello;

import io.swagger.annotations.ApiModel;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "sayHello")
@XmlAccessorType(XmlAccessType.FIELD)
@ApiModel(value = "SayHello", description = "This class contains message returned from service")
public class SayHelloModel {

    @XmlElement(name = "description")
    protected String description;

    @XmlElement(name = "servertime")
    protected String servertime;

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

    public String getServertime() {
        return servertime;
    }

    public void setServertime(String servertime) {
        this.servertime = servertime;
    }

    public List<LiveSourceModel> getLiveSourceList() {
        return liveSourceList;
    }

    public void setLiveSourceList(List<LiveSourceModel> liveSourceList) {
        this.liveSourceList = liveSourceList;
    }
}

