package Scripts;
import org.testng.annotations.Test;
import Generic_Libraries.BaseClass;
import POM.DemoSkillraryApp_page;
import POM.Skillrary_homepage;
import POM.TestingPAge;
public class TestCase1 extends BaseClass
{
	@Test
	public void tc1() throws Throwable 
	{
		Skillrary_homepage s = new Skillrary_homepage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplink();
		utilities.switchTable(driver);
		DemoSkillraryApp_page ds = new DemoSkillraryApp_page(driver);
		utilities.dropDown(ds.getCategoriesdd(), pdata.getpropertyData("coursedd"));
		TestingPAge tp = new TestingPAge(driver);
		utilities.scrollBar1(driver, tp.getFbIcon());
		tp.fbIcon();	
	}
}