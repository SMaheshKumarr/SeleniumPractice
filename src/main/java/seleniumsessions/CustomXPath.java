package seleniumsessions;

public class CustomXPath {

	public static void main(String[] args) {
		
		/*
		 * Custom XPath:
		 * 
		 * //tag[@attr]
		 * 
		 * //tag[@atrr=‘value’]
		 * 
		 * //tag[@atrr=‘value’ and @attr=‘value’]
		 * 
		 * //tag[@atrr=‘value’ and @attr=‘value’ and @attr=‘value’]
		 * 
		 *  //tag[@atrr=‘value’ or @attr=‘value’]
		 * 
		 * 
		 * Xpath with Text: 
		 * 
		 * //tag[text()=‘value’]
		 * 
		 * //tag[text()='value' and @attr='value' and @href]
		 * 
		 * 
		 * Xpath with contains: 
		 * 
		 * 
		 * //tag[contains(@attr,’value’)] 
		 * 
		 * //tag[contains(text(),’value’)]
		 *
		 * //tag[contains(@attr,’value’) and @attr=‘value’]
		 * 
		 * //tag[contains(@attr,’value’) and contains(@attr=‘value’)]
		 * 
		 * 
		 * xpath using Index:
		 * 
		 * 
		 * (//tag[@attr=‘value’])[1] 
		 * 
		 * (//tag[@attr=‘value’])[last()]
		 * 
		 *  (//tag[@attr=‘value’])[last()-1]
		 *  
		 *  
		 *  xpath using starts-with:
		 *  
		 *  
		 * //tag[starts-with(text(),'value')]
		 *
		 * //a[starts-with(@href,'/ref=nav_logo')]
		 * 
		 * //a[starts-with(@href,'/ref=nav_logo') and @aria-label="Amazon.in"]
		 *
		 *
		 *
		 * Handling Dynamic value using xpath:
		 * 
		 * //input[contains(@id,'firstname_')]
		 * 
		 * Sibling xpaths:
		 * 
		 * //a[contains(text(),'100%')]/ancestor::ul/li/a[contains(text(),'Amazon')]
		 *  
		 * //a[contains(text(),'100%')]/parent::li/following-sibling::li/a[text()='Amazon Assistant Download']
		 * 
		 * //a[contains(text(),'100%')]/preceding-sibling::li
		 * 
		 */
		
		/* :Amazon:
		 * 
		 * To get all the links available in the last footer column from amazon
		 * 
		 * 
		 * (//div[contains(@class,'navFooterLinkCol')])[last()]//a
		 * 
		 * 
		 * To select the last link available in last footer column from amazon
		 * 
		 * ((//div[contains(@class,'navFooterLinkCol')])[last()]//a)[last()-1]
		 * 
		 * 
		 * 
		 */
		
		//Note: For xpath class name has to be given fully
		
		
	}

}
