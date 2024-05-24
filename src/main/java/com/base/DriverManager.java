package com.base;

import com.base.ConfigReader;
import com.microsoft.playwright.*;
import com.microsoft.playwright.BrowserType.LaunchOptions;
import org.testng.Reporter;

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
                String hostIp = System.getProperty("host.ip", "localhost");
                System.setProperty("host.ip", hostIp);
                browser= playwright.firefox().launch(new LaunchOptions().setHeadless(false));
                break;
            default:
                throw new IllegalArgumentException("Unexpected browser: " + BrowserName);
        }
        context = browser.newContext();
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