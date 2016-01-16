package com.codingbat.ap1;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class AP1Test is contains tests for AP-1 section.
 */
public class AP1Test {

  /** The instance variable to test the not static methods. */
  private static AP1 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new AP1();
  }

  /**
   * Test method for {@link AP1#scoresIncreasing(int[])}.
   */
  @Test
  public void testScoresIncreasing() {
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {1, 3, 4}));
    Assert.assertEquals(false, instance.scoresIncreasing(new int[] {1, 3, 2}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {1, 1, 4}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {1, 1, 2, 4, 4, 7}));
    Assert.assertEquals(false, instance.scoresIncreasing(new int[] {1, 1, 2, 4, 3, 7}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {-5, 4, 11}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {0, 0, 0}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {-19, -18, -10}));
  }

}
