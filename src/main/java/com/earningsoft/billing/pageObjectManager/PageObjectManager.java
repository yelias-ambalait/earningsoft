package com.earningsoft.billing.pageObjectManager;

import com.earningsoft.billing.transaction.TransactionPage;
import org.openqa.selenium.WebDriver;

public class PageObjectManager {
    public static WebDriver driver;

    TransactionPage transactionPage;
    public PageObjectManager(WebDriver driver) {
        this.driver = driver;
    }

    public TransactionPage getTransactionPage() {
        transactionPage = new TransactionPage(driver);
        return transactionPage;
    }
}
