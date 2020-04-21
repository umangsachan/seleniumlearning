package AutomationNew;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginScript {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Options op =driver.manage();
		Window w=op.window();
		w.maximize();
		
		WebElement user=driver.findElement(By.id("email"));
		user.sendKeys("Umang");
		WebElement pass=driver.findElement(By.cssSelector("input#pass"));
		pass.sendKeys("Sachan");
		WebElement loginbutton=driver.findElement(By.id("u_0_b"));
		loginbutton.click();
		

	}

}
