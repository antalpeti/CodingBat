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

  /**
   * Test method for {@link String2#endOther(String, String)}.
   */
  @Test
  public void testEndOther() {
    Assert.assertEquals(true, instance.endOther("", ""));
    Assert.assertEquals(true, instance.endOther("a", "ba"));
    Assert.assertEquals(true, instance.endOther("ab", "b"));
    Assert.assertEquals(true, instance.endOther("c", "bc"));
    Assert.assertEquals(false, instance.endOther("12", "23"));
    Assert.assertEquals(false, instance.endOther("xyz", "jkl"));
    Assert.assertEquals(true, instance.endOther("h", ""));
    Assert.assertEquals(true, instance.endOther("", "t"));
  }

  /**
   * Test method for {@link String2#xyzThere(String)}.
   */
  @Test
  public void testXyzThere() {
    Assert.assertEquals(true, instance.xyzThere("abcxyz"));
    Assert.assertEquals(false, instance.xyzThere("abc.xyz"));
    Assert.assertEquals(true, instance.xyzThere("xyz.abc"));
    Assert.assertEquals(false, instance.xyzThere("abcxy"));
    Assert.assertEquals(true, instance.xyzThere("xyz"));
    Assert.assertEquals(false, instance.xyzThere("xy"));
    Assert.assertEquals(false, instance.xyzThere("x"));
    Assert.assertEquals(false, instance.xyzThere(""));
    Assert.assertEquals(true, instance.xyzThere("abc.xyzxyz"));
    Assert.assertEquals(true, instance.xyzThere("abc.xxyz"));
    Assert.assertEquals(false, instance.xyzThere(".xyz"));
    Assert.assertEquals(false, instance.xyzThere("12.xyz"));
    Assert.assertEquals(true, instance.xyzThere("12xyz"));
    Assert.assertEquals(false, instance.xyzThere("1.xyz.xyz2.xyz"));
  }

  /**
   * Test method for {@link String2#bobThere(String)}.
   */
  @Test
  public void testBobThere() {
    Assert.assertEquals(true, instance.bobThere("abcbob"));
    Assert.assertEquals(true, instance.bobThere("b9b"));
    Assert.assertEquals(false, instance.bobThere("bac"));
    Assert.assertEquals(true, instance.bobThere("bbb"));
    Assert.assertEquals(false, instance.bobThere("abcdefb"));
    Assert.assertEquals(true, instance.bobThere("123abcbcdbabxyz"));
    Assert.assertEquals(false, instance.bobThere("b12"));
    Assert.assertEquals(true, instance.bobThere("b1b"));
    Assert.assertEquals(true, instance.bobThere("b12b1b"));
    Assert.assertEquals(false, instance.bobThere("bbc"));
    Assert.assertEquals(true, instance.bobThere("bbb"));
    Assert.assertEquals(false, instance.bobThere("bb"));
    Assert.assertEquals(false, instance.bobThere("b"));
    Assert.assertEquals(false, instance.bobThere(""));
    Assert.assertEquals(true, instance.bobThere("b*b"));
    Assert.assertEquals(true, instance.bobThere("b b"));
  }
}
