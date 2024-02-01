package Task;

import Interaction.SliderInteraction;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.MoveMouse;


@AllArgsConstructor
public class SliderTask implements Task {
    private String valor;

    public static SliderTask datos(String valor) {
        return new SliderTask(valor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(SliderInteraction.datos(valor));
    }
}
