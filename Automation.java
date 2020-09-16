package TestingSamples;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Automation {
    public static void main(String[] args) throws Exception {
        System.setProperty("webdriver.chrome.driver","S:/Webdriver/chromedriver_win32/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        Thread.sleep(5000);
        driver.get("https://cutebabypic.in/september-2020/?contest=photo-detail&photo_id=4244");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//div[contains(text(),'Vote Now!')]")).click();
        Thread.sleep(20000);
        driver.quit();

    }
}
