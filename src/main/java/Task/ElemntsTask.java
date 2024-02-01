package Task;

import Interaction.ElemntsInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;

import static Interface.DemoqaPage.Opcion_elemnts;
import static Interface.DemoqaPage.Opcion_link;

public class ElemntsTask implements Task {
    public static ElemntsTask datos() {
        return new ElemntsTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                ElemntsInteraction.datos()
        );
    }
}
