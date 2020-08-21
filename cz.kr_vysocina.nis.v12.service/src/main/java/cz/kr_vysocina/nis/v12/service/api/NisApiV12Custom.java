package cz.kr_vysocina.nis.v12.service.api;

import cz.kr_vysocina.nis.v12.api.NisApiV12;
import cz.kr_vysocina.nis.v12.core.providers.IDataProvider;

import javax.inject.Inject;

public class NisApiV12Custom extends NisApiV12 {

    @Inject
    public NisApiV12Custom(IDataProvider dataProvider) {
        super(dataProvider);
    }

}





