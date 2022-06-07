package com.vstl.DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generic.GenericMethods;

public class RadioButtonsInElements extends GenericMethods {

	public void selectRadioButtonYesinDoYouLikeTheSite() {
		
		WebElement objEWebElementRadio =  driver.findElement(By.xpath("//label[@for='yesRadio']"));
		objEWebElementRadio.click();
		System.out.println("Radio Button Yes is Selected");
	}
	
	public void verifyRadioButtonisEnabled() {
	
		boolean verifyRadio =  driver.findElement(By.xpath("//label[@for='yesRadio']")).isSelected();
		if(verifyRadio==true)
		System.out.println("Radio Button Yes is Selected in Selenium");
		else
			System.out.println("Radio Button is Not Clicked");
	}
	
	
public void selectRadioButtonNOinDoYouLikeTheSite() {
		
		WebElement objEWebElementRadio =  driver.findElement(By.xpath("//label[@for='noRadio']"));
		objEWebElementRadio.click();
		System.out.println("Radio Button No is Selected");
	}
	
	public void verifyRadioButtonNoisDisabled() {
	
		boolean verifyRadio =  driver.findElement(By.xpath("//label[@for='noRadio']")).isEnabled();
		if(verifyRadio==false)
		System.out.println("Unable to Select Radio Button No, Since it is disabled");
		else
			System.out.println("Radio Button is enabled");
	}

public void selectRadioButtonImpressiveinDoYouLikeTheSite() {
		
		WebElement objEWebElementRadio =  driver.findElement(By.xpath("//label[@for='impressiveRadio']"));
		objEWebElementRadio.click();
		System.out.println("Radio Button Impressive is Selected");
	}
	
	public void verifyRadioButtonImpressiveisEnabled() {
	
		boolean verifyRadio =  driver.findElement(By.xpath("//label[@for='impressiveRadio']")).isSelected();
		if(verifyRadio==true)
		System.out.println("Radio Button Impressive is Selected in Selenium");
		else
			System.out.println("Radio Button is Not Clicked");
	}
	

}
