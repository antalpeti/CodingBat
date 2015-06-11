package com.codingbat.warmup1;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class Warmup1Test is contains tests for Warmup-1 section.
 */
public class Warmup1Test {

  /** The instance variable to test the not static methods. */
  private Warmup1 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @Before
  public void setUp() throws Exception {
    instance = new Warmup1();
  }

  /**
   * Tear down after the tests finish.
   *
   * @throws Exception the exception if something go wrong
   */
  @After
  public void tearDown() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link Warmup1#sleepIn(boolean, boolean)}.
   */
  @Test
  public void testSleepIn() {
    Assert.assertEquals(true, instance.sleepIn(false, false));
    Assert.assertEquals(false, instance.sleepIn(true, false));
    Assert.assertEquals(true, instance.sleepIn(false, true));
    Assert.assertEquals(true, instance.sleepIn(true, true));
  }

  /**
   * Test method for {@link Warmup1#monkeyTrouble(boolean, boolean)}.
   */
  @Test
  public void testMonkeyTrouble() {
    Assert.assertEquals(true, instance.monkeyTrouble(true, true));
    Assert.assertEquals(true, instance.monkeyTrouble(false, false));
    Assert.assertEquals(false, instance.monkeyTrouble(true, false));
    Assert.assertEquals(false, instance.monkeyTrouble(false, true));
  }

  /**
   * Test method for {@link Warmup1#sumDouble(int, int)}.
   */
  @Test
  public void testSumDouble() {
    Assert.assertEquals(3, instance.sumDouble(1, 2));
    Assert.assertEquals(5, instance.sumDouble(3, 2));
    Assert.assertEquals(8, instance.sumDouble(2, 2));
    Assert.assertEquals(-1, instance.sumDouble(-1, 0));
    Assert.assertEquals(12, instance.sumDouble(3, 3));
    Assert.assertEquals(0, instance.sumDouble(0, 0));
    Assert.assertEquals(1, instance.sumDouble(0, 1));
    Assert.assertEquals(7, instance.sumDouble(3, 4));
    Assert.assertEquals(-12, instance.sumDouble(-3, -3));
  }

  /**
   * Test method for {@link Warmup1#diff21(int)}.
   */
  @Test
  public void testDiff21() {
    Assert.assertEquals(2, instance.diff21(19));
    Assert.assertEquals(11, instance.diff21(10));
    Assert.assertEquals(0, instance.diff21(21));
    Assert.assertEquals(2, instance.diff21(22));
    Assert.assertEquals(8, instance.diff21(25));
    Assert.assertEquals(18, instance.diff21(30));
    Assert.assertEquals(58, instance.diff21(50));
    Assert.assertEquals(100, instance.diff21(71));
    Assert.assertEquals(21, instance.diff21(0));
    Assert.assertEquals(20, instance.diff21(1));
    Assert.assertEquals(19, instance.diff21(2));
    Assert.assertEquals(22, instance.diff21(-1));
    Assert.assertEquals(23, instance.diff21(-2));
  }

  /**
   * Test method for {@link Warmup1#parrotTrouble(boolean, int)}.
   */
  @Test
  public void testParrotTrouble() {
    Assert.assertEquals(true, instance.parrotTrouble(true, 6));
    Assert.assertEquals(false, instance.parrotTrouble(false, 6));
    Assert.assertEquals(false, instance.parrotTrouble(true, 7));
    Assert.assertEquals(false, instance.parrotTrouble(false, 7));
    Assert.assertEquals(true, instance.parrotTrouble(true, 21));
    Assert.assertEquals(false, instance.parrotTrouble(false, 21));
    Assert.assertEquals(false, instance.parrotTrouble(false, 20));
    Assert.assertEquals(false, instance.parrotTrouble(true, 20));
    Assert.assertEquals(true, instance.parrotTrouble(true, 23));
    Assert.assertEquals(false, instance.parrotTrouble(false, 23));
    Assert.assertEquals(false, instance.parrotTrouble(true, 12));
    Assert.assertEquals(false, instance.parrotTrouble(false, 12));
    Assert.assertEquals(false, instance.parrotTrouble(false, 25));
    Assert.assertEquals(false, instance.parrotTrouble(true, 25));
    Assert.assertEquals(false, instance.parrotTrouble(false, -1));
    Assert.assertEquals(false, instance.parrotTrouble(true, -1));
  }

  /**
   * Test method for {@link Warmup1#makes10(int, int)}.
   */
  @Test
  public void testMakes10() {
    Assert.assertEquals(true, instance.makes10(9, 10));
    Assert.assertEquals(false, instance.makes10(9, 9));
    Assert.assertEquals(true, instance.makes10(1, 9));
    Assert.assertEquals(true, instance.makes10(9, 1));
    Assert.assertEquals(true, instance.makes10(10, 1));
    Assert.assertEquals(true, instance.makes10(1, 10));
    Assert.assertEquals(true, instance.makes10(10, 10));
    Assert.assertEquals(true, instance.makes10(8, 2));
    Assert.assertEquals(false, instance.makes10(8, 3));
    Assert.assertEquals(false, instance.makes10(5, 4));
    Assert.assertEquals(true, instance.makes10(-10, 20));
    Assert.assertEquals(false, instance.makes10(8, 3));
    Assert.assertEquals(true, instance.makes10(10, 42));
    Assert.assertEquals(true, instance.makes10(-2, 10));
  }
}
