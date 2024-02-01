package Task;

import Interaction.FormInteraction;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


public class FormmTask implements Task {
    public static FormmTask datos() {
        return new FormmTask();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(FormInteraction.datos());
    }
}
