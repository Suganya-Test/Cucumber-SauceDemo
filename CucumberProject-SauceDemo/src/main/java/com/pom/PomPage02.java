package com.pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomPage02 {
	public static WebDriver driver;
	
	@FindBy(xpath="(//div[@class='inventory_item_name'])[1]")
	private WebElement product;
	
	@FindBy(xpath="//button[@class='btn btn_primary btn_small btn_inventory']")
	private WebElement addToCart;
	
	@FindBy(xpath="//a[@class='shopping_cart_link']")
	private WebElement shoppingCart;
	
	@FindBy(xpath="//button[text()='Checkout']")
	private WebElement checkOut;

	public PomPage02(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public WebElement getProduct() {
		return product;
	}

	public WebElement getAddToCart() {
		return addToCart;
	}

	public WebElement getShoppingCart() {
		return shoppingCart;
	}

	public WebElement getCheckOut() {
		return checkOut;
	}
	
}
