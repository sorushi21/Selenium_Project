package org.basicPrograms;

import org.openqa.selenium.WebDriver;
import org.utilities.BaseUtility;

public class Ex3 {
	public static void main(String[] args) {
		System.out.println("** Program Starts **");
		BaseUtility bu = new BaseUtility();
		String url="https://www.google.com";
		@SuppressWarnings("unused")
		WebDriver driver = bu.startUp("ch", url);
		
		
		System.out.println("** Program Ends **");
	}
	
}