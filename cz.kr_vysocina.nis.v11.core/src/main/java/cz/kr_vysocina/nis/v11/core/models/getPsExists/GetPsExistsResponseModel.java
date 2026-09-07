package cz.kr_vysocina.nis.v11.core.models.getPsExists;

import io.swagger.v3.oas.annotations.media.Schema;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "getPsExistsResponse")
@XmlAccessorType(XmlAccessType.FIELD)
@Schema(name = "GetPsExistsResponseModel", description = "This class contains message returned from service")
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

