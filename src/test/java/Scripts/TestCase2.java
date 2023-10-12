package Scripts;

import org.testng.annotations.Test;

import Generic_Libraries.BaseClass;
import POM.DemoSkillraryApp_page;
import POM.DownloadInvoicePage;
import POM.Skillrary_homepage;

public class TestCase2 extends BaseClass
{
	@Test
	public void tc2() 
	{
		Skillrary_homepage s = new Skillrary_homepage(driver);
		s.gearsbutton();
		s.Skillrarydemoapplink();
		utilities.switchTable(driver);
		DemoSkillraryApp_page ds = new DemoSkillraryApp_page(driver);
		ds.feedBackButton();
		DownloadInvoicePage ip = new DownloadInvoicePage(driver);
		ip.DownloadInvoicebutton();
	}

}
