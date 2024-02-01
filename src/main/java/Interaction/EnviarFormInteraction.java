package Interaction;

import Model.PracticeFormModel;
import Questions.GeneralQuestion;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;

import static Interface.DemoqaPage.boton_cerrar_modal;

@AllArgsConstructor
public class EnviarFormInteraction implements Interaction {
    private final PracticeFormModel model;

    public static EnviarFormInteraction verf(PracticeFormModel model) {
        return new EnviarFormInteraction(model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Ensure.that(GeneralQuestion.Formulario()).isEqualTo(model.getVerification())
        );
    }
}
