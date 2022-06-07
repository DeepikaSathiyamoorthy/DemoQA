package com.vstl.TestDemoQA;

import com.vstl.DemoQA.WebTablesInElements;

public class TestWebTablesSearch {

	public static void main(String[] args) {
		
		WebTablesInElements objWebTables = new WebTablesInElements();
		objWebTables.invokeApplication("https://demoqa.com/webtables");
		objWebTables.enterFilterDatainSearchBox();
		objWebTables.editSelectedRecord();
		objWebTables.editinSelectedRecord();
		objWebTables.setImplicitWait(10000);
		objWebTables.verifytheEditedRow();
		
		
		//objWebTables.tearDown();
	}

}
