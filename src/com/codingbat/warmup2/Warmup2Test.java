package com.codingbat.warmup2;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

/**
 * The Class Warmup2Test is contains tests for Warmup-2 section.
 */
public class Warmup2Test {

  /** The instance variable to test the not static methods. */
  private Warmup2 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @Before
  public void setUp() throws Exception {
    instance = new Warmup2();
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
   * Test method for {@link Warmup2#stringTimes(String, int)}.
   */
  @Test
  public final void testStringTimes() {
    Assert.assertEquals("", instance.stringTimes("Hi", 0));
    Assert.assertEquals("Hi", instance.stringTimes("Hi", 1));
    Assert.assertEquals("HiHi", instance.stringTimes("Hi", 2));
    Assert.assertEquals("HiHiHi", instance.stringTimes("Hi", 3));
    Assert.assertEquals("HiHiHiHi", instance.stringTimes("Hi", 4));
    Assert.assertEquals("HiHiHiHiHi", instance.stringTimes("Hi", 5));
    Assert.assertEquals("Oh Boy!Oh Boy!", instance.stringTimes("Oh Boy!", 2));
    Assert.assertEquals("xxxx", instance.stringTimes("x", 4));
    Assert.assertEquals("", instance.stringTimes("", 4));
    Assert.assertEquals("codecode", instance.stringTimes("code", 2));
    Assert.assertEquals("codecodecode", instance.stringTimes("code", 3));
  }

}
