package practicegitpackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Flipkartweb {
  @Test
  public void flipkartweb() throws InterruptedException {
	  
 WebDriver driver = new ChromeDriver();
	  
	  driver.get("https://www.flipkart.com/");
	  Thread.sleep(2000);
	  driver.close();
  }
}
