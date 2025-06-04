package javademocit.p6;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class AppTest 
    extends TestCase
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
	private App app;
	
    public AppTest( String testName )
    {
        super( testName );
        this.app = new App();
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite()
    {
        return new TestSuite( AppTest.class );
    }

    /**
     * Rigourous Test :-)
     */
    public void testApp()
    {
        assertTrue( true );
    }
    
    public void testfact0() {
    	assertEquals("Factorial of 0 must be 1", 1, this.app.calculatefactorial(0));
    }
    public void testfact5() {
    	assertEquals("Factorial of 5 must be 120", 120, this.app.calculatefactorial(5));
    }
}
