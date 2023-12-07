package Ajo;

import java.security.KeyStore.*;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.decorators.WebDriverDecorator;


public class Sha {
	public static void main(String[] args){
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amd\\eclipse-workspace\\Octobar\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com");
		
		WebElement user1=driver.findElement(By.xpath("//span[text()='✕']"));
		user1.click();

		WebElement user2=driver.findElement(By.xpath("//input[@class='Pke_EE']"));
        user2.sendKeys("redmi mobiles");
      
        WebElement user3=driver.findElement(By.xpath("//button[@class='_2iLD__']"));
        user3.click();
        
        List<WebElement> l=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
        //System.out.println(l.size());
        for(int i=0;i<l.size();i++) {
        	WebElement value=l.get(i);
        	String text=value.getText();
        	System.out.println(text);
        }  
//        List<WebElement> ll=driver.findElements(By.xpath("//div[@class='_4rR01T']"));
//        for(int i=0;i<ll.size();i++) {
//        	WebElement value=l.get(i);
//        	Dimension size=value.getSize();
//        	System.out.println(size);
//      
        
//        Set<Entry<String,Interger>> entryset=user3.entrySet();
//        for(Entry<String,Interger>entry:entryset) {
//        	System.out.println(entry);
//        	System.out.println(entry.getKey());
//        	System.out.println(entry.getValue());
//        }
	}
	}


