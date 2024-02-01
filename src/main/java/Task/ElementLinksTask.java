package Task;

import Interaction.ElementLinksInteraction;
import Model.LinksModel;
import lombok.AllArgsConstructor;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Task;


@AllArgsConstructor
public class ElementLinksTask implements Task {
    private final LinksModel model;

    public static ElementLinksTask datos(LinksModel model) {
        return new ElementLinksTask(model);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(ElementLinksInteraction.datos(model));
    }
}
