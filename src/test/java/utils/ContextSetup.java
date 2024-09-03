package utils;

import com.earningsoft.billing.pageObjectManager.PageObjectManager;

import java.io.IOException;

public class ContextSetup {
    public Base base;
    public PageObjectManager pageObjectManager;

    public ContextSetup() throws IOException {
        base = new Base();
        pageObjectManager = new PageObjectManager(base.webDriverManager());
    }
}
