package week2day4HA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssg {

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
        String title = driver.getTitle();
        if(title.contains("Create Lead")) {
       	 System.out.println("page is load");
        }
        else {
   		System.out.println("page is not loaded");
   	}
        
        driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Test Leaf");
        driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Veera");
        driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Sekar");
        
        driver.findElement(By.name("departmentName")).sendKeys("Testing");
        driver.findElement(By.name("description")).sendKeys("performs good");
        driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("sekarveer455@gmail.com");
       
        // locate  dropdown
        WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
        Select drop =new Select(state);
        drop.selectByVisibleText("New York");
        driver.findElement(By.name("submitButton")).click();
        driver.findElement(By.className("subMenuButton")).click();
        driver.findElement(By.name("description")).clear();
        driver.findElement(By.name("importantNote")).sendKeys("edited the note");
        driver.findElement(By.name("submitButton")).click();
        String title2 = driver.getTitle();
		if (title2.contains("View Lead")) {
			System.out.println("page is loaded");
		}
		else {
			System.out.println("page is not load");
		}
		//driver.findElement(By.linkText("http://leaftaps.com/crmsfa/control/viewLead?partyId=14716"))
		driver.close();
	}
	

}
