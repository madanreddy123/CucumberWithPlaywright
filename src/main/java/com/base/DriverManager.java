package com.base;

import com.base.ConfigReader;
import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import org.testng.Reporter;

import java.time.Duration;
import java.util.Properties;

public class DriverManager {
    private Playwright playwright;
    private Browser browser;
    private BrowserContext context;
    private Page page;
    private Properties prop;
    private ConfigReader configReader;

    public DriverManager() {
        try {
            configReader = new ConfigReader();
            prop = configReader.init_prop();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Page getPage() {
        return page;
    }

    public void initializeDriver() {
        playwright = Playwright.create();
        String BrowserName = null;
        if (Reporter.getCurrentTestResult() != null) {
            BrowserName = Reporter.getCurrentTestResult().getTestContext().getCurrentXmlTest().getParameter("browser");
        }
        if (BrowserName == null) {
            BrowserName = "chrome";
        }
        switch (BrowserName.toLowerCase()) {
            case "edge":
              browser= playwright.chromium().launch(new LaunchOptions().setChannel("msedge").setHeadless(false));
                break;
            case "chrome":
                browser= playwright.chromium().launch(new LaunchOptions().setChannel("chrome").setHeadless(false));
                break;
            case "firefox":
                browser= playwright.firefox().launch(new LaunchOptions().setHeadless(false));
                break;
            case "gridchrome":

                String wsendpoint = "ws://localhost:56214/239ac884a1acbce4b0b144e09f7712be";
                browser= playwright.chromium().connect(wsendpoint);
                break;
            default:
                throw new IllegalArgumentException("Unexpected browser: " + BrowserName);
        }
        context = browser.newContext();
        context.setDefaultTimeout(1000*10);
        page = context.newPage();
    }

    public void closeBrowser() {
        if (page != null) {
            page.close();
        }
        if (context != null) {
            context.close();
        }
        if (browser != null) {
            browser.close();
        }
        if (playwright != null) {
            playwright.close();
        }
    }

}