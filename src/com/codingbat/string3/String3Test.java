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
}
