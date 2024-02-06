package week2day4HA;

import java.time.Duration;

import org.apache.commons.collections4.Get;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadsTeastLeaf {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
	
		String title = driver.getTitle();
		  if(title.contains("Find Leads")) {
		    	 System.out.println("page is load");
		     }
		     else {
				System.out.println("page is not loaded");
			}
		  Thread.sleep(2500);
		driver.findElement(By.linkText("Phone")).click();
		driver.findElement(By.name("phoneNumber")).sendKeys("9176696957");
		driver.findElement(By.xpath("//button[@class='x-btn-text']")).click();
	     Thread.sleep(3800);
		
        WebElement firstleadid = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]"));
        String leadid = firstleadid.getText();
        System.out.println(leadid);
        firstleadid.click();
        //driver.findElement(By.className("subMenuButtonDangerous")).clear();
          driver.findElement(By.xpath("//a[text()='Delete']")).click();
        driver.findElement(By.linkText("Find Leads")).click();
       
        driver.findElement(By.xpath("//input[@name='id']")).sendKeys(leadid);
        
       // driver.findElement(By.xpath("//a[text()='10180']")).click();
       driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
       System.out.println("find lead");
       
       WebElement record = driver.findElement(By.xpath("//div[contains(text(),'No records to display')]"));
       String text=record.getText();
       System.out.println(text);
       if (text.contains("No records to display")) {
		System.out.println("led id deleted");
	}
       else {
		System.out.println("not deleted");
	}       
	}

}
