package Task;

import Model.PracticeFormModel;

import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import Interaction.EnviarFormInteraction;
import net.serenitybdd.screenplay.Task;

@AllArgsConstructor
public class EnviarFormTask implements Task {
    private final PracticeFormModel model;

    public static EnviarFormTask verf(PracticeFormModel model) {
        return new EnviarFormTask(model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(EnviarFormInteraction.verf(model));
    }
}
