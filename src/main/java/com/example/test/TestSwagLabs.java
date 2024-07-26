package com.example.test;

import io.qameta.allure.Description;
import io.qameta.allure.Step;
import io.qameta.allure.junit4.DisplayName;
import io.qameta.allure.Attachment;
import org.apache.commons.io.FileUtils;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.junit.Assert.assertEquals;

public class TestSwagLabs {

    private WebDriver driver;
    private WebDriverWait wait;
    private static final Logger logger = Logger.getLogger(TestSwagLabs.class.getName());

    @Before
    public void setUp() {
        // Configurar o logger para exibir no console
        ConsoleHandler consoleHandler = new ConsoleHandler();
        consoleHandler.setLevel(Level.ALL);
        logger.addHandler(consoleHandler);
        logger.setLevel(Level.ALL);

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10)); // espera de 10 segundos
        logger.info("Browser opened and WebDriver initialized.");
    }

    @Test
    @DisplayName("Test Swag Labs Login")
    @Description("Test the login functionality of Swag Labs and validate the Products page")
    public void testSwagLabsLogin() {
        try {
            stepOpenLoginPage();
            stepValidateLoginPageTitle();
            stepEnterCredentialsAndLogin();
            stepValidateMainPage();
            stepValidateProductsSection();
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Test encountered an exception: ", e);
            saveScreenshotPNG("Error Screenshot");
            throw e; // Re-throw the exception to let JUnit handle it
        }
    }

    @Step("Open Swag Labs login page")
    private void stepOpenLoginPage() {
        driver.get("https://www.saucedemo.com/");
        logger.info("Navigated to Swag Labs login page.");
        saveScreenshotPNG("01 - Swag Labs Login Page");
        sleep(1000);
    }

    @Step("Validate login page title")
    private void stepValidateLoginPageTitle() {
        WebElement nameElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("login_logo")));
        String pageName = nameElement.getText().trim();
        assertEquals("Swag Labs", pageName);
    }

    @Step("Enter username and password, then login")
    private void stepEnterCredentialsAndLogin() {
        WebElement username = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("user-name")));
        username.sendKeys("standard_user");
        logger.info("Entered username.");
        saveScreenshotPNG("02 - Username Entered");
        sleep(1000);

        WebElement password = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("password")));
        password.sendKeys("secret_sauce");
        logger.info("Entered password.");
        saveScreenshotPNG("03 - Password Entered");
        sleep(1000);

        WebElement loginButton = wait.until(ExpectedConditions.elementToBeClickable(By.id("login-button")));
        loginButton.click();
        logger.info("Clicked login button.");
        saveScreenshotPNG("04 - Login Button Clicked");
        sleep(3000);
    }

    @Step("Validate main page title after login")
    private void stepValidateMainPage() {
        WebElement logoElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("app_logo")));
        String pageMain = logoElement.getText().trim();
        logger.info("Main page title after login: " + pageMain);
        assertEquals("Swag Labs", pageMain);
        saveScreenshotPNG("05 - Main Page Title Validated");
        sleep(1000);
    }

    @Step("Validate Products section title")
    private void stepValidateProductsSection() {
        WebElement sectionProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("title")));
        String pageMainProd = sectionProduct.getText().trim();
        logger.info("Products section title: " + pageMainProd);
        assertEquals("Products", pageMainProd);
        saveScreenshotPNG("06 - Products Section Title Validated");
        sleep(5000);
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
            logger.info("Browser closed.");
        }
    }

    @Attachment(value = "{0}", type = "image/png")
    public byte[] saveScreenshotPNG(String name) {
        File screenshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        File screenshotLocation = new File("screenshots/" + name + ".png");
        try {
            FileUtils.copyFile(screenshot, screenshotLocation);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }

    private void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}