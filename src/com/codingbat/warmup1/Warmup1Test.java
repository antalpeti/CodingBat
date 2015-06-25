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

  /**
   * Test method for {@link Warmup1#nearHundred(int)}.
   */
  @Test
  public void testNearHundred() {
    Assert.assertEquals(false, instance.nearHundred(0));
    Assert.assertEquals(false, instance.nearHundred(5));
    Assert.assertEquals(false, instance.nearHundred(89));
    Assert.assertEquals(true, instance.nearHundred(90));
    Assert.assertEquals(true, instance.nearHundred(93));
    Assert.assertEquals(true, instance.nearHundred(109));
    Assert.assertEquals(true, instance.nearHundred(110));
    Assert.assertEquals(false, instance.nearHundred(111));
    Assert.assertEquals(false, instance.nearHundred(121));
    Assert.assertEquals(false, instance.nearHundred(189));
    Assert.assertEquals(true, instance.nearHundred(190));
    Assert.assertEquals(true, instance.nearHundred(191));
    Assert.assertEquals(true, instance.nearHundred(200));
    Assert.assertEquals(true, instance.nearHundred(210));
    Assert.assertEquals(false, instance.nearHundred(211));
    Assert.assertEquals(false, instance.nearHundred(290));
  }

  /**
   * Test method for {@link Warmup1#posNeg(int, int, boolean)}.
   */
  @Test
  public void testPosNeg() {
    Assert.assertEquals(false, instance.posNeg(1, 1, false));
    Assert.assertEquals(false, instance.posNeg(1, 1, true));
    Assert.assertEquals(false, instance.posNeg(-1, -1, false));
    Assert.assertEquals(true, instance.posNeg(-1, -1, true));
    Assert.assertEquals(true, instance.posNeg(1, -1, false));
    Assert.assertEquals(false, instance.posNeg(1, -1, true));
    Assert.assertEquals(false, instance.posNeg(-1, 1, true));
    Assert.assertEquals(false, instance.posNeg(1, 2, false));
    Assert.assertEquals(false, instance.posNeg(-2, -1, false));
    Assert.assertEquals(true, instance.posNeg(-4, -5, true));
    Assert.assertEquals(false, instance.posNeg(-4, -5, false));
    Assert.assertEquals(false, instance.posNeg(-4, 5, true));
    Assert.assertEquals(true, instance.posNeg(5, -5, false));
    Assert.assertEquals(true, instance.posNeg(-5, -5, true));
    Assert.assertEquals(true, instance.posNeg(-6, 6, false));
    Assert.assertEquals(false, instance.posNeg(-5, -6, false));
    Assert.assertEquals(false, instance.posNeg(-5, 6, true));
  }

  /**
   * Test method for {@link Warmup1#notString(String)}.
   */
  @Test
  public void testNotString() {
    Assert.assertEquals("not candy", instance.notString("candy"));
    Assert.assertEquals("not x", instance.notString("x"));
    Assert.assertEquals("not bad", instance.notString("not bad"));
    Assert.assertEquals("not bad", instance.notString("bad"));
    Assert.assertEquals("not", instance.notString("not"));
    Assert.assertEquals("not is not", instance.notString("is not"));
    Assert.assertEquals("not no", instance.notString("no"));
    Assert.assertEquals("not hey", instance.notString("hey"));
  }

  /**
   * Test method for {@link Warmup1#missingChar(String, int)}.
   */
  @Test
  public void testMissingChar() {
    Assert.assertEquals("", instance.missingChar("", -1));
    Assert.assertEquals("", instance.missingChar("", 0));
    Assert.assertEquals("ktten", instance.missingChar("kitten", 1));
    Assert.assertEquals("itten", instance.missingChar("kitten", 0));
    Assert.assertEquals("kittn", instance.missingChar("kitten", 4));
    Assert.assertEquals("i", instance.missingChar("Hi", 0));
    Assert.assertEquals("H", instance.missingChar("Hi", 1));
    Assert.assertEquals("ode", instance.missingChar("code", 0));
    Assert.assertEquals("cde", instance.missingChar("code", 1));
    Assert.assertEquals("coe", instance.missingChar("code", 2));
    Assert.assertEquals("cod", instance.missingChar("code", 3));
    Assert.assertEquals("chocolat", instance.missingChar("chocolate", 8));
  }

  /**
   * Test method for {@link Warmup1#frontBack(String)}.
   */
  @Test
  public void testFrontBack() {
    Assert.assertEquals("eodc", instance.frontBack("code"));
    Assert.assertEquals("a", instance.frontBack("a"));
    Assert.assertEquals("ba", instance.frontBack("ab"));
    Assert.assertEquals("cba", instance.frontBack("abc"));
    Assert.assertEquals("", instance.frontBack(""));
    Assert.assertEquals("1", instance.frontBack("1"));
    Assert.assertEquals("21", instance.frontBack("12"));
    Assert.assertEquals("321", instance.frontBack("123"));
    Assert.assertEquals("ehocolatC", instance.frontBack("Chocolate"));
    Assert.assertEquals("Java", instance.frontBack("aavJ"));
    Assert.assertEquals("oellh", instance.frontBack("hello"));
  }

  /**
   * Test method for {@link Warmup1#front3(String)}.
   */
  @Test
  public void testFront3() {
    Assert.assertEquals("JavJavJav", instance.front3("Java"));
    Assert.assertEquals("ChoChoCho", instance.front3("Chocolate"));
    Assert.assertEquals("abcabcabc", instance.front3("abc"));
    Assert.assertEquals("@1#@1#@1#", instance.front3("@1#"));
    Assert.assertEquals("abcabcabc", instance.front3("abcXYZ"));
    Assert.assertEquals("ababab", instance.front3("ab"));
    Assert.assertEquals("@1@1@1", instance.front3("@1"));
    Assert.assertEquals("aaa", instance.front3("a"));
    Assert.assertEquals("@@@", instance.front3("@"));
    Assert.assertEquals("", instance.front3(""));
  }

  /**
   * Test method for {@link Warmup1#backAround(String)}.
   */
  @Test
  public void testBackAround() {
    Assert.assertEquals("tcatt", instance.backAround("cat"));
    Assert.assertEquals("oHelloo", instance.backAround("Hello"));
    Assert.assertEquals("", instance.backAround(""));
    Assert.assertEquals("aaa", instance.backAround("a"));
    Assert.assertEquals("cabcc", instance.backAround("abc"));
    Assert.assertEquals("dreadd", instance.backAround("read"));
    Assert.assertEquals("obooo", instance.backAround("boo"));
  }

  /**
   * Test method for {@link Warmup1#or35(int)}.
   */
  @Test
  public void testOr35() {
    Assert.assertEquals(true, instance.or35(-5));
    Assert.assertEquals(true, instance.or35(-3));
    Assert.assertEquals(false, instance.or35(-1));
    Assert.assertEquals(true, instance.or35(3));
    Assert.assertEquals(false, instance.or35(4));
    Assert.assertEquals(true, instance.or35(5));
    Assert.assertEquals(true, instance.or35(6));
    Assert.assertEquals(false, instance.or35(7));
    Assert.assertEquals(false, instance.or35(8));
    Assert.assertEquals(true, instance.or35(9));
    Assert.assertEquals(true, instance.or35(10));
    Assert.assertEquals(true, instance.or35(15));
    Assert.assertEquals(false, instance.or35(17));
    Assert.assertEquals(true, instance.or35(18));
    Assert.assertEquals(false, instance.or35(19));
    Assert.assertEquals(false, instance.or35(29));
    Assert.assertEquals(true, instance.or35(20));
    Assert.assertEquals(true, instance.or35(21));
    Assert.assertEquals(false, instance.or35(22));
    Assert.assertEquals(true, instance.or35(45));
    Assert.assertEquals(true, instance.or35(99));
    Assert.assertEquals(true, instance.or35(100));
    Assert.assertEquals(false, instance.or35(101));
    Assert.assertEquals(false, instance.or35(121));
    Assert.assertEquals(false, instance.or35(122));
    Assert.assertEquals(true, instance.or35(123));
  }

  /**
   * Test method for {@link Warmup1#front22(String)}.
   */
  @Test
  public void testFront22() {
    Assert.assertEquals("kikittenki", instance.front22("kitten"));
    Assert.assertEquals("HaHaHa", instance.front22("Ha"));
    Assert.assertEquals("ababcab", instance.front22("abc"));
    Assert.assertEquals("ababab", instance.front22("ab"));
    Assert.assertEquals("aaa", instance.front22("a"));
    Assert.assertEquals("", instance.front22(""));
    Assert.assertEquals("LoLogicLo", instance.front22("Logic"));
  }

  /**
   * Test method for {@link Warmup1#startHi(String)}.
   */
  @Test
  public void testStartHi() {
    Assert.assertEquals(true, instance.startHi("hi there"));
    Assert.assertEquals(true, instance.startHi("hi"));
    Assert.assertEquals(false, instance.startHi("hello hi"));
    Assert.assertEquals(false, instance.startHi("he"));
    Assert.assertEquals(false, instance.startHi("h"));
    Assert.assertEquals(false, instance.startHi(""));
    Assert.assertEquals(false, instance.startHi("ho hi"));
    Assert.assertEquals(true, instance.startHi("hi ho"));
  }

  /**
   * Test method for {@link Warmup1#icyHot(int, int)}.
   */
  @Test
  public void testIcyHot() {
    Assert.assertEquals(true, instance.icyHot(120, -1));
    Assert.assertEquals(true, instance.icyHot(-1, 120));
    Assert.assertEquals(false, instance.icyHot(2, 120));
    Assert.assertEquals(false, instance.icyHot(120, 2));
    Assert.assertEquals(false, instance.icyHot(-1, 100));
    Assert.assertEquals(false, instance.icyHot(100, -1));
    Assert.assertEquals(false, instance.icyHot(-1, -1));
    Assert.assertEquals(false, instance.icyHot(101, 101));
  }

  /**
   * Test method for {@link Warmup1#in1020(int, int)}.
   */
  @Test
  public void testIn1020() {
    Assert.assertEquals(false, instance.in1020(8, 99));
    Assert.assertEquals(true, instance.in1020(10, 99));
    Assert.assertEquals(true, instance.in1020(12, 99));
    Assert.assertEquals(true, instance.in1020(20, 99));
    Assert.assertEquals(true, instance.in1020(20, 12));
    Assert.assertEquals(true, instance.in1020(99, 10));
    Assert.assertEquals(true, instance.in1020(21, 12));
    Assert.assertEquals(true, instance.in1020(21, 20));
    Assert.assertEquals(true, instance.in1020(10, 10));
    Assert.assertEquals(true, instance.in1020(20, 20));
    Assert.assertEquals(false, instance.in1020(9, 9));
    Assert.assertEquals(false, instance.in1020(21, 21));
  }

  /**
   * Test method for {@link Warmup1#hasTeen(int, int, int)}.
   */
  @Test
  public void testHasTeen() {
    // not in range
    Assert.assertEquals(false, instance.hasTeen(12, 21, 9));
    Assert.assertEquals(false, instance.hasTeen(12, 9, 21));
    Assert.assertEquals(false, instance.hasTeen(20, 7, 24));
    Assert.assertEquals(false, instance.hasTeen(20, 24, 7));
    Assert.assertEquals(false, instance.hasTeen(12, 12, 12));
    Assert.assertEquals(false, instance.hasTeen(11, 22, 22));
    Assert.assertEquals(false, instance.hasTeen(20, 20, 20));
    Assert.assertEquals(false, instance.hasTeen(4, 2, 20));
    Assert.assertEquals(false, instance.hasTeen(1, 20, 12));
    Assert.assertEquals(false, instance.hasTeen(12, 9, 20));
    // first number in range
    Assert.assertEquals(true, instance.hasTeen(13, 20, 10));
    Assert.assertEquals(true, instance.hasTeen(13, 10, 20));
    Assert.assertEquals(true, instance.hasTeen(14, 2, 20));
    Assert.assertEquals(true, instance.hasTeen(14, 20, 2));
    Assert.assertEquals(true, instance.hasTeen(15, 20, 10));
    Assert.assertEquals(true, instance.hasTeen(19, 7, 24));
    Assert.assertEquals(true, instance.hasTeen(19, 24, 7));
    Assert.assertEquals(true, instance.hasTeen(19, 20, 12));
    Assert.assertEquals(true, instance.hasTeen(19, 12, 20));
    // second number in range
    Assert.assertEquals(true, instance.hasTeen(12, 13, 20));
    Assert.assertEquals(true, instance.hasTeen(20, 13, 12));
    Assert.assertEquals(true, instance.hasTeen(12, 18, 20));
    Assert.assertEquals(true, instance.hasTeen(20, 18, 12));
    Assert.assertEquals(true, instance.hasTeen(7, 19, 24));
    Assert.assertEquals(true, instance.hasTeen(24, 19, 7));
    Assert.assertEquals(true, instance.hasTeen(10, 19, 20));
    Assert.assertEquals(true, instance.hasTeen(20, 19, 10));
    // third number in range
    Assert.assertEquals(true, instance.hasTeen(20, 10, 13));
    Assert.assertEquals(true, instance.hasTeen(10, 20, 13));
    Assert.assertEquals(true, instance.hasTeen(8, 22, 15));
    Assert.assertEquals(true, instance.hasTeen(22, 8, 15));
    Assert.assertEquals(true, instance.hasTeen(12, 20, 19));
    Assert.assertEquals(true, instance.hasTeen(20, 12, 19));
  }

  /**
   * Test method for {@link Warmup1#loneTeen(int, int)}.
   */
  @Test
  public void testLoneTeen() {
    // out of range
    Assert.assertEquals(false, instance.loneTeen(1, 1));
    Assert.assertEquals(false, instance.loneTeen(12, 12));
    Assert.assertEquals(false, instance.loneTeen(12, 20));
    Assert.assertEquals(false, instance.loneTeen(20, 12));
    Assert.assertEquals(false, instance.loneTeen(20, 20));
    Assert.assertEquals(false, instance.loneTeen(99, 99));
    // first number in range
    Assert.assertEquals(true, instance.loneTeen(13, 99));
    Assert.assertEquals(true, instance.loneTeen(13, 20));
    Assert.assertEquals(true, instance.loneTeen(16, 9));
    Assert.assertEquals(true, instance.loneTeen(14, 20));
    // second number in range
    Assert.assertEquals(true, instance.loneTeen(20, 13));
    Assert.assertEquals(true, instance.loneTeen(99, 13));
    Assert.assertEquals(true, instance.loneTeen(20, 15));
    Assert.assertEquals(true, instance.loneTeen(6, 18));
    Assert.assertEquals(true, instance.loneTeen(21, 19));
    // both of them in range
    Assert.assertEquals(false, instance.loneTeen(13, 13));
    Assert.assertEquals(false, instance.loneTeen(13, 19));
    Assert.assertEquals(false, instance.loneTeen(16, 18));
    Assert.assertEquals(false, instance.loneTeen(16, 17));
    Assert.assertEquals(false, instance.loneTeen(17, 16));
    Assert.assertEquals(false, instance.loneTeen(19, 13));
    Assert.assertEquals(false, instance.loneTeen(19, 19));
  }

  /**
   * Test method for {@link Warmup1#delDel(String)}.
   */
  @Test
  public void testDelDel() {
    Assert.assertEquals("abc", instance.delDel("adelbc"));
    Assert.assertEquals("aHello", instance.delDel("adelHello"));
    Assert.assertEquals("adedbc", instance.delDel("adedbc"));
    Assert.assertEquals("abcdel", instance.delDel("abcdel"));
    Assert.assertEquals("add", instance.delDel("add"));
    Assert.assertEquals("ad", instance.delDel("ad"));
    Assert.assertEquals("a", instance.delDel("a"));
    Assert.assertEquals("", instance.delDel(""));
    Assert.assertEquals("del", instance.delDel("del"));
    Assert.assertEquals("a", instance.delDel("adel"));
    Assert.assertEquals("adel", instance.delDel("adeldel"));
    Assert.assertEquals("abdel", instance.delDel("adelbdel"));
    Assert.assertEquals("aadelbb", instance.delDel("aadelbb"));
  }

  /**
   * Test method for {@link Warmup1#mixStart(String)}.
   */
  @Test
  public void testMixStart() {
    Assert.assertEquals(true, instance.mixStart("mix snacks"));
    Assert.assertEquals(true, instance.mixStart("pix snacks"));
    Assert.assertEquals(false, instance.mixStart("piz snacks"));
    Assert.assertEquals(true, instance.mixStart("nix"));
    Assert.assertEquals(true, instance.mixStart("5ix"));
    Assert.assertEquals(false, instance.mixStart("tnix"));
    Assert.assertEquals(false, instance.mixStart("ix"));
    Assert.assertEquals(false, instance.mixStart("ni"));
    Assert.assertEquals(false, instance.mixStart("n"));
    Assert.assertEquals(false, instance.mixStart("i"));
    Assert.assertEquals(false, instance.mixStart("x"));
    Assert.assertEquals(false, instance.mixStart(""));
  }

  /**
   * Test method for {@link Warmup1#startOz(String)}.
   */
  @Test
  public void testStartOz() {
    Assert.assertEquals("oz", instance.startOz("ozymandias"));
    Assert.assertEquals("z", instance.startOz("bzoo"));
    Assert.assertEquals("o", instance.startOz("oxx"));
    Assert.assertEquals("oz", instance.startOz("oz"));
    Assert.assertEquals("o", instance.startOz("ounce"));
    Assert.assertEquals("o", instance.startOz("o"));
    Assert.assertEquals("", instance.startOz("abc"));
    Assert.assertEquals("", instance.startOz(""));
    Assert.assertEquals("", instance.startOz("zoo"));
    Assert.assertEquals("z", instance.startOz("aztec"));
    Assert.assertEquals("z", instance.startOz("zzzz"));
    Assert.assertEquals("oz", instance.startOz("oznic"));
  }
}
