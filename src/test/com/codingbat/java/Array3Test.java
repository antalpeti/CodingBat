package com.codingbat.java;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.codingbat.java.Array3;

/**
 * The class is contains tests for Array-3 section.
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

  /**
   * Test method for {@link Array3#fix45(int[])}.
   */
  @Test
  public void testFix45() {
    Assert.assertArrayEquals(new int[] {9, 4, 5, 4, 5, 9},
        instance.fix45(new int[] {5, 4, 9, 4, 9, 5}));
    Assert.assertArrayEquals(new int[] {1, 4, 5, 1}, instance.fix45(new int[] {1, 4, 1, 5}));
    Assert.assertArrayEquals(new int[] {1, 4, 5, 1, 1, 4, 5},
        instance.fix45(new int[] {1, 4, 1, 5, 5, 4, 1}));
    Assert.assertArrayEquals(new int[] {4, 5, 4, 5, 9, 9, 4, 5, 9},
        instance.fix45(new int[] {4, 9, 4, 9, 5, 5, 4, 9, 5}));
    Assert.assertArrayEquals(new int[] {1, 1, 4, 5, 4, 5},
        instance.fix45(new int[] {5, 5, 4, 1, 4, 1}));
    Assert.assertArrayEquals(new int[] {4, 5, 2, 2}, instance.fix45(new int[] {4, 2, 2, 5}));
    Assert.assertArrayEquals(new int[] {4, 5, 4, 5, 2, 2},
        instance.fix45(new int[] {4, 2, 4, 2, 5, 5}));
    Assert.assertArrayEquals(new int[] {4, 5, 4, 5, 2}, instance.fix45(new int[] {4, 2, 4, 5, 5}));
    Assert.assertArrayEquals(new int[] {1, 1, 1}, instance.fix45(new int[] {1, 1, 1}));
    Assert.assertArrayEquals(new int[] {4, 5}, instance.fix45(new int[] {4, 5}));
    Assert.assertArrayEquals(new int[] {1, 4, 5}, instance.fix45(new int[] {5, 4, 1}));
    Assert.assertArrayEquals(new int[] {}, instance.fix45(new int[] {}));
    Assert.assertArrayEquals(new int[] {1, 4, 5, 4, 5}, instance.fix45(new int[] {5, 4, 5, 4, 1}));
    Assert.assertArrayEquals(new int[] {4, 5, 4, 5, 1}, instance.fix45(new int[] {4, 5, 4, 1, 5}));
    Assert.assertArrayEquals(new int[] {3, 4, 5}, instance.fix45(new int[] {3, 4, 5}));
    Assert.assertArrayEquals(new int[] {4, 5, 1}, instance.fix45(new int[] {4, 1, 5}));
    Assert.assertArrayEquals(new int[] {1, 4, 5}, instance.fix45(new int[] {5, 4, 1}));
    Assert.assertArrayEquals(new int[] {2, 4, 5, 2}, instance.fix45(new int[] {2, 4, 2, 5}));
  }

  /**
   * Test method for {@link Array3#canBalance(int[])}.
   */
  @Test
  public void testCanBalance() {
    Assert.assertEquals(true, instance.canBalance(new int[] {1, 1, 1, 2, 1}));
    Assert.assertEquals(true, instance.canBalance(new int[] {10, 10}));
    Assert.assertEquals(true, instance.canBalance(new int[] {10, 0, 1, -1, 10}));
    Assert.assertEquals(true, instance.canBalance(new int[] {1, 1, 1, 1, 4}));
    Assert.assertEquals(false, instance.canBalance(new int[] {2, 1, 1, 1, 4}));
    Assert.assertEquals(false, instance.canBalance(new int[] {2, 3, 4, 1, 2}));
    Assert.assertEquals(true, instance.canBalance(new int[] {1, 2, 3, 1, 0, 2, 3}));
    Assert.assertEquals(false, instance.canBalance(new int[] {1, 2, 3, 1, 0, 1, 3}));
    Assert.assertEquals(false, instance.canBalance(new int[] {1}));
    Assert.assertEquals(false, instance.canBalance(new int[] {}));
    Assert.assertEquals(true, instance.canBalance(new int[] {1, 1, 1, 2, 1}));
  }

  /**
   * Test method for {@link Array3#linearIn(int[], int[])}.
   */
  @Test
  public void testLinearIn() {
    Assert.assertEquals(true, instance.linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 4}));
    Assert.assertEquals(false, instance.linearIn(new int[] {1, 2, 4, 6}, new int[] {2, 3, 4}));
    Assert.assertEquals(true, instance.linearIn(new int[] {1, 2, 4, 4, 6}, new int[] {2, 4}));
    Assert.assertEquals(true, instance.linearIn(new int[] {2, 2, 4, 4, 6, 6}, new int[] {2, 4}));
    Assert.assertEquals(true, instance.linearIn(new int[] {2, 2, 2, 2, 2}, new int[] {2, 2}));
    Assert.assertEquals(false, instance.linearIn(new int[] {2, 2, 2, 2, 2}, new int[] {2, 4}));
    Assert.assertEquals(true, instance.linearIn(new int[] {2, 2, 2, 2, 4}, new int[] {2, 4}));
    Assert.assertEquals(true, instance.linearIn(new int[] {2, 2, 3, 2, 4}, new int[] {3, 4}));
    Assert.assertEquals(true, instance.linearIn(new int[] {1, 2, 3}, new int[] {2}));
    Assert.assertEquals(false, instance.linearIn(new int[] {1, 2, 3}, new int[] {-1}));
    Assert.assertEquals(true, instance.linearIn(new int[] {1, 2, 3}, new int[] {}));
    Assert.assertEquals(true,
        instance.linearIn(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {-1, 0, 3, 12}));
    Assert.assertEquals(false,
        instance.linearIn(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {0, 3, 12, 14}));
    Assert.assertEquals(false,
        instance.linearIn(new int[] {-1, 0, 3, 3, 3, 10, 12}, new int[] {-1, 10, 11}));
  }

  /**
   * Test method for {@link Array3#squareUp(int)}.
   */
  @Test
  public void testSquareUp() {
    Assert.assertArrayEquals(new int[] {}, instance.squareUp(0));
    Assert.assertArrayEquals(new int[] {1}, instance.squareUp(1));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 1}, instance.squareUp(2));
    Assert.assertArrayEquals(new int[] {0, 0, 1, 0, 2, 1, 3, 2, 1}, instance.squareUp(3));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1},
        instance.squareUp(4));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 1, 0, 0, 0, 2, 1, 0, 0, 3, 2, 1, 0, 4, 3, 2, 1,
        5, 4, 3, 2, 1}, instance.squareUp(5));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 1, 0, 0, 0, 0, 2, 1, 0, 0, 0, 3, 2, 1, 0, 0,
        4, 3, 2, 1, 0, 5, 4, 3, 2, 1, 6, 5, 4, 3, 2, 1}, instance.squareUp(6));
  }

  /**
   * Test method for {@link Array3#seriesUp(int)}.
   */
  @Test
  public void testSeriesUp() {
    Assert.assertArrayEquals(new int[] {}, instance.seriesUp(0));
    Assert.assertArrayEquals(new int[] {1}, instance.seriesUp(1));
    Assert.assertArrayEquals(new int[] {1, 1, 2}, instance.seriesUp(2));
    Assert.assertArrayEquals(new int[] {1, 1, 2, 1, 2, 3}, instance.seriesUp(3));
    Assert.assertArrayEquals(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4}, instance.seriesUp(4));
    Assert.assertArrayEquals(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5},
        instance.seriesUp(5));
    Assert.assertArrayEquals(new int[] {1, 1, 2, 1, 2, 3, 1, 2, 3, 4, 1, 2, 3, 4, 5, 1, 2, 3, 4, 5,
        6}, instance.seriesUp(6));
  }

  /**
   * Test method for {@link Array3#maxMirror(int[])}.
   */
  @Test
  public void testMaxMirror() {
    Assert.assertEquals(3, instance.maxMirror(new int[] {1, 2, 3, 8, 9, 3, 2, 1}));
    Assert.assertEquals(3, instance.maxMirror(new int[] {1, 2, 1, 4}));
    Assert.assertEquals(2, instance.maxMirror(new int[] {7, 1, 2, 9, 7, 2, 1}));
    Assert.assertEquals(4,
        instance.maxMirror(new int[] {21, 22, 9, 8, 7, 6, 23, 24, 6, 7, 8, 9, 25, 7, 8, 9}));
    Assert.assertEquals(4,
        instance.maxMirror(new int[] {1, 2, 1, 20, 21, 1, 2, 1, 2, 23, 24, 2, 1, 2, 1, 25}));
    Assert.assertEquals(5, instance.maxMirror(new int[] {1, 2, 3, 2, 1}));
    Assert.assertEquals(2, instance.maxMirror(new int[] {1, 2, 3, 3, 8}));
    Assert.assertEquals(2, instance.maxMirror(new int[] {1, 2, 7, 8, 1, 7, 2}));
    Assert.assertEquals(3, instance.maxMirror(new int[] {1, 1, 1}));
    Assert.assertEquals(0, instance.maxMirror(new int[] {}));
    Assert.assertEquals(3, instance.maxMirror(new int[] {9, 1, 1, 4, 2, 1, 1, 1}));
    Assert.assertEquals(7, instance.maxMirror(new int[] {5, 9, 9, 4, 5, 4, 9, 9, 2}));
    Assert.assertEquals(2, instance.maxMirror(new int[] {5, 9, 9, 6, 5, 4, 9, 9, 2}));
    Assert.assertEquals(3, instance.maxMirror(new int[] {5, 9, 1, 6, 5, 4, 1, 9, 5}));
    Assert.assertEquals(8, instance.maxMirror(new int[] {1, 4, 5, 6, 6, 5, 4, 1, 5, 4, 1}));
  }
}
