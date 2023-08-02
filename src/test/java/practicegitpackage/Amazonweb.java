package practicegitpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Amazonweb {
  @Test
  public void amazonweb() throws InterruptedException {
	  
 WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.amazon.in/");
	 Thread.sleep(1000);
	  driver.close();
  }
}
