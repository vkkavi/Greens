package com.greenstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FourthQues {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.greenstechnologys.com/selenium-course-content.html");
		WebElement txt = driver.findElement(By.xpath("(//span[@class='testimonial-content'])[1]"));
		String text = txt.getText();
		System.out.println(text);
	}

}
