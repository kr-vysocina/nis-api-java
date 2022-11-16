package cz.kr_vysocina.nis.v11.core.models.getPsExists;

import javax.xml.bind.annotation.*;
import java.util.List;

@XmlRootElement(name = "patientSummary")
@XmlAccessorType(XmlAccessType.FIELD)
public class PatientSummaryModel {

    @XmlElement(name = "sourceIdentifier")
    protected String sourceIdentifier;

    @XmlElement(name = "sourceName")
    protected String sourceName;

    @XmlElement(name = "sourceIco")
    protected String sourceIco;

    @XmlElement(name = "sourceId")
    protected SourceIdModel sourceId;

    @XmlElement(name = "exists")
    protected boolean exists;

    @XmlElement(name = "cdaL3Id")
    protected String cdaL3Id;

    @XmlElement(name = "cdaL3Oid")
    protected String cdaL3oid;

    @XmlElement(name = "cdaL3Size")
    protected Long cdaL3Size;

    @XmlElement(name = "cdaL3Hash")
    protected String cdaL3Hash;

    @XmlElement(name = "effectiveTime")
    protected String effectiveTime;

    @XmlElement(name = "cdaL1Support")
    protected boolean cdaL1support;

    @XmlElement(name = "cdaL1Id")
    protected String cdaL1Id;

    @XmlElement(name = "cdaL1Oid")
    protected String cdaL1oid;

    @XmlElement(name = "cdaL1Size")
    protected Long cdaL1Size;

    @XmlElement(name = "cdaL1Hash")
    protected String cdaL1Hash;

    @XmlElementWrapper(name="documentList")
    @XmlElement(name = "document")
    protected List<DocumentMetadataModel> documentList;


    public PatientSummaryModel() {
    }

    public String getSourceIdentifier() {
        return sourceIdentifier;
    }

    public void setSourceIdentifier(String sourceIdentifier) {
        this.sourceIdentifier = sourceIdentifier;
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

    public SourceIdModel getSourceId() {
        return sourceId;
    }

    public void setSourceId(SourceIdModel sourceId) {
        this.sourceId = sourceId;
    }

    public boolean isExists() {
        return exists;
    }

    public void setExists(boolean exists) {
        this.exists = exists;
    }

    public String getCdaL3Id() {
        return cdaL3Id;
    }

    public void setCdaL3Id(String cdaL3Id) {
        this.cdaL3Id = cdaL3Id;
    }

    public String getCdaL3oid() {
        return cdaL3oid;
    }

    public void setCdaL3oid(String cdaL3oid) {
        this.cdaL3oid = cdaL3oid;
    }

    public Long getCdaL3Size() {
        return cdaL3Size;
    }

    public void setCdaL3Size(Long cdaL3Size) {
        this.cdaL3Size = cdaL3Size;
    }

    public String getCdaL3Hash() {
        return cdaL3Hash;
    }

    public void setCdaL3Hash(String cdaL3Hash) {
        this.cdaL3Hash = cdaL3Hash;
    }

    public String getEffectiveTime() {
        return effectiveTime;
    }

    public void setEffectiveTime(String effectiveTime) {
        this.effectiveTime = effectiveTime;
    }

    public boolean isCdaL1support() {
        return cdaL1support;
    }

    public void setCdaL1support(boolean cdaL1support) {
        this.cdaL1support = cdaL1support;
    }

    public String getCdaL1Id() {
        return cdaL1Id;
    }

    public void setCdaL1Id(String cdaL1Id) {
        this.cdaL1Id = cdaL1Id;
    }

    public String getCdaL1oid() {
        return cdaL1oid;
    }

    public void setCdaL1oid(String cdaL1oid) {
        this.cdaL1oid = cdaL1oid;
    }

    public Long getCdaL1Size() {
        return cdaL1Size;
    }

    public void setCdaL1Size(Long cdaL1Size) {
        this.cdaL1Size = cdaL1Size;
    }

    public String getCdaL1Hash() {
        return cdaL1Hash;
    }

    public void setCdaL1Hash(String cdaL1Hash) {
        this.cdaL1Hash = cdaL1Hash;
    }

    public List<DocumentMetadataModel> getDocumentList() {
        return documentList;
    }

    public void setDocumentList(List<DocumentMetadataModel> documentList) {
        this.documentList = documentList;
    }
}

