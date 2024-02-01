package Questions;

import net.serenitybdd.screenplay.Question;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;

import static Interface.DemoqaPage.*;

public class GeneralQuestion {

    public static Question<String> Formulario() {
        return actor -> BrowseTheWeb.as(actor).find(Capturar_informacion).getText();

    }
    public static Question<String> TextoLinks() {
        return actor -> BrowseTheWeb.as(actor).find(Capturar_texto_link).getText();

    }
    public static Question<String> Slider() {
        return actor -> BrowseTheWeb.as(actor).find(Verficar_valor_Slider).getValue();

    }
}
