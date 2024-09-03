package stepDefinitions;

import io.cucumber.java.After;
import utils.ContextSetup;

import java.io.IOException;

public class Hooks {
    ContextSetup contextSetup;
    public Hooks(ContextSetup contextSetup) {
        this.contextSetup = contextSetup;
    }
    @After
    public void afterScenario() throws IOException {
//        contextSetup.base.webDriverManager().quit();
    }
}
