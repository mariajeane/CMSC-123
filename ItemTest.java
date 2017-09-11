import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ItemTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testTotalDiscount() {
    Item a = new Item(1500.00, 0.10);
    Item b = new Item(800.00, 0.10);
    Item c = new Item(1000.00, 0.10);
    
    assertEquals(150., a.totalDiscount());
    assertEquals(80.0, b.totalDiscount());
    assertEquals(100.0, c.totalDiscount());
  }
  
  public void testTotalPrice() {
    Item a = new Item(1500.00, 0.10);
    Item b = new Item(800.00, 0.10);
    Item c = new Item(1000.00, 0.10);
    
    assertEquals(1350.0, a.salePrice());
    assertEquals(800.0, b.salePrice());
    assertEquals(1000.0, c.salePrice());
  }
}
