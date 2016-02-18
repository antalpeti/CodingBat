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

  /**
   * Test method for {@link Recursion1#fibonacci(int)}.
   */
  @Test
  public void testFibonacci() {
    Assert.assertEquals(0, instance.fibonacci(0));
    Assert.assertEquals(1, instance.fibonacci(1));
    Assert.assertEquals(1, instance.fibonacci(2));
    Assert.assertEquals(2, instance.fibonacci(3));
    Assert.assertEquals(3, instance.fibonacci(4));
    Assert.assertEquals(5, instance.fibonacci(5));
    Assert.assertEquals(8, instance.fibonacci(6));
    Assert.assertEquals(13, instance.fibonacci(7));
    Assert.assertEquals(21, instance.fibonacci(8));
    Assert.assertEquals(34, instance.fibonacci(9));
    Assert.assertEquals(55, instance.fibonacci(10));
  }

  /**
   * Test method for {@link Recursion1#triangle(int)}.
   */
  @Test
  public void testTriangle() {
    Assert.assertEquals(0, instance.triangle(0));
    Assert.assertEquals(1, instance.fibonacci(1));
    Assert.assertEquals(3, instance.triangle(2));
    Assert.assertEquals(6, instance.triangle(3));
    Assert.assertEquals(10, instance.triangle(4));
    Assert.assertEquals(15, instance.triangle(5));
    Assert.assertEquals(21, instance.triangle(6));
    Assert.assertEquals(28, instance.triangle(7));
    Assert.assertEquals(36, instance.triangle(8));
    Assert.assertEquals(45, instance.triangle(9));
    Assert.assertEquals(55, instance.triangle(10));
  }

  /**
   * Test method for {@link Recursion1#sumDigits(int)}.
   */
  @Test
  public void testSumDigits() {
    Assert.assertEquals(9, instance.sumDigits(126));
    Assert.assertEquals(13, instance.sumDigits(49));
    Assert.assertEquals(3, instance.sumDigits(12));
    Assert.assertEquals(1, instance.sumDigits(10));
    Assert.assertEquals(1, instance.sumDigits(1));
    Assert.assertEquals(0, instance.sumDigits(0));
    Assert.assertEquals(10, instance.sumDigits(730));
    Assert.assertEquals(4, instance.sumDigits(1111));
    Assert.assertEquals(5, instance.sumDigits(11111));
    Assert.assertEquals(3, instance.sumDigits(10110));
    Assert.assertEquals(10, instance.sumDigits(235));
  }

  /**
   * Test method for {@link Recursion1#count7(int)}.
   */
  @Test
  public void testCount7() {
    Assert.assertEquals(2, instance.count7(717));
    Assert.assertEquals(1, instance.count7(7));
    Assert.assertEquals(0, instance.count7(123));
    Assert.assertEquals(2, instance.count7(77));
    Assert.assertEquals(1, instance.count7(7123));
    Assert.assertEquals(3, instance.count7(771237));
    Assert.assertEquals(4, instance.count7(771737));
    Assert.assertEquals(2, instance.count7(47571));
    Assert.assertEquals(6, instance.count7(777777));
    Assert.assertEquals(4, instance.count7(70701277));
    Assert.assertEquals(5, instance.count7(777576197));
    Assert.assertEquals(0, instance.count7(99999));
    Assert.assertEquals(1, instance.count7(99799));
  }

  /**
   * Test method for {@link Recursion1#count8(int)}.
   */
  @Test
  public void testCount8() {
    Assert.assertEquals(1, instance.count8(8));
    Assert.assertEquals(2, instance.count8(818));
    Assert.assertEquals(4, instance.count8(8818));
    Assert.assertEquals(4, instance.count8(8088));
    Assert.assertEquals(0, instance.count8(123));
    Assert.assertEquals(2, instance.count8(81238));
    Assert.assertEquals(6, instance.count8(88788));
    Assert.assertEquals(1, instance.count8(8234));
    Assert.assertEquals(1, instance.count8(2348));
    Assert.assertEquals(3, instance.count8(23884));
    Assert.assertEquals(0, instance.count8(0));
    Assert.assertEquals(5, instance.count8(1818188));
    Assert.assertEquals(5, instance.count8(8818181));
    Assert.assertEquals(1, instance.count8(1080));
    Assert.assertEquals(3, instance.count8(188));
    Assert.assertEquals(9, instance.count8(88888));
    Assert.assertEquals(2, instance.count8(9898));
    Assert.assertEquals(1, instance.count8(78));
  }

  /**
   * Test method for {@link Recursion1#powerN(int, int)}.
   */
  @Test
  public void testPowerN() {
    Assert.assertEquals(3, instance.powerN(3, 1));
    Assert.assertEquals(9, instance.powerN(3, 2));
    Assert.assertEquals(27, instance.powerN(3, 3));
    Assert.assertEquals(2, instance.powerN(2, 1));
    Assert.assertEquals(4, instance.powerN(2, 2));
    Assert.assertEquals(8, instance.powerN(2, 3));
    Assert.assertEquals(16, instance.powerN(2, 4));
    Assert.assertEquals(32, instance.powerN(2, 5));
    Assert.assertEquals(10, instance.powerN(10, 1));
    Assert.assertEquals(100, instance.powerN(10, 2));
    Assert.assertEquals(1000, instance.powerN(10, 3));
  }

  /**
   * Test method for {@link Recursion1#countX(String)}.
   */
  @Test
  public void testCountX() {
    Assert.assertEquals(4, instance.countX("xxhixx"));
    Assert.assertEquals(3, instance.countX("xhixhix"));
    Assert.assertEquals(0, instance.countX("hi"));
    Assert.assertEquals(0, instance.countX("h"));
    Assert.assertEquals(1, instance.countX("x"));
    Assert.assertEquals(0, instance.countX("hihi"));
    Assert.assertEquals(0, instance.countX("hiAAhi12hi"));
  }

  /**
   * Test method for {@link Recursion1#countX(String)}.
   */
  @Test
  public void testCountHi() {
    Assert.assertEquals(1, instance.countHi("xxhixx"));
    Assert.assertEquals(2, instance.countHi("xhixhix"));
    Assert.assertEquals(1, instance.countHi("hi"));
    Assert.assertEquals(2, instance.countHi("hihih"));
    Assert.assertEquals(0, instance.countHi("h"));
    Assert.assertEquals(0, instance.countHi(""));
    Assert.assertEquals(4, instance.countHi("ihihihihih"));
    Assert.assertEquals(5, instance.countHi("ihihihihihi"));
    Assert.assertEquals(3, instance.countHi("hiAAhi12hi"));
    Assert.assertEquals(3, instance.countHi("xhixhxihihhhih"));
    Assert.assertEquals(1, instance.countHi("ship"));
  }

  /**
   * Test method for {@link Recursion1#changeXY(String)}.
   */
  @Test
  public void testChangeXY() {
    Assert.assertEquals("codey", instance.changeXY("codex"));
    Assert.assertEquals("yyhiyy", instance.changeXY("xxhixx"));
    Assert.assertEquals("yhiyhiy", instance.changeXY("xhixhix"));
    Assert.assertEquals("hiy", instance.changeXY("hiy"));
    Assert.assertEquals("h", instance.changeXY("h"));
    Assert.assertEquals("y", instance.changeXY("x"));
    Assert.assertEquals("", instance.changeXY(""));
    Assert.assertEquals("yyy", instance.changeXY("xxx"));
    Assert.assertEquals("yyhyyi", instance.changeXY("yyhxyi"));
    Assert.assertEquals("hihi", instance.changeXY("hihi"));
  }

  /**
   * Test method for {@link Recursion1#changePi(String)}.
   */
  @Test
  public void testChangePi() {
    Assert.assertEquals("x3.14x", instance.changePi("xpix"));
    Assert.assertEquals("3.143.14", instance.changePi("pipi"));
    Assert.assertEquals("3.14p", instance.changePi("pip"));
    Assert.assertEquals("3.14", instance.changePi("pi"));
    Assert.assertEquals("hip", instance.changePi("hip"));
    Assert.assertEquals("p", instance.changePi("p"));
    Assert.assertEquals("x", instance.changePi("x"));
    Assert.assertEquals("", instance.changePi(""));
    Assert.assertEquals("3.14xx", instance.changePi("pixx"));
    Assert.assertEquals("xyzzy", instance.changePi("xyzzy"));
  }

  /**
   * Test method for {@link Recursion1#noX(String)}.
   */
  @Test
  public void testNoX() {
    Assert.assertEquals("ab", instance.noX("xaxb"));
    Assert.assertEquals("abc", instance.noX("abc"));
    Assert.assertEquals("", instance.noX("xx"));
    Assert.assertEquals("", instance.noX(""));
    Assert.assertEquals("ab", instance.noX("axxbxx"));
    Assert.assertEquals("Hello", instance.noX("Hellox"));
  }
}
