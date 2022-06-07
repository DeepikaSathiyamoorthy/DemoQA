package com.vstl.DemoQA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generic.GenericMethods;

public class CheckBoxInElements extends GenericMethods{

	public void selectCheckBoxHome() {
		
		driver.findElement(By.xpath("//button[@class='rct-collapse rct-collapse-btn']")).click();
		System.out.println("CheckBox is clicked");
	}
	
	public void selectDesktopUnderCheckBox() {
		
		driver.findElement(By.xpath("//input[@id='tree-node-desktop']/parent::label/span[@class='rct-checkbox']")).click();
		System.out.println("Desktop is clicked");
		
	}
	
	public void verifyDesktopisSelected() {
		
	WebElement elementCheckBox = driver.findElement(By.xpath("//input[@id='tree-node-desktop']/parent::label/span[@class='rct-checkbox']"));
		
		if(elementCheckBox.isSelected()==true)
		System.out.println(elementCheckBox.isSelected()+" is Selected");
		else
		System.out.println("Desktop is not selected");
	
		}
	
	public void selectDocumentsUnderCheckBox() {
		
		driver.findElement(By.xpath("//input[@id='tree-node-documents']/parent::label/span[@class='rct-checkbox']")).click();
		System.out.println("Documents option is clicked");
		
	}
	
	public void verifyDocumentsisSelected() {
		
		WebElement elementCheckBox = driver.findElement(By.xpath("//input[@id='tree-node-documents']/parent::label/span[@class='rct-checkbox']"));
		setImplicitWait(2000);
		if(elementCheckBox.isSelected())
			System.out.println("Documents Option is Selected");
		else
			System.out.println("Documents option is not selected");
	}
	
public void selectDownloadsUnderCheckBox() {
		
		driver.findElement(By.xpath("//input[@id='tree-node-downloads']/parent::label/span[@class='rct-checkbox']")).click();
		System.out.println("Downloads option is clicked");
		
	}
	
	public void verifyDownloadssisSelected() {
		
		WebElement elementCheckBox = driver.findElement(By.xpath("//input[@id='tree-node-downloads']/parent::label/span[@class='rct-checkbox']"));
		setImplicitWait(2000);
		if(elementCheckBox.isSelected())
			System.out.println(elementCheckBox.isSelected()+" is Selected");
		else
			System.out.println("Downloads option is not selected");
	}
	
	
}
