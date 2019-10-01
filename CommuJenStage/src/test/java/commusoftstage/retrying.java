package commusoftstage;


	import org.testng.IRetryAnalyzer;
	import org.testng.ITestResult;

	public class retrying implements IRetryAnalyzer {	
		int Count=0;
		int retryi=2;
		public boolean retry(ITestResult result) {
			
			  if(Count <= retryi)
				  
		      {
		             System.out.println("Following test is failing===="+result.getName());
		             
		             Count++;

		             return true;

		      }	return false;

		      

	}
	}

