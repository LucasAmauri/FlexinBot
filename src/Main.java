import java.io.IOException;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.JavascriptExecutor;

public class Main  {

	public static void main(String[] args) throws IOException {
		
	System.setProperty("webdriver.gecko.driver" , "c:\\geckodriver.exe");
    FirefoxDriver driver;
    driver = new FirefoxDriver();
    
    driver.manage().window().maximize();
    driver.get("http://portal.helioprint.com.br/flex/app.html");
    
	}

}
