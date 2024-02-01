package Stepsdefinitions;

import Interaction.SliderInteraction;
import Interaction.WidgetsSliderInteraction;
import Interface.DemoqaPage;
import Model.LinksModel;
import Model.PracticeFormModel;
import Task.*;
import Utilities.Leerdatos;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;

public class RetoilianalabSteps {
    @Managed(driver = "chrome")
    private WebDriver getBrowser;
    private final Actor actor = Actor.named("Usuario");
    DemoqaPage demo = new DemoqaPage();
    PracticeFormModel model = Leerdatos.datosForm();
    LinksModel linksModel = Leerdatos.datoslink();

    @Before
    public void setUp() {
        actor.can(BrowseTheWeb.with(getBrowser));
    }

    @Given("Ingresar a la Url de demoqa")
    public void ingresar_a_la_url_de_demoqa() {
        actor.wasAbleTo(Open.browserOn(demo));
    }

    @When("Navegamos hasta la opcions de Practice Form")
    public void navegamos_hasta_la_opcions_de_practice_form() {
        actor.attemptsTo(FormmTask.datos());
    }

    @And("Completamos el formulario")
    public void completamos_el_formulario() {

        actor.attemptsTo(PracticeFormTask.datos(model));
    }

    @Then("Verficamos mensaje de exito del envio del formulario")
    public void verficamos_mensaje_de_exito_del_envio_del_formulario() {
        actor.attemptsTo(EnviarFormTask.verf(model));
    }

    @When(": Navegamos hasta la opcions de Links")
    public void navegamosHastaLaOpcionsDeLinks() {
        actor.attemptsTo(ElemntsTask.datos());

    }

    @Then("hacemos click  en los enlaces, validamos el contenido")
    public void hacemosClickEnLosEnlacesValidamosElContenido() {
        actor.attemptsTo(ElementLinksTask.datos(linksModel));
    }

    @When(": Navegamos hasta la opcions de Slider")
    public void navegamosHastaLaOpcionsDeSlider() {
        actor.attemptsTo(WidgetsSliderInteraction.datos());

    }

    @Then("Arrastramos hara la posicion {string} verifica que el númere mostrado el correcto")
    public void arrastramosHaraLaPosicionVerificaQueElNúmereMostradoElCorrecto(String arg0) {
        actor.attemptsTo(SliderTask.datos(arg0));
    }


}
