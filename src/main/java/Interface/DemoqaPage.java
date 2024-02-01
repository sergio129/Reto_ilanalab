package Interface;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.screenplay.targets.Target;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("https://demoqa.com/")
public class DemoqaPage extends PageObject {
    public static final Target Opcion_Forms = Target.the("Opcion para ingresar a los Forms").locatedBy("//div[@class='card mt-4 top-card']//div[@class='card-body']//h5[contains(text(),'Forms')]");
    public static final Target Opcion_Practice_Form = Target.the("Opcion para ingresar a Practice Form").locatedBy("*//div[1]/div/div/div[2]/div/ul/li/span");
    public static final Target Campo_First_Name = Target.the("Campo para escribir nombres ").located(By.id("firstName"));
    public static final Target Campo_Last_Name = Target.the("Campo para escribir Apellidos ").located(By.id("lastName"));
    public static final Target Campo_Email = Target.the("Campo para escribir correo electronico").located(By.id("userEmail"));
    public static final Target Check_Gender = Target.the("Check para selecionar el genero ").locatedBy("//input[@name=\"gender\"][@type=\"radio\"][@value='{0}']");
    public static final Target Campo_Mobile = Target.the("Campo para escribir numero de mobil").located(By.id("userNumber"));
    public static final Target Campo_fecha = Target.the("Campo para seleccionar una fecha").located(By.cssSelector("[aria-label='Choose Thursday, January 25th, 2024']"));
    public static final Target Capturar_informacion = Target.the("Capturamos el texto que se envio el formulario").located(By.xpath("//div[@class='modal-title h4'][@id='example-modal-sizes-title-lg']"));
    public static final Target Envio_formulario = Target.the("Capturamos el texto que se envio el formulario").located(By.xpath("//button[@id='submit']"));
    public static final Target boton_cerrar_modal = Target.the("Boton para cerrar la modal del envio del formulario").located(By.id("closeLargeModal"));


}
