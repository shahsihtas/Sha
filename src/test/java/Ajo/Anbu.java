package Ajo;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Anbu {
	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\amd\\eclipse-workspace\\Octobar\\src\\main\\resources\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.navigate().to("https://demoqa.com/alerts");
		
		driver.findElement(By.id("alertButton")).click();
		Alert a=driver.switchTo().alert();
		Thread.sleep(2000);
		String text =a.getText();
		System.out.println(text);
		a.accept();
		
		}
}
