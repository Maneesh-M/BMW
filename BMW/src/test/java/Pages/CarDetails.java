package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CarDetails {
	public WebDriver driver;
	@FindBy(xpath="//*[@id='content-navigation']/div/div/div/div/div/div[4]/nav/div/div[3]/a")
	public WebElement technical;
	
	@FindBy(xpath="//*[@id='top-of-content']/div/div[3]/div/div/div[2]/section[1]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[2]/div")
	public WebElement output;
	
	@FindBy(xpath="//*[@id='top-of-content']/div/div[3]/div/div/div[2]/section[1]/div[3]/div/div[2]/div/table/tbody/tr[1]/td[2]/div")
	public WebElement out2;
	
	public void Searchcar(WebDriver driver){
		this.driver=driver;
	}
	
	public void methd(){
		technical.click();}
	
	public String method2()
	{	
		String a=output.getText();
		System.out.println(a);
		return a;
	}
}
