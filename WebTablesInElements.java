package com.vstl.DemoQA;

import org.openqa.selenium.By;

import com.vstl.generic.GenericMethods;

public class WebTablesInElements extends GenericMethods {
	
	/* WebDriverWait wait = new WebDriverWait(driver, 10);
	wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[@id='divTrainsList']/table")));
	
	WebElement table = driver.findElement("//div[@id='divTrainsList']/table");
	List<WebElement> rows = table.findElements(By.tagName("tr"));
	System.out.println(rows.size());
	WebElement firstRow = rows.get(0);
	List<WebElement> columns = firstRow.findElements(By.tagName("td"));
	System.out.println(columns.size());
	System.out.println(columns.get(1).getText()); */
	
	public void name() {
		
	
	// WebDriverWait(driver, 60).until(EC.presence_of_element_located((By.CLASS_NAME, "w3-example")));

	
//	WebElement table = driver.findElement(By.xpath("//*[@id=\"app\"]/div/div/div[2]/div[2]/div[2]/div[3]"));
	//List<WebElement> rows =  table.findElement(By.tagName());
	
	}
	
	public void enterFilterDatainSearchBox() {
		
		driver.findElement(By.id("searchBox")).sendKeys("Vega");
		System.out.println("Vega is entered to search");
	}
	
	public void editSelectedRecord() {
		
		driver.findElement(By.id("edit-record-1")).click();
	}

	public void editinSelectedRecord() {
		driver.findElement(By.id("firstName")).clear();
		driver.findElement(By.id("firstName")).sendKeys("Ratheesh");
		driver.findElement(By.id("lastName")).clear();
		driver.findElement(By.id("lastName")).sendKeys("Deepika");
		driver.findElement(By.id("userEmail")).clear();
		driver.findElement(By.id("userEmail")).sendKeys("xyzer@gmail.com");
		driver.findElement(By.id("age")).clear();
		driver.findElement(By.id("age")).sendKeys("40");
		driver.findElement(By.id("salary")).clear();
		driver.findElement(By.id("salary")).sendKeys("20000");
		driver.findElement(By.id("submit")).click();
		System.out.println("Values of Selected Row is edited");
	
	}

	public void verifytheEditedRow() {
		
		driver.findElement(By.id("searchBox")).clear();
		System.out.println("Vega is removed from SearchBox");
	}
}
