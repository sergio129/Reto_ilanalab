package Runner;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "Stepsdefinitions",
        features = "src/test/resources/features/",
        plugin = {"rerun:target/rerunFailed/fallidos.txt"},
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        tags = "@Caso2",
        monochrome = true

)

public class Runner {

}
