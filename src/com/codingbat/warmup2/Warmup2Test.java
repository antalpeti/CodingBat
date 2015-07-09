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
}
