package com.codingbat.array3;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Array3Test is contains tests for Array-3 section.
 */
public class Array3Test {

  /** The instance variable to test the not static methods. */
  private static Array3 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new Array3();
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
   * Test method for {@link Array3#maxSpan(int[])}.
   */
  @Test
  public void testMaxSpan() {
    Assert.assertEquals(4, instance.maxSpan(new int[] {1, 2, 1, 1, 3}));
    Assert.assertEquals(6, instance.maxSpan(new int[] {1, 4, 2, 1, 4, 1, 4}));
    Assert.assertEquals(6, instance.maxSpan(new int[] {1, 4, 2, 1, 4, 4, 4}));
    Assert.assertEquals(3, instance.maxSpan(new int[] {3, 3, 3}));
    Assert.assertEquals(3, instance.maxSpan(new int[] {3, 9, 3}));
    Assert.assertEquals(2, instance.maxSpan(new int[] {3, 9, 9}));
    Assert.assertEquals(1, instance.maxSpan(new int[] {3, 9,}));
    Assert.assertEquals(2, instance.maxSpan(new int[] {3, 3}));
    Assert.assertEquals(0, instance.maxSpan(new int[] {}));
    Assert.assertEquals(1, instance.maxSpan(new int[] {1}));
  }

  /**
   * Test method for {@link Array3#fix34(int[])}.
   */
  @Test
  public void testFix34() {
    Assert.assertArrayEquals(new int[] {1, 3, 4, 1}, instance.fix34(new int[] {1, 3, 1, 4}));
    Assert.assertArrayEquals(new int[] {1, 3, 4, 1, 1, 3, 4},
        instance.fix34(new int[] {1, 3, 1, 4, 4, 3, 1}));
    Assert.assertArrayEquals(new int[] {3, 4, 2, 2}, instance.fix34(new int[] {3, 2, 2, 4}));
    Assert.assertArrayEquals(new int[] {3, 4, 3, 4, 2, 2},
        instance.fix34(new int[] {3, 2, 3, 2, 4, 4}));
    Assert.assertArrayEquals(new int[] {2, 3, 4, 3, 4, 2, 2},
        instance.fix34(new int[] {2, 3, 2, 3, 2, 4, 4}));
    Assert.assertArrayEquals(new int[] {3, 4, 1}, instance.fix34(new int[] {3, 1, 4}));
    Assert.assertArrayEquals(new int[] {3, 4, 1}, instance.fix34(new int[] {3, 4, 1}));
    Assert.assertArrayEquals(new int[] {1, 1, 1}, instance.fix34(new int[] {1, 1, 1}));
    Assert.assertArrayEquals(new int[] {1}, instance.fix34(new int[] {1}));
    Assert.assertArrayEquals(new int[] {}, instance.fix34(new int[] {}));
    Assert.assertArrayEquals(new int[] {7, 3, 4, 7, 7}, instance.fix34(new int[] {7, 3, 7, 7, 4}));
    Assert.assertArrayEquals(new int[] {3, 4, 1, 3, 4, 1},
        instance.fix34(new int[] {3, 1, 4, 3, 1, 4}));
    Assert.assertArrayEquals(new int[] {3, 4, 1, 3, 4, 1},
        instance.fix34(new int[] {3, 1, 1, 3, 4, 4}));
    Assert.assertArrayEquals(new int[] {3, 4, 2, 3, 4, 1},
        instance.fix34(new int[] {3, 1, 2, 3, 4, 4}));
    Assert.assertArrayEquals(new int[] {3, 4, 2, 5, 1}, instance.fix34(new int[] {3, 1, 2, 5, 4}));
  }
}
