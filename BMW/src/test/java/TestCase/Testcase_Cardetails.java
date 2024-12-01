package TestCase;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import org.testng.asserts.SoftAssert;

import BaseClass.Wrapper;
import Pages.CarDetails;
import Pages.Searchcar;
import UtilityClass.ExcelUtility;

public class Testcase_Cardetails extends Wrapper {
	
	@BeforeTest
	public void start(){
		launchApplication("chrome","https://www.bmw.in/en/all-models/7-series/sedan/2019/bmw-7-series-sedan-inspire.html");
	}
	
	@Test
	public void run() throws InterruptedException, IOException{
		CarDetails cd=new CarDetails();
		ExcelUtility eu= new ExcelUtility();
		cd=PageFactory.initElements(driver, CarDetails.class);
		Thread.sleep(3000);
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0, 250)");
		Thread.sleep(3000);
		cd.methd();
		Thread.sleep(3000);
		
		JavascriptExecutor je = (JavascriptExecutor) driver;
		je.executeScript("window.scrollBy(0, 300)");
		
		String er="250";
		String ar=cd.method2();
		eu.excelwrite(1, ar);
		SoftAssert sa=new SoftAssert();
		sa.assertEquals(er, ar);
		sa.assertAll();
		Thread.sleep(5000);
		
	}
	
	@AfterTest
	public void stop() throws IOException{
		Screenshot("C:\\844888\\BMW\\src\\test\\resources\\Screenshot\\bmwspeed.png");
		end();
	}
}
