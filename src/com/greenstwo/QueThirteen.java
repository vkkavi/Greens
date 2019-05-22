package com.greenstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QueThirteen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://accounts.google.com/signup/v2/webcreateaccount?hl=en&flowName=GlifWebSignIn&flowEntry=SignUp");
		WebElement fn = driver.findElement(By.id("firstName"));
		fn.sendKeys("kavitha");
		String fname = fn.getAttribute("value");
		System.out.println(fname);
		WebElement ln = driver.findElement(By.id("lastName"));
		ln.sendKeys("vinoth");
		String lname = ln.getAttribute("value");
		System.out.println(lname);
		WebElement us = driver.findElement(By.id("username"));
		us.sendKeys("vkkavi78");
		String uname = us.getAttribute("value");
		System.out.println(uname);
		WebElement ps = driver.findElement(By.xpath("(//input[@type='password'])[1]"));
		ps.sendKeys("kavivino");
		String pass = ps.getAttribute("value");
		System.out.println(pass);
		WebElement cp = driver.findElement(By.name("ConfirmPasswd"));
		cp.sendKeys("kavvino");
		String cpass = cp.getAttribute("value");
		System.out.println(cpass);
	}

}
