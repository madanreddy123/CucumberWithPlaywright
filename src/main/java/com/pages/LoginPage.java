package com.pages;

import com.base.ActionClass;
import com.microsoft.playwright.Page;

public class LoginPage {
	
	 Page page;

	
	 String Firstname = "//input[@placeholder='Your Name']";
	 String Middle_Name = "//input[@placeholder='Your Middle Name']";
	 String Lastname = "//input[@placeholder='Your Last Name']";
	 String Phone_number = "//input[@placeholder='Phone Number']";
	 String Address_One = "//input[@placeholder='Your Address']";
	 String Address_Two = "//input[@placeholder='Your Address Two']";
	 String Pin_code = "//input[@placeholder='Your Pin Code']";
	 String Continent = "//input[@placeholder='Asia']";

	 ActionClass actions;
	 public LoginPage(Page page) {
		 this.page = page;
		 actions = new ActionClass(page);
	}

		//Parameterizing the void functions
		
	 public void Firstname(String first_name)
		 
		 {

			 actions.sendKeys(Firstname, first_name);

			 
		    }
		
		public void Middle_Name(String middle_Name)  
		 
		 {

			 actions.sendKeys(Middle_Name, middle_Name);


			 
		    }
		
	public void Lastname(String last_Name)
	{
		
		actions.sendKeys(Lastname, last_Name);
	}
	
	public  void Phone_number(String phone_number) {
		
		actions.sendKeys(Phone_number, phone_number);
		}
	
	
	public  void Address_One(String address_One) {

		actions.sendKeys(Address_One, address_One);
		}
	
	public  void Address_Two(String address_Two) {
		actions.sendKeys(Address_Two, address_Two);
			}
	
public  void Pin_code(String pin_code) {

	actions.sendKeys(Pin_code, pin_code);
			}

public  void Continent(String continent) {

	actions.sendKeys(Continent, continent);

}


    public void launchURL() {

        page.navigate("https://testzenlabs.ie/general-information-form/");
    }
}