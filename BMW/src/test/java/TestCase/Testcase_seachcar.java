package TestCase;

import java.io.IOException;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import BaseClass.Wrapper;
import Pages.Searchcar;

public class Testcase_seachcar extends Wrapper{
	
	@BeforeTest
	public void start(){
		launchApplication("chrome","https://www.bmw.in/en/");
	}
	
	@Test
	public void run() throws IOException, InterruptedException{
		Searchcar sc=new Searchcar(driver);
		sc=PageFactory.initElements(driver, Searchcar.class);
		Thread.sleep(10000);
		sc.model.click();
		Thread.sleep(5000);
		sc.seven.click();
		Thread.sleep(5000);
		Thread.sleep(5000);
		sc.method();
	}
	@AfterTest
	public void stop(){
		try {
			Screenshot("C:\\844888\\BMW\\src\\test\\resources\\Screenshot\\bmwtechnicaldata.png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		end();
	}
}
