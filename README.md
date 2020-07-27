# Návod k použití      

* Založit maven Java EE projekt

* Přidat závislost na knihovně `cz.kr_vysocina.nis.v11.api`

* Vytvořit třídu implementující `NisApiV11`

```
public class NisApiV11Custom extends NisApiV11 {

    @Inject
    public NisApiV11Custom(IDataProvider dataProvider) {
        super(dataProvider);
    }

}
``` 

* Ve třídě implementující `ResourceConfig` zaregistrovat následující implementaci
   ```     
        register(NisApiV11Custom.class); //Register NIS API Service
        register(new AbstractBinder() {
            @Override
            protected void configure() {
                bind(MockDataProvider.class).to(IDataProvider.class); //TODO replace by real implementation
            }
        });
   ```   

* Lze přidat závislost na knihovně `cz.kr_vysocina.nis.v11.mock` a registrovat implementaci `MockDataProvider` pro vyzkoušení, zda služba běží a vrací mockovaná data

* Případně je možné použít knihovnu `cz.kr_vysocina.nis.v11.core`, která obsahuje datové modely, a implementovat vlastní rozhraní

* Pro logování je použit framework `The Simple Logging Facade for Java (SLF4J)`, lze tedy zaregistrovat libovolné řešení pro logování, které jej podporuje, a při povolení debug levelu se začnou logovat informace o provolání příslušných metod (například knihovna `logback-classic`)
