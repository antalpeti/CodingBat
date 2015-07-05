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

  @Test
  public final void testFrontTimes() {
    Assert.assertEquals("ChoCho", instance.frontTimes("Chocolate", 2));
    Assert.assertEquals("ChoChoCho", instance.frontTimes("Chocolate", 3));
    Assert.assertEquals("", instance.frontTimes("Abc", 0));
    Assert.assertEquals("Abc", instance.frontTimes("Abc", 1));
    Assert.assertEquals("AbcAbc", instance.frontTimes("Abc", 2));
    Assert.assertEquals("AbcAbcAbc", instance.frontTimes("Abc", 3));
    Assert.assertEquals("AbAbAbAb", instance.frontTimes("Ab", 4));
    Assert.assertEquals("AAAA", instance.frontTimes("A", 4));
    Assert.assertEquals("", instance.frontTimes("", 4));
    Assert.assertEquals("", instance.frontTimes("Abc", 0));
  }
}
