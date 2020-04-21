package AutomationNew;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver.Options;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SignupPage {
	ChromeDriver driver;
	//public static void main(String[] args) {
	
		@Before
		public void browserlaunch()
		{
		System.setProperty("webdriver.chrome.driver", "E:\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Options op=driver.manage();
		Window win = op.window();
		win.maximize();
	    }
		
		@Test
		public void signup()
		{
			//ChromeDriver driver=new ChromeDriver();
		  WebElement user=driver.findElement(By.id("u_0_m"));
		  user.sendKeys("Umang");
		  
		  WebElement pass=driver.findElement(By.cssSelector("input#u_0_o"));
		  pass.sendKeys("Sachan");
		  
		  WebElement phone=driver.findElement(By.cssSelector("input#u_0_r"));
		  phone.sendKeys("8090791703");
		  
		  WebElement newpass=driver.findElement(By.cssSelector("input#u_0_w"));
		  newpass.sendKeys("iluvmomdad");
		  
		  WebElement day= driver.findElement(By.cssSelector("select#day"));
		  Select s= new Select(day);
		  s.selectByIndex(21);
		  
		  WebElement month= driver.findElement(By.cssSelector("select#month"));
		  Select d= new Select(month);
		  d.selectByIndex(11);
		  
		  WebElement year= driver.findElement(By.cssSelector("select#year"));
		  Select h= new Select(year);
		  h.selectByValue("1992");
		  
		  WebElement radio2 = driver.findElement(By.id("u_0_7"));
		  radio2.click();
		  
		  WebElement signupbutton=driver.findElement(By.id("u_0_13"));
		  signupbutton.click();
		  
		}
		@After
		public void browserclose()
		{
	     //ChromeDriver driver=new ChromeDriver();
		driver.close();
		}
		
}

