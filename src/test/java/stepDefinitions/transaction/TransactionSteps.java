package stepDefinitions.transaction;

import com.earningsoft.billing.transaction.TransactionPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import utils.ContextSetup;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

public class TransactionSteps {
    public WebDriver driver;
    ContextSetup contextSetup;
    TransactionPage transactionPage;
    Properties properties;
    WebDriverWait wait;

    public TransactionSteps(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
        this.transactionPage = contextSetup.pageObjectManager.getTransactionPage();
        this.driver = transactionPage.driver;
        properties = new Properties();

        try {
            properties.load(new FileInputStream(System.getProperty("user.dir") + "/src/test/resources/global.properties"));
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    @Given("login form is displayed")
    public void loginForm() throws InterruptedException {
        wait = new WebDriverWait(transactionPage.driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(transactionPage.getLoginForm()));
        Assert.assertTrue(transactionPage.getLoginForm().isDisplayed());
        Thread.sleep(1000);
    }

    @When("Enter username and password")
    public void enter_username_and_password() throws InterruptedException {
        String username = properties.getProperty("username");
        String password = properties.getProperty("password");

        transactionPage.getEmailInput().sendKeys(username);
        Thread.sleep(1000);
        transactionPage.getPasswordInput().sendKeys(password);
        Thread.sleep(1000);
    }
    @When("Click on the login button")
    public void click_on_the_login_button() throws InterruptedException {
        Assert.assertTrue(transactionPage.getLoginButton().isDisplayed());
        Thread.sleep(1000);
        transactionPage.getLoginButton().click();
    }
}
