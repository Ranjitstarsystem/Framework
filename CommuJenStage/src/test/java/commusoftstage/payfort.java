package commusoftstage;

import org.openqa.selenium.By;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;


public class payfort extends FrameworkFinal {
	public static String dashboard;
	public static ExtentHtmlReporter report ;
	public static ExtentReports extent;
	public static ExtentTest logger;
	public static ITestResult results;
	public static String customerurl;
	public static String joburl;

	
		
	
	@BeforeClass
	public static void StartTest()
	{
		
		report = new ExtentHtmlReporter("D:/Reports/payfort.html");
		extent = new ExtentReports();
		extent.attachReporter(report);
		logger = extent.createTest("payfort");
		
		
	}
	@AfterClass
	public static void EndTest()
	{
		extent.flush();
	}
	
	@AfterMethod
	public static void elogin(ITestResult result)
	{
	if(ITestResult.FAILURE==result.getStatus())
	{
	try 
	{
	logger.log(Status.FAIL,logger.addScreenCaptureFromPath( capture(driver)) +"  Method Name:- " + result.getName());
	System.out.println("Error Occurs in The Method:- " +result.getName());
	} 
	catch (Exception e)
	{
	System.out.println("Exception while taking screenshot "+e.getMessage());
	} 
	}
	if(ITestResult.SUCCESS == result.getStatus())
	{
		logger.log(Status.PASS,"Method been executed successfully Method Name:- " +result.getName());
		System.out.println("Method been executed successfully Method Name:- " +result.getName());
		
	}
	}
	
	@Test (priority = 0)
	public static void login() throws InterruptedException 
	{
		launchchrome("https://dev.commusoft.co.uk");
		iwait();
		type("#logintype_clientid","17974");
		type("#logintype_username","aravind");
		type("#logintype_password","welcome123");
		click("//span[@ng-hide='saving']");
		Thread.sleep(4000);
		dashboard = driver.getCurrentUrl();
		Thread.sleep(2000);
		
	}
	@Test (priority = 1)
	public static void System_Settings() throws InterruptedException 
	{
		Thread.sleep(2000);
		iwait();
		click("//a[@id='drop4']");	
		iwait();
		click("//a[text()='Company settings']");
		iwait();
	//	scrolldown("//a[text()='Company details']");
		Thread.sleep(2000);
		iwait();
		click("//a[text()='Credit card']");
		Thread.sleep(3000);
		iwait();
		try
		{
			iwait();
			click("(//a[@class='cancel-this-backup'])[2]");
			iwait();
			type("(//input[@id=\"confirm_delete_input\"])[1]", "CANCEL");
			iwait();
			click("(//a[@id='delete-button'])[1]");
			iwait();
			click("(//a[@class=\"btn btn-primary\"])[2]");
			iwait();
		}catch(Exception j)
		{
			iwait();
			click("(//a[@class=\"btn btn-primary\"])[2]");
			iwait();
		}
		Thread.sleep(3000);
		iwait();
		type("//input[@ng-model='merchant_identifier']", "VSILSjTJ");
		type("//input[@ng-model='access_code']", "3XDQNFdYD97q0sY2AINY");
		iwait();
		selectdropdown("//select[@ng-model='sha_type']", "SHA-256");
		type("//input[@ng-model='sha_request_phrase']", "TESTSHAIN");
		type("//input[@ng-model='sha_response_phrase']", "TESTSHAOUT");
		iwait();
		click("(//a[text()='Save'])[2]");
		Thread.sleep(3000);
		
	}
	@Test(priority = 2)
	public static void PayFort_Customer_Email() throws InterruptedException 
	{
		driver.get(dashboard);
		Thread.sleep(5000);
		iwait();
		click("//span[text()='New Private customer']");
		Thread.sleep(3000);
		type("#customertype_contacts_name","Roman");
		type("#customertype_contacts_surname","Regins");
		type("#customertype_contacts_contactstelephone_1_telephonenumber","9856325698");
		type("#customertype_contacts_contactstelephone_0_telephonenumber","9856326598");
		type("#customertype_contacts_contactsemail_emailaddress","ranjit@commusoft.co.uk");
		type("#customertype_addressline1","Madurai One");
		type("#customertype_addressline2","Madurai2");
		type("#customertype_town","Madurai JILLA");
		type("#customertype_county","Madurai");
		click("//span[@ng-hide='saving']");
		Thread.sleep(3000);
		customerurl = driver.getCurrentUrl();
		Thread.sleep(4000);
		//Create job
		iwait();
		click("#newJob");
		isenabled("(//button[@type='submit'])[1]");
		type("#job_description","Job Description");
		type("#job_engineernotes","Notes Of Engineer");
		type("#job_quotedamount","5000");
		type("#job_ponumber","Customer Reference-316");
		click("(//button[@type='submit'])[1]");
		iwait();
		Thread.sleep(3000);
		joburl = driver.getCurrentUrl();
		//Invoice
		Thread.sleep(5000);
		iwait();
		click("(//span[@class='ng-scope'])[15]");
		iwait();
		Thread.sleep(3000);
		click("//a[@has-permission='Customerinvoicing,writeaccess']");
		iwait();
		type("$invoiceDescription","Description");
		iwait();
		type("#note","Enter the note");
		iwait();
		clear("$total_price");
		iwait();
		type("$total_price","500");
		iwait();
		click("//span[@ng-hide='saving']");
		Thread.sleep(4000);
		//payment
		click("(//a[@has-permission=\"Customerinvoicing,readaccess\"])[1]");
		iwait();
		Thread.sleep(3000);
		iwait();
		click("//a[@class='btn btn-small btn-primary action-btn']");
		iwait();
		Thread.sleep(2000);
		type("//textarea[@ng-model='description']","Enter the Description");
		iwait();
		selectdropdownvalue("//select[@name='paymentMethod']","5");
		iwait();
		selectdropdown("//select[@name='nominalAccount']","Bank");
		iwait();
		clear("//input[@name='amount']");
		iwait();
		type("//input[@name='amount']","100");
		iwait();
		Thread.sleep(3000);
		framein("payfort_merchant_page");
		Thread.sleep(3000);
		iwait();
		type("//input[@id='cardNoInput']", "4111111111111111");
		iwait();
		type("//input[@id='expDateInput']", "0222");
		iwait();
		type("//input[@name='card_security_code']", "316");
		iwait();
		type("//input[@id='chNameInput']", "RANJIT");
		iwait();
		Thread.sleep(2000);
		click("//button[@id='submitBtn']");
		iwait();
		frameout();
		value = driver.findElement(By.xpath("(//span[@class='ng-binding'])[23]")).getText();
		System.out.println(value);
		String pay = "425";
		if (value.equals(pay))
		{
			logger.log(Status.PASS, "payment via payfort is been Fine");
		}
		
		
		
	}
	
