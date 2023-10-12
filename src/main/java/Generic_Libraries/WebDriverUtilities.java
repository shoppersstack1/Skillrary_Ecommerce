package Generic_Libraries;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class WebDriverUtilities 
{
	//1.handling dropdown
	public void dropDown(WebElement ele , String text)
	{
		Select s = new Select(ele);
		s.selectByVisibleText(text);
	}
	//2.handling right click 
	public void rightClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.contextClick(ele).perform();
	}
	//3.handling double click 
	public void doubleClick(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.doubleClick(ele).perform();
	}
	//4.handling drag and dropping
	public void dragDrop(WebDriver driver, WebElement src, WebElement target )
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(src, target).perform();
	}
	//5.mouseHovering
	public void mouseHover(WebDriver driver, WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele).perform();
	}
	//6.handling alter pop up
	public void popUp(WebDriver driver)
	{
		driver.switchTo().alert().accept();
	}
	//7.handling child browser popup
	public void switchTable(WebDriver driver)
	{
		Set<String> child =driver.getWindowHandles();
	for(String b :child)
		{
			driver.switchTo().window(b);
		}
	}
	//8.handling scroll bar
	public void scrollBar(WebDriver driver, int x , int y)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+","+y+")");
	}
	// 9.scrolling with webelement 
	public void scrollBar1(WebDriver driver, WebElement ele) 
	{
		JavascriptExecutor js = (JavascriptExecutor)driver; 
		js.executeScript("arguments[0].scrollIntoView();", ele); 
	}
	//10.for click
	public void clicking(WebDriver driver, WebElement ele)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", ele);
	}	
}