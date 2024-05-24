package com.pages;

import com.base.ActionClass;
import com.microsoft.playwright.Page;


public class Educationpage {

    Page page;
    ActionClass actions;


    String Primary_School = "//input[@placeholder='Primary School Name']";
    String Secondary_School = "//input[@placeholder='Secondary School Name']";
    String Intermediate = "//input[@placeholder='Intermediate College Name']";
    String Engineering = "//input[@placeholder='Engineering College Name']";
    String University = "//input[@placeholder='University Name']";
    String Intermediate_Percentage = "//input[@placeholder='Intermediate Percentage']";
    String Gender = "//input[@id='profession-0']";

    public Educationpage(Page page) {

        this.page = page;
        actions = new ActionClass(page);
    }

    //Parameterizing the void functions

    public void Primary_School(String primary_School)

    {
        actions.sendKeys(Primary_School, primary_School);

    }

    public  void Secondary_School(String secondary_School) throws InterruptedException

    {
        //actions.waitForVisibilityOfElement(Secondary_School, 15);
        actions.sendKeys(Secondary_School, secondary_School);


    }

    public  void Intermediate(String intermediate)

    {

        actions.sendKeys(Intermediate, intermediate);


    }
    public  void Engineering(String engineering) throws InterruptedException
    {

        actions.sendKeys(Engineering, engineering);

    }
    public  void University(String university) throws InterruptedException

    {
        actions.sendKeys(University, university);


    }

    public  void Intermediate_Percentage(String Percentage) throws InterruptedException

    {
        actions.click(Intermediate_Percentage);
        actions.sendKeys(Intermediate_Percentage, Percentage);
        actions.pressenter(Intermediate_Percentage);
        Thread.sleep(4000);


    }


    public  void Gender(String gender) throws InterruptedException

    {
        actions.click(Gender);

    }

    public void launchurl() {

        page.navigate("https://testzenlabs.ie/education-form/");
    }
    String uploadfile = "//input[@type = 'file']";

    public void uploadAFileAndValidateIfItsDownloaded() {

        actions.waitforSeconds(2);
        //actions.waitForVisibilityOfElement(uploadfile, 50);
//        actions.sendKeys(uploadfile, "/Downloads/TestData/sample.xlsx");
    }


}
