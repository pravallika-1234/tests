import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.util.*;

public class CodingPractice23 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Desktop\\selenium\\chromedriver-win64 (5)\\chromedriver-win64\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.navigate().to("https://qabloglist.ccbp.tech/");

        String expectedHomepageUrl = "https://qabloglist.ccbp.tech/";
        String expectedAboutPageUrl = "https://qabloglist.ccbp.tech/about";
        String expectedContactPageUrl = "https://qabloglist.ccbp.tech/contact";

        String currentUrl = driver.getCurrentUrl();

        if(expectedHomepageUrl.equals(currentUrl)) System.out.println("Navigated to Homepage");
        else System.out.println("Navigation to Homepage Failed");

        List<WebElement> linksList = driver.findElements(By.className("link-item"));

        WebElement aboutLink = linksList.get(1);
        WebElement contactLink = linksList.get(2);

        aboutLink.click();

        currentUrl = driver.getCurrentUrl();

        if(expectedAboutPageUrl.equals(currentUrl)) System.out.println("Navigated to About page");
        else System.out.println("Navigation to About page Failed");

        contactLink.click();

        currentUrl = driver.getCurrentUrl();

        if(expectedContactPageUrl.equals(currentUrl)) System.out.println("Navigated to Contact page");
        else System.out.println("Navigation to Contact page Failed");

        driver.navigate().back();

        currentUrl = driver.getCurrentUrl();

        if(expectedAboutPageUrl.equals(currentUrl)) System.out.println("Navigated to About page");
        else System.out.println("Navigation to About page Failed");

        driver.navigate().forward();

        currentUrl = driver.getCurrentUrl();

        if(expectedContactPageUrl.equals(currentUrl)) System.out.println("Navigated to Contact page");
        else System.out.println("Navigation to Contact page Failed");

        driver.quit();
    }
}
