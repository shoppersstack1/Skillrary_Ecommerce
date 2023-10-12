package POM;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
public class AddtoCartPage 
{
	//Declaration
	//Address for plus icon
	@FindBy(xpath = "i[@class='fa fa-plus']")
	private WebElement plusIcon;
	
	@FindBy(xpath = "button[Text()='Add to Cart']")
	private WebElement addtoCart;
	
	//Intialization
	public AddtoCartPage (WebDriver driver)
	{
		PageFactory.initElements( driver , this);
	}
	
	//Utilization
	public void addtoCartButtion()
	{
		addtoCart.click();
	}

	public WebElement getPlusIcon() 
	{
		return plusIcon;
	}
}