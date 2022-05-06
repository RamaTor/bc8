package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CarritoDeComprasPage extends SeleniumBase {

    public CarritoDeComprasPage (WebDriver driver) {super(driver);}

    //atributos

    By btnAgregarAlCarrito = By.xpath("//button[@class=\"action tocart primary \"]");
    By mensajeOKAgregarProductoAlCarrito = By.xpath ("//div[@class='toast-message']");
  //  By contadorProductosAlCarrito = By.xpath("");
    By btnCarrito = By.xpath("//span[@class=\"counter-number\"]");
    By btnVerCarrito = By.xpath("//i[@class=\"navbar-tool-icon icon-cart\"]");

    //funciones
    public void irAURLFarmacia(String url){
        goToUrl(url);
    }

    public void clickAgregarCarrito(){
        click(btnAgregarAlCarrito);
    }

    public String validarMensajeImpresoProductoEnCarrito() {
        exwait(mensajeOKAgregarProductoAlCarrito);
        if (isDisplayed(mensajeOKAgregarProductoAlCarrito)) ;
        {
            return getText(mensajeOKAgregarProductoAlCarrito);
        }
    }
}
