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

  /**
   * Test method for {@link Recursion1#array6(int[], int)}.
   */
  @Test
  public void testArray6() {
    Assert.assertEquals(true, instance.array6(new int[] {1, 6, 4}, 0));
    Assert.assertEquals(false, instance.array6(new int[] {1, 4}, 0));
    Assert.assertEquals(true, instance.array6(new int[] {6}, 0));
    Assert.assertEquals(false, instance.array6(new int[] {}, 0));
    Assert.assertEquals(true, instance.array6(new int[] {6, 2, 2}, 0));
    Assert.assertEquals(false, instance.array6(new int[] {2, 5}, 0));
    Assert.assertEquals(true, instance.array6(new int[] {1, 9, 4, 6, 6}, 0));
    Assert.assertEquals(true, instance.array6(new int[] {2, 5, 6}, 0));
  }

  /**
   * Test method for {@link Recursion1#array11(int[], int)}.
   */
  @Test
  public void testArray11() {
    Assert.assertEquals(1, instance.array11(new int[] {1, 2, 11}, 0));
    Assert.assertEquals(2, instance.array11(new int[] {11, 11}, 0));
    Assert.assertEquals(0, instance.array11(new int[] {1, 2, 3, 4}, 0));
    Assert.assertEquals(3, instance.array11(new int[] {1, 11, 3, 11, 11}, 0));
    Assert.assertEquals(1, instance.array11(new int[] {11}, 0));
    Assert.assertEquals(0, instance.array11(new int[] {1}, 0));
    Assert.assertEquals(0, instance.array11(new int[] {}, 0));
    Assert.assertEquals(2, instance.array11(new int[] {11, 2, 3, 4, 11, 5}, 0));
    Assert.assertEquals(2, instance.array11(new int[] {11, 5, 11}, 0));
  }

  /**
   * Test method for {@link Recursion1#array220(int[], int)}.
   */
  @Test
  public void testArray220() {
    Assert.assertEquals(true, instance.array220(new int[] {1, 2, 20}, 0));
    Assert.assertEquals(true, instance.array220(new int[] {3, 30}, 0));
    Assert.assertEquals(false, instance.array220(new int[] {3}, 0));
    Assert.assertEquals(false, instance.array220(new int[] {}, 0));
    Assert.assertEquals(true, instance.array220(new int[] {3, 3, 30, 4}, 0));
    Assert.assertEquals(false, instance.array220(new int[] {2, 19, 4}, 0));
    Assert.assertEquals(false, instance.array220(new int[] {20, 19, 4}, 0));
    Assert.assertEquals(false, instance.array220(new int[] {20, 2, 21}, 0));
    Assert.assertEquals(true, instance.array220(new int[] {20, 2, 21, 210}, 0));
    Assert.assertEquals(true, instance.array220(new int[] {2, 200, 2000}, 0));
    Assert.assertEquals(true, instance.array220(new int[] {0, 0}, 0));
    Assert.assertEquals(false, instance.array220(new int[] {1, 2, 3, 4, 5, 6}, 0));
    Assert.assertEquals(true, instance.array220(new int[] {1, 2, 3, 4, 5, 50, 6}, 0));
    Assert.assertEquals(false, instance.array220(new int[] {1, 2, 3, 4, 5, 51, 6}, 0));
    Assert.assertEquals(true, instance.array220(new int[] {1, 2, 3, 4, 4, 50, 500, 6}, 0));
  }

  /**
   * Test method for {@link Recursion1#allStar(String)}.
   */
  @Test
  public void testAllStar() {
    Assert.assertEquals("h*e*l*l*o", instance.allStar("hello"));
    Assert.assertEquals("a*b*c", instance.allStar("abc"));
    Assert.assertEquals("a*b", instance.allStar("ab"));
    Assert.assertEquals("a", instance.allStar("a"));
    Assert.assertEquals("", instance.allStar(""));
    Assert.assertEquals("3*.*1*4", instance.allStar("3.14"));
    Assert.assertEquals("C*h*o*c*o*l*a*t*e", instance.allStar("Chocolate"));
    Assert.assertEquals("1*2*3*4", instance.allStar("1234"));
  }

  /**
   * Test method for {@link Recursion1#allStar(String)}.
   */
  @Test
  public void testPairStar() {
    Assert.assertEquals("hel*lo", instance.pairStar("hello"));
    Assert.assertEquals("x*xy*y", instance.pairStar("xxyy"));
    Assert.assertEquals("a*a*a*a", instance.pairStar("aaaa"));
    Assert.assertEquals("a*a*ab", instance.pairStar("aaab"));
    Assert.assertEquals("a*a", instance.pairStar("aa"));
    Assert.assertEquals("a", instance.pairStar("a"));
    Assert.assertEquals("", instance.pairStar(""));
    Assert.assertEquals("noadjacent", instance.pairStar("noadjacent"));
    Assert.assertEquals("ab*ba", instance.pairStar("abba"));
    Assert.assertEquals("ab*b*ba", instance.pairStar("abbba"));
  }

  /**
   * Test method for {@link Recursion1#endX(String)}.
   */
  @Test
  public void testEndX() {
    Assert.assertEquals("rexx", instance.endX("xxre"));
    Assert.assertEquals("hixxxx", instance.endX("xxhixx"));
    Assert.assertEquals("hihixxx", instance.endX("xhixhix"));
    Assert.assertEquals("hiy", instance.endX("hiy"));
    Assert.assertEquals("h", instance.endX("h"));
    Assert.assertEquals("x", instance.endX("x"));
    Assert.assertEquals("xx", instance.endX("xx"));
    Assert.assertEquals("", instance.endX(""));
    Assert.assertEquals("bxx", instance.endX("bxx"));
    Assert.assertEquals("baxx", instance.endX("bxax"));
    Assert.assertEquals("aaaxxx", instance.endX("axaxax"));
    Assert.assertEquals("hixxx", instance.endX("xxhxi"));
  }

  /**
   * Test method for {@link Recursion1#countPairs(String)}.
   */
  @Test
  public void testCountPairs() {
    Assert.assertEquals(1, instance.countPairs("axa"));
    Assert.assertEquals(2, instance.countPairs("axax"));
    Assert.assertEquals(1, instance.countPairs("axbx"));
    Assert.assertEquals(0, instance.countPairs("hi"));
    Assert.assertEquals(3, instance.countPairs("hihih"));
    Assert.assertEquals(3, instance.countPairs("ihihhh"));
    Assert.assertEquals(0, instance.countPairs("ihjxhh"));
    Assert.assertEquals(0, instance.countPairs(""));
    Assert.assertEquals(0, instance.countPairs("a"));
    Assert.assertEquals(0, instance.countPairs("aa"));
    Assert.assertEquals(1, instance.countPairs("aaa"));
  }

  /**
   * Test method for {@link Recursion1#countAbc(String)}.
   */
  @Test
  public void testCountAbc() {
    Assert.assertEquals(1, instance.countAbc("abc"));
    Assert.assertEquals(2, instance.countAbc("abcxxabc"));
    Assert.assertEquals(2, instance.countAbc("abaxxaba"));
    Assert.assertEquals(2, instance.countAbc("ababc"));
    Assert.assertEquals(0, instance.countAbc("abxbc"));
    Assert.assertEquals(1, instance.countAbc("aaabc"));
    Assert.assertEquals(0, instance.countAbc("hello"));
    Assert.assertEquals(0, instance.countAbc(""));
    Assert.assertEquals(0, instance.countAbc("ab"));
    Assert.assertEquals(1, instance.countAbc("aba"));
    Assert.assertEquals(0, instance.countAbc("aca"));
    Assert.assertEquals(0, instance.countAbc("aaa"));
  }

  /**
   * Test method for {@link Recursion1#count11(String)}.
   */
  @Test
  public void testCount11() {
    Assert.assertEquals(2, instance.count11("11abc11"));
    Assert.assertEquals(3, instance.count11("abc11x11x11"));
    Assert.assertEquals(1, instance.count11("111"));
    Assert.assertEquals(2, instance.count11("1111"));
    Assert.assertEquals(0, instance.count11("1"));
    Assert.assertEquals(0, instance.count11(""));
    Assert.assertEquals(0, instance.count11("hi"));
    Assert.assertEquals(4, instance.count11("11x111x1111"));
    Assert.assertEquals(1, instance.count11("1x111"));
    Assert.assertEquals(0, instance.count11("1Hello1"));
    Assert.assertEquals(0, instance.count11("Hello"));
  }

  /**
   * Test method for {@link Recursion1#stringClean(String)}.
   */
  @Test
  public void testStringClean() {
    Assert.assertEquals("yza", instance.stringClean("yyzzza"));
    Assert.assertEquals("abcd", instance.stringClean("abbbcdd"));
    Assert.assertEquals("Helo", instance.stringClean("Hello"));
    Assert.assertEquals("XabcY", instance.stringClean("XXabcYY"));
    Assert.assertEquals("12ab45", instance.stringClean("112ab445"));
    Assert.assertEquals("Helo Bokeper", instance.stringClean("Hello Bookkeeper"));
  }

  /**
   * Test method for {@link Recursion1#countHi2(String)}.
   */
  @Test
  public void testCountHi2() {
    Assert.assertEquals(1, instance.countHi2("ahixhi"));
    Assert.assertEquals(2, instance.countHi2("ahibhi"));
    Assert.assertEquals(0, instance.countHi2("xhixhi"));
    Assert.assertEquals(1, instance.countHi2("hixhi"));
    Assert.assertEquals(2, instance.countHi2("hixhhi"));
    Assert.assertEquals(3, instance.countHi2("hihihi"));
    Assert.assertEquals(3, instance.countHi2("hihihix"));
    Assert.assertEquals(2, instance.countHi2("xhihihix"));
    Assert.assertEquals(0, instance.countHi2("xxhi"));
    Assert.assertEquals(1, instance.countHi2("hixxhi"));
    Assert.assertEquals(1, instance.countHi2("hi"));
    Assert.assertEquals(0, instance.countHi2("xxxx"));
    Assert.assertEquals(0, instance.countHi2("h"));
    Assert.assertEquals(0, instance.countHi2("x"));
    Assert.assertEquals(0, instance.countHi2(""));
    Assert.assertEquals(1, instance.countHi2("Hellohi"));
  }

  /**
   * Test method for {@link Recursion1#parenBit(String)}.
   */
  @Test
  public void testParenBit() {
    Assert.assertEquals("(abc)", instance.parenBit("xyz(abc)123"));
    Assert.assertEquals("(hello)", instance.parenBit("x(hello)"));
    Assert.assertEquals("(xy)", instance.parenBit("(xy)1"));
    Assert.assertEquals("(possible)", instance.parenBit("not really (possible)"));
    Assert.assertEquals("(abc)", instance.parenBit("(abc)"));
    Assert.assertEquals("(abc)", instance.parenBit("(abc)xyz"));
    Assert.assertEquals("(abc)", instance.parenBit("(abc)x"));
    Assert.assertEquals("(x)", instance.parenBit("(x)"));
    Assert.assertEquals("()", instance.parenBit("()"));
    Assert.assertEquals("(ipsa)", instance.parenBit("res (ipsa) loquitor"));
    Assert.assertEquals("(not really)", instance.parenBit("hello(not really)there"));
    Assert.assertEquals("(ab)", instance.parenBit("ab(ab)ab"));
  }

  /**
   * Test method for {@link Recursion1#nestParen(String)}.
   */
  @Test
  public void testNestParen() {
    Assert.assertEquals(true, instance.nestParen("(())"));
    Assert.assertEquals(true, instance.nestParen("((()))"));
    Assert.assertEquals(false, instance.nestParen("(((x))"));
    Assert.assertEquals(false, instance.nestParen("((())"));
    Assert.assertEquals(false, instance.nestParen("((()()"));
    Assert.assertEquals(true, instance.nestParen("()"));
    Assert.assertEquals(true, instance.nestParen(""));
    Assert.assertEquals(false, instance.nestParen("(yy)"));
    Assert.assertEquals(true, instance.nestParen("(())"));
    Assert.assertEquals(false, instance.nestParen("(((y))"));
    Assert.assertEquals(false, instance.nestParen("((y)))"));
    Assert.assertEquals(true, instance.nestParen("((()))"));
    Assert.assertEquals(false, instance.nestParen("(())))"));
    Assert.assertEquals(false, instance.nestParen("((yy())))"));
    Assert.assertEquals(true, instance.nestParen("(((())))"));
  }

  /**
   * Test method for {@link Recursion1#strCount(String, String)}.
   */
  @Test
  public void testStrCount() {
    Assert.assertEquals(0, instance.strCount("", ""));
    Assert.assertEquals(0, instance.strCount("", "cat"));
    Assert.assertEquals(0, instance.strCount("catcowcat", ""));
    Assert.assertEquals(2, instance.strCount("catcowcat", "cat"));
    Assert.assertEquals(1, instance.strCount("catcowcat", "cow"));
    Assert.assertEquals(0, instance.strCount("catcowcat", "dog"));
    Assert.assertEquals(2, instance.strCount("cacatcowcat", "cat"));
    Assert.assertEquals(2, instance.strCount("xyx", "x"));
    Assert.assertEquals(4, instance.strCount("iiiijj", "i"));
    Assert.assertEquals(2, instance.strCount("iiiijj", "ii"));
    Assert.assertEquals(1, instance.strCount("iiiijj", "iii"));
    Assert.assertEquals(2, instance.strCount("iiiijj", "j"));
    Assert.assertEquals(1, instance.strCount("iiiijj", "jj"));
    Assert.assertEquals(4, instance.strCount("aaabababab", "ab"));
    Assert.assertEquals(1, instance.strCount("aaabababab", "aa"));
    Assert.assertEquals(6, instance.strCount("aaabababab", "a"));
    Assert.assertEquals(4, instance.strCount("aaabababab", "b"));
  }

  /**
   * Test method for {@link Recursion1#strCopies(String, String, int)}.
   */
  @Test
  public void testStrCopies() {
    Assert.assertEquals(true, instance.strCopies("catcowcat", "cat", 2));
    Assert.assertEquals(false, instance.strCopies("catcowcat", "cow", 2));
    Assert.assertEquals(true, instance.strCopies("catcowcat", "cow", 1));
    Assert.assertEquals(true, instance.strCopies("iiijjj", "i", 3));
    Assert.assertEquals(false, instance.strCopies("iiijjj", "i", 4));
    Assert.assertEquals(true, instance.strCopies("iiijjj", "ii", 2));
    Assert.assertEquals(false, instance.strCopies("iiijjj", "ii", 3));
    Assert.assertEquals(false, instance.strCopies("iiijjj", "x", 3));
    Assert.assertEquals(true, instance.strCopies("iiijjj", "x", 0));
    Assert.assertEquals(true, instance.strCopies("iiiiij", "iii", 3));
    Assert.assertEquals(false, instance.strCopies("iiiiij", "iii", 4));
    Assert.assertEquals(true, instance.strCopies("ijiiiiij", "iiii", 2));
    Assert.assertEquals(false, instance.strCopies("ijiiiiij", "iiii", 4));
    Assert.assertEquals(true, instance.strCopies("dogcatdogcat", "dog", 2));
  }

  /**
   * Test method for {@link Recursion1#strDist(String, String)}.
   */
  @Test
  public void testStrDist() {
    Assert.assertEquals(9, instance.strDist("catcowcat", "cat"));
    Assert.assertEquals(3, instance.strDist("catcowcat", "cow"));
    Assert.assertEquals(9, instance.strDist("cccatcowcatxx", "cat"));
    Assert.assertEquals(12, instance.strDist("abccatcowcatcatxyz", "cat"));
    Assert.assertEquals(3, instance.strDist("xyx", "x"));
    Assert.assertEquals(1, instance.strDist("xyx", "y"));
    Assert.assertEquals(0, instance.strDist("xyx", "z"));
    Assert.assertEquals(1, instance.strDist("z", "z"));
    Assert.assertEquals(0, instance.strDist("x", "z"));
    Assert.assertEquals(0, instance.strDist("x", ""));
    Assert.assertEquals(0, instance.strDist("", "z"));
    Assert.assertEquals(13, instance.strDist("hiHellohihihi", "hi"));
    Assert.assertEquals(5, instance.strDist("hiHellohihihi", "hih"));
    Assert.assertEquals(1, instance.strDist("hiHellohihihi", "o"));
    Assert.assertEquals(2, instance.strDist("hiHellohihihi", "ll"));
  }
}
