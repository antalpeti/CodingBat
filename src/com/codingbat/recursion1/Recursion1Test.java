package com.codingbat.recursion1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class Recursion1 is contains tests for Recursion-1 section.
 */
public class Recursion1Test {

  /** The instance variable to test the not static methods. */
  private static Recursion1 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new Recursion1();
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
   * Test method for {@link Recursion1#factorial(int)}.
   */
  @Test
  public void testFactorial() {
    Assert.assertEquals(1, instance.factorial(0));
    Assert.assertEquals(1, instance.factorial(1));
    Assert.assertEquals(2, instance.factorial(2));
    Assert.assertEquals(6, instance.factorial(3));
    Assert.assertEquals(24, instance.factorial(4));
    Assert.assertEquals(120, instance.factorial(5));
    Assert.assertEquals(720, instance.factorial(6));
    Assert.assertEquals(5040, instance.factorial(7));
    Assert.assertEquals(40320, instance.factorial(8));
    Assert.assertEquals(362880, instance.factorial(9));
    Assert.assertEquals(3628800, instance.factorial(10));
    Assert.assertEquals(39916800, instance.factorial(11));
    Assert.assertEquals(479001600, instance.factorial(12));
  }

  /**
   * Test method for {@link Recursion1#bunnyEars(int)}.
   */
  @Test
  public void testBunnyEars() {
    Assert.assertEquals(0, instance.bunnyEars(0));
    Assert.assertEquals(2, instance.bunnyEars(1));
    Assert.assertEquals(4, instance.bunnyEars(2));
    Assert.assertEquals(6, instance.bunnyEars(3));
    Assert.assertEquals(8, instance.bunnyEars(4));
    Assert.assertEquals(10, instance.bunnyEars(5));
    Assert.assertEquals(24, instance.bunnyEars(12));
    Assert.assertEquals(100, instance.bunnyEars(50));
    Assert.assertEquals(468, instance.bunnyEars(234));
    Assert.assertEquals(500, instance.bunnyEars(250));
  }
}