	@Test(priority = 3)
	public static void PayFort_Customer_WithoutEmail() throws InterruptedException 
	{
		driver.get(dashboard);
		Thread.sleep(5000);
		iwait();
		click("//span[text()='New Private customer']");
		Thread.sleep(3000);
		type("#customertype_contacts_name","Roman");
		type("#customertype_contacts_surname","Regins");
		type("#customertype_contacts_contactstelephone_1_telephonenumber","9856325698");
		type("#customertype_contacts_contactstelephone_0_telephonenumber","9856326598");
		type("#customertype_addressline1","Madurai One");
		type("#customertype_addressline2","Madurai2");
		type("#customertype_town","Madurai JILLA");
		type("#customertype_county","Madurai");
		click("//span[@ng-hide='saving']");
		Thread.sleep(3000);
		customerurl = driver.getCurrentUrl();
		Thread.sleep(4000);
		//Create job
		iwait();
		click("#newJob");
		isenabled("(//button[@type='submit'])[1]");
		type("#job_description","Job Description");
		type("#job_engineernotes","Notes Of Engineer");
		type("#job_quotedamount","5000");
		type("#job_ponumber","Customer Reference-316");
		click("(//button[@type='submit'])[1]");
		iwait();
		Thread.sleep(3000);
		joburl = driver.getCurrentUrl();
		//Invoice
		Thread.sleep(5000);
		iwait();
		click("(//span[@class='ng-scope'])[15]");
		iwait();
		Thread.sleep(3000);
		click("//a[@has-permission='Customerinvoicing,writeaccess']");
		iwait();
		type("$invoiceDescription","Description");
		iwait();
		type("#note","Enter the note");
		iwait();
		clear("$total_price");
		iwait();
		type("$total_price","500");
		iwait();
		click("//span[@ng-hide='saving']");
		Thread.sleep(4000);
		//payment
		click("(//a[@has-permission=\"Customerinvoicing,readaccess\"])[1]");
		iwait();
		Thread.sleep(3000);
		iwait();
		click("//a[@class='btn btn-small btn-primary action-btn']");
		iwait();
		Thread.sleep(2000);
		type("//textarea[@ng-model='description']","Enter the Description");
		iwait();
		selectdropdownvalue("//select[@name='paymentMethod']","5");
		iwait();
		selectdropdown("//select[@name='nominalAccount']","Bank");
		iwait();
		clear("//input[@name='amount']");
		iwait();
		type("//input[@name='amount']","100");
		iwait();
		Thread.sleep(3000);
		framein("payfort_merchant_page");
		Thread.sleep(3000);
		iwait();
		type("//input[@id='cardNoInput']", "4111111111111111");
		iwait();
		type("//input[@id='expDateInput']", "0222");
		iwait();
		type("//input[@name='card_security_code']", "316");
		iwait();
		type("//input[@id='chNameInput']", "RANJIT");
		iwait();
		Thread.sleep(2000);
		click("//button[@id='submitBtn']");
		iwait();
		frameout();
	value=	driver.findElement(By.xpath("//div[@ng-if='showPayFortError']")).getText();
		System.out.println(value);
		String error ="Missing parameter email";
		if (value.equals(error))
		{
			logger.log(Status.PASS, "payment without Email get Fails");
		}
		
	}
	@Test(priority = 3)
	public static void PayFort_Customer_Creditnote_WithoutEmail() throws InterruptedException 
	{
		driver.get(dashboard);
		Thread.sleep(5000);
		iwait();
		click("//span[text()='New Private customer']");
		Thread.sleep(3000);
		type("#customertype_contacts_name","Roman");
		type("#customertype_contacts_surname","Regins");
		type("#customertype_contacts_contactstelephone_1_telephonenumber","9856325698");
		type("#customertype_contacts_contactstelephone_0_telephonenumber","9856326598");
		type("#customertype_addressline1","Madurai One");
		type("#customertype_addressline2","Madurai2");
		type("#customertype_town","Madurai JILLA");
		type("#customertype_county","Madurai");
		click("//span[@ng-hide='saving']");
		Thread.sleep(5000);
		customerurl = driver.getCurrentUrl();
		Thread.sleep(4000);
		//Create job
		iwait();
		click("#newJob");
		isenabled("(//button[@type='submit'])[1]");
		type("#job_description","Job Description");
		type("#job_engineernotes","Notes Of Engineer");
		type("#job_quotedamount","5000");
		type("#job_ponumber","Customer Reference-316");
		click("(//button[@type='submit'])[1]");
		iwait();
		Thread.sleep(5000);
		//Invoice
		Thread.sleep(5000);
		iwait();
		click("(//span[@class='ng-scope'])[15]");
		iwait();
		Thread.sleep(3000);
		click("//a[@has-permission='Customerinvoicing,writeaccess']");
		iwait();
		type("$invoiceDescription","Description");
		iwait();
		type("#note","Enter the note");
		iwait();
		clear("$total_price");
		iwait();
		type("$total_price","500");
		iwait();
		click("//span[@ng-hide='saving']");
		Thread.sleep(7000);
		driver.get(customerurl);
		Thread.sleep(3000);
		
		//credit note
		iwait();
		Thread.sleep(2000);
		click("//span[text()='Quick links']");
		iwait();
		click("//a[text()='Cash allocation']");
		Thread.sleep(2000);
		type("//textarea[@ng-model='description']","Enter the Description");
		iwait();
		selectdropdownvalue("//select[@name='paymentMethod']","5");
		iwait();
		Thread.sleep(2000);
		click("//td[text()='Please select']");
		iwait();
		dclick("//td[text()='Please select']");
		Thread.sleep(2000);
		typeenter("//input[contains(@class,'select2-input select2')]");
		Thread.sleep(3000);
		framein("payfort_merchant_page");
		Thread.sleep(3000);
		iwait();
		type("//input[@id='cardNoInput']", "4111111111111111");
		iwait();
		type("//input[@id='expDateInput']", "0222");
		iwait();
		type("//input[@name='card_security_code']", "316");
		iwait();
		type("//input[@id='chNameInput']", "RANJIT");
		iwait();
		Thread.sleep(2000);
		click("//button[@id='submitBtn']");
		iwait();
		frameout();
	value =	driver.findElement(By.xpath("//div[@ng-if='showPayFortError']")).getText();
		System.out.println(value);
		String error ="Missing parameter email";
		if (value.equals(error))
		{
			logger.log(Status.PASS, "payment without Email get Fails");
		}
		
	}
	
