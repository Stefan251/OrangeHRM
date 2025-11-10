package org.example;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");


        WebElement username = driver.findElement(By.xpath("//input[@name=\"username\"]"));
        username.sendKeys("Admin");

        WebElement password = driver.findElement(By.xpath("//input[@name=\"password\"]"));
        password.sendKeys("admin123");

        WebElement loginElement = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        loginElement.click();
    }
}

