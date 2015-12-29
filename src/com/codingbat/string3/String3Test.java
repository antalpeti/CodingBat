package com.codingbat.string3;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class String3Test is contains tests for String-3 section.
 */
public class String3Test {

  /** The instance variable to test the not static methods. */
  private static String3 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new String3();
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
   * Test method for {@link String3#countYZ(String)}.
   */
  @Test
  public void testCountYZ() {
    Assert.assertEquals(2, instance.countYZ("fez day"));
    Assert.assertEquals(2, instance.countYZ("day fez"));
    Assert.assertEquals(2, instance.countYZ("day fyyyz"));
    Assert.assertEquals(1, instance.countYZ("day yak"));
    Assert.assertEquals(1, instance.countYZ("day:yak"));
    Assert.assertEquals(2, instance.countYZ("!!day--yaz!!"));
    Assert.assertEquals(0, instance.countYZ("yak zak"));
    Assert.assertEquals(2, instance.countYZ("DAY abc XYZ"));
    Assert.assertEquals(3, instance.countYZ("aaz yyz my"));
    Assert.assertEquals(2, instance.countYZ("y2bz"));
    Assert.assertEquals(0, instance.countYZ("zxyx"));
  }

  /**
   * Test method for {@link String3#isYZ(char)}.
   */
  @Test
  public void testIsYZ() {
    Assert.assertEquals(false, instance.isYZ('x'));
    Assert.assertEquals(false, instance.isYZ('X'));
    Assert.assertEquals(true, instance.isYZ('y'));
    Assert.assertEquals(true, instance.isYZ('Y'));
    Assert.assertEquals(true, instance.isYZ('z'));
    Assert.assertEquals(true, instance.isYZ('Z'));
    Assert.assertEquals(false, instance.isYZ('1'));
    Assert.assertEquals(false, instance.isYZ(':'));
  }

  /**
   * Test method for {@link String3#withoutString(String, String)}.
   */
  @Test
  public void testWithoutString() {
    Assert.assertEquals("He there", instance.withoutString("Hello there", "llo"));
    Assert.assertEquals("Hllo thr", instance.withoutString("Hello there", "e"));
    Assert.assertEquals("Hello there", instance.withoutString("Hello there", "x"));
    Assert.assertEquals("Th  a FH", instance.withoutString("This is a FISH", "IS"));
    Assert.assertEquals("Th  a FH", instance.withoutString("This is a FISH", "is"));
    Assert.assertEquals("Th  a FH", instance.withoutString("This is a FISH", "iS"));
    Assert.assertEquals("abab", instance.withoutString("abxxxxab", "xx"));
    Assert.assertEquals("abxab", instance.withoutString("abxxxab", "xx"));
    Assert.assertEquals("abab", instance.withoutString("abxxxab", "x"));
    Assert.assertEquals("", instance.withoutString("xxx", "x"));
    Assert.assertEquals("x", instance.withoutString("xxx", "xx"));
    Assert.assertEquals("xzz", instance.withoutString("xyzzy", "Y"));
    Assert.assertEquals("", instance.withoutString("", "x"));
    Assert.assertEquals("acac", instance.withoutString("abcabc", "b"));
    Assert.assertEquals("AAbb", instance.withoutString("AA22bb", "2"));
    Assert.assertEquals("", instance.withoutString("1111", "1"));
    Assert.assertEquals("", instance.withoutString("1111", "11"));
    Assert.assertEquals("1", instance.withoutString("1111", "111"));
    Assert.assertEquals("jtx", instance.withoutString("MkjtMkx", "Mk"));
    Assert.assertEquals("Hi ", instance.withoutString("Hi HoHo", "Ho"));
  }

  /**
   * Test method for {@link String3#equalIsNot(String)}.
   */
  @Test
  public void testEqualIsNot() {
    Assert.assertEquals(false, instance.equalIsNot("This is not"));
    Assert.assertEquals(true, instance.equalIsNot("This is notnot"));
    Assert.assertEquals(true, instance.equalIsNot("noisxxnotyynotxisi"));
    Assert.assertEquals(false, instance.equalIsNot("noisxxnotyynotxsi"));
    Assert.assertEquals(true, instance.equalIsNot("xxxyyyzzzintint"));
    Assert.assertEquals(true, instance.equalIsNot(""));
    Assert.assertEquals(true, instance.equalIsNot("isisnotnot"));
    Assert.assertEquals(false, instance.equalIsNot("isisnotno7Not"));
    Assert.assertEquals(false, instance.equalIsNot("isnotis"));
    Assert.assertEquals(true, instance.equalIsNot("isnot"));
    Assert.assertEquals(true, instance.equalIsNot("notis"));
    Assert.assertEquals(false, instance.equalIsNot("notIs"));
    Assert.assertEquals(false, instance.equalIsNot("noTis"));
    Assert.assertEquals(false, instance.equalIsNot("mis3notpotbotis"));
  }
}
