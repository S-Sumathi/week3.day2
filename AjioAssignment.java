package week3.day2;

import java.time.Duration;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AjioAssignment {
	public static void main(String[] args) throws InterruptedException {
			
			//Call WDM for the browser driver
			WebDriverManager.chromedriver().setup();
			
			//Handle Browser Notifications
			ChromeOptions options=new ChromeOptions();
			
			//Notifications
			options.addArguments("--disable-notifications");
			
			//Launch the browser
			ChromeDriver driver=new ChromeDriver();
			
			//Load the url
			driver.get("https://www.ajio.com/");
			
			Thread.sleep(2000);
			//Maximize the browser
			driver.manage().window().maximize();
			
			//Manage timeout
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
			
			//Type in the Search box
			driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
			Thread.sleep(2000);
			
			//Click on Men checkbox
			driver.findElement(By.xpath("//label[@for='Men']")).click();
			Thread.sleep(2000);

			//Click on Category
			driver.findElement(By.xpath("//label[@for='Men - Fashion Bags']")).click();
			Thread.sleep(2000);
			
			//Get the total items
            String totalitems=driver.findElement(By.className("length")).getText();
            System.out.println("The number of iems found:"+totalitems);
            
            //Get the brand name 
            List<WebElement> brandName=driver.findElements(By.className("brand"));
			System.out.println("Brand Lists are:"+brandName.size());
            
            //Iterate over the list
            for (WebElement webElement : brandName) {
            	String brandName1=webElement.getText(); 
            	System.out.println("Brand Names are:"+brandName1);
				
			}
            //Get the bag names and iterate over the list
            List<WebElement> bagName=driver.findElements(By.className("nameCls"));
            for (WebElement webElement : bagName) {
            	String bagName1=webElement.getText();
            	System.out.println("Bag Names are:"+bagName1);
            	
      		}
         }
}
