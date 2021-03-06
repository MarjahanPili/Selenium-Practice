package BasicOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TaskTwo {
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		// URL visit
		driver.get("https://katalon-demo-cura.herokuapp.com/");
		// -- Linktext Testing
		driver.findElement(By.linkText("Make Appointment")).click();
		//write on textbox(username,password)
		driver.findElement(By.id("txt-username")).sendKeys("John Doe");
		driver.findElement(By.id("txt-password")).sendKeys("ThisIsNotAPassword");
		driver.findElement(By.id("btn-login")).click();
		driver.quit();
		
	}

}
