package prueba;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium {

	public static void main(String[] args) throws InterruptedException {
       WebDriver driver = new ChromeDriver ();
       driver.get("https://www.saucedemo.com/");
       //obtener o identificar los objetos GUI/WebElement
       WebElement userNameTxt = driver.findElement(By.id("user-name"));
       WebElement pwdTxt = driver.findElement(By.name("password"));
       WebElement loginBtn = driver.findElement(By.id("login-button"));
       
       
       //login
       userNameTxt.sendKeys("standard_user");
       Thread.sleep(2000);
       pwdTxt.sendKeys("secret_sauce");
       Thread.sleep(2000);
       loginBtn.click();
       Thread.sleep(2000);
       
       	
       //metodos del explorador
       
       String title = driver.getTitle();
       System.out.println(title);
       
       String url = driver.getCurrentUrl();
       System.out.println(url);
       
       //Metodos de navegación
       //driver.navigate().back();
       //Thread.sleep(2000);
       //driver.navigate().forward();
       //Thread.sleep(2000);
       //driver.navigate().refresh();
       
       //vrificar elemento en la pagina
       
       boolean prodDisplayed = driver.findElement (By.className("inventory_item_name")).isDisplayed();
       if (prodDisplayed) {
    	   System.out.println("El articulo está desplegado");
    	   
       }
       
       String prodName = driver.findElement(By.className("inventory_item_name")).getText();
       boolean msjCorrect = prodName.contains("Sauce Labs Backpack");
       if (msjCorrect) {
    	   System.out.println("El nombre del articulo está correcto");
    	   
       }else {
    	   System.out.println("El nombre del articulo está incorrecto");
       }
     
       //Dropdowns
       Select drpProdCont = new Select(driver.findElement(By.className("product_sort_container")));
       drpProdCont.selectByVisibleText("Price (low to high)");
       Thread.sleep(2000);
       
       //Cerrar el navegador 
       //driver.close();//Cerrar la ventana actual que el Webdriver esta utilizando
       driver.quit(); //CIerra todas la ventanas que el webdriver haya abierto
	}

}



