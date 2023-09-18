package base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.json.JsonOutput;

import java.util.List;

public class Excersice {
    private WebDriver driver;

    public void setup(){
        System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");
        driver = new ChromeDriver();

        driver.get("https://the-internet.herokuapp.com/");

        WebElement link = driver.findElement(By.linkText("Shifting Content"));
        link.click();

        driver.findElement(By.linkText("Example 1: Menu Element")).click();

        List<WebElement> elements = driver.findElements(By.xpath("//li/a[@href]"));
//        List<WebElement> elements = driver.findElements(By.tagName("li"));
        System.out.println("Number of menu items: " + elements.size());
        driver.quit();
    }

    public static void main(String[] args) {
        Excersice test = new Excersice();
        test.setup();
    }
}
