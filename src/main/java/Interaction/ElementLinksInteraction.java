package Interaction;

import Model.LinksModel;
import Questions.GeneralQuestion;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.ensure.Ensure;
import org.apache.commons.compress.archivers.sevenz.CLI;

import static Interface.DemoqaPage.*;

@AllArgsConstructor
public class ElementLinksInteraction implements Interaction {
    private final LinksModel model;

    public static ElementLinksInteraction datos(LinksModel model) {
        return new ElementLinksInteraction(model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(
                Click.on(Created), Ensure.that(GeneralQuestion.TextoLinks()).isEqualTo(model.getCreated()),
                Click.on(NoContent), Ensure.that(GeneralQuestion.TextoLinks()).isEqualTo(model.getNoContent()),
                Click.on(Moved), Ensure.that(GeneralQuestion.TextoLinks()).isEqualTo(model.getMoved()),
                Click.on(BadRequest), Ensure.that(GeneralQuestion.TextoLinks()).isEqualTo(model.getBadRequest()),
                Click.on(Unauthorized), Ensure.that(GeneralQuestion.TextoLinks()).isEqualTo(model.getUnauthorized()),
                Click.on(Forbidden), Ensure.that(GeneralQuestion.TextoLinks()).isEqualTo(model.getForbidden()),
                Click.on(Not_Found), Ensure.that(GeneralQuestion.TextoLinks()).isEqualTo(model.getNotFound())
        );
    }
}
