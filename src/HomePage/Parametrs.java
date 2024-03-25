package HomePage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.asserts.Assertion;

public class Parametrs {
WebDriver driver=new ChromeDriver();

String URL="https://www.almosafer.com/en";


String ExeptedLanguage="en";
String ExeptedCurrency="SAR";
String ExeptedNumber="+966554400000";

Assertion MyAssert = new Assertion();



}
