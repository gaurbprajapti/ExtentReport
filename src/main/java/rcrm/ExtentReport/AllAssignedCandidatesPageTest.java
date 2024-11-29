package rcrm.ExtentReport;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterMethod;
import org.testng.annotations.*;
import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class AllAssignedCandidatesPageTest {

    private WebDriver driver;

    @Test
    public void bulkEmailToCandidateInAllAssignedCandidateListView() {
    	 driver = new ChromeDriver();
    	 getGooleLine(driver);
        // Additional test actions as needed
    }
    
    public void getGooleLine(WebDriver driver) {
    	 driver.get("https://www.google.com");
    }

    
    
    @AfterTest
    public void dropDriver() {
      driver.close();
      driver.quit();
    }
    
    @AfterSuite
    public void tearDownSuite() {
        // Flush Extent Report once after all tests complete
        ExtentManager.getInstance().flush();
    }
}
