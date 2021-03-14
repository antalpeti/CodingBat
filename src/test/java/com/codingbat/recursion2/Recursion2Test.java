package java.com.codingbat.recursion2;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class is contains tests for Recursion-2 section.
 */
public class Recursion2Test {

  /** The instance variable to test the not static methods. */
  private static Recursion2 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new Recursion2();
  }

  /**
   * Tear down after the tests finish.
   *
   * @throws Exception the exception if something go wrong
   */
  @AfterClass
  public static void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Recursion2#groupSum(int, int[], int)}.
   */
  @Test
  public void testGroupSum() {
    Assert.assertEquals(true, instance.groupSum(0, new int[] {2, 4, 8}, 10));
    Assert.assertEquals(true, instance.groupSum(0, new int[] {2, 4, 8}, 14));
    Assert.assertEquals(false, instance.groupSum(0, new int[] {2, 4, 8}, 9));
    Assert.assertEquals(true, instance.groupSum(0, new int[] {2, 4, 8}, 8));
    Assert.assertEquals(true, instance.groupSum(1, new int[] {1, 4, 8}, 8));
    Assert.assertEquals(false, instance.groupSum(1, new int[] {2, 4, 8}, 2));
    Assert.assertEquals(true, instance.groupSum(0, new int[] {1}, 1));
    Assert.assertEquals(false, instance.groupSum(0, new int[] {9}, 1));
    Assert.assertEquals(true, instance.groupSum(1, new int[] {9}, 0));
    Assert.assertEquals(true, instance.groupSum(0, new int[] {}, 0));
    Assert.assertEquals(true, instance.groupSum(0, new int[] {10, 2, 2, 5}, 17));
    Assert.assertEquals(true, instance.groupSum(0, new int[] {10, 2, 2, 5}, 15));
    Assert.assertEquals(true, instance.groupSum(0, new int[] {10, 2, 2, 5}, 9));
  }

  /**
   * Test method for {@link Recursion2#groupSum6(int, int[], int)}.
   */
  @Test
  public void testGroupSum6() {
    Assert.assertEquals(true, instance.groupSum6(0, new int[] {5, 6, 2}, 8));
    Assert.assertEquals(false, instance.groupSum6(0, new int[] {5, 6, 2}, 9));
    Assert.assertEquals(false, instance.groupSum6(0, new int[] {5, 6, 2}, 7));
    Assert.assertEquals(true, instance.groupSum6(0, new int[] {1}, 1));
    Assert.assertEquals(false, instance.groupSum6(0, new int[] {9}, 1));
    Assert.assertEquals(true, instance.groupSum6(0, new int[] {}, 0));
    Assert.assertEquals(true, instance.groupSum6(0, new int[] {3, 2, 4, 6}, 8));
    Assert.assertEquals(true, instance.groupSum6(0, new int[] {6, 2, 4, 3}, 8));
    Assert.assertEquals(false, instance.groupSum6(0, new int[] {5, 2, 4, 6}, 9));
    Assert.assertEquals(false, instance.groupSum6(0, new int[] {6, 2, 4, 5}, 9));
    Assert.assertEquals(false, instance.groupSum6(0, new int[] {3, 2, 4, 6}, 3));
    Assert.assertEquals(true, instance.groupSum6(0, new int[] {1, 6, 2, 6, 4}, 12));
    Assert.assertEquals(true, instance.groupSum6(0, new int[] {1, 6, 2, 6, 4}, 13));
    Assert.assertEquals(false, instance.groupSum6(0, new int[] {1, 6, 2, 6, 4}, 4));
    Assert.assertEquals(false, instance.groupSum6(0, new int[] {1, 6, 2, 6, 4}, 9));
    Assert.assertEquals(true, instance.groupSum6(0, new int[] {1, 6, 2, 6, 5}, 14));
    Assert.assertEquals(true, instance.groupSum6(0, new int[] {1, 6, 2, 6, 5}, 15));
    Assert.assertEquals(false, instance.groupSum6(0, new int[] {1, 6, 2, 6, 5}, 16));
  }

  /**
   * Test method for {@link Recursion2#groupNoAdj(int, int[], int)}.
   */
  @Test
  public void testGroupNoAdj() {
    Assert.assertEquals(true, instance.groupNoAdj(0, new int[] {2, 5, 10, 4}, 12));
    Assert.assertEquals(false, instance.groupNoAdj(0, new int[] {2, 5, 10, 4}, 14));
    Assert.assertEquals(false, instance.groupNoAdj(0, new int[] {2, 5, 10, 4}, 7));
    Assert.assertEquals(true, instance.groupNoAdj(0, new int[] {2, 5, 10, 4, 2}, 7));
    Assert.assertEquals(true, instance.groupNoAdj(0, new int[] {2, 5, 10, 4}, 9));
    Assert.assertEquals(true, instance.groupNoAdj(0, new int[] {10, 2, 2, 3, 3}, 15));
    Assert.assertEquals(false, instance.groupNoAdj(0, new int[] {10, 2, 2, 3, 3}, 7));
    Assert.assertEquals(true, instance.groupNoAdj(0, new int[] {}, 0));
    Assert.assertEquals(true, instance.groupNoAdj(0, new int[] {1}, 1));
    Assert.assertEquals(false, instance.groupNoAdj(0, new int[] {9}, 1));
    Assert.assertEquals(true, instance.groupNoAdj(0, new int[] {9}, 0));
    Assert.assertEquals(true, instance.groupNoAdj(0, new int[] {5, 10, 4, 1}, 11));
  }
}
