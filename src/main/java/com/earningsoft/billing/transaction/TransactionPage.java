package com.earningsoft.billing.transaction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransactionPage {
    public WebDriver driver;

    By loginForm = By.className("validate-form");
    By emailInput = By.xpath("//input[@placeholder='Email']");
    By passwordInput = By.xpath("//input[@placeholder='Password']");
    By loginButton = By.xpath("//button[normalize-space()='Login']");

    public TransactionPage(WebDriver driver) {
        this.driver = driver;
    }
    public WebElement getLoginForm() {
        return driver.findElement(loginForm);
    }
    public WebElement getEmailInput() {
        return driver.findElement(emailInput);
    }
    public WebElement getPasswordInput() {
        return driver.findElement(passwordInput);
    }
    public WebElement getLoginButton() {
        return driver.findElement(loginButton);
    }
}
