package com.vstl.TestDemoQA;

import com.vstl.DemoQA.CheckBoxInElements;

public class TestCheckBoxInElements {

	public static void main(String[] args) {
		
		CheckBoxInElements objCheckBox = new CheckBoxInElements();
		objCheckBox.invokeApplication("https://demoqa.com/checkbox");
		objCheckBox.selectCheckBoxHome();
		objCheckBox.selectDesktopUnderCheckBox();
		objCheckBox.setImplicitWait(3000);
		objCheckBox.verifyDesktopisSelected();
		objCheckBox.setImplicitWait(3000);
		objCheckBox.selectDocumentsUnderCheckBox();
		objCheckBox.verifyDocumentsisSelected();
		objCheckBox.selectDownloadsUnderCheckBox();
		objCheckBox.verifyDownloadssisSelected();
		objCheckBox.setImplicitWait(10000);
		objCheckBox.tearDown();

	}

}
