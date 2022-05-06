package automationcraft.testcreation.farmacia.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.farmacia.pages.CarritoDeComprasPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.testng.Assert;

public class CarritoDeComprasSteps {

    CarritoDeComprasPage carrito;

    @Given("que estoy en la url {string}")
    public void queEstoyEnLaUrl(String url) {
    carrito = new CarritoDeComprasPage(DriverFactory.getDriver());
    carrito.irAURLFarmacia(url);
    }
    @When("presiono el botón Agregar al Carrito")
    public void presionoElBotónAgregarAlCarrito() {
        carrito.clickAgregarCarrito();
    }

    @Then("se debe agregar correctamente el producto al carrito")
    public void seDebeAgregarCorrectamenteElProductoAlCarrito() {
        Assert.assertTrue(carrito.validarMensajeImpresoProductoEnCarrito().contains("Se agreg"));
    }
    @Then("ver el carrito de compra en pantalla")
    public void verElCarritoDeCompraEnPantalla() {
        System.out.println("Validando Conexiones");
    }
}


