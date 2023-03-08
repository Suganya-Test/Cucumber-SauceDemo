package com.stepdefinition;

import com.baseclass.BaseClass;
import com.pom.PomPage01;
import com.pom.PomPage02;
import com.pom.PomPage03;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class StepDefinition extends BaseClass {
	
	
	PomPage01 p = new PomPage01(driver);
	PomPage02 p2 = new PomPage02(driver);
	PomPage03 p3 = new PomPage03(driver);
	
	@Given("User launch the url")
	public void user_launch_the_url() {
	    
		getUrl("https://www.saucedemo.com/");
	}

	@When("User click the username and send the username {string}")
	public void user_click_the_username_and_send_the_username(String string) {
	   p.getUserName().sendKeys(string);
	}

	@When("User click the password and send the password {string}")
	public void user_click_the_password_and_send_the_password(String string) {
	    p.getPassWord().sendKeys(string);
	}

	@When("User click the login button")
	public void user_click_the_login_button() {
	    p.getLogin().click();
	}

	@Then("See page shown")
	public void see_page_shown() {
		System.out.println("Saucedemo");
	}

	@When("User click the product")
	public void user_click_the_product() {
	  p2.getProduct().click();
	}

	@When("User click the add to cart")
	public void user_click_the_add_to_cart() {
	  p2.getAddToCart().click();
	}

	@When("User click the shopping cart badge")
	public void user_click_the_shopping_cart_badge() {
	   p2.getShoppingCart().click();
	}

	@When("User click the checkout button")
	public void user_click_the_checkout_button() {
	   p2.getCheckOut().click();
	}
	@When("User click the First Name and send {string}")
	public void user_click_the_first_name_and_send(String string) {
	   p3.getFirstName().sendKeys(string);
	}

	@When("User click the Last Name and send {string}")
	public void user_click_the_last_name_and_send(String string) {
	   p3.getLastName().sendKeys(string);
	}

	@When("User click the Postal code and send {string}")
	public void user_click_the_postal_code_and_send(String string) {
	    p3.getPost().sendKeys(string);
	}

	@When("User click the Continue button")
	public void user_click_the_continue_button() {
	    p3.getConti().click();
	}

	@When("User click the Finish button")
	public void user_click_the_finish_button() {
	    p3.getFinish();
	    driver.quit();
	}
}
