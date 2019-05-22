package com.greenstwo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QueFourteen {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\acer\\eclipse-workspace\\SeleniumClass\\Driver\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		WebElement ele = driver.findElement(By.xpath("//span[text()='Electronics']"));
		String text = ele.getText();
		System.out.println(text);
		WebElement tv = driver.findElement(By.xpath("//span[text()='TVs & Appliances']"));
		String text2 = tv.getText();
		System.out.println(text2);
		WebElement me = driver.findElement(By.xpath("//span[text()='Men']"));
		String text3 = me.getText();
		System.out.println(text3);
		WebElement wm = driver.findElement(By.xpath("//span[text()='Women']"));
		String text4 = wm.getText();
		System.out.println(text4);
		WebElement bab = driver.findElement(By.xpath("//span[text()='Baby & Kids']"));
		String text5 = bab.getText();
		System.out.println(text5);
		WebElement hom = driver.findElement(By.xpath("//span[text()='Home & Furniture']"));
		String text6 = hom.getText();
		System.out.println(text6);
	}

}
