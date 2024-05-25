package com.base;



import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import org.openqa.selenium.By;

public class ActionClass {

    Page page;

    public ActionClass(Page page) {
        this.page = page;
    }

public void waitforlementvisbility(By loc, int sec)
{

    String xpathString = byToXPathString(loc);
    System.out.println("XPath String: " + xpathString);
    page.waitForSelector(xpathString, new Page.WaitForSelectorOptions().setTimeout(1000*sec));

}

    public void waitforSeconds(long timeinSec) {
        try {
            Thread.sleep(1000*timeinSec);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }

    public void click(String loc) {

       Locator locator = page.locator("xpath=" + loc);
       locator.click();
    }


    public void clickUsingJS(By loc){
        String xpathString = byToXPathString(loc);
        System.out.println("XPath String: " + xpathString);
        Locator locator = page.locator("xpath=" + xpathString);
        locator.click();
    }

    private  String byToXPathString(By by) {

        String byString = by.toString();

        if (byString.startsWith("By.xpath: ")) {
            return byString.substring(10); // Extract the XPath expression
        } else {
            throw new IllegalArgumentException("The provided By locator is not an XPath locator: " + byString);
        }
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
