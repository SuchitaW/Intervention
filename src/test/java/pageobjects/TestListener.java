package pageobjects;

import org.junit.runner.Description;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;
import org.junit.runner.notification.RunListener;

import utility.SendMail;

public class TestListener extends RunListener {
	
	
	private static boolean hasFailures = false;

    @Override
    public void testRunStarted(Description description) throws Exception {
        hasFailures = false;
    }

    @Override
    public void testFailure(Failure failure) throws Exception {
        hasFailures = true;
    }

    public static boolean hasFailures() {
        return hasFailures;
    }
}
	
	
	
	
	
	
	

//	    private StringBuilder report = new StringBuilder();
//
//	    @Override
//	    public void testRunStarted(Description description) throws Exception {
//	        report.append("Test run started: ").append(description.getDisplayName()).append("\n");
//	    }
//
//	    @Override
//	    public void testRunFinished(Result result) throws Exception {
//	        report.append("Test run finished: ").append(result.getRunTime()).append(" ms\n");
//	        report.append("Total tests: ").append(result.getRunCount()).append("\n");
//	        report.append("Passed tests: ").append(result.getRunCount() - result.getFailureCount()).append("\n");
//	        report.append("Failed tests: ").append(result.getFailureCount()).append("\n");
//	    }
//
//	    @Override
//	    public void testFailure(Failure failure) throws Exception {
//	        report.append("Test failed: ").append(failure.getDescription().getDisplayName()).append("\n");
//	        report.append("Error: ").append(failure.getMessage()).append("\n");
//	    }
//
//	    @Override
//	    public void testFinished(Description description) throws Exception {
//	        report.append("Test finished: ").append(description.getDisplayName()).append("\n");
//	    }
//
//	    public String getReport() {
//	        return report.toString();
//	    }
//	}
	