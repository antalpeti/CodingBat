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

  /**
   * Test method for {@link Warmup2#frontTimes(String, int)}.
   */
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

  /**
   * Test method for {@link Warmup2#countXX(String)}.
   */
  @Test
  public final void testCountXX() {
    Assert.assertEquals(1, instance.countXX("abcxx"));
    Assert.assertEquals(2, instance.countXX("xxx"));
    Assert.assertEquals(3, instance.countXX("xxxx"));
    Assert.assertEquals(0, instance.countXX("abc"));
    Assert.assertEquals(0, instance.countXX("Hello there"));
    Assert.assertEquals(2, instance.countXX("Hexxo thxxe"));
    Assert.assertEquals(0, instance.countXX(""));
    Assert.assertEquals(0, instance.countXX("Kittens"));
    Assert.assertEquals(2, instance.countXX("Kittensxxx"));
  }

  /**
   * Test method for {@link Warmup2#doubleX(String)}.
   */
  @Test
  public final void testDoubleX() {
    Assert.assertEquals(true, instance.doubleX("axxbb"));
    Assert.assertEquals(false, instance.doubleX("axaxax"));
    Assert.assertEquals(true, instance.doubleX("xxxxx"));
    Assert.assertEquals(false, instance.doubleX("xaxxx"));
    Assert.assertEquals(false, instance.doubleX("aaaax"));
    Assert.assertEquals(false, instance.doubleX(""));
    Assert.assertEquals(false, instance.doubleX("abc"));
    Assert.assertEquals(false, instance.doubleX("x"));
    Assert.assertEquals(true, instance.doubleX("xx"));
    Assert.assertEquals(false, instance.doubleX("xax"));
    Assert.assertEquals(false, instance.doubleX("xaxx"));
  }

  /**
   * Test method for {@link Warmup2#stringBits(String)}.
   */
  @Test
  public final void testStringBits() {
    Assert.assertEquals("Hlo", instance.stringBits("Hello"));
    Assert.assertEquals("H", instance.stringBits("Hi"));
    Assert.assertEquals("Hello", instance.stringBits("Heeololeo"));
    Assert.assertEquals("HHH", instance.stringBits("HiHiHi"));
    Assert.assertEquals("", instance.stringBits(""));
    Assert.assertEquals("Getns", instance.stringBits("Greetings"));
    Assert.assertEquals("Coot", instance.stringBits("Chocoate"));
    Assert.assertEquals("p", instance.stringBits("pi"));
    Assert.assertEquals("HloKte", instance.stringBits("Hello Kitten"));
    Assert.assertEquals("happy", instance.stringBits("hxaxpxpxy"));
  }

  /**
   * Test method for {@link Warmup2#stringSplosion(String)}.
   */
  @Test
  public final void testStringSplosion() {
    Assert.assertEquals("CCoCodCode", instance.stringSplosion("Code"));
    Assert.assertEquals("aababc", instance.stringSplosion("abc"));
    Assert.assertEquals("aab", instance.stringSplosion("ab"));
    Assert.assertEquals("x", instance.stringSplosion("x"));
    Assert.assertEquals("", instance.stringSplosion(""));
    Assert.assertEquals("ffafadfade", instance.stringSplosion("fade"));
    Assert.assertEquals("TThTheTherThere", instance.stringSplosion("There"));
    Assert.assertEquals("KKiKitKittKitteKitten", instance.stringSplosion("Kitten"));
    Assert.assertEquals("BByBye", instance.stringSplosion("Bye"));
    Assert.assertEquals("GGoGooGood", instance.stringSplosion("Good"));
    Assert.assertEquals("BBaBad", instance.stringSplosion("Bad"));
  }

  /**
   * Test method for {@link Warmup2#last2(String)}.
   */
  @Test
  public final void testLast2() {
    Assert.assertEquals(1, instance.last2("hixxxhi"));
    Assert.assertEquals(1, instance.last2("xaxxaxaxx"));
    Assert.assertEquals(2, instance.last2("axxxaaxx"));
    Assert.assertEquals(3, instance.last2("xxaxxaxxaxx"));
    Assert.assertEquals(0, instance.last2("xaxaxaxx"));
    Assert.assertEquals(2, instance.last2("xxxx"));
    Assert.assertEquals(1, instance.last2("13121312"));
    Assert.assertEquals(1, instance.last2("11212"));
    Assert.assertEquals(0, instance.last2("13121311"));
    Assert.assertEquals(2, instance.last2("1717171"));
    Assert.assertEquals(0, instance.last2("hi"));
    Assert.assertEquals(0, instance.last2("h"));
    Assert.assertEquals(0, instance.last2(""));
  }

  /**
   * Test method for {@link Warmup2#arrayCount9(int[])}.
   */
  @Test
  public final void testArrayCount9() {
    Assert.assertEquals(1, instance.arrayCount9(new int[] {1, 2, 9}));
    Assert.assertEquals(2, instance.arrayCount9(new int[] {1, 9, 9}));
    Assert.assertEquals(3, instance.arrayCount9(new int[] {1, 9, 9, 3, 9}));
    Assert.assertEquals(0, instance.arrayCount9(new int[] {1, 2, 3}));
    Assert.assertEquals(0, instance.arrayCount9(new int[] {}));
    Assert.assertEquals(0, instance.arrayCount9(new int[] {4, 2, 4, 3, 1}));
    Assert.assertEquals(1, instance.arrayCount9(new int[] {9, 2, 4, 3, 1}));
    Assert.assertEquals(1, instance.arrayCount9(new int[] {9, -9}));
  }

  /**
   * Test method for {@link Warmup2#arrayFront9(int[])}.
   */
  @Test
  public final void testArrayFront9() {
    Assert.assertEquals(true, instance.arrayFront9(new int[] {1, 2, 9, 3, 4}));
    Assert.assertEquals(false, instance.arrayFront9(new int[] {1, 2, 3, 4, 9}));
    Assert.assertEquals(false, instance.arrayFront9(new int[] {1, 2, 3, 4, 5}));
    Assert.assertEquals(true, instance.arrayFront9(new int[] {9, 2, 3}));
    Assert.assertEquals(true, instance.arrayFront9(new int[] {1, 9, 9}));
    Assert.assertEquals(false, instance.arrayFront9(new int[] {1, 2, 3}));
    Assert.assertEquals(true, instance.arrayFront9(new int[] {1, 9}));
    Assert.assertEquals(false, instance.arrayFront9(new int[] {5, 5}));
    Assert.assertEquals(false, instance.arrayFront9(new int[] {2}));
    Assert.assertEquals(true, instance.arrayFront9(new int[] {9}));
    Assert.assertEquals(false, instance.arrayFront9(new int[] {}));
    Assert.assertEquals(true, instance.arrayFront9(new int[] {3, 9, 2, 3, 3}));
  }

  /**
   * Test method for {@link Warmup2#array123(int[])}.
   */
  @Test
  public final void testArray123() {
    Assert.assertEquals(true, instance.array123(new int[] {1, 1, 2, 3, 1}));
    Assert.assertEquals(false, instance.array123(new int[] {1, 1, 2, 4, 1}));
    Assert.assertEquals(true, instance.array123(new int[] {1, 1, 2, 1, 2, 3}));
    Assert.assertEquals(false, instance.array123(new int[] {1, 1, 2, 1, 2, 1}));
    Assert.assertEquals(true, instance.array123(new int[] {1, 2, 3, 1, 2, 3}));
    Assert.assertEquals(false, instance.array123(new int[] {0, 1, 0, 2, 0, 3}));
    Assert.assertEquals(true, instance.array123(new int[] {1, 2, 3}));
    Assert.assertEquals(false, instance.array123(new int[] {1, 1, 1}));
    Assert.assertEquals(false, instance.array123(new int[] {1, 2}));
    Assert.assertEquals(false, instance.array123(new int[] {1}));
    Assert.assertEquals(false, instance.array123(new int[] {}));
  }

  /**
   * Test method for {@link Warmup2#stringMatch(String, String)}.
   */
  @Test
  public final void testStringMatch() {
    Assert.assertEquals(3, instance.stringMatch("xxcaazz", "xxbaaz"));
    Assert.assertEquals(2, instance.stringMatch("abc", "abc"));
    Assert.assertEquals(0, instance.stringMatch("abc", "axc"));
    Assert.assertEquals(1, instance.stringMatch("hello", "he"));
    Assert.assertEquals(1, instance.stringMatch("he", "hello"));
    Assert.assertEquals(0, instance.stringMatch("h", "hello"));
    Assert.assertEquals(0, instance.stringMatch("", "hello"));
    Assert.assertEquals(0, instance.stringMatch("hehe", ""));
    Assert.assertEquals(0, instance.stringMatch("", ""));
    Assert.assertEquals(1, instance.stringMatch("aabbccdd", "abbbxxd"));
    Assert.assertEquals(3, instance.stringMatch("aaxxaaxx", "iaxxai"));
    Assert.assertEquals(3, instance.stringMatch("iaxxai", "aaxxaaxx"));
  }

  /**
   * Test method for {@link Warmup2#stringX(String)}.
   */
  @Test
  public final void testStringX() {
    Assert.assertEquals("xHix", instance.stringX("xxHxix"));
    Assert.assertEquals("abcd", instance.stringX("abxxxcd"));
    Assert.assertEquals("xabcdx", instance.stringX("xabxxxcdx"));
    Assert.assertEquals("xKittenx", instance.stringX("xKittenx"));
    Assert.assertEquals("Hello", instance.stringX("Hello"));
    Assert.assertEquals("xx", instance.stringX("xx"));
    Assert.assertEquals("x", instance.stringX("x"));
    Assert.assertEquals("", instance.stringX(""));
  }

  /**
   * Test method for {@link Warmup2#altPairs(String)}.
   */
  @Test
  public final void testAltPairs() {
    Assert.assertEquals("kien", instance.altPairs("kitten"));
    Assert.assertEquals("Chole", instance.altPairs("Chocolate"));
    Assert.assertEquals("Congrr", instance.altPairs("CodingHorror"));
    Assert.assertEquals("ya", instance.altPairs("yak"));
    Assert.assertEquals("ya", instance.altPairs("ya"));
    Assert.assertEquals("y", instance.altPairs("y"));
    Assert.assertEquals("", instance.altPairs(""));
    Assert.assertEquals("ThThThth", instance.altPairs("ThisThatTheOther"));
  }

  /**
   * Test method for {@link Warmup2#stringYak(String)}.
   */
  @Test
  public final void testStringYak() {
    Assert.assertEquals("pak", instance.stringYak("yakpak"));
    Assert.assertEquals("pak", instance.stringYak("yokpak"));
    Assert.assertEquals("pak", instance.stringYak("pakyak"));
    Assert.assertEquals("pak", instance.stringYak("pakyuk"));
    Assert.assertEquals("123ya", instance.stringYak("yak123ya"));
    Assert.assertEquals("", instance.stringYak("yak"));
    Assert.assertEquals("", instance.stringYak("ybk"));
    Assert.assertEquals("xxx", instance.stringYak("yakxxxyak"));
    Assert.assertEquals("xxx", instance.stringYak("yekxxxyik"));
    Assert.assertEquals("HiHi", instance.stringYak("HiyakHi"));
    Assert.assertEquals("xxxyyzzz", instance.stringYak("xxxyakyyyakzzz"));
  }
}
