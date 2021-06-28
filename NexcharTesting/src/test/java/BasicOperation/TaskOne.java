package BasicOperation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskOne {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver Driver = new ChromeDriver();
		Driver.get("http://automationpractice.com/index.php");
		
		System.out.println("Capture url :"+Driver.getCurrentUrl());
		System.out.println("Title :"+Driver.getTitle());
		
		Driver.navigate().to("https://www.nexchar.com/");
		Thread.sleep(5000);
		Driver.navigate().refresh();
	}
}
