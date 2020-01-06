package allDriversReader;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

public class Drivers {
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  
	  WebDriver driver=new FirefoxDriver();
	  driver.get("");
	  
  }

}
