package Day22;

import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;



public class LocatorsDemo {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		//name locator(identifier)
		//driver.findElement(By.name("search")).sendKeys("Mac");
		
		//id locator
		//boolean logoDisplayedStatus=driver.findElement(By.id("logo")).isDisplayed();
		//System.out.println(logoDisplayedStatus);
		
		//linkText and partial LinkText
		driver.findElement(By.linkText("Tablets")).click();
		
		//class name
		List<WebElement> headerLinks=driver.findElements(By.className("list-inline-item"));
		System.out.println("total number of headerlinks="+headerLinks.size());
		
		//tag name
		List<WebElement> links=driver.findElements(By.tagName("a"));
		System.out.println("total num of links"+links.size());
		
		//images
		
		
		
		
		

	}

}
