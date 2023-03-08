package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage03 {

	public static WebDriver driver;
	
	@FindBy(xpath="//input[@name='firstName']")
	private WebElement firstName;
	
	@FindBy(xpath="//input[@name='lastName']")
	private WebElement lastName;
	
	@FindBy(xpath="//input[@name='postalCode']")
	private WebElement post;
	
	@FindBy(xpath="//input[@name='continue']")
	private WebElement conti;
	
	@FindBy(xpath="	//button[text()='Finish']")
	private WebElement finish;

	public PomPage03(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}

	public WebElement getFirstName() {
		return firstName;
	}

	public WebElement getLastName() {
		return lastName;
	}

	public WebElement getPost() {
		return post;
	}

	public WebElement getConti() {
		return conti;
	}

	public WebElement getFinish() {
		return finish;
	}
}
