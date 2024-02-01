package Task;

import Model.PracticeFormModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import Interaction.PracticeFormInteraction;
import net.serenitybdd.screenplay.Task;


@AllArgsConstructor
public class PracticeFormTask implements Task {
    private final PracticeFormModel model;

    public static PracticeFormTask datos(PracticeFormModel model) {
        return new PracticeFormTask(model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(PracticeFormInteraction.datos(model));

    }
}
