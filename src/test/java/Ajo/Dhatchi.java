package Ajo;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dhatchi {
	 public static void main(String[] args)throws Throwable{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amd\\eclipse-workspace\\Octobar\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.facebook.com");
//		driver.findElement(By.xpath("//span[text()='✕']")).click();
	
   //  webElement element=driver.findElement(By.xpath("//span[text()='Login']")).click();
     
      WebElement element=driver.findElement(By.id("email"));
        element.click();
        
        Actions ac= new Actions(driver);
        //ac.moveToElement(element).perform();
        ac.sendKeys(element,"java").perform();
        ac.contextClick(element).perform();
        
        Robot r= new Robot();
        for (int i=0;i<7;i++) {
        	r.keyPress(KeyEvent.VK_DOWN);
        	r.keyRelease(KeyEvent.VK_DOWN);
        }
        r.keyPress(KeyEvent.VK_ENTER);
    	r.keyRelease(KeyEvent.VK_ENTER);
	 	r.keyPress(KeyEvent.VK_TAB);
 		r.keyRelease(KeyEvent.VK_TAB);

 		r.keyPress(KeyEvent.VK_CONTROL);
 		r.keyRelease(KeyEvent.VK_V);
 	   // Thread.sleep(2000);
 		r.keyPress(KeyEvent.VK_CONTROL);
 		r.keyRelease(KeyEvent.VK_V);
}
}