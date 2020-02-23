package myframework;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listener extends PageSetup implements ITestListener{
	
	public void onTestSuccess (ITestResult result)
	{
		try {
			ScreenShot();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
