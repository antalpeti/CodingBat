package com.codingbat.array2;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Array2Test is contains tests for Array-2 section.
 */
public class Array2Test {

  /** The instance variable to test the not static methods. */
  private static Array2 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new Array2();
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
   * Test method for {@link Array2#countEvens(int[])}.
   */
  @Test
  public void testCountEvens() {
    Assert.assertEquals(3, instance.countEvens(new int[] {2, 1, 2, 3, 4}));
    Assert.assertEquals(0, instance.countEvens(new int[] {1, 3, 5}));
    Assert.assertEquals(0, instance.countEvens(new int[] {}));
    Assert.assertEquals(1, instance.countEvens(new int[] {11, 9, 0, 1}));
    Assert.assertEquals(2, instance.countEvens(new int[] {2, 11, 9, 0}));
    Assert.assertEquals(1, instance.countEvens(new int[] {2}));
    Assert.assertEquals(2, instance.countEvens(new int[] {2, 5, 12}));
  }
}
