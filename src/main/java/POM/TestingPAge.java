package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class TestingPAge 
{
	//Declaration
	//Address of facebook Webelements
	@FindBy(xpath = "(//i[@class='fa fa-facebook'])[2]")
	private WebElement fbIcon;
	
	//Intialization
	public TestingPAge (WebDriver driver)
	{
		PageFactory.initElements( driver , this);
	}
	
	//Utilization
		public void fbIcon()
		{
			fbIcon.click();
		}

		public WebElement getFbIcon() {
			return fbIcon;
		}
	
}
