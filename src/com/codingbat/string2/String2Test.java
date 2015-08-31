package com.codingbat.string2;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class String2Test is contains tests for String-2 section.
 */
public class String2Test {

  /** The instance variable to test the not static methods. */
  private static String2 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new String2();
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
   * Test method for {@link String2#doubleChar(String)}.
   */
  @Test
  public void testDoubleChar() {
    Assert.assertEquals("TThhee", instance.doubleChar("The"));
    Assert.assertEquals("AAAAbbbb", instance.doubleChar("AAbb"));
    Assert.assertEquals("HHii--TThheerree", instance.doubleChar("Hi-There"));
    Assert.assertEquals("WWoorrdd!!", instance.doubleChar("Word!"));
    Assert.assertEquals("!!!!", instance.doubleChar("!!"));
    Assert.assertEquals("", instance.doubleChar(""));
    Assert.assertEquals("aa", instance.doubleChar("a"));
    Assert.assertEquals("..", instance.doubleChar("."));
    Assert.assertEquals("aaaa", instance.doubleChar("aa"));
  }

  /**
   * Test method for {@link String2#countHi(String)}.
   */
  @Test
  public void testCountHi() {
    Assert.assertEquals(1, instance.countHi("abc hi ho"));
    Assert.assertEquals(2, instance.countHi("ABChi hi"));
    Assert.assertEquals(2, instance.countHi("hihi"));
    Assert.assertEquals(2, instance.countHi("hiHIhi"));
    Assert.assertEquals(0, instance.countHi(""));
    Assert.assertEquals(0, instance.countHi("h"));
    Assert.assertEquals(1, instance.countHi("hi"));
    Assert.assertEquals(0, instance.countHi("Hi is no HI on ahI"));
    Assert.assertEquals(2, instance.countHi("hiho not HOHIhi"));
  }
}
