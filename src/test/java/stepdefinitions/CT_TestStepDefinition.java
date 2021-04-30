package stepdefinitions;

import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.thucydides.core.annotations.Managed;
import org.openqa.selenium.WebDriver;
import tasks.BuscarProducto;
import userinterfaces.HomePageNE;

public class CT_TestStepDefinition {

    @Managed(driver = "chrome")
    private WebDriver navegador;
    private Actor actor = Actor.named("userRegistered");
    private HomePageNE homePageNE = new HomePageNE();

    @Dado("^que un cliente ya registrado accede a la página$")
    public void queUnClienteYaRegistradoAccedeALaPágina() {
        actor.can(BrowseTheWeb.with(navegador));
        actor.wasAbleTo(Open.browserOn(homePageNE));

    }

    @Cuando("^agrega el o los productos que desea al carrito de compras$")
    public void agregaElOLosProductosQueDeseaAlCarritoDeCompras() {
        actor.wasAbleTo(BuscarProducto);

    }

    @Entonces("^puede ver los productos que tomó y el precio$")
    public void puedeVerLosProductosQueTomóYElPrecio() {

    }

}