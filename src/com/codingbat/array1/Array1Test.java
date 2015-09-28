package com.codingbat.array1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Array1Test is contains tests for Array-1 section.
 */
public class Array1Test {

  /** The instance variable to test the not static methods. */
  private static Array1 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new Array1();
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
   * Test method for {@link Array1#firstLast6(int[])}.
   */
  @Test
  public void testFirstLast6() {
    Assert.assertEquals(true, instance.firstLast6(new int[] {1, 2, 6}));
    Assert.assertEquals(true, instance.firstLast6(new int[] {6, 1, 2, 3}));
    Assert.assertEquals(false, instance.firstLast6(new int[] {13, 6, 1, 2, 3}));
    Assert.assertEquals(true, instance.firstLast6(new int[] {13, 6, 1, 2, 6}));
    Assert.assertEquals(false, instance.firstLast6(new int[] {3, 1, 2}));
    Assert.assertEquals(false, instance.firstLast6(new int[] {3, 6, 1}));
    Assert.assertEquals(true, instance.firstLast6(new int[] {3, 6}));
    Assert.assertEquals(true, instance.firstLast6(new int[] {6, 1}));
    Assert.assertEquals(true, instance.firstLast6(new int[] {6}));
    Assert.assertEquals(false, instance.firstLast6(new int[] {3}));
    Assert.assertEquals(true, instance.firstLast6(new int[] {5, 6}));
    Assert.assertEquals(false, instance.firstLast6(new int[] {5, 5}));
    Assert.assertEquals(true, instance.firstLast6(new int[] {1, 2, 3, 4, 6}));
    Assert.assertEquals(false, instance.firstLast6(new int[] {1, 2, 3, 4}));
  }

  /**
   * Test method for {@link Array1#sameFirstLast(int[])}.
   */
  @Test
  public void testSameFirstLast() {
    Assert.assertEquals(false, instance.sameFirstLast(new int[] {1, 2, 3}));
    Assert.assertEquals(true, instance.sameFirstLast(new int[] {1, 2, 3, 1}));
    Assert.assertEquals(true, instance.sameFirstLast(new int[] {1, 2, 1}));
    Assert.assertEquals(true, instance.sameFirstLast(new int[] {7}));
    Assert.assertEquals(false, instance.sameFirstLast(new int[] {}));
    Assert.assertEquals(true, instance.sameFirstLast(new int[] {1, 2, 3, 4, 5, 1}));
    Assert.assertEquals(false, instance.sameFirstLast(new int[] {1, 2, 3, 4, 5, 13}));
    Assert.assertEquals(true, instance.sameFirstLast(new int[] {13, 2, 3, 4, 5, 13}));
    Assert.assertEquals(true, instance.sameFirstLast(new int[] {7, 7}));
  }

  /**
   * Test method for {@link Array1#makePi()}.
   */
  @Test
  public void testMakePi() {
    Assert.assertArrayEquals(new int[] {3, 1, 4}, instance.makePi());
  }

  /**
   * Test method for {@link Array1#commonEnd(int[], int[])}.
   */
  @Test
  public void testCommonEnd() {
    Assert.assertEquals(true, instance.commonEnd(new int[] {1, 2, 3}, new int[] {7, 3}));
    Assert.assertEquals(false, instance.commonEnd(new int[] {1, 2, 3}, new int[] {7, 3, 2}));
    Assert.assertEquals(true, instance.commonEnd(new int[] {1, 2, 3}, new int[] {1, 3}));
    Assert.assertEquals(true, instance.commonEnd(new int[] {1, 2, 3}, new int[] {1}));
    Assert.assertEquals(true, instance.commonEnd(new int[] {3}, new int[] {1, 2, 3}));
    Assert.assertEquals(false, instance.commonEnd(new int[] {1, 2, 3}, new int[] {2}));
  }

  /**
   * Test method for {@link Array1#sum3(int[])}.
   */
  @Test
  public void testSum3() {
    Assert.assertEquals(6, instance.sum3(new int[] {1, 2, 3}));
    Assert.assertEquals(18, instance.sum3(new int[] {5, 11, 2}));
    Assert.assertEquals(7, instance.sum3(new int[] {7, 0, 0}));
    Assert.assertEquals(4, instance.sum3(new int[] {1, 2, 1}));
    Assert.assertEquals(3, instance.sum3(new int[] {1, 1, 1}));
    Assert.assertEquals(11, instance.sum3(new int[] {2, 7, 2}));
    Assert.assertEquals(2, instance.sum3(new int[] {2, 0, 0}));
    Assert.assertEquals(5, instance.sum3(new int[] {0, 5, 0}));
    Assert.assertEquals(8, instance.sum3(new int[] {0, 0, 8}));
    Assert.assertEquals(0, instance.sum3(new int[] {0, 0, 0}));
  }

  /**
   * Test method for {@link Array1#rotateLeft3(int[])}.
   */
  @Test
  public void testRotateLeft3() {
    Assert.assertArrayEquals(new int[] {2, 3, 1}, instance.rotateLeft3(new int[] {1, 2, 3}));
    Assert.assertArrayEquals(new int[] {11, 9, 5}, instance.rotateLeft3(new int[] {5, 11, 9}));
    Assert.assertArrayEquals(new int[] {0, 0, 7}, instance.rotateLeft3(new int[] {7, 0, 0}));
    Assert.assertArrayEquals(new int[] {2, 1, 1}, instance.rotateLeft3(new int[] {1, 2, 1}));
    Assert.assertArrayEquals(new int[] {0, 1, 0}, instance.rotateLeft3(new int[] {0, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 0, 0}, instance.rotateLeft3(new int[] {0, 0, 0}));
    Assert.assertArrayEquals(new int[] {1, 1, 1}, instance.rotateLeft3(new int[] {1, 1, 1}));
  }

  /**
   * Test method for {@link Array1#reverse3(int[])}.
   */
  @Test
  public void testReverse3() {
    Assert.assertArrayEquals(new int[] {3, 2, 1}, instance.reverse3(new int[] {1, 2, 3}));
    Assert.assertArrayEquals(new int[] {9, 11, 5}, instance.reverse3(new int[] {5, 11, 9}));
    Assert.assertArrayEquals(new int[] {0, 0, 7}, instance.reverse3(new int[] {7, 0, 0}));
    Assert.assertArrayEquals(new int[] {2, 1, 2}, instance.reverse3(new int[] {2, 1, 2}));
    Assert.assertArrayEquals(new int[] {1, 2, 1}, instance.reverse3(new int[] {1, 2, 1}));
    Assert.assertArrayEquals(new int[] {3, 11, 2}, instance.reverse3(new int[] {2, 11, 3}));
    Assert.assertArrayEquals(new int[] {5, 6, 0}, instance.reverse3(new int[] {0, 6, 5}));
    Assert.assertArrayEquals(new int[] {3, 2, 7}, instance.reverse3(new int[] {7, 2, 3}));
  }
}
