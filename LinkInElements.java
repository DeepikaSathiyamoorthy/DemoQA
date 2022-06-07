package com.vstl.DemoQA;

import org.openqa.selenium.By;
import com.vstl.generic.GenericMethods;

public class LinkInElements extends GenericMethods {

	public void simpleLinkHome() {
		
		driver.findElement(By.id("simpleLink")).click();
		System.out.println("Home Link is clicked");
	}
		
	public void dynamicLinkHome() {
		
	driver.findElement(By.xpath("//a[@id='dynamicLink']")).click();
		System.out.println("Dynamic home Link is clicked");
	}
	
	public void createdAPILink() {
		driver.findElement(By.id("created")).click();
		System.out.println("Created Link is Clicked");
		
	}
	
	public void no_ContentAPILink() {
		driver.findElement(By.id("no-content")).click();
		System.out.println("No Content Link is Clicked");
		
	}
	
	public void movedAPILink() {
		driver.findElement(By.id("moved")).click();
		System.out.println("Moved Link is Clicked");
		
	}
	
	public void badRequestAPILink() {
		driver.findElement(By.xpath("//a[@id='bad-request']")).click();
		System.out.println("Bad Request Link is Clicked");
		
	}
	public void unAuthorizedAPILink() {
		driver.findElement(By.linkText("Unauthorized")).click();
		System.out.println("Unauthorized Link is clicked");
	}
	public void forbiddenAPILink() {
		driver.findElement(By.id("forbidden")).click();
		System.out.println("Forbidden Link is Clicked");
	}
	public void notFoundAPILink() {
		driver.findElement(By.id("invalid-url")).click();
		System.out.println("Not Found Link is Clicked");
	}
	
}
