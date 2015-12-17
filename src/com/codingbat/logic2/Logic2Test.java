package com.codingbat.logic2;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Logic2Test is contains tests for Logic-2 section.
 */
public class Logic2Test {

  /** The instance variable to test the not static methods. */
  private static Logic2 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new Logic2();
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
   * Test method for {@link Logic2#makeBricks(int, int, int)}.
   */
  @Test
  public void testMakeBricks() {
    Assert.assertEquals(true, instance.makeBricks(0, 2, 10));
    Assert.assertEquals(true, instance.makeBricks(0, 3, 10));
    Assert.assertEquals(false, instance.makeBricks(0, 3, 11));
    Assert.assertEquals(true, instance.makeBricks(2, 1, 7));
    Assert.assertEquals(false, instance.makeBricks(2, 1, 8));
    Assert.assertEquals(true, instance.makeBricks(3, 1, 7));
    Assert.assertEquals(true, instance.makeBricks(3, 1, 8));
    Assert.assertEquals(false, instance.makeBricks(3, 1, 9));
    Assert.assertEquals(true, instance.makeBricks(3, 2, 8));
    Assert.assertEquals(true, instance.makeBricks(3, 2, 10));
    Assert.assertEquals(true, instance.makeBricks(3, 8, 22));
    Assert.assertEquals(false, instance.makeBricks(3, 2, 20));
    Assert.assertEquals(false, instance.makeBricks(3, 2, 22));
    Assert.assertEquals(false, instance.makeBricks(3, 2, 9));
    Assert.assertEquals(true, instance.makeBricks(6, 1, 11));
    Assert.assertEquals(false, instance.makeBricks(6, 0, 11));
    Assert.assertEquals(true, instance.makeBricks(1, 4, 11));
    Assert.assertEquals(false, instance.makeBricks(1, 4, 12));
    Assert.assertEquals(true, instance.makeBricks(1, 1, 5));
    Assert.assertEquals(true, instance.makeBricks(1, 1, 6));
    Assert.assertEquals(false, instance.makeBricks(1, 1, 7));
    Assert.assertEquals(true, instance.makeBricks(7, 1, 8));
    Assert.assertEquals(true, instance.makeBricks(7, 1, 11));
    Assert.assertEquals(false, instance.makeBricks(7, 1, 13));
    Assert.assertEquals(true, instance.makeBricks(20, 0, 19));
    Assert.assertEquals(false, instance.makeBricks(20, 0, 21));
    Assert.assertEquals(true, instance.makeBricks(20, 4, 39));
    Assert.assertEquals(false, instance.makeBricks(20, 4, 51));
    Assert.assertEquals(false, instance.makeBricks(22, 2, 33));
    Assert.assertEquals(true, instance.makeBricks(40, 2, 47));
    Assert.assertEquals(true, instance.makeBricks(40, 2, 50));
    Assert.assertEquals(false, instance.makeBricks(40, 2, 52));
    Assert.assertEquals(false, instance.makeBricks(40, 1, 46));
    Assert.assertEquals(true, instance.makeBricks(43, 1, 46));
    Assert.assertEquals(true, instance.makeBricks(1000000, 1000, 1000100));
    Assert.assertEquals(false, instance.makeBricks(2, 1000000, 1000003));
  }

  /**
   * Test method for {@link Logic2#loneSum(int, int, int)}.
   */
  @Test
  public void testLoneSum() {
    Assert.assertEquals(6, instance.loneSum(1, 2, 3));
    Assert.assertEquals(3, instance.loneSum(1, 3, 1));
    Assert.assertEquals(9, instance.loneSum(2, 2, 9));
    Assert.assertEquals(9, instance.loneSum(2, 9, 2));
    Assert.assertEquals(9, instance.loneSum(9, 2, 2));
    Assert.assertEquals(14, instance.loneSum(2, 9, 3));
    Assert.assertEquals(2, instance.loneSum(3, 2, 3));
    Assert.assertEquals(0, instance.loneSum(3, 3, 3));
    Assert.assertEquals(9, instance.loneSum(4, 2, 3));
  }

  /**
   * Test method for {@link Logic2#luckySum(int, int, int)}.
   */
  @Test
  public void testLuckySum() {
    Assert.assertEquals(6, instance.luckySum(1, 2, 3));
    Assert.assertEquals(3, instance.luckySum(1, 2, 13));
    Assert.assertEquals(1, instance.luckySum(1, 13, 3));
    Assert.assertEquals(1, instance.luckySum(1, 13, 13));
    Assert.assertEquals(13, instance.luckySum(6, 5, 2));
    Assert.assertEquals(0, instance.luckySum(13, 2, 3));
    Assert.assertEquals(0, instance.luckySum(13, 2, 13));
    Assert.assertEquals(0, instance.luckySum(13, 13, 2));
    Assert.assertEquals(0, instance.luckySum(13, 13, 13));
    Assert.assertEquals(13, instance.luckySum(9, 4, 13));
    Assert.assertEquals(8, instance.luckySum(8, 13, 2));
    Assert.assertEquals(10, instance.luckySum(7, 2, 1));
    Assert.assertEquals(6, instance.luckySum(3, 3, 13));
  }
}
