package Interaction;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;

import static Interface.DemoqaPage.Opcion_Widgets;
import static Interface.DemoqaPage.Opcion_Widgets_Slider;

public class WidgetsSliderInteraction implements Interaction {
    public static WidgetsSliderInteraction datos() {
        return new WidgetsSliderInteraction();
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Opcion_Widgets),
                Click.on(Opcion_Widgets_Slider)
        );

    }
}
