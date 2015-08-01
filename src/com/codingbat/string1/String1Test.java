package com.codingbat.string1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class String1Test is contains tests for String-1 section.
 */
public class String1Test {

  /** The instance variable to test the not static methods. */
  private static String1 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUpBeforeClass() throws Exception {
    instance = new String1();
  }

  /**
   * Tear down after the tests finish.
   *
   * @throws Exception the exception if something go wrong
   */
  @AfterClass
  public static void tearDownAfterClass() throws Exception {
    instance = null;
  }

  /**
   * Test method for {@link String1#helloName(String)}.
   */
  @Test
  public void testHelloName() {
    Assert.assertEquals("Hello Bob!", instance.helloName("Bob"));
    Assert.assertEquals("Hello Alice!", instance.helloName("Alice"));
    Assert.assertEquals("Hello X!", instance.helloName("X"));
    Assert.assertEquals("Hello Dolly!", instance.helloName("Dolly"));
    Assert.assertEquals("Hello Alpha!", instance.helloName("Alpha"));
    Assert.assertEquals("Hello Omega!", instance.helloName("Omega"));
    Assert.assertEquals("Hello Goodbye!", instance.helloName("Goodbye"));
    Assert.assertEquals("Hello ho ho ho!", instance.helloName("ho ho ho"));
    Assert.assertEquals("Hello xyz!!", instance.helloName("xyz!"));
    Assert.assertEquals("Hello Hello!", instance.helloName("Hello"));
  }

  /**
   * Test method for {@link String1#makeAbba(String, String)}.
   */
  @Test
  public void testMakeAbba() {
    Assert.assertEquals("HiByeByeHi", instance.makeAbba("Hi", "Bye"));
    Assert.assertEquals("YoAliceAliceYo", instance.makeAbba("Yo", "Alice"));
    Assert.assertEquals("WhatUpUpWhat", instance.makeAbba("What", "Up"));
    Assert.assertEquals("aaabbbbbbaaa", instance.makeAbba("aaa", "bbb"));
    Assert.assertEquals("xyyx", instance.makeAbba("x", "y"));
    Assert.assertEquals("xx", instance.makeAbba("x", ""));
    Assert.assertEquals("yy", instance.makeAbba("", "y"));
    Assert.assertEquals("", instance.makeAbba("", ""));
    Assert.assertEquals("", instance.makeAbba("", ""));
    Assert.assertEquals("BoYaYaBo", instance.makeAbba("Bo", "Ya"));
    Assert.assertEquals("YaYaYaYa", instance.makeAbba("Ya", "Ya"));
    Assert.assertEquals("cCCc", instance.makeAbba("c", "C"));
    Assert.assertEquals("cccc", instance.makeAbba("c", "c"));
  }

  /**
   * Test method for {@link String1#makeTags(String, String)}.
   */
  @Test
  public void testMakeTags() {
    Assert.assertEquals("<i>Yay</i>", instance.makeTags("i", "Yay"));
    Assert.assertEquals("<i>Hello</i>", instance.makeTags("i", "Hello"));
    Assert.assertEquals("<cite>Yay</cite>", instance.makeTags("cite", "Yay"));
    Assert.assertEquals("<address>here</address>", instance.makeTags("address", "here"));
    Assert.assertEquals("<body>Heart</body>", instance.makeTags("body", "Heart"));
    Assert.assertEquals("<i>i</i>", instance.makeTags("i", "i"));
    Assert.assertEquals("<i></i>", instance.makeTags("i", ""));
    Assert.assertEquals("<>i</>", instance.makeTags("", "i"));
    Assert.assertEquals("<></>", instance.makeTags("", ""));
  }

