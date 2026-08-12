package cz.kr_vysocina.nis.v11.core.models.getPsExists;

/**
 * OID codes (ArtDecor OID template) for the document types exchanged via {@code documentList} (see NIXZD v11 spec,
 * §getPsExists.xml, typeOID).
 */
public final class DocumentTypeOID {

    public static final String ORCD_MEDICAL_IMAGING_REPORT_L1 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.10";
    public static final String ORCD_MEDICAL_IMAGES_L1 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.11";
    public static final String ORCD_LABORATORY_RESULT_L1 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.8";
    public static final String ORCD_HOSPITAL_DISCHARGE_REPORT_L1 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.9";
    public static final String ORCD_DISCHARGE_REPORT_L1 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.9.1";
    public static final String EP_L1 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.6";
    public static final String EP_L3 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.1";
    public static final String ED_L3 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.2";
    public static final String PS_L1 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.7";
    public static final String PS_L3 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.3";
    public static final String RETURN_MRO_L3 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.4";
    public static final String HCER_TO_COUNTRY_A_L3 = "1.3.6.1.4.1.12559.11.10.1.3.1.1.5";
    public static final String HOSPITAL_DISCHARGE_REPORT_FHIR = "1.3.6.1.4.1.12559.11.10.1.3.1.1.9.2";
    public static final String DISCHARGE_REPORT_FHIR = "1.3.6.1.4.1.12559.11.10.1.3.1.1.9.3";
    public static final String LABORATORY_REPORT_FHIR = "1.3.6.1.4.1.12559.11.10.1.3.1.1.8.1";
    public static final String EMERGENCY_SERVICE_REPORT = "1.2.203.24341.11.4.1";
    public static final String MEDICAL_EXAMINATION_REQUEST = "1.2.203.24341.11.4.2";

    private DocumentTypeOID() {
    }
}
