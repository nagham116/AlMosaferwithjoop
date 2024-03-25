package HomePage;

import org.testng.annotations.Test;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;


public class HomePageTestCases extends Parametrs {

@BeforeTest
public void Setup() {

	driver.manage().window().maximize();
	
	driver.get(URL);	
	
	
	WebElement popMSG = driver.findElement(By.cssSelector(".sc-iBmynh.izXFRL"));
	if (popMSG.isDisplayed()) {
		WebElement SarBUTTON = driver
				.findElement(By.cssSelector(".sc-jTzLTM.hQpNle.cta__button.cta__saudi.btn.btn-primary"));
		SarBUTTON.click();}
	
	
	
	
	
	
}



@Test()
public void CheckTheDefaultLanguageIsEnglish() 
{
	

String ActualLanguage = driver.findElement(By.tagName("html")).getAttribute("lang");

  MyAssert.assertEquals(ActualLanguage, ActualLanguage);
}

@Test()
public void CheckTheDefaultCurrency() {
	
	String ActualCurrency = driver.findElement(By.xpath("//button[@data-testid='Header__CurrencySelector']"))
			.getText();
	
 MyAssert.assertEquals(ActualCurrency,ExeptedCurrency);
	
	
	
}


@Test()
public void CheckTheContactNumber() {
	
	String ActualNumber = driver.findElement(By.tagName("Strong"))
			.getText();
	
 MyAssert.assertEquals(ActualNumber,ExeptedNumber);
	
	
	
}





}











