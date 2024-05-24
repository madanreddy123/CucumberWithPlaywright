package com.stepdefination;

import com.base.ConfigReader;
import com.base.DriverManager;
import com.microsoft.playwright.Page;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.qameta.allure.Allure;

import java.io.ByteArrayInputStream;
import java.util.Properties;

public class ApplicationHooks {

    Page page;

    DriverManager driverManager;
    private Properties prop;
    private ConfigReader configReader;

    public ApplicationHooks(DriverManager driverManager){
        try {
            this.driverManager=driverManager;
            this.driverManager.initializeDriver();
            this.page = driverManager.getPage();
            configReader = new ConfigReader();
            prop = configReader.init_prop();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

    @After()
    public void tearDown(Scenario scenario) {
        if (scenario.isFailed()) {
            byte[] screenshot = page.screenshot(new Page.ScreenshotOptions().setFullPage(true));
            Allure.addAttachment("screenshot", new ByteArrayInputStream(screenshot));
        }
        driverManager.closeBrowser();
    }

}
