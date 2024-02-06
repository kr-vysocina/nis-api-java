package cz.kr_vysocina.nis.v11.api;

import cz.kr_vysocina.nis.v11.core.models.CDAType;
import cz.kr_vysocina.nis.v11.core.models.IdType;
import cz.kr_vysocina.nis.v11.core.models.PurposeOfUse;
import cz.kr_vysocina.nis.v11.core.models.getPsExists.GetPsExistsResponseModel;
import cz.kr_vysocina.nis.v11.core.models.sayHello.SayHelloModel;
import cz.kr_vysocina.nis.v11.core.providers.IDataProvider;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Api(tags = {"NIS-API-v11"})
@Path("api/nixzd/v11")
@Produces({MediaType.APPLICATION_XML})
@Consumes({MediaType.APPLICATION_XML})
public class NisApiV11 {

    private final Logger logger = LoggerFactory.getLogger(NisApiV11.class);
    private final IDataProvider m_dataProvider;

    public NisApiV11(IDataProvider dataProvider) {
        this.m_dataProvider = dataProvider;
    }

    @GET
    @Path("sayHello.xml")
    @ApiOperation(
            value = "Say Hello operation",
            notes = "This operation can be called only for testing the connection and availability of the service",
            response = SayHelloModel.class)
    @ApiResponse(code = 200, message = "Response for the parameters")
    public Response sayHello() {

        logger.debug("Running sayHello.xml");

        SayHelloModel result = m_dataProvider.getSayHelloData();

        logger.debug("Returning result of sayHello.xml");

        return Response.ok(result).build();
    }

    @GET
    @Path("getPsExists.xml")
    @ApiOperation(
            value = "Get PS exists operation",
            notes = "This operation can be called to get list of PS metadata",
            response = GetPsExistsResponseModel.class)
    @ApiResponse(code = 200, message = "Response for the parameters")
    public Response getPsExists(
            @ApiParam(value = NISApiDescription.PARAM_ID_RID_DESC, required = true) @QueryParam("idRID") String idRID,
            @ApiParam(value = NISApiDescription.PARAM_ID_TYPE_DESC, required = true) @QueryParam("idType") IdType idType,
            @ApiParam(value = NISApiDescription.PARAM_ID_VALUE_DESC, required = true) @QueryParam("idValue") String idValue,
            @ApiParam(value = NISApiDescription.PARAM_PURPOSE_OF_USE_DESC, required = true) @QueryParam("purposeOfUse") PurposeOfUse purposeOfUse,
            @ApiParam(value = NISApiDescription.PARAM_SUBJECT_NAME_ID_DESC, required = true) @QueryParam("subjectNameId") String subjectNameId,
            @ApiParam(value = NISApiDescription.PARAM_REQUEST_ORG_ID_DESC) @QueryParam("requestOrgId") String requestOrganizationId,
            @ApiParam(value = NISApiDescription.PARAM_REQUEST_ID_DESC, required = true) @QueryParam("requestId") String requestId
    ) {

        logger.debug("Running getPsExists.xml");

        if (idType == null
                || purposeOfUse == null
                || StringUtils.isEmpty(idValue)
                || StringUtils.isEmpty(subjectNameId)
                || StringUtils.isEmpty(requestId)
        ) {
            logger.debug("Bad request to getPsExists.xml");
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        GetPsExistsResponseModel result = m_dataProvider.getPsExistsData(idRID, idType, idValue, purposeOfUse, subjectNameId, requestOrganizationId, requestId);

        logger.debug("Returning result of getPsExists.xml");

        return Response.ok(result).build();
    }

    @GET
    @Path("getPs.cda")
    @ApiOperation(
            value = "Get PS CDA operation",
            notes = "This operation can be called to get PS document",
            response = byte[].class)
    @ApiResponse(code = 200, message = "Response for the parameters")
    @Produces({MediaType.APPLICATION_OCTET_STREAM})
    public Response getPsCda(
            @ApiParam(value = NISApiDescription.PARAM_SOURCE_IDENTIFIER_DESC, required = true) @QueryParam("sourceIdentifier") String sourceIdentifier,
            @ApiParam(value = NISApiDescription.PARAM_ID_RID_DESC, required = true) @QueryParam("idRID") String idRID,
            @ApiParam(value = NISApiDescription.PARAM_ID_TYPE_DESC, required = true) @QueryParam("idType") IdType idType,
            @ApiParam(value = NISApiDescription.PARAM_ID_VALUE_DESC, required = true) @QueryParam("idValue") String idValue,
            @ApiParam(value = NISApiDescription.PARAM_PURPOSE_OF_USE_DESC, required = true) @QueryParam("purposeOfUse") PurposeOfUse purposeOfUse,
            @ApiParam(value = NISApiDescription.PARAM_SUBJECT_NAME_ID_DESC, required = true) @QueryParam("subjectNameId") String subjectNameId,
            @ApiParam(value = NISApiDescription.PARAM_REQUEST_ORG_ID_DESC) @QueryParam("requestOrgId") String requestOrganizationId,
            @ApiParam(value = NISApiDescription.PARAM_CDA_TYPE_DESC, required = true) @QueryParam("cdaType") CDAType cdaType,
            @ApiParam(value = NISApiDescription.PARAM_CDA_ID_DESC, required = true) @QueryParam("cdaId") String cdaId,
            @ApiParam(value = NISApiDescription.PARAM_CDA_OID_DESC, required = true) @QueryParam("cdaOid") String cdaOid,
            @ApiParam(value = NISApiDescription.PARAM_REQUEST_ID_DESC, required = true) @QueryParam("requestId") String requestId
    ) {

        logger.debug("Running getPs.cda");

        if (idType == null
                || purposeOfUse == null
                || cdaType == null
                || StringUtils.isEmpty(idValue)
                || StringUtils.isEmpty(subjectNameId)
                || StringUtils.isEmpty(requestId)
                || StringUtils.isEmpty(sourceIdentifier)
                || StringUtils.isEmpty(cdaId)
                || StringUtils.isEmpty(cdaOid)
        ) {
            logger.debug("Bad request to getPs.cda");
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        byte[] result = m_dataProvider.getPsCdaData(sourceIdentifier, idRID, idType, idValue, purposeOfUse, subjectNameId, requestOrganizationId, cdaType, cdaId, cdaOid, requestId);

        logger.debug("Returning result of getPs.cda");

        return Response.ok(result, MediaType.APPLICATION_OCTET_STREAM).build();
    }

}
