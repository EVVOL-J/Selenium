package org.example.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class FirstTest {
    private WebDriver driver;

    @BeforeClass
    public void setup() {
        driver = new ChromeDriver();
    }

    @Test
    public void loginTest() {
        driver.get("http://localhost/litecart/admin/");
        driver.findElement(By.name("username")).sendKeys("admin");
        driver.findElement(By.name("password")).sendKeys("admin");
        driver.findElement(By.name("login")).click();
    }

    @AfterClass(alwaysRun = true)
    public void close() {
        driver.quit();
        driver = null;
    }
}
