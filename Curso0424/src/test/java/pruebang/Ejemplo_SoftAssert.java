package pruebang;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Ejemplo_SoftAssert {
	SoftAssert soft=new SoftAssert();
  @Test
  public void f() {
	  WebDriver driver = new ChromeDriver();
	  driver.get("https://www.saucedemo.com/");
	  
	  String expectedTitle= "Swag Labs";
	  String actualTitle = driver.getTitle();
	  String badTitle = "my store";
	  
	  soft.assertEquals(expectedTitle, actualTitle);
	  soft.assertEquals(expectedTitle, badTitle);
	  
	  soft.assertAll();
	  
  }
}
