package BasicOperation;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.sun.org.apache.bcel.internal.generic.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConnectUrl {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nexchar.com/");
		// System.out.println("The tittle of the webpage is:"+driver.getTitle());
	    // System.out.println("The tittle of the webpage is:"+driver.getPageSource());
		//driver.manage().window().maximize();
		//driver.manage().window().fullscreen();
		//Thread.sleep(7000);
		//driver.manage().window().minimize();
		//driver.navigate().to("https://www.aiub.edu/");
		//driver.navigate().back();
		//driver.navigate().forward();
		//Thread.sleep(7000);
		//driver.navigate().refresh();
		//driver.switchTo().newWindow(WindowType.TAB).get("https://www.aiub.edu/");;
		//driver.get("https://www.aiub.edu/");
		
		//Dimension d = new Dimension(200,400);
		//driver.manage().window().setSize(d);
		
		//Select dropdown = new Select (driver.findElement(By.id(""))));
		//driver.get("https://nexchar.com/signin");
		
		//give value in emailbox and clear all value
		//WebElement emailbox= driver.findElement(By.id("Email"));
	//	emailbox.sendKeys("abcd");
		//emailbox.clear();
		
		//use web locator id
		//driver.findElement(By.id("Email")).sendKeys("gift_shop");
		//use web locator name
		//driver.findElement(By.name("Password")).sendKeys("12345");
		//use web locator xpath
		//driver.findElement(By.xpath("//body/div[1]/div[1]/div[1]/form[1]/div[1]/div[2]/div[1]/div[1]/span[1]/a[1]/*[1]")).click();
		//use web locator cssselector
		//driver.findElement(By.cssSelector("body.antialiased:nth-child(2) div.page:nth-child(1) div.flex-fill.d-flex.flex-column.justify-content-center.py-4 div.container-tight.py-6 form.card.card-md.sm-borderless div.card-body:nth-child(1) div.form-footer:nth-child(5) > button.btn.btn-primary.w-100")).click();
		
		//driver.navigate().back();
		//use web locator LinkText
		driver.findElement(By.linkText("Contact")).click();
		
		//use web locator Partial LinkText
		//driver.findElement(By.partialLinkText("Dem")).click();
		
		//use web locator className
		//driver.findElement(By.className("navbar-brand-image")).click();
		
		//Text area testing
		driver.findElement(By.id("Message")).sendKeys("asjjvn kxvnn xnvn nxcvmnb");
		
		
	}
	} 
	      

