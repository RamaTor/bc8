package automationcraft.testcreation.farmacia.steps;

import automationcraft.engine.selenium.DriverFactory;
import automationcraft.testcreation.farmacia.pages.CarritoDeComprasPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import org.testng.Assert;


public class LimiteDeStockSteps {

    CarritoDeComprasPage limiteStock;

    @Given("que el cliente está el en carrito de compras con al menos {int} producto")
    public void queElClienteEstáElEnCarritoDeComprasConAlMenosProducto(int i) {
    }
    @When("el cliente aumenta la cantidad a pedir del producto a un número mayor de {int}")
    public void elClienteAumentaLaCantidadAPedirDelProductoAUnNúmeroMayorDe(int i) {
    }
    @Then("ver el carrito de compra en pantalla")
    public void verElCarritoDeCompraEnPantalla() {
        System.out.println("Ver carrito de compra");
    }

    @And("hace clic en {string}")
    public void presionoElBotónAgregarAlCarrito(String arg0) {
            limiteStock.clickAgregarCarrito();
    }

   /* @Then("se debe mostrar un popup que dice {string}")
    public void seDebeMostrarUnPopupQueDice(String arg0) {
        if (arg0.equals("Atención Has excedido el número máximo de unidades que puedes solicitar."))
       Assert.assertTrue(limiteStock.popUpMaximoDeUnidades.contains("Atención Has excedido el número máximo de unidades que puedes solicitar.\""));
    }
*/
}
