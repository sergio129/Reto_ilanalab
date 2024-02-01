package Interaction;

import Model.PracticeFormModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Enter;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.MoveMouseToTarget;
import net.serenitybdd.screenplay.ui.Checkbox;
import net.serenitybdd.screenplay.ui.RadioButton;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

import static Interface.DemoqaPage.*;

@AllArgsConstructor
public class PracticeFormInteraction implements Interaction {
    private final PracticeFormModel model;


    public static PracticeFormInteraction datos(PracticeFormModel model) {
        return new PracticeFormInteraction(model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {


        actor.attemptsTo(
                Enter.theValue(model.getFirstName()).into(Campo_First_Name),
                Enter.theValue(model.getLastName()).into(Campo_Last_Name),
                Enter.theValue(model.getEmail()).into(Campo_Email),
                MoveMouse.to(Check_Gender.of(String.valueOf(model.getGender()))).andThen(actions -> actions.click()),
                Enter.theValue(model.getMobile()).into(Campo_Mobile).thenHit(Keys.TAB),
                Click.on(Campo_fecha),
                Click.on(Envio_formulario)
        );

    }
}
