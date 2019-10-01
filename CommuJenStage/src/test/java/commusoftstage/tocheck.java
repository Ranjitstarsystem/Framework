package commusoftstage;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class tocheck extends FrameworkFinal {
	public	static String customerurl =  "https://stage.commusoft.co.uk/customers/customer/1440/view/property/view";

	public static void main(String[] args) throws InterruptedException, IOException {
		// TODO Auto-generated method stub
	
	
		launchchrome("https://stage.commusoft.co.uk");
		iwait();
		type("#logintype_clientid","16833");
		type("#logintype_username","ranjit");
		type("#logintype_password","Stage123!");
		click("//span[@ng-hide='saving']");
		Thread.sleep(4000);
		
	//	Diary_JobEvent();
	//	Customer_reminder();
	//	Edit_customer();
	//	service_reminder();
	//	Customer_NotesCommunication();
	//	Customer_Createcontact();
		System_Settings();
		
//		RejectEstimate();
//		ConvertEstimateToJob();
	//	Create_job();
//		Diary_EstimateEvent();
//		Diary_JobEvent();
//		Diary_JobEventwithnewcustomer();
		
	}
	public static void ConvertEstimateToJob() throws InterruptedException, IOException
	{
	Thread.sleep(3000);
	driver.get("https://stage.commusoft.co.uk/customers/customer/1440/estimate/242/estimate_details/send_to_customer/view");
	Thread.sleep(5000);
	iwait();
	click("#newEstimate");
	iwait();
	selectdropdown("//select[@name='estimate[templateid]']","General Works");		
	type("#estimate_engineernotes","Notes for Engineer");
	iwait();
	type("#estimate_customerreference","Customer Reference");
	iwait();
	click("//button[@type='submit']");
	iwait();
	click("#partsTab");
	iwait();
//	click("//a[@tabindex='1']");
	iwait();
	Thread.sleep(3000);
	click("//button[@class='button --primary']");
	iwait();
	Thread.sleep(3000);
	click("//button[text()='Save']");
	iwait();
	Thread.sleep(3000);
	click("~Select-placeholder");
    iwait();
	Thread.sleep(3000);
	type("//input[contains(@aria-activedescendant,'react-select-')]","parts");
	Thread.sleep(4000);
	typeenter("//input[contains(@aria-activedescendant,'react-select-')]");
	Thread.sleep(3000);
	Thread.sleep(2000);
	type("//input[contains(@aria-activedescendant,'react-select-')]","item1");
	Thread.sleep(4000);
	typeenter("//input[contains(@aria-activedescendant,'react-select-')]");
	Thread.sleep(3000);
	iwait();
	click("(//td[@class='supplier  '])[2]");
	iwait();
	click("(//td[@class='supplier  '])[5 ]");
	iwait();
	Thread.sleep(2000);
	click("//a[@ng-if='!advanced_estimate']");
	iwait();
	Thread.sleep(2000);
	click("//span[text()='Add line items to estimate']");
	iwait();
	click("(//input[@class='inline-checkbox ng-scope'])[1]");
	iwait();
	click("(//input[@class='inline-checkbox ng-scope'])[2]");
	iwait();
	click("//a[@class='btn btn-primary ng-scope']");
	Thread.sleep(2000);
	click("#step-7-text");
	Thread.sleep(3000);
	click("(//span[text()='Accept / reject'])[1]");
	iwait();
	click("//input[@ng-checked='option.estimate_option_allow_check === true']");
	iwait();
	click("//button[@ng-click='estimateAccept(estimate_options)']");
	iwait();
	type("#confirm_delete_input","ACCEPT");
	iwait();
	click("(//button[text()='Accept'])[2]");
	Thread.sleep(3000);
	driver.get(customerurl);
	Thread.sleep(4000);
	iwait();
	click("(//a[@ng-show=\"'0' == '0' && estimate.additionalWorkId == null\"])[1]");
	Thread.sleep(2000);
	iwait();
	click("//span[text()='Send to customer']");
	iwait();
	click("//a[text()='Print estimate']");
	iwait();
	tab("y");
	
	
	
}
	

	public static void RejectEstimate() throws InterruptedException, IOException
	{
	Thread.sleep(3000);
	driver.get(customerurl);
	Thread.sleep(5000);
	iwait();
	click("#newEstimate");
	iwait();
	selectdropdown("//select[@name='estimate[templateid]']","General Works");		
	type("#estimate_engineernotes","Notes for Engineer");
	iwait();
	type("#estimate_customerreference","Customer Reference");
	iwait();
	click("//button[@type='submit']");
	iwait();
	click("#partsTab");
	iwait();
//	click("//a[@tabindex='1']");
	iwait();
	Thread.sleep(3000);
	click("//button[@class='button --primary']");
	iwait();
	Thread.sleep(3000);
	click("//button[text()='Save']");
	iwait();
	Thread.sleep(3000);
	click("~Select-placeholder");
    iwait();
	Thread.sleep(3000);
	type("//input[contains(@aria-activedescendant,'react-select-')]","parts");
	Thread.sleep(4000);
	typeenter("//input[contains(@aria-activedescendant,'react-select-')]");
	Thread.sleep(3000);
	Thread.sleep(2000);
	type("//input[contains(@aria-activedescendant,'react-select-')]","item1");
	Thread.sleep(4000);
	typeenter("//input[contains(@aria-activedescendant,'react-select-')]");
	Thread.sleep(3000);
	iwait();
	click("(//td[@class='supplier  '])[2]");
	iwait();
	click("(//td[@class='supplier  '])[5 ]");
	iwait();
	Thread.sleep(2000);
	click("//a[@ng-if='!advanced_estimate']");
	iwait();
	Thread.sleep(2000);
	click("//span[text()='Add line items to estimate']");
	iwait();
	click("(//input[@class='inline-checkbox ng-scope'])[1]");
	iwait();
	click("(//input[@class='inline-checkbox ng-scope'])[2]");
	iwait();
	click("//a[@class='btn btn-primary ng-scope']");
	Thread.sleep(2000);
	click("#step-7-text");
	Thread.sleep(3000);
	click("(//span[text()='Accept / reject'])[1]");
	iwait();
	click("//input[@ng-checked='option.estimate_option_allow_check === true']");
	iwait();
	click("//button[@ng-click='estimateReject(estimate_options)']");
	iwait();
	Thread.sleep(3000);
	selectdropdown("//select[@required='required']", "Too expensive");
	iwait();
	type("#confirm_delete_input","REJECT");
	iwait();
	click("//button[@id='delete-button']");
	Thread.sleep(3000);
	driver.get(customerurl);
	Thread.sleep(4000);
	iwait();
	click("(//a[@ng-show=\"'0' == '0' && estimate.additionalWorkId == null\"])[1]");
	Thread.sleep(2000);
	iwait();
	click("//span[text()='Send to customer']");
	iwait();
	click("//a[text()='Print estimate']");
	iwait();
	tab("y");
	
}
	
	public static void Create_job() throws InterruptedException
	{
		driver.get("https://stage.commusoft.co.uk/customers/customer/1453/view/property/view");
		Thread.sleep(5000);
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
		
		Thread.sleep(2000);
		click("//span[text()=\"Add new diary event\"]/..");
		iwait();
		click("//button[text()='Daily']");
		iwait();
		Thread.sleep(3000);
		click("//div[@id='all_event_am_pm_event']");
		iwait();
		selectdropdown("//select[@ng-change=\"updateParentValues('allDayValue', allDayValue)\"]","Specific time");
		click("//a[@ng-click=\"loadNotificationData();openDiaryStep('notifications')\"]");
		iwait();
		Thread.sleep(2000);
		click("#top-input-in-notifications-step");
		iwait();
		selectdropdown("//select[@ng-if=\"notification_type == 'customer'\"]","Lord Ranjit Aravind");
		iwait();
		selectdropdown("//select[@ng-if=\"notification_type != 'engineer'\"]","Email");
		iwait();
		click("//button[@ng-click='saveDiaryEvent()']");
		Thread.sleep(3000);
		
	//	test.log(LogStatus.INFO, "Job Has Been Created Sucessfuly, JOB URL:-" + joburl);
		
	}
	
	
	public static void Diary_EstimateEvent() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		click("//a[@ui-sref='loggedin.diary']");
		iwait();
		
		//Create Estimate with Existing Customer
		Thread.sleep(4000);
		click("//button[text()='Weekly']");
		iwait();
		//Create Job with Existing Customer
		Thread.sleep(3000);
		click("//div[@id='all_event_am_pm_event']");
		iwait();
		Thread.sleep(2000);
		click("//a[@ng-click=\"setEventType('estimate', 'add_estimate_event_inputs')\"]");
		iwait();
		type("//input[@ng-model='propertySearchQuery']","Ranjit");
		Thread.sleep(2000);
		typeenter("//input[@ng-model='propertySearchQuery']");
		iwait();
		click("(//div[@class='flex flex-1 flex-column'])[1]");
		iwait();
		selectdropdown("//select[@name='allDayValue']","Specific time");
		iwait();
		selectdropdown("//select[@ng-change='setEstimateDescription()']","General Works");
		iwait();
		Thread.sleep(2000);
		click("//span[@ng-hide='saving_diary_event']");
		Thread.sleep(3000);
	}

	
	
	public static void Diary_JobEvent() throws InterruptedException, IOException
	{
		Thread.sleep(3000);
		iwait();
		click("//a[@ui-sref='loggedin.diary']");
		iwait();
		Thread.sleep(3000);
		click("//button[text()='Weekly']");
		iwait();
		Thread.sleep(2000);
		
		try {
			
			click("//a[text()='Today']");
			iwait();
			Thread.sleep(3000);
			iwait();
			click("//div[@id='all_event_am_pm_event']");
		}catch(Exception e)
		{
			Thread.sleep(3000);
			iwait();
			click("//div[@id='all_event_am_pm_event']");
		}
		//Create Job with Existing Customer
		
		
		iwait();
		Thread.sleep(2000);
		click("(//a[@ng-click=\"setEventType('job', 'add_job_event_inputs')\"])[1]");
		iwait();
		type("//input[@ng-model='propertySearchQuery']","Ranjit");
		Thread.sleep(2000);
		typeenter("//input[@ng-model='propertySearchQuery']");
		iwait();
		click("(//div[@class='flex flex-1 flex-column'])[1]");
		iwait();
		selectdropdown("//select[@name='allDayValue']","Specific time");
		iwait();
		type("//input[@ng-model='add_job_event_inputs.job.description']","Descrption Value");
		iwait();
		Thread.sleep(2000);
		click("(//span[@ng-hide=\"saving_diary_event\"])[1]");
		Thread.sleep(3000);
	}
	
	public static void Diary_JobEventwithnewcustomer() throws InterruptedException, IOException
	{
		//Create Job with New Customer
		Thread.sleep(3000);
		iwait();
		click("//button[text()='Monthly']");
		Thread.sleep(3000);
		
		click("(//td[contains(@class,'fc-day-top fc-thu fc-future')])[1]");
		iwait();
		Thread.sleep(2000);
		click("(//a[@ng-click=\"setEventType('job', 'add_job_event_inputs')\"])[1]");
		iwait();
		click("//a[@ng-click='addNewProperty(event_type)']");
		iwait();
		selectdropdown("//select[@id='new-property-type-input']","Customer");
		iwait();
		selectdropdown("//select[@ng-change='setCustomerType()']","Private Customer");
		iwait();
		type("//input[@ng-model='add_new_customer_inputs.first_name']","Aravind");
		iwait();
		type("//input[@ng-model='add_new_customer_inputs.surname']","Reigns 316");
		iwait();
		type("//input[@ng-model='add_new_customer_inputs.email']","ranjit.aravind@yopmail.com");
		iwait();
		type("//input[@ng-model='add_new_customer_inputs.addrs_1']","Madurai JIlla");
		iwait();
		click("//button[@ng-show=\"selected_customer_type == 'new_customer'\"]");
		iwait();
		Thread.sleep(2000);
		selectdropdown("//select[@name='allDayValue']","Specific time");
		iwait();
		Thread.sleep(2000);
		type("//input[@ng-model='add_job_event_inputs.job.description']","Descrption Value");
		iwait();
		Thread.sleep(2000);
		click("(//span[@ng-hide=\"saving_diary_event\"])[1]");
		//Print Job Sheet
		iwait();
		Thread.sleep(4000);
		click("//span[text()='Print job sheets']");
		iwait();
		String windowHandle = driver.getWindowHandle();
		driver.switchTo().window(windowHandle);
		Thread.sleep(2000);
		click("//span[text()='Print summary sheets']");
		iwait();
		String windowHandle1 = driver.getWindowHandle();
		driver.switchTo().window(windowHandle1);
		Thread.sleep(3000);
	}
	
	public static void Customer_reminder() throws InterruptedException
	{
		driver.get("https://stage.commusoft.co.uk/customers/customer/1488/reminders/view");
		click("//a[@id='remindersTab']");
		iwait();
		click("(//a[@has-permission='Setupdefaultoptionsforaftersalescare,updateaccess'])[2]");
		iwait();
		selectdropdown("//select[@ng-model='notificationValue']", "On");
		click("(//span[text()='Save'])[1]");
		Thread.sleep(3000);
		iwait();
		click("//span[text()='Property']");
		Thread.sleep(2000);
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
		click("//span[text()='Quick links']");
		iwait();
		click("//a[text()='Free of charge job']");
		Thread.sleep(3000);
		iwait();
		selectdropdown("//select[@id='freeofchargeandabortjob_reason']", "Admin error");
		iwait();
		click("//button[@type='submit']");
		Thread.sleep(3000);
		try
		{
		driver.findElement(By.xpath("//p[@ng-if='information.help_text']")).isDisplayed();
		
		}catch(Exception k)
		{
			
		}
	}
	public static void Edit_customer() throws InterruptedException
	{
		driver.get("https://stage.commusoft.co.uk/customers/customer/1495/jobs/1655/details/view");
		Thread.sleep(5000);
		iwait();
		click("//a[@has-permission='Jobs,updateaccess']");
		clear("$job[description]");
		type("$job[description]","Job Description update");
		clear("//textarea[@ng-model='job.engineernotes']");
		type("//textarea[@ng-model='job.engineernotes']","Updated Text is present ");
		clear("$quoted_amount");
		type("$quoted_amount","5000");
		clear("//input[@ng-model='job.ponumber']");
		type("//input[@ng-model='job.ponumber']","Stone cold Reference-316");
		click("//span[@ng-hide='updating']");
		iwait();
		Thread.sleep(4000);
		click("(//a[text()='Edit'])[2]");
		iwait();
		Thread.sleep(4000);
		selectdropdown("(//select[@ng-change='updateHours(hours)'])[1]","09");
		iwait();
		selectdropdown("(//select[@ng-change='updateHours(hours)'])[3]","10");
		iwait();
		selectdropdown("//select[@name='engineer_name']","Ranjit araind");
		iwait();
		click("//input[@name='is_special_event']");
		iwait();
		selectdropdown("//select[@id='top-input-in-details-step']","30 mins");
		iwait();
		click("//button[@ng-click='saveDiaryEvent()']");
		iwait();
		Thread.sleep(2000);
		click("(//a[@id=\"cancel-panel-btn\"])[2]");
		Thread.sleep(4000);	
	
						
}
	public static void service_reminder() throws InterruptedException
	{
		driver.get("https://stage.commusoft.co.uk/customers/customer/1500/view/property/view");
		Thread.sleep(3000);
		iwait();
		click("#remindersTab");
		Thread.sleep(2000);
		iwait();
		click("#AddNewServiceReminder");
		Thread.sleep(3000);
		selectdropdown("//select[@id='servicereminder_propertyservicereminderid']","Manuall reminder");
		iwait();
		selectdropdown("//select[@id='servicereminder_contactid']", "Lord Ranjit Aravind - Phone call, SMS, Email, Letter");
		iwait();
		click("//span[text()='Add service reminder']");
		Thread.sleep(3000);
		iwait();
		click("(//a[text()='Customers'])[1]");
		Thread.sleep(4000);
		click("//a[text()='View all service reminders']");
		Thread.sleep(3000);
		click("(//span[@class='ss-calendar'])[1]");
		iwait();
		click("(//a[@ng-click='selectRange(dateFilterOption)'])[1]");
		Thread.sleep(4000);
//		selectdropdown("//select[@id='selectedServiceReminder']", "Manuall reminder");
//		Thread.sleep(4000);
		iwait();
		click("//span[@class='ss-check']");
		Thread.sleep(2000);
		iwait();
		click("(//span[text()='Process reminders'])[1]");
		Thread.sleep(6000);
		click("//a[@id='printscreen']");
		Thread.sleep(3000);
	}
	
	public static void Customer_NotesCommunication() throws InterruptedException
	{
		driver.get("https://stage.commusoft.co.uk/customers/customer/1500/view/property/view");
		Thread.sleep(3000);
		iwait();
	//Create a New Notes	
		click("//span[text()='Notes & communications']");
		Thread.sleep(3000);
		iwait();
		click("//span[text()='Add new note']");
		Thread.sleep(2000);
		iwait();
		type("#communication_communicationsnote_title", "Title");
		iwait();
		type("#communication_communicationsnote_note", "If you Smell What THE ROCK is Cooking");
		iwait();
		click("(//span[text()='Save'])[1]");
		Thread.sleep(2000);
	//Send new Email
		click("(//span[text()='Send new email'])[1]");
		Thread.sleep(2000);
		iwait();
		selectdropdown("//select[@ng-model='email.selected_recipient_address']", "ranjit@commusoft.co.uk");
		iwait();
		type("//input[@ng-model='email.subject']", "Notes and Communication Email Subject");
		iwait();
		click("(//a[@ng-click='sendEmail()'])[2]");
		Thread.sleep(2000);
	}
	public static void Customer_Createcontact() throws InterruptedException
	{
		driver.get("https://stage.commusoft.co.uk/customers/customer/1500/view/property/view");
		Thread.sleep(3000);
		iwait();
		click("//span[text()='Contacts']");
		Thread.sleep(2000);
		iwait();
		click("//a[text()='Add new contact']");
		iwait();
		type("#contact_name", "Aravind");
		type("#contact_surname", "Reigns");
		type("#contact_contactsemail_emailaddress","rara@yopmail.com");
		iwait();
		Thread.sleep(1000);
		click("//span[@class='number-type-toggle ng-binding']");
		iwait();
		click("//li[text()='Mobile']");
		type("$contact[contactstelephone][0][telephonenumber]", "9856325698");
		click("//span[text()='Add phone number']");
		iwait();
		click("//span[text()='Add contact']");
		
		
	}
	
	
	public static void System_Settings() throws InterruptedException 
	{
		driver.get("https://stage.commusoft.co.uk/customers");
		Thread.sleep(2000);
		iwait();
		click("//a[@id='drop4']");	
		iwait();
		click("//a[text()='Company settings']");
		iwait();
//		scrolldown("//a[text()='Company details']");
		Thread.sleep(2000);
		iwait();
		click("//a[text()='Credit card']");
		Thread.sleep(3000);
		iwait();
		try
		{
			iwait();
			click("(//a[@class='cancel-this-backup ng-pristine ng-valid'])[1]");
			iwait();
			type("(//input[@id='confirm_delete_input'])[1]", "CANCEL");
			iwait();
			click("(//a[@id='delete-button'])[1]");
			iwait();
			click("//a[@class='btn btn-primary ng-pristine ng-valid']");
			iwait();
		}catch(Exception j)
		{
			iwait();
			click("//a[@class='btn btn-primary ng-pristine ng-valid']");
			iwait();
		}
		Thread.sleep(4000);
		iwait();
		click("//a[@id='skip-account-app']");
		Thread.sleep(3000);
		
		
	}
}
