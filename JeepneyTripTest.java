import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class SampleTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testChangeNoDiscount() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 0);
    JeepneyTrip u = new JeepneyTrip(6, 1, 0);
    JeepneyTrip v = new JeepneyTrip(4, 1, 0);
    JeepneyTrip a = new JeepneyTrip(5, 2, 0);
    JeepneyTrip b = new JeepneyTrip(6, 2, 0);
    JeepneyTrip c = new JeepneyTrip(4, 2, 0);
    
    assertEquals(3.0, t.fareChange(10));
    assertEquals(2.5, u.fareChange(10));
    assertEquals(3.0, v.fareChange(10));
    assertEquals(6.0, a.fareChange(20));
    assertEquals(5.0, b.fareChange(20));
    assertEquals(6.0, c.fareChange(20));
  }
  
  public void testChangeDiscount() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 1);
    JeepneyTrip u = new JeepneyTrip(6, 2, 1);
    JeepneyTrip v = new JeepneyTrip(4, 3, 2);
    JeepneyTrip a = new JeepneyTrip(5, 3, 2);
    JeepneyTrip b = new JeepneyTrip(6, 1, 1);
    JeepneyTrip c = new JeepneyTrip(8, 2, 2);
    
    assertEquals(4.0, t.fareChange(10));
    assertEquals(6.0, u.fareChange(20));
    assertEquals(1.0, v.fareChange(20));
    assertEquals(1.0, a.fareChange(20));
    assertEquals(3.5, b.fareChange(10));
    assertEquals(5.0, c.fareChange(20));
  }
  
  public void testExcessDistance() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 1);
    JeepneyTrip u = new JeepneyTrip(6, 2, 1);
    JeepneyTrip v = new JeepneyTrip(4, 3, 2);
    JeepneyTrip a = new JeepneyTrip(5, 3, 2);
    JeepneyTrip b = new JeepneyTrip(6, 1, 1);
    JeepneyTrip c = new JeepneyTrip(8, 2, 2);
    
    assertEquals(0.0, t.excessDistance());
    assertEquals(0.5, u.excessDistance());
    assertEquals(0.0, v.excessDistance());
    assertEquals(0.0, a.excessDistance());
    assertEquals(0.5, b.excessDistance());
    assertEquals(1.5, c.excessDistance());
  }
  
  public void testRegularFare() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 1);
    JeepneyTrip u = new JeepneyTrip(6, 2, 1);
    JeepneyTrip v = new JeepneyTrip(4, 3, 2);
    JeepneyTrip a = new JeepneyTrip(5, 3, 2);
    JeepneyTrip b = new JeepneyTrip(6, 1, 1);
    JeepneyTrip c = new JeepneyTrip(8, 2, 2);
    
    assertEquals(6.0, t.totalFare());
    assertEquals(14.0, u.totalFare());
    assertEquals(19.0, v.totalFare());
    assertEquals(19.0, a.totalFare());
    assertEquals(6.5, b.totalFare());
    assertEquals(15.0, c.totalFare());
  }
  
  public void testRegularPassenger() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 1);
    JeepneyTrip u = new JeepneyTrip(6, 2, 1);
    JeepneyTrip a = new JeepneyTrip(5, 2, 0);
    
    assertEquals(0, t.regularPassenger());
    assertEquals(1, u.regularPassenger());
    assertEquals(2, a.regularPassenger());
  }
}
