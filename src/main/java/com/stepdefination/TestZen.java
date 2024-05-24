package com.stepdefination;

import com.base.ActionClass;
import com.base.ConfigReader;
import com.base.DriverManager;
import com.microsoft.playwright.Page;
import com.pages.LoginPage;
import com.pages.Educationpage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import java.util.Properties;

public class TestZen {

    ActionClass actions;
    public LoginPage loginPage;
    private Properties prop;
    private ConfigReader configReader;
    Page page;

    DriverManager driverManager;
    Educationpage educationpage;
    public TestZen(DriverManager driverManager){
        try {
            this.driverManager=driverManager;
            this.driverManager.initializeDriver();
            this.page = driverManager.getPage();
            loginPage = new LoginPage(page);
             educationpage = new Educationpage(page);
             actions = new ActionClass(page);
            configReader = new ConfigReader();
            prop = configReader.init_prop();

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
    @Given("user on login page")
    public void userOnLoginPage() {

        loginPage.launchURL();
    }

    @Given("validate the homepage")
    public void validateTheHomepage() throws InterruptedException {

        System.out.println(page.title());
        Thread.sleep(5000);
    }

    @Given("I enter the name a first_name {string}")
    public void i_enter_the_name_a_first_name(String first_name) throws InterruptedException {


        loginPage.Firstname(first_name);


        //WebElement element1 = driver.findElement(By.cssSelector("input[placeholder= 'Your Name']"));

        //Assert.assertEquals(element1.getAttribute("value"), "madan");
        ///validating the text is correct or not
    }

    @Given("I enter the name a Middle_Name {string}")
    public void i_enter_the_name_a_Middle_Name(String middle_Name) throws InterruptedException{
        loginPage.Middle_Name(middle_Name);

    }

    @Given("I enter the name a Last_Name {string}")
    public void i_enter_the_name_a_Last_Name(String last_Name)throws InterruptedException {
        loginPage.Lastname(last_Name);

    }

    @When("I enter the name a phone_number {string}")
    public void i_enter_the_name_a_phone_number(String phone_number) throws Throwable  {
        loginPage.Phone_number(phone_number);

    }

    @When("I enter the name a Address_One {string}")
    public void i_enter_the_name_a_Address_One(String address_One)  throws InterruptedException {
        loginPage.Address_One(address_One);
    }

    @When("I enter the Address_Two {string}")
    public void i_enter_the_Address_Two(String address_Two) throws InterruptedException {

        loginPage.Address_Two(address_Two);


    }
    @When("I enter the pin_code {string}")
    public void i_enter_the_pin_code(String pin_code) throws InterruptedException {
        loginPage.Pin_code(pin_code);

    }

    @When("I enter the continent {string}")
    public void i_enter_the_continent(String continent) throws InterruptedException {

        loginPage.Continent(continent);

    }


    @Given("I enter the name a Primary_School {string}")
    public void i_enter_the_name_a_Primary_School(String primary_School) throws InterruptedException {
        educationpage.launchurl();
        String gettitle = page.title();
        System.out.println(gettitle);
        educationpage.Primary_School(primary_School);



    }

    @Given("I enter the name a Secondary_School {string}")
    public void i_enter_the_name_a_Secondary_School(String secondary_School) throws InterruptedException{

        educationpage.Secondary_School(secondary_School);

    }

    @Given("I enter the name a Intermediate {string}")
    public void i_enter_the_name_a_Intermediate(String intermediate) throws InterruptedException {

        educationpage.Intermediate(intermediate);

    }

    @When("I enter the name a Engineering {string}")
    public void i_enter_the_name_a_Engineering(String engineering) throws InterruptedException {

        educationpage.Engineering(engineering);

    }

    @When("I enter the name a University {string}")
    public void i_enter_the_name_a_University(String university) throws InterruptedException {

        educationpage.University(university);

    }

    @When("I enter the intermediate_Percentage {string}")
    public void i_enter_the_intermediate_Percentage(String intermediate_Percentage) throws InterruptedException {

        educationpage.Intermediate_Percentage(intermediate_Percentage);
    }
    @When("I click on gender {string}")
    public void i_click_on_gender(String gender) throws InterruptedException {
        educationpage.Gender(gender);
    }

    @Then("upload a file and validate if its downloaded")
    public void uploadAFileAndValidateIfItsDownloaded() {

        educationpage.uploadAFileAndValidateIfItsDownloaded();
    }
}
