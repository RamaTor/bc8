package automationcraft.testcreation.farmacia.pages;

import automationcraft.engine.selenium.SeleniumBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductoConRecetaPage extends SeleniumBase {

    public ProductoConRecetaPage(WebDriver driver) {
        super(driver);
    }

    By cantidadDeProductos = By.xpath("//input[@class=\"input-text qty\"]");
    By pideRecetaMedica = By.xpath("//div[@data-ui-id=\"checkout-cart-validationmessages-message-error\"]");

    public void validarCantidadDeProductos() {
        int i = 1;
        if (cantidadDeProductos.equals(1)) ;
        {

            System.out.println("Cantidad de productos igual a 1");
        }
        /*public void solicitaRecetaMedica{

            if (pideRecetaMedica.equals("Este medicamento requiere receta médica. Es necesario subirla en el paso siguiente."))
            System.out.println("Solicita receta");
        }
    }*/

    }
}

