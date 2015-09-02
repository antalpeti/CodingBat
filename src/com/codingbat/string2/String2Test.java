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

  /**
   * Test method for {@link String2#catDog(String)}.
   */
  @Test
  public void testCatDog() {
    Assert.assertEquals(true, instance.catDog("catdog"));
    Assert.assertEquals(false, instance.catDog("catcat"));
    Assert.assertEquals(true, instance.catDog("1cat1cadodog"));
    Assert.assertEquals(false, instance.catDog("catxxdogxxxdog"));
    Assert.assertEquals(true, instance.catDog("catxdogxdogxcat"));
    Assert.assertEquals(false, instance.catDog("catxdogxdogxca"));
    Assert.assertEquals(false, instance.catDog("dogdogcat"));
    Assert.assertEquals(true, instance.catDog("dogogcat"));
    Assert.assertEquals(false, instance.catDog("dog"));
    Assert.assertEquals(false, instance.catDog("cat"));
    Assert.assertEquals(true, instance.catDog("ca"));
    Assert.assertEquals(true, instance.catDog("c"));
    Assert.assertEquals(true, instance.catDog(""));
  }

  /**
   * Test method for {@link String2#countCode(String)}.
   */
  @Test
  public void testCountCode() {
    Assert.assertEquals(1, instance.countCode("aaacodebbb"));
    Assert.assertEquals(2, instance.countCode("codexxcode"));
    Assert.assertEquals(2, instance.countCode("cozexxcope"));
    Assert.assertEquals(1, instance.countCode("cozfxxcope"));
    Assert.assertEquals(1, instance.countCode("xxcozeyycop"));
    Assert.assertEquals(0, instance.countCode("cozcop"));
    Assert.assertEquals(0, instance.countCode("abcxyz"));
    Assert.assertEquals(1, instance.countCode("code"));
    Assert.assertEquals(0, instance.countCode("ode"));
    Assert.assertEquals(0, instance.countCode("c"));
    Assert.assertEquals(0, instance.countCode(""));
    Assert.assertEquals(3, instance.countCode("AAcodeBBcoleCCccoreDD"));
    Assert.assertEquals(2, instance.countCode("AAcodeBBcoleCCccorfDD"));
    Assert.assertEquals(3, instance.countCode("coAcodeBcoleccoreDD"));
  }
}
