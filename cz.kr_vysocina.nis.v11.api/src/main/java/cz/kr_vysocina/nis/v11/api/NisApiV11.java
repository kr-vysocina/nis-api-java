package cz.kr_vysocina.nis.v11.api;

import cz.kr_vysocina.nis.v11.core.models.CDAType;
import cz.kr_vysocina.nis.v11.core.models.IdType;
import cz.kr_vysocina.nis.v11.core.models.PurposeOfUse;
import cz.kr_vysocina.nis.v11.core.models.getPsExists.GetPsExistsResponseModel;
import cz.kr_vysocina.nis.v11.core.models.sayHello.SayHelloModel;
import cz.kr_vysocina.nis.v11.core.providers.IDataProvider;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

@Tag(name = "NIS-API-v11")
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
    @Operation(
            summary = "Say Hello operation",
            description = "This operation can be called only for testing the connection and availability of the service")
    @ApiResponse(responseCode = "200", description = "Response for the parameters",
            content = @Content(schema = @Schema(implementation = SayHelloModel.class)))
    public Response sayHello() {

        logger.debug("Running sayHello.xml");

        SayHelloModel result = m_dataProvider.getSayHelloData();

        logger.debug("Returning result of sayHello.xml");

        return Response.ok(result).build();
    }

    @GET
    @Path("getPsExists.xml")
    @Operation(
            summary = "Get PS exists operation",
            description = "This operation can be called to get list of PS metadata")
    @ApiResponse(responseCode = "200", description = "Response for the parameters",
            content = @Content(schema = @Schema(implementation = GetPsExistsResponseModel.class)))
    public Response getPsExists(
            @Parameter(description = NISApiDescription.PARAM_ID_RID_DESC, required = true) @QueryParam("idRID") String idRID,
            @Parameter(description = NISApiDescription.PARAM_ID_TYPE_DESC, required = true) @QueryParam("idType") IdType idType,
            @Parameter(description = NISApiDescription.PARAM_ID_VALUE_DESC, required = true) @QueryParam("idValue") String idValue,
            @Parameter(description = NISApiDescription.PARAM_PURPOSE_OF_USE_DESC, required = true) @QueryParam("purposeOfUse") PurposeOfUse purposeOfUse,
            @Parameter(description = NISApiDescription.PARAM_SUBJECT_NAME_ID_DESC, required = true) @QueryParam("subjectNameId") String subjectNameId,
            @Parameter(description = NISApiDescription.PARAM_REQUEST_ORG_ID_DESC) @QueryParam("requestOrgId") String requestOrganizationId,
            @Parameter(description = NISApiDescription.PARAM_REQUEST_ID_DESC, required = true) @QueryParam("requestId") String requestId
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
    @Operation(
            summary = "Get PS CDA operation",
            description = "This operation can be called to get PS document")
    @ApiResponse(responseCode = "200", description = "Response for the parameters",
            content = @Content(mediaType = MediaType.APPLICATION_OCTET_STREAM, schema = @Schema(type = "string", format = "binary")))
    @Produces({MediaType.APPLICATION_OCTET_STREAM})
    public Response getPsCda(
            @Parameter(description = NISApiDescription.PARAM_SOURCE_IDENTIFIER_DESC, required = true) @QueryParam("sourceIdentifier") String sourceIdentifier,
            @Parameter(description = NISApiDescription.PARAM_ID_RID_DESC, required = true) @QueryParam("idRID") String idRID,
            @Parameter(description = NISApiDescription.PARAM_ID_TYPE_DESC, required = true) @QueryParam("idType") IdType idType,
            @Parameter(description = NISApiDescription.PARAM_ID_VALUE_DESC, required = true) @QueryParam("idValue") String idValue,
            @Parameter(description = NISApiDescription.PARAM_PURPOSE_OF_USE_DESC, required = true) @QueryParam("purposeOfUse") PurposeOfUse purposeOfUse,
            @Parameter(description = NISApiDescription.PARAM_SUBJECT_NAME_ID_DESC, required = true) @QueryParam("subjectNameId") String subjectNameId,
            @Parameter(description = NISApiDescription.PARAM_REQUEST_ORG_ID_DESC) @QueryParam("requestOrgId") String requestOrganizationId,
            @Parameter(description = NISApiDescription.PARAM_CDA_TYPE_DESC, required = true) @QueryParam("cdaType") CDAType cdaType,
            @Parameter(description = NISApiDescription.PARAM_CDA_ID_DESC, required = true) @QueryParam("cdaId") String cdaId,
            @Parameter(description = NISApiDescription.PARAM_CDA_OID_DESC, required = true) @QueryParam("cdaOid") String cdaOid,
            @Parameter(description = NISApiDescription.PARAM_REQUEST_ID_DESC, required = true) @QueryParam("requestId") String requestId
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
