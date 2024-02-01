package Interaction;

import Questions.GeneralQuestion;
import lombok.AllArgsConstructor;
import lombok.var;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.thucydides.core.webdriver.WebDriverFacade;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static Interface.DemoqaPage.Slider;
import static Interface.DemoqaPage.Slider_move;

@AllArgsConstructor
public class SliderInteraction implements Interaction {
    private int valor;

    public static SliderInteraction datos(int valor) {
        return new SliderInteraction(valor);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Slider));
        for (int i = 1; i <= 50 - valor; i++) {
            actor.attemptsTo(
                    Hit.the(Keys.ARROW_LEFT).into(Slider));
        }
        actor.attemptsTo(
                Ensure.that(GeneralQuestion.Slider()).isEqualTo(String.valueOf(valor))
        );

    }
}
