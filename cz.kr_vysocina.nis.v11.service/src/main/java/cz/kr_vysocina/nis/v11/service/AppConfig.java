package cz.kr_vysocina.nis.v11.service;

import cz.kr_vysocina.nis.v11.core.providers.IDataProvider;
import cz.kr_vysocina.nis.v11.mock.MockDataProvider;
import cz.kr_vysocina.nis.v11.service.api.NisApiV11Custom;
import io.swagger.v3.jaxrs2.integration.resources.OpenApiResource;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {

    public AppConfig() {

        register(NisApiV11Custom.class); //Register NIS API Service
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(MockDataProvider.class).to(IDataProvider.class); //TODO replace by real implementation
            }
        });

        register(OpenApiResource.class); //Register OpenAPI (Swagger) document + UI resource at rest/openapi.json
    }
}
