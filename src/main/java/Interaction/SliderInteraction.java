package Interaction;

import Questions.GeneralQuestion;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.ensure.Ensure;
import static Interface.DemoqaPage.Slider;

@AllArgsConstructor
public class SliderInteraction implements Interaction {
    private String valor;

    public static SliderInteraction datos(String valor) {
        return new SliderInteraction(valor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                MoveMouse.to(Slider.of(String.valueOf(valor))).andThen(actions -> actions.click()));
        actor.attemptsTo(
                Ensure.that(GeneralQuestion.Slider()).isEqualTo(valor)
        );
    }
}
