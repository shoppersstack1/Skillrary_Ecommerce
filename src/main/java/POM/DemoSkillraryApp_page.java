package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DemoSkillraryApp_page 
{
	//Declaration 
	//Address of course
	@FindBy(id = "course")
	private WebElement Coursebtn;
	
	//Address of Feedback 
	@FindBy(xpath = "//a[text()='FEEDBACK']")
	private WebElement Feedbackbtn;
	
	//Address of categories dropdown
	@FindBy(name = "addresstype")
	private WebElement  categoriesdd;
	
	public DemoSkillraryApp_page (WebDriver driver)
	{
		PageFactory.initElements( driver , this);
	}
	
	//Utilization
	public WebElement getCoursebtn()
	{
		return Coursebtn;
	}
	public WebElement getCategoriesdd() 
	{
		return categoriesdd;
	}
	public void feedBackButton()
	{
		Feedbackbtn.click();
	}
}