  /**
   * Test method for {@link String1#makeOutWord(String, String)}.
   */
  @Test
  public void testMakeOutWord() {
    Assert.assertEquals("<<Yay>>", instance.makeOutWord("<<>>", "Yay"));
    Assert.assertEquals("<<WooHoo>>", instance.makeOutWord("<<>>", "WooHoo"));
    Assert.assertEquals("[[word]]", instance.makeOutWord("[[]]", "word"));
    Assert.assertEquals("HHHellooo", instance.makeOutWord("HHoo", "Hello"));
    Assert.assertEquals("abYAYyz", instance.makeOutWord("abyz", "YAY"));
    Assert.assertEquals("12numbers34", instance.makeOutWord("1234", "numbers"));
    Assert.assertEquals("(())", instance.makeOutWord("(())", ""));
    Assert.assertEquals("((*))", instance.makeOutWord("(())", "*"));
  }

  /**
   * Test method for {@link String1#extraEnd(String)}.
   */
  @Test
  public void testExtraEnd() {
    Assert.assertEquals("lololo", instance.extraEnd("Hello"));
    Assert.assertEquals("ababab", instance.extraEnd("ab"));
    Assert.assertEquals("HiHiHi", instance.extraEnd("Hi"));
    Assert.assertEquals("dydydy", instance.extraEnd("Candy"));
    Assert.assertEquals("dedede", instance.extraEnd("Code"));
    Assert.assertEquals("121212", instance.extraEnd("12"));
    Assert.assertEquals("bcbcbc", instance.extraEnd("abc"));
  }

  /**
   * Test method for {@link String1#firstTwo(String)}.
   */
  @Test
  public void testFirstTwo() {
    Assert.assertEquals("He", instance.firstTwo("Hello"));
    Assert.assertEquals("ab", instance.firstTwo("abcdefg"));
    Assert.assertEquals("ab", instance.firstTwo("ab"));
    Assert.assertEquals("a", instance.firstTwo("a"));
    Assert.assertEquals("", instance.firstTwo(""));
    Assert.assertEquals("1", instance.firstTwo("1"));
    Assert.assertEquals("17", instance.firstTwo("17"));
    Assert.assertEquals("Ki", instance.firstTwo("Kitten"));
    Assert.assertEquals("hi", instance.firstTwo("hi"));
    Assert.assertEquals("hi", instance.firstTwo("hiya"));
  }

  /**
   * Test method for {@link String1#firstHalf(String)}.
   */
  @Test
  public void testFirstHalf() {
    Assert.assertEquals("Woo", instance.firstHalf("WooHoo"));
    Assert.assertEquals("Hello", instance.firstHalf("HelloThere"));
    Assert.assertEquals("abc", instance.firstHalf("abcdef"));
    Assert.assertEquals("abc", instance.firstHalf("abcdefg"));
    Assert.assertEquals("a", instance.firstHalf("ab"));
    Assert.assertEquals("a", instance.firstHalf("abc"));
    Assert.assertEquals("", instance.firstHalf(""));
    Assert.assertEquals("", instance.firstHalf("1"));
    Assert.assertEquals("1", instance.firstHalf("12"));
    Assert.assertEquals("01234", instance.firstHalf("0123456789"));
    Assert.assertEquals("kit", instance.firstHalf("kitten"));
  }

  /**
   * Test method for {@link String1#withoutEnd(String)}.
   */
  @Test
  public void testWithoutEnd() {
    Assert.assertEquals("ell", instance.withoutEnd("Hello"));
    Assert.assertEquals("av", instance.withoutEnd("java"));
    Assert.assertEquals("odin", instance.withoutEnd("coding"));
    Assert.assertEquals("od", instance.withoutEnd("code"));
    Assert.assertEquals("", instance.withoutEnd("ab"));
    Assert.assertEquals("hocolate", instance.withoutEnd("Chocolate!"));
    Assert.assertEquals("itte", instance.withoutEnd("kitten"));
    Assert.assertEquals("ooho", instance.withoutEnd("woohoo"));
    Assert.assertEquals("", instance.withoutEnd("k"));
    Assert.assertEquals("", instance.withoutEnd(""));
  }
}
