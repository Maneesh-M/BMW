package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

public class Searchcar {
public WebDriver driver;
	@FindBy(xpath="//a[@class='tw-relative tw-p-400 tw-m-0 tw-flex tw-items-center tw-font-bmw-bold tw-text-450 tw-border-b-400 tw-border-transparent tw-text-grey-500 xl:hover:tw-text-grey-900 xl:hover:tw-border-b-400 xl:hover:tw-border-primary-500 xl:hover:tw-text-grey-900']")
	public WebElement model;
	
	@FindBy(xpath="//*[@id='the-top-navigation']/div/div/div/div[1]/div/div[1]/div[2]/div/div/div/div/div[1]/div/nav/div/div/div[4]/a")
	public WebElement seven;
	
	@FindBy(xpath="//img[@alt='Not Found']")
	public WebElement img;
	
	public Searchcar(WebDriver driver){
		this.driver=driver;
	}
	public void method(){
		model.click();
		seven.click();
		
		Actions act=new Actions(driver);
		act.moveToElement(img);
		act.click(img).build().perform();
		
		
	}
}
