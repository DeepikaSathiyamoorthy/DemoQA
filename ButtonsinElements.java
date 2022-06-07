package com.vstl.DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.vstl.generic.GenericMethods;

public class ButtonsinElements extends GenericMethods {

	
	
	public void clickOnDoubleClickMe() {
		
		Actions actions = new Actions(driver);
		WebElement doubleClickButton = driver.findElement(By.id("doubleClickBtn"));
		actions.doubleClick(doubleClickButton).perform();
		System.out.println("Double Clicked onto the Button");
	}

	public void clickOnRightClickMe() {
		
		Actions actions = new Actions(driver);
		WebElement rightClickButton = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(rightClickButton).perform();
		System.out.println("Right Clicked onto the Button");		
	}
	
	public void clickOnButton() {
		
		//Dynamic Button Hence used customized Xpath since dynamic elements could not be locate always using Full Xpath and Other IDS
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[2]/div[2]/div[3]/button")).click();
		System.out.println(" Clicked onto the Dynamic Button");
	}
}
