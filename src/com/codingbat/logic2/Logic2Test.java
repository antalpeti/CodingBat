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

  /**
   * Test method for {@link Logic2#noTeenSum(int, int, int)}.
   */
  @Test
  public void testNoTeenSum() {
    Assert.assertEquals(6, instance.noTeenSum(1, 2, 3));
    Assert.assertEquals(3, instance.noTeenSum(2, 13, 1));
    Assert.assertEquals(3, instance.noTeenSum(2, 1, 14));
    Assert.assertEquals(18, instance.noTeenSum(2, 1, 15));
    Assert.assertEquals(19, instance.noTeenSum(2, 1, 16));
    Assert.assertEquals(3, instance.noTeenSum(2, 1, 17));
    Assert.assertEquals(3, instance.noTeenSum(17, 1, 2));
    Assert.assertEquals(19, instance.noTeenSum(2, 15, 2));
    Assert.assertEquals(16, instance.noTeenSum(16, 17, 18));
    Assert.assertEquals(0, instance.noTeenSum(17, 18, 19));
    Assert.assertEquals(32, instance.noTeenSum(15, 16, 1));
    Assert.assertEquals(30, instance.noTeenSum(15, 15, 19));
    Assert.assertEquals(31, instance.noTeenSum(15, 19, 16));
    Assert.assertEquals(5, instance.noTeenSum(5, 17, 18));
    Assert.assertEquals(16, instance.noTeenSum(17, 18, 16));
    Assert.assertEquals(0, instance.noTeenSum(17, 19, 18));
  }

  /**
   * Test method for {@link Logic2#fixTeen(int)}.
   */
  @Test
  public void testFixTeen() {
    Assert.assertEquals(10, instance.fixTeen(10));
    Assert.assertEquals(11, instance.fixTeen(11));
    Assert.assertEquals(12, instance.fixTeen(12));
    Assert.assertEquals(0, instance.fixTeen(13));
    Assert.assertEquals(0, instance.fixTeen(14));
    Assert.assertEquals(15, instance.fixTeen(15));
    Assert.assertEquals(16, instance.fixTeen(16));
    Assert.assertEquals(0, instance.fixTeen(17));
    Assert.assertEquals(0, instance.fixTeen(18));
    Assert.assertEquals(0, instance.fixTeen(19));
    Assert.assertEquals(20, instance.fixTeen(20));
  }

  /**
   * Test method for {@link Logic2#roundSum(int, int, int)}.
   */
  @Test
  public void testRoundSum() {
    Assert.assertEquals(0, instance.roundSum(0, 0, 1));
    Assert.assertEquals(10, instance.roundSum(0, 9, 0));
    Assert.assertEquals(10, instance.roundSum(4, 4, 6));
    Assert.assertEquals(20, instance.roundSum(4, 6, 5));
    Assert.assertEquals(10, instance.roundSum(6, 4, 4));
    Assert.assertEquals(10, instance.roundSum(9, 4, 4));
    Assert.assertEquals(40, instance.roundSum(10, 10, 19));
    Assert.assertEquals(70, instance.roundSum(11, 24, 36));
    Assert.assertEquals(40, instance.roundSum(12, 10, 24));
    Assert.assertEquals(30, instance.roundSum(12, 13, 14));
    Assert.assertEquals(50, instance.roundSum(14, 12, 26));
    Assert.assertEquals(60, instance.roundSum(16, 17, 18));
    Assert.assertEquals(90, instance.roundSum(20, 30, 40));
    Assert.assertEquals(60, instance.roundSum(23, 11, 26));
    Assert.assertEquals(70, instance.roundSum(23, 24, 25));
    Assert.assertEquals(70, instance.roundSum(23, 24, 29));
    Assert.assertEquals(90, instance.roundSum(24, 36, 32));
    Assert.assertEquals(80, instance.roundSum(25, 24, 25));
    Assert.assertEquals(100, instance.roundSum(45, 21, 30));
  }

  /**
   * Test method for {@link Logic2#roundTo10(int)}.
   */
  @Test
  public void testRound10() {
    Assert.assertEquals(0, instance.roundTo10(1));
    Assert.assertEquals(0, instance.roundTo10(2));
    Assert.assertEquals(0, instance.roundTo10(3));
    Assert.assertEquals(0, instance.roundTo10(4));
    Assert.assertEquals(10, instance.roundTo10(5));
    Assert.assertEquals(10, instance.roundTo10(6));
    Assert.assertEquals(10, instance.roundTo10(7));
    Assert.assertEquals(10, instance.roundTo10(8));
    Assert.assertEquals(10, instance.roundTo10(9));
    Assert.assertEquals(10, instance.roundTo10(10));
    Assert.assertEquals(10, instance.roundTo10(11));
    Assert.assertEquals(10, instance.roundTo10(12));
    Assert.assertEquals(10, instance.roundTo10(13));
    Assert.assertEquals(10, instance.roundTo10(14));
    Assert.assertEquals(20, instance.roundTo10(15));
    Assert.assertEquals(20, instance.roundTo10(16));
    Assert.assertEquals(20, instance.roundTo10(17));
    Assert.assertEquals(20, instance.roundTo10(18));
    Assert.assertEquals(20, instance.roundTo10(19));
    Assert.assertEquals(20, instance.roundTo10(20));
  }

  /**
   * Test method for {@link Logic2#closeFar(int, int, int)}.
   */
  @Test
  public void testCloseFar() {
    Assert.assertEquals(true, instance.closeFar(-1, 10, 0));
    Assert.assertEquals(true, instance.closeFar(0, -1, 10));
    Assert.assertEquals(true, instance.closeFar(1, 2, 10));
    Assert.assertEquals(true, instance.closeFar(1, 10, 2));
    Assert.assertEquals(false, instance.closeFar(1, 2, 3));
    Assert.assertEquals(false, instance.closeFar(1, 3, 2));
    Assert.assertEquals(true, instance.closeFar(4, 1, 3));
    Assert.assertEquals(false, instance.closeFar(4, 5, 3));
    Assert.assertEquals(false, instance.closeFar(4, 3, 5));
    Assert.assertEquals(false, instance.closeFar(8, 9, 10));
    Assert.assertEquals(false, instance.closeFar(8, 9, 7));
    Assert.assertEquals(true, instance.closeFar(8, 6, 9));
    Assert.assertEquals(true, instance.closeFar(8, 9, 6));
    Assert.assertEquals(true, instance.closeFar(10, 10, 8));
    Assert.assertEquals(false, instance.closeFar(10, 8, 9));
    Assert.assertEquals(true, instance.closeFar(5, 5, 7));
    Assert.assertEquals(false, instance.closeFar(6, 5, 7));
    Assert.assertEquals(true, instance.closeFar(8, 5, 7));
    Assert.assertEquals(false, instance.closeFar(11, 5, 7));
    Assert.assertEquals(false, instance.closeFar(5, 5, 5));
  }

  /**
   * Test method for {@link Logic2#blackjack(int, int)}.
   */
  @Test
  public void testBlackjack() {
    Assert.assertEquals(0, instance.blackjack(22, 22));
    Assert.assertEquals(0, instance.blackjack(22, 50));
    Assert.assertEquals(0, instance.blackjack(34, 33));
    Assert.assertEquals(1, instance.blackjack(33, 1));
    Assert.assertEquals(2, instance.blackjack(1, 2));
    Assert.assertEquals(3, instance.blackjack(3, 2));
    Assert.assertEquals(4, instance.blackjack(3, 4));
    Assert.assertEquals(18, instance.blackjack(18, 17));
    Assert.assertEquals(16, instance.blackjack(16, 23));
    Assert.assertEquals(19, instance.blackjack(17, 19));
    Assert.assertEquals(19, instance.blackjack(19, 22));
    Assert.assertEquals(19, instance.blackjack(22, 19));
    Assert.assertEquals(21, instance.blackjack(19, 21));
    Assert.assertEquals(21, instance.blackjack(21, 19));
    Assert.assertEquals(21, instance.blackjack(21, 20));
  }
}
