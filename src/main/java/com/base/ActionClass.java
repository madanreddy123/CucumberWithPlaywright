package com.base;



import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;

public class ActionClass {

    Page page;

    public ActionClass(Page page) {
        this.page = page;
    }



    public void waitforSeconds(long timeinSec) {
        try {
            Thread.sleep(1000*timeinSec);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void click(String loc) {

       Locator locator = page.locator("xpath=" + loc);
       locator.click();
    }


    public void clickUsingJS(String loc){

    }

    public void sendKeys(String loc,String arg0) {
        Locator locator = page.locator("xpath=" + loc);
        locator.fill(arg0);
        String text = locator.getAttribute("value");
        System.out.println(text);
    }

    public void pressenter(String loc) {
        Locator locator = page.locator("xpath=" + loc);
        locator.press("Enter");
    }

}
