package cz.kr_vysocina.nis.v11.service.api;

import cz.kr_vysocina.nis.v11.api.NisApiV11;
import cz.kr_vysocina.nis.v11.core.providers.IDataProvider;

import javax.inject.Inject;

public class NisApiV11Custom extends NisApiV11 {

    @Inject
    public NisApiV11Custom(IDataProvider dataProvider) {
        super(dataProvider);
    }

}





