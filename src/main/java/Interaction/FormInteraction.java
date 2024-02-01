package Interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static Interface.DemoqaPage.Opcion_Forms;
import static Interface.DemoqaPage.Opcion_Practice_Form;

public class FormInteraction implements Interaction {
    public static FormInteraction datos() {
        return new FormInteraction();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(Click.on(Opcion_Forms),Click.on(Opcion_Practice_Form));
    }
}
