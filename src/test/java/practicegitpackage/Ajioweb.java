package practicegitpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Ajioweb {
  @Test
  public void ajioweb() throws InterruptedException
  {
	  WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.ajio.com/");
	  Thread.sleep(2000);
	  driver.close();
  }
}
