package com.vstl.TestDemoQA;

import com.vstl.DemoQA.RadioButtonsInElements;

public class TestRadioButtonInElements {

	public static void main(String[] args) {
		
		RadioButtonsInElements objRadioButton = new RadioButtonsInElements();
		objRadioButton.invokeApplication("https://demoqa.com/radio-button");
		objRadioButton.selectRadioButtonYesinDoYouLikeTheSite();
		objRadioButton.setImplicitWait(3000);
		objRadioButton.verifyRadioButtonisEnabled();
		objRadioButton.selectRadioButtonNOinDoYouLikeTheSite();
		objRadioButton.setImplicitWait(3000);
		objRadioButton.verifyRadioButtonNoisDisabled();
		objRadioButton.selectRadioButtonImpressiveinDoYouLikeTheSite();
		objRadioButton.verifyRadioButtonImpressiveisEnabled();
		
		objRadioButton.setImplicitWait(5000);
		objRadioButton.tearDown();
		

	}

}
