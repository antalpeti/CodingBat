package com.codingbat.logic1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Logic1Test is contains tests for Logic-1 section.
 */
public class Logic1Test {

  /** The instance variable to test the not static methods. */
  private static Logic1 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new Logic1();
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
   * Test method for {@link Logic1#cigarParty(int, boolean)}.
   */
  @Test
  public void testCigarParty() {
    for (int i = 0; i < 40; i++) {
      Assert.assertEquals(false, instance.cigarParty(i, false));
      Assert.assertEquals(false, instance.cigarParty(i, true));
    }
    for (int i = 40; i < 61; i++) {
      Assert.assertEquals(true, instance.cigarParty(i, false));
      Assert.assertEquals(true, instance.cigarParty(i, true));
    }
    for (int i = 61; i < 100; i++) {
      Assert.assertEquals(false, instance.cigarParty(i, false));
      Assert.assertEquals(true, instance.cigarParty(i, true));
    }
  }

  /**
   * Test method for {@link Logic1#dateFashion(int, int)}.
   */
  @Test
  public void testDateFashion() {
    for (int i = 0; i < 11; i++) {
      Assert.assertEquals(0, instance.dateFashion(0, i));
      Assert.assertEquals(0, instance.dateFashion(1, i));
      Assert.assertEquals(0, instance.dateFashion(2, i));
      Assert.assertEquals(0, instance.dateFashion(i, 0));
      Assert.assertEquals(0, instance.dateFashion(i, 1));
      Assert.assertEquals(0, instance.dateFashion(i, 2));
    }
    for (int i = 3; i < 11; i++) {
      Assert.assertEquals(2, instance.dateFashion(8, i));
      Assert.assertEquals(2, instance.dateFashion(9, i));
      Assert.assertEquals(2, instance.dateFashion(10, i));
      Assert.assertEquals(2, instance.dateFashion(i, 8));
      Assert.assertEquals(2, instance.dateFashion(i, 9));
      Assert.assertEquals(2, instance.dateFashion(i, 10));

    }
    for (int i = 3; i < 7; i++) {
      for (int j = 3; j < 7; j++) {
        Assert.assertEquals(1, instance.dateFashion(i, j));
      }
    }
  }

  /**
   * Test method for {@link Logic1#squirrelPlay(int, boolean)}.
   */
  @Test
  public void testSquirrelPlay() {
    Assert.assertEquals(false, instance.squirrelPlay(50, false));
    Assert.assertEquals(false, instance.squirrelPlay(50, true));
    Assert.assertEquals(false, instance.squirrelPlay(59, false));
    Assert.assertEquals(false, instance.squirrelPlay(59, true));
    Assert.assertEquals(true, instance.squirrelPlay(60, false));
    Assert.assertEquals(true, instance.squirrelPlay(60, true));
    Assert.assertEquals(true, instance.squirrelPlay(70, false));
    Assert.assertEquals(true, instance.squirrelPlay(70, true));
    Assert.assertEquals(true, instance.squirrelPlay(90, false));
    Assert.assertEquals(true, instance.squirrelPlay(90, true));
    Assert.assertEquals(false, instance.squirrelPlay(95, false));
    Assert.assertEquals(true, instance.squirrelPlay(95, true));
    Assert.assertEquals(false, instance.squirrelPlay(100, false));
    Assert.assertEquals(true, instance.squirrelPlay(100, true));
    Assert.assertEquals(false, instance.squirrelPlay(101, false));
    Assert.assertEquals(false, instance.squirrelPlay(101, true));
  }

  /**
   * Test method for {@link Logic1#caughtSpeeding(int, boolean)}.
   */
  @Test
  public void testCaughtSpeeding() {
    Assert.assertEquals(0, instance.caughtSpeeding(40, false));
    Assert.assertEquals(0, instance.caughtSpeeding(40, true));
    Assert.assertEquals(0, instance.caughtSpeeding(60, false));
    Assert.assertEquals(0, instance.caughtSpeeding(60, true));
    Assert.assertEquals(1, instance.caughtSpeeding(61, false));
    Assert.assertEquals(0, instance.caughtSpeeding(61, true));
    Assert.assertEquals(1, instance.caughtSpeeding(65, false));
    Assert.assertEquals(0, instance.caughtSpeeding(65, true));
    Assert.assertEquals(1, instance.caughtSpeeding(66, false));
    Assert.assertEquals(1, instance.caughtSpeeding(66, true));
    Assert.assertEquals(1, instance.caughtSpeeding(75, false));
    Assert.assertEquals(1, instance.caughtSpeeding(75, true));
    Assert.assertEquals(1, instance.caughtSpeeding(80, false));
    Assert.assertEquals(1, instance.caughtSpeeding(80, true));
    Assert.assertEquals(2, instance.caughtSpeeding(85, false));
    Assert.assertEquals(1, instance.caughtSpeeding(85, true));
    Assert.assertEquals(2, instance.caughtSpeeding(86, false));
    Assert.assertEquals(2, instance.caughtSpeeding(86, true));
    Assert.assertEquals(2, instance.caughtSpeeding(90, false));
    Assert.assertEquals(2, instance.caughtSpeeding(90, true));
  }
}
