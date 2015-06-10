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
}
