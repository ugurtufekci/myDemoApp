package com.mycompany.app;
import java.util.Arrays;
import java.util.ArrayList;
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
    public AppTest( String testName )
    {
        super( testName );
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
  
    } public void testFound() {
      ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(5, 10, 15, 20));
      assertTrue(new App().search(array, 4,10));
    }

    public void testNotFound() {
      ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(5,6,7,8));
      assertFalse(new App().search(array, 9,15));
    }

    public void Negative(){
     ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(5,55,89,44));
     assertFalse(new App().search(array,-5,10)); 
    }

    public void Negative2(){
     ArrayList<Integer> array = new ArrayList<Integer>(Arrays.asList(7,34,5,100));
     assertFalse(new App().search(array,5,-11)); 
    }


    public void testEmptyArray() {
      ArrayList<Integer> array = new ArrayList<Integer>();
      assertFalse(new App().search(array, 1,1));
    }

    public void testNull() {
      assertFalse(new App().search(null, 1,1));
    }

}
