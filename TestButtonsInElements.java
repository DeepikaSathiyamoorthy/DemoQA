package com.vstl.TestDemoQA;

import com.vstl.DemoQA.ButtonsinElements;

public class TestButtonsInElements {

	public static void main(String[] args) {
		
		ButtonsinElements objButton = new ButtonsinElements();
		objButton.invokeApplication("https://demoqa.com/buttons");
		objButton.clickOnDoubleClickMe();
		objButton.clickOnRightClickMe();
		objButton.clickOnButton();
	}

}
