package eFinancialCareersTests;

import java.time.Duration;
import java.util.concurrent.TimeUnit;
import eFinancialCareersPages.HomePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
    private WebDriver driver;
    public HomePage homepage;

    @BeforeClass
    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.efinancialcareers.com/");
        homepage = new HomePage(driver);
        driver.manage().window().maximize();

    }


    @AfterClass
    public void teardown(){
//        driver.quit();
    }
}
