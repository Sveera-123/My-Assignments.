package week2day3;

import org.apache.poi.hssf.record.SelectionRecord;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LoginTestLeaf {

	public static void main(String[] args) {
    ChromeDriver driver=new ChromeDriver();
     driver.get("http://leaftaps.com/opentaps/control/main");
     driver.manage().window().maximize();
     driver.findElement(By.id("username")).sendKeys("demosalesmanager");
     driver.findElement(By.id("password")).sendKeys("crmsfa");
     driver.findElement(By.className("decorativeSubmit")).click();
     driver.findElement(By.linkText("CRM/SFA")).click();
     driver.findElement(By.linkText("Leads")).click();
     driver.findElement(By.linkText("Create Lead")).click();
     System.out.println(driver.getTitle());
     driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Test Leaf");
     driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Veera");
     driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Sekar");
     driver.findElement(By.name("submitButton")).click();
      //verify the load page for current page
     String title = driver.getTitle();
     if(title.contains("My Leads")) {
    	 System.out.println("page is load");
     }
     else {
		System.out.println("page is not loaded");
	}
     // find drpodown locating
     
    WebElement source  =driver.findElement(By.id("createLeadForm_dataSourceId"));
    // creat object  for select class
    
      Select drop =new Select(source);
      
      // helper method to  pick specific opton
      
       drop.selectByIndex(3);
      
     //System.out.println(sourceDropdown.getFirstSelectedOption().getText();
	}

}
