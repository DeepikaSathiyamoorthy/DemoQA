package com.vstl.TestDemoQA;

import com.vstl.DemoQA.BrokenLinksImages;

public class TestBrokenLinkImages {

	public static void main(String[] args) {
		
		BrokenLinksImages objBrokenLinks = new BrokenLinksImages();
		objBrokenLinks.invokeApplication("https://demoqa.com/broken");
		objBrokenLinks.brokenLinks();
	}

}
