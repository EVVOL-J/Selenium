package org.example.selenium;

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
    public void openBrowserTest() {
        driver.get("https://www.google.ru/");
    }

    @AfterClass(alwaysRun = true)
    public void close() {
        driver.quit();
        driver = null;
    }
}
