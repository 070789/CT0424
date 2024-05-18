package prueba;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ejemplo_ImplicitWait {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver ();
	       driver.get("https://www.saucedemo.com/");
	       //implicit wait
	       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	       
            //obtener o identificar los objetos GUI/WebElements de la página
	       WebElement userNameTxt = driver.findElement(By.id("user-name"));
	       
	       driver.quit();
	       
	}

}
