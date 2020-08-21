package cz.kr_vysocina.nis.v12.core.providers;

import cz.kr_vysocina.nis.v12.core.models.CDAType;
import cz.kr_vysocina.nis.v12.core.models.IdType;
import cz.kr_vysocina.nis.v12.core.models.PurposeOfUse;
import cz.kr_vysocina.nis.v12.core.models.getPsExists.GetPsExistsResponseModel;
import cz.kr_vysocina.nis.v12.core.models.sayHello.SayHelloModel;

public interface IDataProvider {

    SayHelloModel getSayHelloData();

    GetPsExistsResponseModel getPsExistsData(IdType idType, String idValue, PurposeOfUse purposeOfUse, String subjectNameId, String requestOrganizationId, String requestId);

    byte[] getPsCdaData(String sourceIdentifier, IdType idType, String idValue, PurposeOfUse purposeOfUse, String subjectNameId, String requestOrganizationId, CDAType cdaType, String cdaId, String cdaOid, String requestId);
}

