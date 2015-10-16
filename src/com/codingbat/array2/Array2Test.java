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

  /**
   * Test method for {@link Array2#bigDiff(int[])}.
   */
  @Test
  public void testBigDiff() {
    Assert.assertEquals(7, instance.bigDiff(new int[] {10, 3, 5, 6}));
    Assert.assertEquals(8, instance.bigDiff(new int[] {7, 2, 10, 9}));
    Assert.assertEquals(8, instance.bigDiff(new int[] {2, 10, 7, 2}));
    Assert.assertEquals(8, instance.bigDiff(new int[] {2, 10}));
    Assert.assertEquals(8, instance.bigDiff(new int[] {10, 2}));
    Assert.assertEquals(10, instance.bigDiff(new int[] {10, 0}));
    Assert.assertEquals(1, instance.bigDiff(new int[] {2, 3}));
    Assert.assertEquals(0, instance.bigDiff(new int[] {2, 2}));
    Assert.assertEquals(0, instance.bigDiff(new int[] {2}));
    Assert.assertEquals(8, instance.bigDiff(new int[] {5, 1, 6, 1, 9, 9}));
    Assert.assertEquals(3, instance.bigDiff(new int[] {7, 6, 8, 5}));
    Assert.assertEquals(3, instance.bigDiff(new int[] {7, 7, 6, 8, 5, 5, 6}));
  }

  /**
   * Test method for {@link Array2#centeredAverage(int[])}.
   */
  @Test
  public void testCenteredAverage() {
    Assert.assertEquals(3, instance.centeredAverage(new int[] {1, 2, 3, 4, 100}));
    Assert.assertEquals(5, instance.centeredAverage(new int[] {1, 1, 5, 5, 10, 8, 7}));
    Assert.assertEquals(-3, instance.centeredAverage(new int[] {-10, -4, -2, -4, -2, 0}));
    Assert.assertEquals(4, instance.centeredAverage(new int[] {5, 3, 4, 6, 2}));
    Assert.assertEquals(4, instance.centeredAverage(new int[] {5, 3, 4, 0, 100}));
    Assert.assertEquals(4, instance.centeredAverage(new int[] {100, 0, 5, 3, 4}));
    Assert.assertEquals(4, instance.centeredAverage(new int[] {4, 0, 100}));
    Assert.assertEquals(3, instance.centeredAverage(new int[] {0, 2, 3, 4, 100}));
    Assert.assertEquals(1, instance.centeredAverage(new int[] {1, 1, 100}));
    Assert.assertEquals(7, instance.centeredAverage(new int[] {7, 7, 7}));
    Assert.assertEquals(7, instance.centeredAverage(new int[] {1, 7, 8}));
    Assert.assertEquals(50, instance.centeredAverage(new int[] {1, 1, 99, 99}));
    Assert.assertEquals(50, instance.centeredAverage(new int[] {1000, 0, 1, 99}));
    Assert.assertEquals(4, instance.centeredAverage(new int[] {4, 4, 4, 4, 5}));
    Assert.assertEquals(4, instance.centeredAverage(new int[] {4, 4, 4, 1, 5}));
    Assert.assertEquals(6, instance.centeredAverage(new int[] {6, 4, 8, 12, 3}));
  }
}
