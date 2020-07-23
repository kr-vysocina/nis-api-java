package cz.kr_vysocina.nis.v11.api;

public class NISApiDescription {

    public static final String PARAM_ID_TYPE_DESC = "Typ identifikátoru pacienta, aktuálně „RC“ = rodné číslo resp. číslo pojištěnce, v budoucnu případně nový typ ID (bezvýznamový identifikátor, resortní ID,…)";
    public static final String PARAM_ID_VALUE_DESC = "Identifikátor pacienta (hodnota)";
    public static final String PARAM_PURPOSE_OF_USE_DESC = "Důvod dotazu na PS (EMERGENCY | TREATMENT | NONNCP) ";
    public static final String PARAM_SUBJECT_NAME_ID_DESC = "Identifikace uživatele, který požaduje data v Base64 kódování (saml2SubjectNameID). Příklady dle implementace: EidasId, LoginName,...";
    public static final String PARAM_REQUEST_ORG_ID_DESC = "Identifikace organizace posílající request (primární použití pro identifikaci organizace při purposeOfUse=NONNCP, např. Portál občana). \n" +
            "Příklady dle implementace: IČO, ...\n";
    public static final String PARAM_REQUEST_ID_DESC = "Identifikátor dotazu, který si uloží obě strany pro usnadnění případných reklamací nebo průkaznost vydání dat pacienta (saml2AssertionID).";
    public static final String PARAM_SOURCE_IDENTIFIER_DESC = "Identifikátor zdroje PS (ZZ = zdravotnického zařízení). Jedná se o interní identifikátor ZZ poskytujícím PS ve zdrojovém systému (bude využíván v případě zpětného volání getPS.cda jako identifikace ZZ). V případě sběrnicových systémů pro vracení agregovaného PS bude uvedena konstanta „AGGREGATE“";
    public static final String PARAM_CDA_TYPE_DESC = "Povolené hodnoty (L3 | L1)";
    public static final String PARAM_CDA_ID_DESC = "Identifikátor dokumentu CDA dle cdaType (viz cdaL3Id nebo cdaL1Id v metodě getPsExist.xml)";
    public static final String PARAM_CDA_OID_DESC = "OID dokumentu CDA dle cdaType (viz cdaL3Oid nebo cdaL1Oid v metodě getPsExist.xml)";
}
