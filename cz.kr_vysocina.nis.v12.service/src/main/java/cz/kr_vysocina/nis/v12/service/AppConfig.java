package cz.kr_vysocina.nis.v12.service;

import cz.kr_vysocina.nis.v12.core.providers.IDataProvider;
import cz.kr_vysocina.nis.v12.mock.MockDataProvider;
import cz.kr_vysocina.nis.v12.service.api.NisApiV12Custom;
import org.glassfish.jersey.internal.inject.AbstractBinder;
import org.glassfish.jersey.server.ResourceConfig;

public class AppConfig extends ResourceConfig {

    public AppConfig() {

        register(NisApiV12Custom.class); //Register NIS API Service
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(MockDataProvider.class).to(IDataProvider.class); //TODO replace by real implementation
            }
        });

        packages("io.swagger.jaxrs"); //Register swagger package
    }
}
