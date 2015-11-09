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

  /**
   * Test method for {@link Array2#sum13(int[])}.
   */
  @Test
  public void testSum13() {
    Assert.assertEquals(6, instance.sum13(new int[] {1, 2, 2, 1}));
    Assert.assertEquals(2, instance.sum13(new int[] {1, 1}));
    Assert.assertEquals(6, instance.sum13(new int[] {1, 2, 2, 1, 13}));
    Assert.assertEquals(4, instance.sum13(new int[] {1, 2, 13, 2, 1, 13}));
    Assert.assertEquals(3, instance.sum13(new int[] {13, 1, 2, 13, 2, 1, 13}));
    Assert.assertEquals(0, instance.sum13(new int[] {}));
    Assert.assertEquals(0, instance.sum13(new int[] {13}));
    Assert.assertEquals(0, instance.sum13(new int[] {13, 13}));
    Assert.assertEquals(0, instance.sum13(new int[] {13, 0, 13}));
    Assert.assertEquals(0, instance.sum13(new int[] {13, 1, 13}));
    Assert.assertEquals(14, instance.sum13(new int[] {5, 7, 2}));
    Assert.assertEquals(5, instance.sum13(new int[] {5, 13, 2}));
    Assert.assertEquals(0, instance.sum13(new int[] {0}));
    Assert.assertEquals(0, instance.sum13(new int[] {13, 0}));
  }

  /**
   * Test method for {@link Array2#sum67(int[])}.
   */
  @Test
  public void testSum67() {
    Assert.assertEquals(5, instance.sum67(new int[] {1, 2, 2}));
    Assert.assertEquals(5, instance.sum67(new int[] {1, 2, 2, 6, 99, 99, 7}));
    Assert.assertEquals(4, instance.sum67(new int[] {1, 1, 6, 7, 2}));
    Assert.assertEquals(2, instance.sum67(new int[] {1, 6, 2, 2, 7, 1, 6, 99, 99, 7}));
    Assert.assertEquals(2, instance.sum67(new int[] {1, 6, 2, 6, 2, 7, 1, 6, 99, 99, 7}));
    Assert.assertEquals(18, instance.sum67(new int[] {2, 7, 6, 2, 6, 7, 2, 7}));
    Assert.assertEquals(9, instance.sum67(new int[] {2, 7, 6, 2, 6, 2, 7}));
    Assert.assertEquals(8, instance.sum67(new int[] {1, 6, 7, 7}));
    Assert.assertEquals(8, instance.sum67(new int[] {6, 7, 1, 6, 7, 7}));
    Assert.assertEquals(0, instance.sum67(new int[] {6, 8, 1, 6, 7}));
    Assert.assertEquals(0, instance.sum67(new int[] {}));
    Assert.assertEquals(11, instance.sum67(new int[] {6, 7, 11}));
    Assert.assertEquals(22, instance.sum67(new int[] {11, 6, 7, 11}));
    Assert.assertEquals(11, instance.sum67(new int[] {2, 2, 6, 7, 7}));
  }

  /**
   * Test method for {@link Array2#has22(int[])}.
   */
  @Test
  public void testHas22() {
    Assert.assertEquals(true, instance.has22(new int[] {1, 2, 2}));
    Assert.assertEquals(false, instance.has22(new int[] {1, 2, 1, 2}));
    Assert.assertEquals(false, instance.has22(new int[] {2, 1, 2}));
    Assert.assertEquals(true, instance.has22(new int[] {2, 2, 1, 2}));
    Assert.assertEquals(false, instance.has22(new int[] {1, 3, 2}));
    Assert.assertEquals(true, instance.has22(new int[] {1, 3, 2, 2}));
    Assert.assertEquals(true, instance.has22(new int[] {2, 3, 2, 2}));
    Assert.assertEquals(true, instance.has22(new int[] {4, 2, 4, 2, 2, 5}));
    Assert.assertEquals(false, instance.has22(new int[] {1, 2}));
    Assert.assertEquals(true, instance.has22(new int[] {2, 2}));
    Assert.assertEquals(false, instance.has22(new int[] {2}));
    Assert.assertEquals(false, instance.has22(new int[] {}));
    Assert.assertEquals(true, instance.has22(new int[] {3, 3, 2, 2}));
    Assert.assertEquals(false, instance.has22(new int[] {5, 2, 5, 2}));
  }

  /**
   * Test method for {@link Array2#lucky13(int[])}.
   */
  @Test
  public void testLucky13() {
    Assert.assertEquals(true, instance.lucky13(new int[] {0, 2, 4}));
    Assert.assertEquals(false, instance.lucky13(new int[] {1, 2, 3}));
    Assert.assertEquals(false, instance.lucky13(new int[] {1, 2, 4}));
    Assert.assertEquals(true, instance.lucky13(new int[] {2, 7, 2, 8}));
    Assert.assertEquals(false, instance.lucky13(new int[] {2, 7, 1, 8}));
    Assert.assertEquals(false, instance.lucky13(new int[] {3, 7, 2, 8}));
    Assert.assertEquals(false, instance.lucky13(new int[] {2, 7, 2, 1}));
    Assert.assertEquals(false, instance.lucky13(new int[] {1, 2}));
    Assert.assertEquals(true, instance.lucky13(new int[] {2, 2}));
    Assert.assertEquals(true, instance.lucky13(new int[] {2}));
    Assert.assertEquals(false, instance.lucky13(new int[] {3}));
    Assert.assertEquals(false, instance.lucky13(new int[] {1}));
    Assert.assertEquals(true, instance.lucky13(new int[] {}));
  }

  /**
   * Test method for {@link Array2#sum28(int[])}.
   */
  @Test
  public void testSum28() {
    Assert.assertEquals(true, instance.sum28(new int[] {2, 3, 2, 2, 4, 2}));
    Assert.assertEquals(false, instance.sum28(new int[] {2, 3, 2, 2, 4, 2, 2}));
    Assert.assertEquals(false, instance.sum28(new int[] {1, 2, 3, 4}));
    Assert.assertEquals(true, instance.sum28(new int[] {2, 2, 2, 2}));
    Assert.assertEquals(true, instance.sum28(new int[] {1, 2, 2, 2, 2, 4}));
    Assert.assertEquals(false, instance.sum28(new int[] {}));
    Assert.assertEquals(false, instance.sum28(new int[] {2}));
    Assert.assertEquals(false, instance.sum28(new int[] {8}));
    Assert.assertEquals(false, instance.sum28(new int[] {2, 2, 2}));
    Assert.assertEquals(false, instance.sum28(new int[] {2, 2, 2, 2, 2}));
    Assert.assertEquals(true, instance.sum28(new int[] {1, 2, 2, 1, 2, 2}));
    Assert.assertEquals(true, instance.sum28(new int[] {5, 2, 2, 2, 4, 2}));
  }

  /**
   * Test method for {@link Array2#more14(int[])}.
   */
  @Test
  public void testMore14() {
    Assert.assertEquals(true, instance.more14(new int[] {1, 4, 1}));
    Assert.assertEquals(false, instance.more14(new int[] {1, 4, 1, 4}));
    Assert.assertEquals(true, instance.more14(new int[] {1, 1}));
    Assert.assertEquals(true, instance.more14(new int[] {1, 6, 6}));
    Assert.assertEquals(true, instance.more14(new int[] {1}));
    Assert.assertEquals(false, instance.more14(new int[] {1, 4}));
    Assert.assertEquals(true, instance.more14(new int[] {6, 1, 1}));
    Assert.assertEquals(false, instance.more14(new int[] {1, 6, 4}));
    Assert.assertEquals(true, instance.more14(new int[] {1, 1, 4, 4, 1}));
    Assert.assertEquals(true, instance.more14(new int[] {1, 1, 6, 4, 4, 1}));
    Assert.assertEquals(false, instance.more14(new int[] {}));
    Assert.assertEquals(false, instance.more14(new int[] {4, 1, 4, 6}));
    Assert.assertEquals(false, instance.more14(new int[] {4, 1, 4, 6, 1}));
    Assert.assertEquals(true, instance.more14(new int[] {1, 4, 1, 4, 1, 6}));
  }

  /**
   * Test method for {@link Array2#fizzArray(int)}.
   */
  @Test
  public void testFizzArray() {
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3}, instance.fizzArray(4));
    Assert.assertArrayEquals(new int[] {0}, instance.fizzArray(1));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}, instance.fizzArray(10));
    Assert.assertArrayEquals(new int[] {}, instance.fizzArray(0));
    Assert.assertArrayEquals(new int[] {0, 1}, instance.fizzArray(2));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6}, instance.fizzArray(7));
    Assert.assertArrayEquals(new int[] {0, 1, 2, 3, 4, 5, 6, 7}, instance.fizzArray(8));
  }

  /**
   * Test method for {@link Array2#only14(int[])}.
   */
  @Test
  public void testOnly14() {
    Assert.assertEquals(true, instance.only14(new int[] {1, 4, 1, 4}));
    Assert.assertEquals(false, instance.only14(new int[] {1, 4, 2, 4}));
    Assert.assertEquals(true, instance.only14(new int[] {1, 1}));
    Assert.assertEquals(true, instance.only14(new int[] {4, 1}));
    Assert.assertEquals(true, instance.only14(new int[] {4, 4}));
    Assert.assertEquals(false, instance.only14(new int[] {2}));
    Assert.assertEquals(true, instance.only14(new int[] {}));
    Assert.assertEquals(false, instance.only14(new int[] {1, 4, 1, 3}));
    Assert.assertEquals(false, instance.only14(new int[] {3, 1, 3}));
    Assert.assertEquals(true, instance.only14(new int[] {1}));
    Assert.assertEquals(true, instance.only14(new int[] {4}));
    Assert.assertEquals(false, instance.only14(new int[] {3, 4}));
    Assert.assertEquals(false, instance.only14(new int[] {1, 3, 4}));
    Assert.assertEquals(true, instance.only14(new int[] {1, 1, 1}));
    Assert.assertEquals(true, instance.only14(new int[] {4, 4, 4}));
    Assert.assertEquals(false, instance.only14(new int[] {1, 1, 1, 5}));
    Assert.assertEquals(true, instance.only14(new int[] {4, 1, 4, 1}));
  }

  /**
   * Test method for {@link Array2#fizzArray2(int)}.
   */
  @Test
  public void testFizzArray2() {
    Assert.assertArrayEquals(new String[] {}, instance.fizzArray2(0));
    Assert.assertArrayEquals(new String[] {"0"}, instance.fizzArray2(1));
    Assert.assertArrayEquals(new String[] {"0", "1"}, instance.fizzArray2(2));
    Assert.assertArrayEquals(new String[] {"0", "1", "2", "3"}, instance.fizzArray2(4));
    Assert.assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6"},
        instance.fizzArray2(7));
    Assert.assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8"},
        instance.fizzArray2(9));
    Assert.assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"},
        instance.fizzArray2(10));
    Assert.assertArrayEquals(new String[] {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"},
        instance.fizzArray2(11));
  }

  /**
   * Test method for {@link Array2#no14(int[])}.
   */
  @Test
  public void testNo14() {
    Assert.assertEquals(true, instance.no14(new int[] {1, 2, 3}));
    Assert.assertEquals(false, instance.no14(new int[] {1, 2, 3, 4}));
    Assert.assertEquals(true, instance.no14(new int[] {2, 3, 4}));
    Assert.assertEquals(false, instance.no14(new int[] {1, 1, 4, 4}));
    Assert.assertEquals(true, instance.no14(new int[] {2, 2, 4, 4}));
    Assert.assertEquals(false, instance.no14(new int[] {2, 3, 4, 1}));
    Assert.assertEquals(true, instance.no14(new int[] {2, 1, 1}));
    Assert.assertEquals(false, instance.no14(new int[] {1, 4}));
    Assert.assertEquals(true, instance.no14(new int[] {2}));
    Assert.assertEquals(true, instance.no14(new int[] {2, 1}));
    Assert.assertEquals(true, instance.no14(new int[] {1}));
    Assert.assertEquals(true, instance.no14(new int[] {4}));
    Assert.assertEquals(true, instance.no14(new int[] {}));
    Assert.assertEquals(true, instance.no14(new int[] {1, 1, 1, 1}));
    Assert.assertEquals(false, instance.no14(new int[] {9, 4, 4, 1}));
    Assert.assertEquals(false, instance.no14(new int[] {4, 2, 3, 1}));
    Assert.assertEquals(true, instance.no14(new int[] {4, 2, 3, 5}));
    Assert.assertEquals(true, instance.no14(new int[] {4, 4, 2}));
    Assert.assertEquals(false, instance.no14(new int[] {1, 4, 4}));
  }

  /**
   * Test method for {@link Array2#isEverywhere(int[], int)}.
   */
  @Test
  public void testIsEverywhere() {
    Assert.assertEquals(true, instance.isEverywhere(new int[] {1, 2, 1, 3}, 1));
    Assert.assertEquals(false, instance.isEverywhere(new int[] {1, 2, 1, 3}, 2));
    Assert.assertEquals(false, instance.isEverywhere(new int[] {1, 2, 1, 3, 4}, 1));
    Assert.assertEquals(true, instance.isEverywhere(new int[] {2, 1, 2, 1}, 1));
    Assert.assertEquals(true, instance.isEverywhere(new int[] {2, 1, 2, 1}, 2));
    Assert.assertEquals(false, instance.isEverywhere(new int[] {2, 1, 2, 3, 1}, 2));
    Assert.assertEquals(true, instance.isEverywhere(new int[] {3, 1}, 3));
    Assert.assertEquals(false, instance.isEverywhere(new int[] {3, 1}, 2));
    Assert.assertEquals(true, instance.isEverywhere(new int[] {3}, 1));
    Assert.assertEquals(true, instance.isEverywhere(new int[] {}, 1));
    Assert.assertEquals(true, instance.isEverywhere(new int[] {1, 2, 1, 2, 3, 2, 5}, 2));
    Assert.assertEquals(false, instance.isEverywhere(new int[] {1, 2, 1, 1, 1, 2}, 2));
    Assert.assertEquals(false, instance.isEverywhere(new int[] {2, 1, 2, 1, 1, 2}, 2));
    Assert.assertEquals(false, instance.isEverywhere(new int[] {2, 1, 2, 2, 2, 1, 1, 2}, 2));
    Assert.assertEquals(true, instance.isEverywhere(new int[] {2, 1, 2, 2, 2, 1, 2, 1}, 2));
    Assert.assertEquals(true, instance.isEverywhere(new int[] {2, 1, 2, 1, 2}, 2));
  }

  /**
   * Test method for {@link Array2#either24(int[])}.
   */
  @Test
  public void testEither24() {
    Assert.assertEquals(true, instance.either24(new int[] {1, 2, 2}));
    Assert.assertEquals(true, instance.either24(new int[] {4, 4, 1}));
    Assert.assertEquals(false, instance.either24(new int[] {4, 4, 1, 2, 2}));
    Assert.assertEquals(false, instance.either24(new int[] {1, 2, 3, 4}));
    Assert.assertEquals(false, instance.either24(new int[] {3, 5, 9}));
    Assert.assertEquals(true, instance.either24(new int[] {1, 2, 3, 4, 4}));
    Assert.assertEquals(true, instance.either24(new int[] {2, 2, 3, 4}));
    Assert.assertEquals(true, instance.either24(new int[] {1, 2, 3, 2, 2, 4}));
    Assert.assertEquals(false, instance.either24(new int[] {1, 2, 3, 2, 2, 4, 4}));
    Assert.assertEquals(false, instance.either24(new int[] {1, 2}));
    Assert.assertEquals(true, instance.either24(new int[] {2, 2}));
    Assert.assertEquals(true, instance.either24(new int[] {4, 4}));
    Assert.assertEquals(false, instance.either24(new int[] {2}));
    Assert.assertEquals(false, instance.either24(new int[] {}));
  }

  /**
   * Test method for {@link Array2#matchUp(int[], int[])}.
   */
  @Test
  public void testMatchUp() {
    Assert.assertEquals(2, instance.matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 10}));
    Assert.assertEquals(3, instance.matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 5}));
    Assert.assertEquals(2, instance.matchUp(new int[] {1, 2, 3}, new int[] {2, 3, 3}));
    Assert.assertEquals(1, instance.matchUp(new int[] {5, 3}, new int[] {5, 5}));
    Assert.assertEquals(2, instance.matchUp(new int[] {5, 3}, new int[] {4, 4}));
    Assert.assertEquals(1, instance.matchUp(new int[] {5, 3}, new int[] {3, 3}));
    Assert.assertEquals(1, instance.matchUp(new int[] {5, 3}, new int[] {2, 2}));
    Assert.assertEquals(1, instance.matchUp(new int[] {5, 3}, new int[] {1, 1}));
    Assert.assertEquals(0, instance.matchUp(new int[] {5, 3}, new int[] {0, 0}));
    Assert.assertEquals(0, instance.matchUp(new int[] {4}, new int[] {4}));
    Assert.assertEquals(1, instance.matchUp(new int[] {4}, new int[] {5}));
  }

  /**
   * Test method for {@link Array2#has77(int[])}.
   */
  @Test
  public void testHas77() {
    Assert.assertEquals(true, instance.has77(new int[] {1, 7, 7}));
    Assert.assertEquals(true, instance.has77(new int[] {1, 7, 1, 7}));
    Assert.assertEquals(false, instance.has77(new int[] {1, 7, 1, 1, 7}));
    Assert.assertEquals(true, instance.has77(new int[] {7, 7, 1, 1, 7}));
    Assert.assertEquals(true, instance.has77(new int[] {7, 7, 2, 2, 7, 2}));
    Assert.assertEquals(false, instance.has77(new int[] {2, 7, 2, 2, 7, 2}));
    Assert.assertEquals(true, instance.has77(new int[] {2, 7, 2, 2, 7, 7}));
    Assert.assertEquals(true, instance.has77(new int[] {7, 2, 7, 2, 2, 7}));
    Assert.assertEquals(false, instance.has77(new int[] {7, 2, 6, 2, 2, 7}));
    Assert.assertEquals(true, instance.has77(new int[] {7, 7, 7}));
    Assert.assertEquals(true, instance.has77(new int[] {7, 1, 7}));
    Assert.assertEquals(true, instance.has77(new int[] {1, 7, 7}));
    Assert.assertEquals(true, instance.has77(new int[] {7, 7, 1}));
    Assert.assertEquals(true, instance.has77(new int[] {7, 7}));
    Assert.assertEquals(false, instance.has77(new int[] {7, 3}));
    Assert.assertEquals(false, instance.has77(new int[] {1, 2}));
    Assert.assertEquals(false, instance.has77(new int[] {1, 7}));
    Assert.assertEquals(false, instance.has77(new int[] {7}));
    Assert.assertEquals(false, instance.has77(new int[] {}));
  }

  /**
   * Test method for {@link Array2#has12(int[])}.
   */
  @Test
  public void testHas12() {
    Assert.assertEquals(true, instance.has12(new int[] {1, 3, 2}));
    Assert.assertEquals(true, instance.has12(new int[] {3, 1, 2}));
    Assert.assertEquals(true, instance.has12(new int[] {3, 1, 4, 5, 2}));
    Assert.assertEquals(false, instance.has12(new int[] {3, 1, 4, 5, 6}));
    Assert.assertEquals(true, instance.has12(new int[] {3, 1, 4, 1, 6, 2}));
    Assert.assertEquals(true, instance.has12(new int[] {2, 1, 4, 1, 6, 2}));
    Assert.assertEquals(false, instance.has12(new int[] {2, 1, 4, 1, 6}));
    Assert.assertEquals(false, instance.has12(new int[] {3, 5, 9}));
    Assert.assertEquals(false, instance.has12(new int[] {3, 5, 1}));
    Assert.assertEquals(false, instance.has12(new int[] {3, 2, 1}));
    Assert.assertEquals(true, instance.has12(new int[] {1, 2, 2}));
    Assert.assertEquals(true, instance.has12(new int[] {1, 2}));
    Assert.assertEquals(false, instance.has12(new int[] {1, 1}));
    Assert.assertEquals(false, instance.has12(new int[] {1}));
    Assert.assertEquals(false, instance.has12(new int[] {2}));
    Assert.assertEquals(false, instance.has12(new int[] {}));
  }

  /**
   * Test method for {@link Array2#modThree(int[])}.
   */
  @Test
  public void testModThree() {
    Assert.assertEquals(true, instance.modThree(new int[] {2, 1, 3, 5}));
    Assert.assertEquals(false, instance.modThree(new int[] {2, 1, 2, 5}));
    Assert.assertEquals(true, instance.modThree(new int[] {2, 4, 2, 5}));
    Assert.assertEquals(false, instance.modThree(new int[] {1, 2, 1, 2, 1}));
    Assert.assertEquals(true, instance.modThree(new int[] {9, 9, 9}));
    Assert.assertEquals(false, instance.modThree(new int[] {1, 2, 1}));
    Assert.assertEquals(true, instance.modThree(new int[] {2, 4, 6}));
    Assert.assertEquals(false, instance.modThree(new int[] {2, 4, 1}));
    Assert.assertEquals(false, instance.modThree(new int[] {2, 5, 4}));
    Assert.assertEquals(false, instance.modThree(new int[] {2, 5, 3}));
    Assert.assertEquals(false, instance.modThree(new int[] {1, 6, 6}));
    Assert.assertEquals(false, instance.modThree(new int[] {1, 6, 5}));
    Assert.assertEquals(false, instance.modThree(new int[] {1, 3, 8}));
    Assert.assertEquals(true, instance.modThree(new int[] {1, 3, 7}));
    Assert.assertEquals(true, instance.modThree(new int[] {3, 1, 5}));
    Assert.assertEquals(false, instance.modThree(new int[] {1, 2}));
    Assert.assertEquals(false, instance.modThree(new int[] {1}));
    Assert.assertEquals(false, instance.modThree(new int[] {}));
    Assert.assertEquals(false, instance.modThree(new int[] {9, 7, 2, 9}));
    Assert.assertEquals(false, instance.modThree(new int[] {9, 7, 2, 9, 2, 2}));
    Assert.assertEquals(true, instance.modThree(new int[] {9, 7, 2, 4, 2, 5, 7}));
    Assert.assertEquals(true, instance.modThree(new int[] {9, 7, 2, 9, 2, 2, 6}));
  }

  /**
   * Test method for {@link Array2#haveThree(int[])}.
   */
  @Test
  public void testHaveThree() {
    Assert.assertEquals(true, instance.haveThree(new int[] {3, 1, 3, 1, 3}));
    Assert.assertEquals(true, instance.haveThree(new int[] {1, 3, 1, 3, 1, 3}));
    Assert.assertEquals(false, instance.haveThree(new int[] {3, 1, 3, 3}));
    Assert.assertEquals(false, instance.haveThree(new int[] {3, 4, 3, 3, 4}));
    Assert.assertEquals(false, instance.haveThree(new int[] {1, 3, 1, 3, 1, 2}));
    Assert.assertEquals(true, instance.haveThree(new int[] {1, 3, 1, 3, 1, 3}));
    Assert.assertEquals(false, instance.haveThree(new int[] {1, 3, 3, 1, 3}));
    Assert.assertEquals(false, instance.haveThree(new int[] {1, 3, 1, 3, 1, 3, 4, 3}));
    Assert.assertEquals(true, instance.haveThree(new int[] {3, 4, 3, 4, 3, 4, 4}));
    Assert.assertEquals(false, instance.haveThree(new int[] {3, 3, 3}));
    Assert.assertEquals(false, instance.haveThree(new int[] {1, 1, 1}));
    Assert.assertEquals(false, instance.haveThree(new int[] {1, 3}));
    Assert.assertEquals(false, instance.haveThree(new int[] {3}));
    Assert.assertEquals(false, instance.haveThree(new int[] {1}));
    Assert.assertEquals(false, instance.haveThree(new int[] {}));
  }

  /**
   * Test method for {@link Array2#twoTwo(int[])}.
   */
  @Test
  public void testTwoTwo() {
    Assert.assertEquals(true, instance.twoTwo(new int[] {4, 2, 2, 3}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {2, 2, 4}));
    Assert.assertEquals(false, instance.twoTwo(new int[] {2, 2, 4, 2}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {1, 3, 4}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {1, 2, 2, 3, 4}));
    Assert.assertEquals(false, instance.twoTwo(new int[] {1, 2, 3, 4}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {2, 2}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {2, 2, 7}));
    Assert.assertEquals(false, instance.twoTwo(new int[] {2, 2, 7, 2, 1}));
    Assert.assertEquals(false, instance.twoTwo(new int[] {2, 2, 7, 2, 1, 1}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {4, 2, 2, 2}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {2, 2, 2}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {1, 2, 2, 2, 4}));
    Assert.assertEquals(false, instance.twoTwo(new int[] {1, 2}));
    Assert.assertEquals(false, instance.twoTwo(new int[] {1, 2, 1}));
    Assert.assertEquals(false, instance.twoTwo(new int[] {2}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {1}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {1, 3, 5}));
    Assert.assertEquals(true, instance.twoTwo(new int[] {5, 2, 2, 3}));
    Assert.assertEquals(false, instance.twoTwo(new int[] {2, 2, 5, 2}));
  }

  /**
   * Test method for {@link Array2#sameEnds(int[], int)}.
   */
  @Test
  public void testSameEnds() {
    Assert.assertEquals(false, instance.sameEnds(new int[] {5, 6, 45, 99, 13, 5, 6}, 1));
    Assert.assertEquals(true, instance.sameEnds(new int[] {5, 6, 45, 99, 13, 5, 6}, 2));
    Assert.assertEquals(false, instance.sameEnds(new int[] {5, 6, 45, 99, 13, 5, 6}, 3));
    Assert.assertEquals(true, instance.sameEnds(new int[] {1, 2, 5, 2, 1}, 1));
    Assert.assertEquals(false, instance.sameEnds(new int[] {1, 2, 5, 2, 1}, 2));
    Assert.assertEquals(true, instance.sameEnds(new int[] {1, 2, 5, 2, 1}, 0));
    Assert.assertEquals(true, instance.sameEnds(new int[] {1, 2, 5, 2, 1}, 5));
    Assert.assertEquals(true, instance.sameEnds(new int[] {1, 1, 1}, 0));
    Assert.assertEquals(true, instance.sameEnds(new int[] {1, 1, 1}, 1));
    Assert.assertEquals(true, instance.sameEnds(new int[] {1, 1, 1}, 2));
    Assert.assertEquals(true, instance.sameEnds(new int[] {1, 1, 1}, 3));
    Assert.assertEquals(true, instance.sameEnds(new int[] {1}, 1));
    Assert.assertEquals(true, instance.sameEnds(new int[] {}, 0));
    Assert.assertEquals(false, instance.sameEnds(new int[] {4, 2, 4, 5}, 1));
  }

  /**
   * Test method for {@link Array2#tripleUp(int[])}.
   */
  @Test
  public void testTripleUp() {
    Assert.assertEquals(true, instance.tripleUp(new int[] {1, 4, 5, 6, 2}));
    Assert.assertEquals(true, instance.tripleUp(new int[] {1, 2, 3}));
    Assert.assertEquals(false, instance.tripleUp(new int[] {1, 2, 4}));
    Assert.assertEquals(true, instance.tripleUp(new int[] {1, 2, 4, 5, 7, 6, 5, 6, 7, 6}));
    Assert.assertEquals(false, instance.tripleUp(new int[] {1, 2, 4, 5, 7, 6, 5, 7, 7, 6}));
    Assert.assertEquals(false, instance.tripleUp(new int[] {1, 2}));
    Assert.assertEquals(false, instance.tripleUp(new int[] {1}));
    Assert.assertEquals(false, instance.tripleUp(new int[] {}));
    Assert.assertEquals(true, instance.tripleUp(new int[] {10, 9, 8, -100, -99, -98, 100}));
    Assert.assertEquals(false, instance.tripleUp(new int[] {10, 9, 8, -100, -99, 99, 100}));
    Assert.assertEquals(true, instance.tripleUp(new int[] {-100, -99, -99, 100, 101, 102}));
    Assert.assertEquals(false, instance.tripleUp(new int[] {2, 3, 5, 6, 8, 9, 2, 3}));
  }

  /**
   * Test method for {@link Array2#fizzArray3(int, int)}.
   */
  @Test
  public void testFizzArray3() {
    Assert.assertArrayEquals(new int[] {5, 6, 7, 8, 9}, instance.fizzArray3(5, 10));
    Assert.assertArrayEquals(new int[] {11, 12, 13, 14, 15, 16, 17}, instance.fizzArray3(11, 18));
    Assert.assertArrayEquals(new int[] {1, 2}, instance.fizzArray3(1, 3));
    Assert.assertArrayEquals(new int[] {1}, instance.fizzArray3(1, 2));
    Assert.assertArrayEquals(new int[] {}, instance.fizzArray3(1, 1));
    Assert.assertArrayEquals(new int[] {1000, 1001, 1002, 1003, 1004},
        instance.fizzArray3(1000, 1005));
  }

  /**
   * Test method for {@link Array2#shiftLeft(int[])}.
   */
  @Test
  public void testShiftLeft() {
    Assert.assertArrayEquals(new int[] {2, 5, 3, 6}, instance.shiftLeft(new int[] {6, 2, 5, 3}));
    Assert.assertArrayEquals(new int[] {2, 1}, instance.shiftLeft(new int[] {1, 2}));
    Assert.assertArrayEquals(new int[] {1}, instance.shiftLeft(new int[] {1}));
    Assert.assertArrayEquals(new int[] {}, instance.shiftLeft(new int[] {}));
    Assert.assertArrayEquals(new int[] {1, 2, 2, 4, 1},
        instance.shiftLeft(new int[] {1, 1, 2, 2, 4}));
    Assert.assertArrayEquals(new int[] {1, 1, 1}, instance.shiftLeft(new int[] {1, 1, 1}));
    Assert.assertArrayEquals(new int[] {2, 3, 1}, instance.shiftLeft(new int[] {1, 2, 3}));
  }

  /**
   * Test method for {@link Array2#tenRun(int[])}.
   */
  @Test
  public void testTenRun() {
    Assert.assertArrayEquals(new int[] {2, 10, 10, 10, 20, 20},
        instance.tenRun(new int[] {2, 10, 3, 4, 20, 5}));
    Assert.assertArrayEquals(new int[] {10, 10, 20, 20}, instance.tenRun(new int[] {10, 1, 20, 2}));
    Assert.assertArrayEquals(new int[] {10, 10, 10, 20}, instance.tenRun(new int[] {10, 1, 9, 20}));
    Assert.assertArrayEquals(new int[] {1, 2, 50, 50}, instance.tenRun(new int[] {1, 2, 50, 1}));
    Assert.assertArrayEquals(new int[] {1, 20, 50, 50}, instance.tenRun(new int[] {1, 20, 50, 1}));
    Assert.assertArrayEquals(new int[] {10, 10}, instance.tenRun(new int[] {10, 10}));
    Assert.assertArrayEquals(new int[] {10, 10}, instance.tenRun(new int[] {10, 2}));
    Assert.assertArrayEquals(new int[] {0, 0}, instance.tenRun(new int[] {0, 2}));
    Assert.assertArrayEquals(new int[] {1, 2}, instance.tenRun(new int[] {1, 2}));
    Assert.assertArrayEquals(new int[] {1}, instance.tenRun(new int[] {1}));
    Assert.assertArrayEquals(new int[] {}, instance.tenRun(new int[] {}));
  }

  /**
   * Test method for {@link Array2#pre4(int[])}.
   */
  @Test
  public void testPre4() {
    Assert.assertArrayEquals(new int[] {1, 2}, instance.pre4(new int[] {1, 2, 4, 1}));
    Assert.assertArrayEquals(new int[] {3, 1}, instance.pre4(new int[] {3, 1, 4}));
    Assert.assertArrayEquals(new int[] {1}, instance.pre4(new int[] {1, 4, 4}));
    Assert.assertArrayEquals(new int[] {1}, instance.pre4(new int[] {1, 4, 4, 2}));
    Assert.assertArrayEquals(new int[] {1, 3}, instance.pre4(new int[] {1, 3, 4, 2, 4}));
    Assert.assertArrayEquals(new int[] {}, instance.pre4(new int[] {4, 4}));
    Assert.assertArrayEquals(new int[] {}, instance.pre4(new int[] {}));
    Assert.assertArrayEquals(new int[] {}, instance.pre4(new int[] {1, 2, 3}));
    Assert.assertArrayEquals(new int[] {3, 3}, instance.pre4(new int[] {3, 3, 4}));
    Assert.assertArrayEquals(new int[] {1, 2, 1}, instance.pre4(new int[] {1, 2, 1, 4}));
    Assert.assertArrayEquals(new int[] {2, 1}, instance.pre4(new int[] {2, 1, 4, 2}));
    Assert.assertArrayEquals(new int[] {2, 1, 2, 1}, instance.pre4(new int[] {2, 1, 2, 1, 4, 2}));
  }

  /**
   * Test method for {@link Array2#post4(int[])}.
   */
  @Test
  public void testPost4() {
    Assert.assertArrayEquals(new int[] {1, 2}, instance.post4(new int[] {2, 4, 1, 2}));
    Assert.assertArrayEquals(new int[] {1, 2, 3}, instance.post4(new int[] {4, 4, 1, 2, 3}));
    Assert.assertArrayEquals(new int[] {2}, instance.post4(new int[] {4, 2}));
    Assert.assertArrayEquals(new int[] {3}, instance.post4(new int[] {4, 4, 3}));
    Assert.assertArrayEquals(new int[] {}, instance.post4(new int[] {4, 4}));
    Assert.assertArrayEquals(new int[] {}, instance.post4(new int[] {4}));
    Assert.assertArrayEquals(new int[] {}, instance.post4(new int[] {}));
    Assert.assertArrayEquals(new int[] {}, instance.post4(new int[] {1, 2, 3}));
    Assert.assertArrayEquals(new int[] {3, 2}, instance.post4(new int[] {2, 4, 1, 4, 3, 2}));
    Assert.assertArrayEquals(new int[] {2, 2, 2}, instance.post4(new int[] {4, 1, 4, 2, 2, 2}));
    Assert.assertArrayEquals(new int[] {3, 2}, instance.post4(new int[] {3, 4, 3, 2}));
  }

  /**
   * Test method for {@link Array2#notAlone(int[], int)}.
   */
  @Test
  public void testNotAlone() {
    Assert.assertArrayEquals(new int[] {1, 3, 3}, instance.notAlone(new int[] {1, 2, 3}, 2));
    Assert.assertArrayEquals(new int[] {1, 3, 3, 5, 5, 2},
        instance.notAlone(new int[] {1, 2, 3, 2, 5, 2}, 2));
    Assert.assertArrayEquals(new int[] {3, 4}, instance.notAlone(new int[] {3, 4}, 3));
    Assert.assertArrayEquals(new int[] {3, 3}, instance.notAlone(new int[] {3, 3}, 3));
    Assert.assertArrayEquals(new int[] {1, 3, 3, 2}, instance.notAlone(new int[] {1, 3, 1, 2}, 1));
    Assert.assertArrayEquals(new int[] {3}, instance.notAlone(new int[] {3}, 3));
    Assert.assertArrayEquals(new int[] {}, instance.notAlone(new int[] {}, 3));
    Assert.assertArrayEquals(new int[] {7, 7, 6}, instance.notAlone(new int[] {7, 1, 6}, 1));
    Assert.assertArrayEquals(new int[] {1, 1, 1}, instance.notAlone(new int[] {1, 1, 1}, 1));
    Assert.assertArrayEquals(new int[] {1, 1, 2}, instance.notAlone(new int[] {1, 1, 2}, 1));
    Assert.assertArrayEquals(new int[] {2, 1, 1}, instance.notAlone(new int[] {2, 1, 1}, 1));
    Assert.assertArrayEquals(new int[] {1, 1, 1, 2}, instance.notAlone(new int[] {1, 1, 1, 2}, 1));
  }

  /**
   * Test method for {@link Array2#zeroFront(int[])}.
   */
  @Test
  public void testZeroFront() {
    Assert.assertArrayEquals(new int[] {0, 0, 1, 1}, instance.zeroFront(new int[] {1, 0, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 0, 1, 1, 1},
        instance.zeroFront(new int[] {0, 1, 1, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 1, 1, 1},
        instance.zeroFront(new int[] {0, 1, 1, 0, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 1}, instance.zeroFront(new int[] {1, 0}));
    Assert.assertArrayEquals(new int[] {0, 1}, instance.zeroFront(new int[] {0, 1}));
    Assert.assertArrayEquals(new int[] {0, 1, 1, 1}, instance.zeroFront(new int[] {1, 1, 1, 0}));
    Assert.assertArrayEquals(new int[] {2, 2, 2, 2}, instance.zeroFront(new int[] {2, 2, 2, 2}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 1}, instance.zeroFront(new int[] {0, 0, 1, 0}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, -1, -1},
        instance.zeroFront(new int[] {-1, 0, 0, -1, 0}));
    Assert
    .assertArrayEquals(new int[] {0, 0, -3, -3}, instance.zeroFront(new int[] {0, -3, 0, -3}));
    Assert.assertArrayEquals(new int[] {}, instance.zeroFront(new int[] {}));
    Assert.assertArrayEquals(new int[] {0, 0, 9, 9, 9, 9},
        instance.zeroFront(new int[] {9, 9, 0, 9, 0, 9}));
  }

  /**
   * Test method for {@link Array2#zeroFront2(int[])}.
   */
  @Test
  public void testZeroFront2() {
    Assert.assertArrayEquals(new int[] {0, 0, 1, 1}, instance.zeroFront2(new int[] {1, 0, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 0, 1, 1, 1},
        instance.zeroFront2(new int[] {0, 1, 1, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 1, 1, 1},
        instance.zeroFront2(new int[] {0, 1, 1, 0, 0, 1}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 1, 2, 3},
        instance.zeroFront2(new int[] {0, 1, 2, 0, 0, 3}));
    Assert.assertArrayEquals(new int[] {0, 1}, instance.zeroFront2(new int[] {1, 0}));
    Assert.assertArrayEquals(new int[] {0, 1}, instance.zeroFront2(new int[] {0, 1}));
    Assert.assertArrayEquals(new int[] {0, 1, 1, 1}, instance.zeroFront2(new int[] {1, 1, 1, 0}));
    Assert.assertArrayEquals(new int[] {0, 3, 2, 1}, instance.zeroFront2(new int[] {3, 2, 1, 0}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 0, 0, 0, 1, 2, 3, 4, 5},
        instance.zeroFront2(new int[] {0, 1, 0, 2, 0, 3, 0, 4, 0, 5, 0}));
    Assert.assertArrayEquals(new int[] {2, 2, 2, 2}, instance.zeroFront2(new int[] {2, 2, 2, 2}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, 1}, instance.zeroFront2(new int[] {0, 0, 1, 0}));
    Assert.assertArrayEquals(new int[] {0, 0, 0, -1, -1},
        instance.zeroFront2(new int[] {-1, 0, 0, -1, 0}));
    Assert.assertArrayEquals(new int[] {0, 0, -3, -3},
        instance.zeroFront2(new int[] {0, -3, 0, -3}));
    Assert.assertArrayEquals(new int[] {}, instance.zeroFront2(new int[] {}));
    Assert.assertArrayEquals(new int[] {0, 0, 9, 9, 9, 9},
        instance.zeroFront2(new int[] {9, 9, 0, 9, 0, 9}));
  }

  /**
   * Test method for {@link Array2#withoutTen(int[])}.
   */
  @Test
  public void testWithoutTen() {
    Assert.assertArrayEquals(new int[] {1, 2, 0, 0}, instance.withoutTen(new int[] {1, 10, 10, 2}));
    Assert.assertArrayEquals(new int[] {2, 0, 0}, instance.withoutTen(new int[] {10, 2, 10}));
    Assert.assertArrayEquals(new int[] {1, 99, 0}, instance.withoutTen(new int[] {1, 99, 10}));
    Assert.assertArrayEquals(new int[] {13, 14, 0, 0},
        instance.withoutTen(new int[] {10, 13, 10, 14}));
    Assert.assertArrayEquals(new int[] {13, 14, 0, 0, 0},
        instance.withoutTen(new int[] {10, 13, 10, 14, 10}));
    Assert.assertArrayEquals(new int[] {3, 0, 0}, instance.withoutTen(new int[] {10, 10, 3}));
    Assert.assertArrayEquals(new int[] {1}, instance.withoutTen(new int[] {1}));
    Assert.assertArrayEquals(new int[] {13, 1}, instance.withoutTen(new int[] {13, 1}));
    Assert.assertArrayEquals(new int[] {0}, instance.withoutTen(new int[] {10}));
    Assert.assertArrayEquals(new int[] {}, instance.withoutTen(new int[] {}));
  }
}
