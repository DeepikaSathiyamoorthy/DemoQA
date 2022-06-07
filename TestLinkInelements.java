package com.vstl.TestDemoQA;

import com.vstl.DemoQA.LinkInElements;

public class TestLinkInelements {

	public static void main(String[] args) {
		
		LinkInElements objLink = new LinkInElements();
		objLink.invokeApplication("https://demoqa.com/links");
		objLink.simpleLinkHome();
		objLink.dynamicLinkHome();
		objLink.createdAPILink();
		objLink.setImplicitWait(5000);
		objLink.no_ContentAPILink();
		objLink.setImplicitWait(5000);
		objLink.movedAPILink();
		objLink.setImplicitWait(5000);
		/*objLink.badRequestAPILink();
		objLink.setImplicitWait(5000); 
		objLink.unAuthorizedAPILink();
		objLink.setImplicitWait(5000);
		objLink.forbiddenAPILink();
		objLink.setImplicitWait(5000);
		objLink.notFoundAPILink(); */
		
	}

}
