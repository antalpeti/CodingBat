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

  /**
   * Test method for {@link String2#xyBalance(String)}.
   */
  @Test
  public void testXyBalance() {
    Assert.assertEquals(true, instance.xyBalance(""));
    Assert.assertEquals(true, instance.xyBalance("xy"));
    Assert.assertEquals(false, instance.xyBalance("x"));
    Assert.assertEquals(true, instance.xyBalance("y"));
    Assert.assertEquals(true, instance.xyBalance("xyy"));
    Assert.assertEquals(false, instance.xyBalance("yyx"));
    Assert.assertEquals(true, instance.xyBalance("xbbdey"));
    Assert.assertEquals(false, instance.xyBalance("ybbdex"));
  }

  /**
   * Test method for {@link String2#mixString(String, String)}.
   */
  @Test
  public void testMixString() {
    Assert.assertEquals("axbycz", instance.mixString("abc", "xyz"));
    Assert.assertEquals("HTihere", instance.mixString("Hi", "There"));
    Assert.assertEquals("xTxhxexre", instance.mixString("xxxx", "There"));
    Assert.assertEquals("xXxx", instance.mixString("xxx", "X"));
    Assert.assertEquals("22/7 around", instance.mixString("2/", "27 around"));
    Assert.assertEquals("Hello", instance.mixString("", "Hello"));
    Assert.assertEquals("Abc", instance.mixString("Abc", ""));
    Assert.assertEquals("", instance.mixString("", ""));
    Assert.assertEquals("ab", instance.mixString("a", "b"));
    Assert.assertEquals("abx", instance.mixString("ax", "b"));
    Assert.assertEquals("abx", instance.mixString("a", "bx"));
    Assert.assertEquals("SLoong", instance.mixString("So", "Long"));
    Assert.assertEquals("LSoong", instance.mixString("Long", "So"));
  }

  /**
   * Test method for {@link String2#repeatEnd(String, int)}.
   */
  @Test
  public void testRepeatEnd() {
    Assert.assertEquals("llollollo", instance.repeatEnd("Hello", 3));
    Assert.assertEquals("lolo", instance.repeatEnd("Hello", 2));
    Assert.assertEquals("o", instance.repeatEnd("Hello", 1));
    Assert.assertEquals("", instance.repeatEnd("Hello", 0));
    Assert.assertEquals("abcabcabc", instance.repeatEnd("abc", 3));
    Assert.assertEquals("bcbc", instance.repeatEnd("abc", 2));
    Assert.assertEquals("c", instance.repeatEnd("abc", 1));
    Assert.assertEquals("", instance.repeatEnd("abc", 0));
    Assert.assertEquals("3434", instance.repeatEnd("1234", 2));
    Assert.assertEquals("234234234", instance.repeatEnd("1234", 3));
    Assert.assertEquals("", instance.repeatEnd("", 0));
  }

  /**
   * Test method for {@link String2#repeatFront(String, int)}.
   */
  @Test
  public void testRepeatFront() {
    Assert.assertEquals("ChocChoChC", instance.repeatFront("Chocolate", 4));
    Assert.assertEquals("ChoChC", instance.repeatFront("Chocolate", 3));
    Assert.assertEquals("IcI", instance.repeatFront("Ice Cream", 2));
    Assert.assertEquals("I", instance.repeatFront("Ice Cream", 1));
    Assert.assertEquals("", instance.repeatFront("Ice Cream", 0));
    Assert.assertEquals("xyzxyx", instance.repeatFront("xyz", 3));
    Assert.assertEquals("", instance.repeatFront("", 0));
    Assert.assertEquals("JavaJavJaJ", instance.repeatFront("Java", 4));
    Assert.assertEquals("J", instance.repeatFront("Java", 1));
    Assert.assertEquals("", instance.repeatFront("Java", -1));
    Assert.assertEquals("JavaJavJaJ", instance.repeatFront("Java", 5));
  }

  /**
   * Test method for {@link String2#repeatSeparator(String, String, int)}.
   */
  @Test
  public void testRepeatSeparator() {
    Assert.assertEquals("WordXWordXWord", instance.repeatSeparator("Word", "X", 3));
    Assert.assertEquals("ThisAndThis", instance.repeatSeparator("This", "And", 2));
    Assert.assertEquals("This", instance.repeatSeparator("This", "And", 1));
    Assert.assertEquals("Hi-n-Hi", instance.repeatSeparator("Hi", "-n-", 2));
    Assert.assertEquals("AAAAAA", instance.repeatSeparator("AAA", "", 2));
    Assert.assertEquals("AAA", instance.repeatSeparator("AAA", "", 1));
    Assert.assertEquals("", instance.repeatSeparator("AAA", "", 0));
    Assert.assertEquals("ABABABABA", instance.repeatSeparator("A", "B", 5));
    Assert.assertEquals("abcXXabcXXabc", instance.repeatSeparator("abc", "XX", 3));
    Assert.assertEquals("abcXXabc", instance.repeatSeparator("abc", "XX", 2));
    Assert.assertEquals("abc", instance.repeatSeparator("abc", "XX", 1));
    Assert.assertEquals("XYZaXYZ", instance.repeatSeparator("XYZ", "a", 2));
  }

  /**
   * Test method for {@link String2#prefixAgain(String, int)}.
   */
  @Test
  public void testPrefixAgain() {
    Assert.assertEquals(true, instance.prefixAgain("abXYabc", 1));
    Assert.assertEquals(true, instance.prefixAgain("abXYabc", 2));
    Assert.assertEquals(false, instance.prefixAgain("abXYabc", 3));
    Assert.assertEquals(true, instance.prefixAgain("xyzxyxyxy", 2));
    Assert.assertEquals(false, instance.prefixAgain("xyzxyxyxy", 3));
    Assert.assertEquals(true, instance.prefixAgain("Hi12345Hi6789Hi10", 1));
    Assert.assertEquals(true, instance.prefixAgain("Hi12345Hi6789Hi10", 2));
    Assert.assertEquals(true, instance.prefixAgain("Hi12345Hi6789Hi10", 3));
    Assert.assertEquals(false, instance.prefixAgain("Hi12345Hi6789Hi10", 4));
    Assert.assertEquals(false, instance.prefixAgain("a", 1));
    Assert.assertEquals(true, instance.prefixAgain("aa", 1));
    Assert.assertEquals(false, instance.prefixAgain("ab", 1));
  }

  /**
   * Test method for {@link String2#xyzMiddle(String)}.
   */
  @Test
  public void testXyzMiddle() {
    Assert.assertEquals(true, instance.xyzMiddle("AAxyzBB"));
    Assert.assertEquals(true, instance.xyzMiddle("AxyzBB"));
    Assert.assertEquals(false, instance.xyzMiddle("AxyzBBB"));
    Assert.assertEquals(false, instance.xyzMiddle("AxyzBBBB"));
    Assert.assertEquals(false, instance.xyzMiddle("AAAxyzB"));
    Assert.assertEquals(true, instance.xyzMiddle("AAAxyzBB"));
    Assert.assertEquals(false, instance.xyzMiddle("AAAAxyzBB"));
    Assert.assertEquals(false, instance.xyzMiddle("AAAAAxyzBBB"));
    Assert.assertEquals(true, instance.xyzMiddle("1x345xyz12x4"));
    Assert.assertEquals(true, instance.xyzMiddle("xyzAxyzBBB"));
    Assert.assertEquals(true, instance.xyzMiddle("xyzAxyzBxyz"));
    Assert.assertEquals(true, instance.xyzMiddle("xyzxyzAxyzBxyzxyz"));
    Assert.assertEquals(true, instance.xyzMiddle("xyzxyzxyzBxyzxyz"));
    Assert.assertEquals(true, instance.xyzMiddle("xyzxyzAxyzxyzxyz"));
    Assert.assertEquals(false, instance.xyzMiddle("xyzxyzAxyzxyzxy"));
    Assert.assertEquals(false, instance.xyzMiddle("AxyzxyzBB"));
    Assert.assertEquals(false, instance.xyzMiddle(""));
    Assert.assertEquals(false, instance.xyzMiddle("x"));
    Assert.assertEquals(false, instance.xyzMiddle("xy"));
    Assert.assertEquals(true, instance.xyzMiddle("xyz"));
    Assert.assertEquals(true, instance.xyzMiddle("xyzz"));
  }

  /**
   * Test method for {@link String2#getSandwich(String)}.
   */
  @Test
  public void testGetSandwich() {
    Assert.assertEquals("jam", instance.getSandwich("breadjambread"));
    Assert.assertEquals("jam", instance.getSandwich("xxbreadjambreadyy"));
    Assert.assertEquals("", instance.getSandwich("xxbreadyy"));
    Assert.assertEquals("breadjam", instance.getSandwich("xxbreadbreadjambreadyy"));
    Assert.assertEquals("A", instance.getSandwich("breadAbread"));
    Assert.assertEquals("", instance.getSandwich("breadbread"));
    Assert.assertEquals("", instance.getSandwich("abcbreaz"));
    Assert.assertEquals("", instance.getSandwich("abcbread"));
    Assert.assertEquals("", instance.getSandwich("bread"));
    Assert.assertEquals("", instance.getSandwich("xyz"));
    Assert.assertEquals("", instance.getSandwich(""));
    Assert.assertEquals("breax", instance.getSandwich("breadbreaxbread"));
    Assert.assertEquals("y", instance.getSandwich("breaxbreadybread"));
    Assert.assertEquals("breadbread", instance.getSandwich("breadbreadbreadbread"));
  }

  /**
   * Test method for {@link String2#sameStarChar(String)}.
   */
  @Test
  public void testSameStarChar() {
    Assert.assertEquals(true, instance.sameStarChar("xy*yzz"));
    Assert.assertEquals(false, instance.sameStarChar("xy*zzz"));
    Assert.assertEquals(true, instance.sameStarChar("xa*az"));
    Assert.assertEquals(false, instance.sameStarChar("xa*bz"));
    Assert.assertEquals(true, instance.sameStarChar("xa*a*"));
    Assert.assertEquals(true, instance.sameStarChar(""));
    Assert.assertEquals(true, instance.sameStarChar("xa*a*a"));
    Assert.assertEquals(false, instance.sameStarChar("xa*a*b"));
    Assert.assertEquals(true, instance.sameStarChar("12*2*2"));
    Assert.assertEquals(false, instance.sameStarChar("12*2*3"));
    Assert.assertEquals(true, instance.sameStarChar("abcDEF"));
    Assert.assertEquals(false, instance.sameStarChar("XY*YYYY*Z*"));
    Assert.assertEquals(true, instance.sameStarChar("XY*YYYY*Y*"));
    Assert.assertEquals(false, instance.sameStarChar("12*2*3*"));
    Assert.assertEquals(true, instance.sameStarChar("*"));
    Assert.assertEquals(true, instance.sameStarChar("**"));
    Assert.assertEquals(true, instance.sameStarChar("***"));
  }

  /**
   * Test method for {@link String2#zipZap(String)}.
   */
  @Test
  public void testZipZap() {
    Assert.assertEquals("zpXzp", instance.zipZap("zipXzap"));
    Assert.assertEquals("zpzp", instance.zipZap("zopzop"));
    Assert.assertEquals("zzzpzp", instance.zipZap("zzzopzop"));
    Assert.assertEquals("zibzp", instance.zipZap("zibzap"));
    Assert.assertEquals("zp", instance.zipZap("zip"));
    Assert.assertEquals("zi", instance.zipZap("zi"));
    Assert.assertEquals("z", instance.zipZap("z"));
    Assert.assertEquals("", instance.zipZap(""));
    Assert.assertEquals("zp", instance.zipZap("zzp"));
    Assert.assertEquals("abcppp", instance.zipZap("abcppp"));
    Assert.assertEquals("azbcppp", instance.zipZap("azbcppp"));
    Assert.assertEquals("azbcpzp", instance.zipZap("azbcpzpp"));
  }
}
