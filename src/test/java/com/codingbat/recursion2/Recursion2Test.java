package com.codingbat.recursion2;

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
}
