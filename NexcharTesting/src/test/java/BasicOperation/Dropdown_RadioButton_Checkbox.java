package BasicOperation;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;


public class Dropdown_RadioButton_Checkbox {
	
	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(); 
		//driver.get("https://www.nexchar.com/signup");
		//select metohod use
		
		//Select dropdown= new Select(driver.findElement(By.id("CategoryId")));
		
		//dropdown.selectByVisibleText("Cafe and food truck");
		//Thread.sleep(2000);
		
		//dropdown.selectByValue("3");
		//Thread.sleep(2000);
		
		//dropdown.selectByIndex(4);
		//radio buttton check
		driver.get("http://demo.guru99.com/test/radio.html");
		//radio buttton 1
		//driver.findElement(By.id("vfb-7-1")).click();
		//radio buttton 2
		//driver.findElement(By.id("vfb-7-2")).click();
		//radio buttton 3
		//driver.findElement(By.id("vfb-7-3")).click();
		
		//check box testing
		//driver.findElement(By.id("vfb-6-0")).click();
		//driver.findElement(By.id("vfb-6-1")).click();
		//driver.findElement(By.id("vfb-6-2")).click();
		
		//input[@type="checkbox"]
		//xpath create kore, webelement list r modde checkbox create kore oi xpath chrckboxbox 
		//a store koresi
		List<WebElement> checkbox =driver.findElements(By.xpath("//input[@type=\"checkbox\"]"));
		//checkbox.
		
		
		System.out.println("The size of checkbox"+checkbox.size());
		
		for(WebElement a: checkbox)
		
		{
		 a.click();
	    }

	}
}
