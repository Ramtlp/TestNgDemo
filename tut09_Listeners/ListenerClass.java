package tut09_Listeners;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenerClass implements ITestListener
{

	public void onStart(ITestContext context)
    {
        System.out.println("onStart method invoked");
    }

    public void onTestStart(ITestResult result)
    {
        System.out.println("Name of test method started: " + result.getName());
    }

    public void onTestSuccess(ITestResult result) 
    {
        System.out.println("Name of test method successfully executed: " + result.getName());
    }

    public void onTestFailure(ITestResult result)
    {
        System.out.println("Failed test method name is: " + result.getName());
    }

    public void onTestFailedWithTimeout(ITestResult result) 
    {
        // Optionally, handle what happens when a test fails due to a timeout
    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
    {
        // Optionally, handle partial failures
    }

    public void onTestSkipped(ITestResult result)
    {
        System.out.println("Name of skipped test method is: " + result.getName());
    }

    public void onFinish(ITestContext context)
    {
        System.out.println("onFinish method invoked");
    }


}
