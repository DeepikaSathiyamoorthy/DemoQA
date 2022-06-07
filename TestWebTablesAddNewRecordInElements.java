package com.vstl.TestDemoQA;

import com.vstl.DemoQA.WebTablesInElementsAddNewRecord;

public class TestWebTablesAddNewRecordInElements {

	public static void main(String[] args) {
	
		WebTablesInElementsAddNewRecord objWebTables = new WebTablesInElementsAddNewRecord();
		objWebTables.invokeApplication("https://demoqa.com/webtables");
		objWebTables.clickOntoAddButton();
		objWebTables.enterFirstNameinNewRecord();
		objWebTables.enterLastNameinNewRecord();
		objWebTables.enteremailIDinNewRecord();
		objWebTables.enterAge();
		objWebTables.enterDepartment();
		objWebTables.clickSubmitToNewRecord();
		
		objWebTables.setImplicitWait(20000);
		objWebTables.tearDown();
	}

}
