package ru.heisenbug;

import com.codeborne.selenide.Configuration;
import org.junit.jupiter.api.extension.BeforeAllCallback;
import org.junit.jupiter.api.extension.ExtensionContext;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.util.Map;

public class MySelenoidSetup implements BeforeAllCallback {

    @Override
    public void beforeAll(ExtensionContext extensionContext) throws Exception {
        DesiredCapabilities capabilities = new DesiredCapabilities();
//        capabilities.setCapability("browserName", "firefox");
//        capabilities.setCapability("browserVersion", "86.0");
//        capabilities.setBrowserName("chrome");
//        capabilities.setVersion("");
        Configuration.browser = "firefox";
        Configuration.browserVersion = "86.0";
        capabilities.setCapability("enableVNC", true);
        capabilities.setCapability("enableVideo", true);

        Configuration.browserCapabilities = capabilities;
        Configuration.remote = "http://localhost:4444/wd/hub";

    }
}
