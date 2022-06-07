package com.vstl.DemoQA;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.vstl.generic.GenericMethods;

public class BrokenLinksImages extends GenericMethods{

	String strURL = "";
	HttpURLConnection objHttpConncection = null;
	int intresponseCode = 200;
	
	
	
	public void brokenLinks() {
		
		List<WebElement> objlinks = driver.findElements(By.tagName("a"));
		Iterator<WebElement> objIteration = objlinks.iterator();
		
		while(objIteration.hasNext()) {
			strURL = objIteration.next().getAttribute("href");
			
			System.out.println(strURL);
		if(strURL==null || strURL.isEmpty()) {
			System.out.println("URL is Empty");
			continue;
		}
			try {
				
			objHttpConncection = (HttpURLConnection) (new URL(strURL).openConnection());
			objHttpConncection.setRequestMethod("HEAD");
			objHttpConncection.connect();
			
			intresponseCode = objHttpConncection.getResponseCode();
			
			if(intresponseCode >=400) {
				System.out.println(strURL + "is a broken link"); 
			}
			else {
				System.out.println(strURL+ "is a Valid Link");
			}
				
			} catch (MalformedURLException objMalformendURL) {
				
				objMalformendURL.printStackTrace();
			} catch (IOException objIOException) {
				objIOException.printStackTrace();
			}
			
		}
		
		driver.quit();
	}
	
}