	@Test(priority = 4)
	public static void PayFort_Customer_Creditnote_WithEmail() throws InterruptedException 
	{
		driver.get(dashboard);
		Thread.sleep(5000);
		iwait();
		click("//span[text()='New Private customer']");
		Thread.sleep(3000);
		type("#customertype_contacts_name","Roman");
		type("#customertype_contacts_surname","Regins");
		type("#customertype_contacts_contactstelephone_1_telephonenumber","9856325698");
		type("#customertype_contacts_contactstelephone_0_telephonenumber","9856326598");
		type("#customertype_contacts_contactsemail_emailaddress","ranjit@commusoft.co.uk");
		type("#customertype_addressline1","Madurai One");
		type("#customertype_addressline2","Madurai2");
		type("#customertype_town","Madurai JILLA");
		type("#customertype_county","Madurai");
		click("//span[@ng-hide='saving']");
		Thread.sleep(5000);
		customerurl = driver.getCurrentUrl();
		Thread.sleep(4000);
		//Create job
		iwait();
		click("#newJob");
		isenabled("(//button[@type='submit'])[1]");
		type("#job_description","Job Description");
		type("#job_engineernotes","Notes Of Engineer");
		type("#job_quotedamount","5000");
		type("#job_ponumber","Customer Reference-316");
		click("(//button[@type='submit'])[1]");
		iwait();
		Thread.sleep(5000);
		//Invoice
		Thread.sleep(5000);
		iwait();
		click("(//span[@class='ng-scope'])[15]");
		iwait();
		Thread.sleep(3000);
		click("//a[@has-permission='Customerinvoicing,writeaccess']");
		iwait();
		type("$invoiceDescription","Description");
		iwait();
		type("#note","Enter the note");
		iwait();
		clear("$total_price");
		iwait();
		type("$total_price","500");
		iwait();
		click("//span[@ng-hide='saving']");
		Thread.sleep(7000);
		driver.get(customerurl);
		Thread.sleep(3000);
		
		//credit note
		iwait();
		Thread.sleep(2000);
		click("//span[text()='Quick links']");
		iwait();
		click("//a[text()='Cash allocation']");
		Thread.sleep(2000);
		type("//textarea[@ng-model='description']","Enter the Description");
		iwait();
		selectdropdownvalue("//select[@name='paymentMethod']","5");
		iwait();
		Thread.sleep(2000);
		click("//td[text()='Please select']");
		iwait();
		dclick("//td[text()='Please select']");
		Thread.sleep(2000);
		typeenter("//input[contains(@class,'select2-input select2')]");
		Thread.sleep(3000);
		framein("payfort_merchant_page");
		Thread.sleep(3000);
		iwait();
		type("//input[@id='cardNoInput']", "4111111111111111");
		iwait();
		type("//input[@id='expDateInput']", "0222");
		iwait();
		type("//input[@name='card_security_code']", "316");
		iwait();
		type("//input[@id='chNameInput']", "RANJIT");
		iwait();
		Thread.sleep(2000);
		click("//button[@id='submitBtn']");
		iwait();
		frameout();
	value =	driver.findElement(By.xpath("//div[@ng-if='showPayFortError']")).getText();
		System.out.println(value);
		String error ="Missing parameter email";
		if (value.equals(error))
		{
			logger.log(Status.PASS, "payment without Email get Fails");
		}
		value = driver.findElement(By.xpath("(//span[@class='ng-binding'])[23]")).getText();
		System.out.println(value);
		String pay = "0";
		if (value.equals(pay))
		{
			logger.log(Status.PASS, "payment via payfort is been Fine");
		}
	}
	public static void kill()
	{
		System.out.println("really");
		System.out.println("ROCK");
		
	}
	
}
