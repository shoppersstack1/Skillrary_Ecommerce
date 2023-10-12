package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skillrary_homepage 
{
	//Declaration
	//Address of gears
	@FindBy(xpath = "//a[text()=' GEARS ']")
	private WebElement gearsbtn;
	
	// Address of Skillrary demo
	@FindBy(xpath = "(//a[text()=' SkillRary Demo APP'])[2]")
	private WebElement skillrarydemoapp;
	
	//Addres of Search textfield
	@FindBy(xpath = "//input[@value='q']")
	private WebElement searchtf;
	
	//Address of search icon
	@FindBy(xpath = "//input[@value='go']")
	private WebElement searchicon;
	
	//Address of cookies
	@FindBy(xpath = "//a[@class='cloose_cookies']")
	private WebElement cookies;
	
	//intilization
	public Skillrary_homepage(WebDriver driver)
	{
		PageFactory.initElements( driver , this);
	}
	
	//Utilization
	public void gearsbutton()
	{
		gearsbtn.click();
	}
	public void cookiesIcon()
	{
		cookies.click();
	}
	public void Skillrarydemoapplink()
	{
		skillrarydemoapp.click();
	}
	public void searchTextField(String data)
	{
		searchtf.sendKeys(data);
	}
	public void searchIcon()
	{
		 searchicon.click();
	}
}
