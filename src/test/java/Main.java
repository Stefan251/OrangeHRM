import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.name("username")).sendKeys("Admin");
        driver.findElement(By.name("password")).sendKeys("admin123");
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        Thread.sleep(2000);
        driver.findElement(By.xpath("//span[text()=\"PIM\"]")).click();

        Thread.sleep(2000);
        WebElement nameInput = driver.findElement(By.xpath("//label[text()=\"Employee Name\"]/../following-sibling::div//input"));
        nameInput.sendKeys("Amelia");

        Thread.sleep(1000);
        driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role=\"cell\"][3]/div")).click();

        Thread.sleep(1000);
        driver.findElement(By.xpath("//div[@role=\"tab\"][2]/a")).click();

        Thread.sleep(1000);
        WebElement firstStreet = driver.findElement(By.xpath("//label[text()=\"Street 1\"]/../following-sibling :: div/input"));
        firstStreet.clear();
        firstStreet.sendKeys("First Street");

        WebElement secondStreet = driver.findElement(By.xpath("//label[text()=\"Street 2\"]/../following-sibling :: div/input"));
        secondStreet.sendKeys("Second Street");

        WebElement city = driver.findElement(By.xpath("//label[text()=\"City\"]/../following-sibling :: div/input"));
        city.sendKeys("randomCity");

        WebElement state = driver.findElement(By.xpath("//label[text()=\"State/Province\"]/../following-sibling :: div/input"));
        state.sendKeys("randomState");

        WebElement postalCode = driver.findElement(By.xpath("//label[text()=\"Zip/Postal Code\"]/../following-sibling :: div/input"));
        postalCode.sendKeys("00000");

//        driver.findElement(By.xpath("//div[@class=\"oxd-select-wrapper\"]//i")).click();

//        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(4));
//        WebElement romania = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/div/div[2]/div[1]/form/div[1]/div/div[6]/div/div[2]/div/div[1]/div[2]/i")));
//        romania.click();

        WebElement homePhone = driver.findElement(By.xpath("//label[text()=\"Home\"]/../following-sibling :: div/input"));
        homePhone.sendKeys("0733333333");

        WebElement mobilePhone = driver.findElement(By.xpath("//label[text()=\"Mobile\"]/../following-sibling :: div/input"));
        mobilePhone.sendKeys("0744444444");

        WebElement workPhone = driver.findElement(By.xpath("//label[text()=\"Work\"]/../following-sibling :: div/input"));
        workPhone.sendKeys("0755555555");

        WebElement workEmail = driver.findElement(By.xpath("//label[text()=\"Work Email\"]/../following-sibling :: div/input"));
        workEmail.sendKeys("workemail@work.com");

        WebElement otherEmail = driver.findElement(By.xpath("//label[text()=\"Other Email\"]/../following-sibling :: div/input"));
        otherEmail.sendKeys("otheremail@other.com");

        Thread.sleep(3000);
        driver.findElement(By.xpath("//div//button[@type=\"submit\"]")).click();

    }
}

