import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;

public class Main {

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        clearThenType(wait, By.name("username"), "Admin");
        clearThenType(wait, By.name("password"), "admin123");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//span[text()='PIM']"))).click();

        clearThenType(wait, By.xpath("//label[text()='Employee Name']/../following-sibling::div//input"), "Amelia");
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='cell'][3]/div"))).click();

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@role='tab'][2]/a"))).click();

        clearThenType(wait, By.xpath("//label[text()='Street 1']/../following-sibling::div/input"), "firstStreet");
        clearThenType(wait, By.xpath("//label[text()='Street 2']/../following-sibling::div/input"), "secondStreet");
        clearThenType(wait, By.xpath("//label[text()='City']/../following-sibling::div/input"), "randomCity");
        clearThenType(wait, By.xpath("//label[text()='State/Province']/../following-sibling::div/input"), "randomState");
        clearThenType(wait, By.xpath("//label[text()='Zip/Postal Code']/../following-sibling::div/input"), "00000");

        clearThenType(wait, By.xpath("//label[text()='Home']/../following-sibling::div/input"), "0733333333");
        clearThenType(wait, By.xpath("//label[text()='Mobile']/../following-sibling::div/input"), "0744444444");
        clearThenType(wait, By.xpath("//label[text()='Work']/../following-sibling::div/input"), "0755555555");

        clearThenType(wait, By.xpath("//label[text()='Work Email']/../following-sibling::div/input"), "workemail@work.com");
        clearThenType(wait, By.xpath("//label[text()='Other Email']/../following-sibling::div/input"), "otheremail@other.com");

        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div//button[@type='submit']"))).click();

    }

    private static void clearThenType(WebDriverWait wait, By locator, String text) {
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        element.click();

        while (!element.getAttribute("value").isEmpty()) {
            element.sendKeys(Keys.BACK_SPACE);
        }

        element.sendKeys(text);
    }
}

