package Task;

import Model.PracticeFormModel;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import Interaction.EnviarFormInteraction;

@AllArgsConstructor
public class EnviarFormTask implements Interaction {
    private final PracticeFormModel model;

    public static EnviarFormTask verf(PracticeFormModel model) {
        return new EnviarFormTask(model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnviarFormInteraction.verf(model));
    }
}
