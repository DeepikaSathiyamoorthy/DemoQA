package com.vstl.DemoQA;

import org.openqa.selenium.By;

import com.vstl.generic.GenericMethods;

public class WebTablesInElementsAddNewRecord extends GenericMethods{
	
	public void clickOntoAddButton() {
		
		driver.findElement(By.id("addNewRecordButton")).click();
		System.out.println("Add button is Clicked");
	}
	public void enterFirstNameinNewRecord() {
		
		driver.findElement(By.id("firstName")).sendKeys(getName(6));
		System.out.println("FirstName is entered in New Reocrd ");
	}
	public void enterLastNameinNewRecord() {
		
		driver.findElement(By.id("lastName")).sendKeys(getName(6));
		System.out.println("LastName is entered in New Reocrd ");
	}
	
	public void enteremailIDinNewRecord() {
	
	driver.findElement(By.id("userEmail")).sendKeys(getEmailID(8));
	System.out.println("EmailID is entered in New Reocrd ");
}

	public void enterAge() {
		driver.findElement(By.id("age")).sendKeys("27");
		System.out.println("Age is entered");
		}
	public void enterSalary() {
		driver.findElement(By.id("salary")).sendKeys("27000");
		System.out.println("Salary is entered");
		}
	public void enterDepartment() {
		driver.findElement(By.id("department")).sendKeys("compliance");
		System.out.println("Department is entered");
		}
	public void clickSubmitToNewRecord(){
		driver.findElement(By.id("submit")).click();
		System.out.println("Submit Button is Clicked");
		}
	
}
