package Ajo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Drop {
	public static void main(String[] args) {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\amd\\eclipse-workspace\\Octobar\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://demo.guru99.com/test/drag_drop.html");
		
		WebElement drag=driver.findElement(By.xpath("//a[contains(text(),'BANK')]"));
		WebElement drop=driver.findElement(By.xpath("(//li[@class='placeholder'])[1]"));
		Actions a=new Actions(driver);
		a.dragAndDrop(drag,drop).perform();
	}

}
