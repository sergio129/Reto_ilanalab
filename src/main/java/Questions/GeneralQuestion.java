package Questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static Interface.DemoqaPage.Capturar_informacion;

public class GeneralQuestion {

    public static Question<String> Formulario() {
        return actor -> BrowseTheWeb.as(actor).find(Capturar_informacion).getText();

    }
}
