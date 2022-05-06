package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LimiteDeStockPage extends SeleniumBase {

    public LimiteDeStockPage(WebDriver driver) {super(driver);}

    By cantidadDeProductos = By.xpath("//input[@class=\"input-text qty\"]");
    By aumentarProductosAlCarrito = By.xpath("//input[@class=\"input-text qty\"]");
    By btnActualizarCompra = By.xpath ("//button[@class=\"action update\"]");
    By popUpExcesoDeUnidades = By.xpath("//h1[@id=\"modal-title-25\"]");



    public void validarCantidadDeProductos(){
        int i = 1;
        if (cantidadDeProductos.equals(1));{

            System.out.println("Cantidad de productos igual a 1");
        }
    }

    public void aumentarCantidadDeProductos(){
        int i = 11;
        if (cantidadDeProductos.equals(11));{

            System.out.println("Excedido el número máximo de unidades");
        }
    }

    public void clickActualizarCompra(){

        click(btnActualizarCompra);
    }

    public String popUpMaximoDeUnidades() {
        exwait(popUpExcesoDeUnidades);
        if (isDisplayed(popUpExcesoDeUnidades)) ;
        {
            return getText(popUpExcesoDeUnidades);
        }
    }

}

