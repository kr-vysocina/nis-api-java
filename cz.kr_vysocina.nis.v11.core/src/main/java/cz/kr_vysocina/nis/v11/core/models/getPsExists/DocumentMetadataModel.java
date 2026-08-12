package cz.kr_vysocina.nis.v11.core.models.getPsExists;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlRootElement(name = "document")
@XmlAccessorType(XmlAccessType.FIELD)
public class DocumentMetadataModel {

    @XmlElement(name = "typeLOINC")
    protected String typeLOINC;

    @XmlElement(name = "typeOID")
    protected String typeOID;

    @XmlElement(name = "label")
    protected String label;

    @XmlElement(name = "id")
    protected String id;

    @XmlElement(name = "oid")
    protected String oid;

    @XmlElement(name = "effectiveTime")
    protected String effectiveTime;

    @XmlElement(name = "documentSize")
    protected Long documentSize;

    @XmlElement(name = "documentHash")
    protected String documentHash;

    @XmlElement(name = "reasonOfHospitalisation")
    protected ReasonOfHospitalisationModel reasonOfHospitalisation;

    @XmlElementWrapper(name = "authors")
    @XmlElement(name = "author")
    protected List<AuthorModel> authors;

    @XmlElement(name = "documentFileType")
    protected DocumentFileTypeEnum documentFileType;

    @XmlElement(name = "confidentialityCode")
    protected ConfidentialityCodeEnum confidentialityCode;

    public DocumentMetadataModel() {
    }

    public String getTypeLOINC() {
        return typeLOINC;
    }

    public void setTypeLOINC(String typeLOINC) {
        this.typeLOINC = typeLOINC;
    }

    public String getTypeOID() {
        return typeOID;
    }

    public void setTypeOID(String typeOID) {
        this.typeOID = typeOID;
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

    public Long getDocumentSize() {
        return documentSize;
    }

    public void setDocumentSize(Long documentSize) {
        this.documentSize = documentSize;
    }

    public String getDocumentHash() {
        return documentHash;
    }

    public void setDocumentHash(String documentHash) {
        this.documentHash = documentHash;
    }

    public ReasonOfHospitalisationModel getReasonOfHospitalisation() {
        return reasonOfHospitalisation;
    }

    public void setReasonOfHospitalisation(ReasonOfHospitalisationModel reasonOfHospitalisation) {
        this.reasonOfHospitalisation = reasonOfHospitalisation;
    }

    public List<AuthorModel> getAuthors() {
        return authors;
    }

    public void setAuthors(List<AuthorModel> authors) {
        this.authors = authors;
    }

    public DocumentFileTypeEnum getDocumentFileType() {
        return documentFileType;
    }

    public void setDocumentFileType(DocumentFileTypeEnum documentFileType) {
        this.documentFileType = documentFileType;
    }

    public ConfidentialityCodeEnum getConfidentialityCode() {
        return confidentialityCode;
    }

    public void setConfidentialityCode(ConfidentialityCodeEnum confidentialityCode) {
        this.confidentialityCode = confidentialityCode;
    }
}
