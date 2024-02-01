package Interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static Interface.DemoqaPage.Opcion_elemnts;
import static Interface.DemoqaPage.Opcion_link;

public class ElemntsInteraction implements Interaction {
    public static ElemntsInteraction datos() {
        return new ElemntsInteraction();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Opcion_elemnts),
                Click.on(Opcion_link)
        );
    }
}
