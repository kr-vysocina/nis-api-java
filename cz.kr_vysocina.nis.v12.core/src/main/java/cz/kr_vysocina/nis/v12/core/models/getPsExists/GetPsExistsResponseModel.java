package cz.kr_vysocina.nis.v12.core.models.getPsExists;

import io.swagger.annotations.ApiModel;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "getPsExistsResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@ApiModel(value = "GetPsExistsResponseModel", description = "This class contains message returned from service")
public class GetPsExistsResponseModel {

    @XmlElement(name = "patientSummary")
    protected List<PatientSummaryModel> patientSummaryList;

    public GetPsExistsResponseModel() {
    }

    public List<PatientSummaryModel> getPatientSummaryList() {
        return patientSummaryList;
    }

    public void setPatientSummaryList(List<PatientSummaryModel> patientSummaryList) {
        this.patientSummaryList = patientSummaryList;
    }
}

