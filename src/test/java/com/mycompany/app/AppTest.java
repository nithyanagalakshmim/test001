package com.mycompany.app;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

public class AppTest {

	public static void main(String[] args) {
		
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		//URL
		driver.get("https://petstore.octoperf.com/actions/Account.action?newAccountForm=");
		//user name text box
		driver.findElement(By.name("username")).sendKeys("kt032");
		//password text box
		driver.findElement(By.name("password")).sendKeys("123456");
		//repeat password
		driver.findElement(By.name("repeatedPassword")).sendKeys("123456");
		//first name text box
		driver.findElement(By.name("account.firstName")).sendKeys("nithya");
		//last name text box
		driver.findElement(By.name("account.lastName")).sendKeys("nagu");
		//email text box
		driver.findElement(By.name("account.email")).sendKeys("1139@gmail.com");
		//phone number text field
		driver.findElement(By.name("account.phone")).sendKeys("1234567890");
		//address1 text box
		driver.findElement(By.name("account.address1")).sendKeys("velachery");
		//address2 text box
		driver.findElement(By.name("account.address2")).sendKeys("velachery");
		//city text box
		driver.findElement(By.name("account.city")).sendKeys("chennai");
		//state text box
		driver.findElement(By.name("account.state")).sendKeys("tamil nadu");
		//zip code text box
		driver.findElement(By.name("account.zip")).sendKeys("600042");
		//country text box
		driver.findElement(By.name("account.country")).sendKeys("india");
		//language preference dropdown
		Select dropdown = new Select (driver.findElement(By.name("account.languagePreference")));
		dropdown.selectByVisibleText("japanese");
		//favorite category dropdown
		Select dropdown2 = new Select (driver.findElement(By.name("account.favouriteCategoryId")));
		dropdown2.selectByVisibleText("DOGS");
		//enable my list checkbox
		WebElement enablemylist= driver.findElement(By.name("account.listOption"));
		enablemylist.click();
		//enable my banner 
		WebElement enablemybanner= driver.findElement(By.name("account.bannerOption"));
		enablemybanner.click();
		//save account info button
		driver.findElement(By.name("newAccount")).click();
		
		
		
		
		
		
	}

}
