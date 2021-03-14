package java.com.codingbat.string3;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class is contains tests for String-3 section.
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

  /**
   * Test method for {@link String3#gHappy(String)}.
   */
  @Test
  public void testGHappy() {
    Assert.assertEquals(true, instance.gHappy("xxggxx"));
    Assert.assertEquals(false, instance.gHappy("xxgxx"));
    Assert.assertEquals(false, instance.gHappy("xxggyygxx"));
    Assert.assertEquals(false, instance.gHappy("g"));
    Assert.assertEquals(true, instance.gHappy("gg"));
    Assert.assertEquals(true, instance.gHappy("ggg"));
    Assert.assertEquals(true, instance.gHappy(""));
    Assert.assertEquals(true, instance.gHappy("xxgggxyz"));
    Assert.assertEquals(false, instance.gHappy("xxgggxyg"));
    Assert.assertEquals(true, instance.gHappy("xxgggxygg"));
    Assert.assertEquals(false, instance.gHappy("mgm"));
    Assert.assertEquals(true, instance.gHappy("mggm"));
    Assert.assertEquals(true, instance.gHappy("yyygggxyy"));
  }

  /**
   * Test method for {@link String3#countTriple(String)}.
   */
  @Test
  public void testCountTriple() {
    Assert.assertEquals(1, instance.countTriple("abcXXXabc"));
    Assert.assertEquals(3, instance.countTriple("xxxabyyyycd"));
    Assert.assertEquals(0, instance.countTriple("a"));
    Assert.assertEquals(0, instance.countTriple(""));
    Assert.assertEquals(1, instance.countTriple("XXXabc"));
    Assert.assertEquals(2, instance.countTriple("XXXXabc"));
    Assert.assertEquals(3, instance.countTriple("XXXXXabc"));
    Assert.assertEquals(3, instance.countTriple("222abyyycdXXX"));
    Assert.assertEquals(4, instance.countTriple("abYYYabXXXXXab"));
    Assert.assertEquals(0, instance.countTriple("abYYXabXXYXXab"));
    Assert.assertEquals(1, instance.countTriple("122abhhh2"));
  }

  /**
   * Test method for {@link String3#sumDigits(String)}.
   */
  @Test
  public void testSumDigits() {
    Assert.assertEquals(6, instance.sumDigits("aa1bc2d3"));
    Assert.assertEquals(8, instance.sumDigits("aa11b33"));
    Assert.assertEquals(0, instance.sumDigits("Chocolate"));
    Assert.assertEquals(7, instance.sumDigits("5hoco1a1e"));
    Assert.assertEquals(12, instance.sumDigits("123abc123"));
    Assert.assertEquals(0, instance.sumDigits(""));
    Assert.assertEquals(0, instance.sumDigits("Hello"));
    Assert.assertEquals(12, instance.sumDigits("X1z9b2"));
    Assert.assertEquals(14, instance.sumDigits("5432a"));
  }

  /**
   * Test method for {@link String3#sameEnds(String)}.
   */
  @Test
  public void testSameEnds() {
    Assert.assertEquals("ab", instance.sameEnds("abXYab"));
    Assert.assertEquals("x", instance.sameEnds("xx"));
    Assert.assertEquals("x", instance.sameEnds("xxx"));
    Assert.assertEquals("xx", instance.sameEnds("xxxx"));
    Assert.assertEquals("java", instance.sameEnds("javaXYZjava"));
    Assert.assertEquals("java", instance.sameEnds("javajava"));
    Assert.assertEquals("", instance.sameEnds("xavaXYZjava"));
    Assert.assertEquals("Hello!", instance.sameEnds("Hello! and Hello!"));
    Assert.assertEquals("y", instance.sameEnds("ynyy"));
    Assert.assertEquals("", instance.sameEnds("ynn"));
    Assert.assertEquals("", instance.sameEnds("x"));
    Assert.assertEquals("", instance.sameEnds(""));
    Assert.assertEquals("", instance.sameEnds(" "));
    Assert.assertEquals(" ", instance.sameEnds("  "));
    Assert.assertEquals("", instance.sameEnds("abcb"));
    Assert.assertEquals("my", instance.sameEnds("mymmy"));
  }

  /**
   * Test method for {@link String3#mirrorEnds(String)}.
   */
  @Test
  public void testMirrorEnds() {
    Assert.assertEquals("ab", instance.mirrorEnds("abXYZba"));
    Assert.assertEquals("a", instance.mirrorEnds("abca"));
    Assert.assertEquals("aba", instance.mirrorEnds("aba"));
    Assert.assertEquals("", instance.mirrorEnds("abab"));
    Assert.assertEquals("xxx", instance.mirrorEnds("xxx"));
    Assert.assertEquals("xxYxx", instance.mirrorEnds("xxYxx"));
    Assert.assertEquals("Hi ", instance.mirrorEnds("Hi and iH"));
    Assert.assertEquals("x", instance.mirrorEnds("x"));
    Assert.assertEquals("", instance.mirrorEnds("hi"));
    Assert.assertEquals("hih", instance.mirrorEnds("hih"));
    Assert.assertEquals("", instance.mirrorEnds(""));
    Assert.assertEquals("123", instance.mirrorEnds("123and then 321"));
    Assert.assertEquals("ba", instance.mirrorEnds("band andab"));
  }

  /**
   * Test method for {@link String3#maxBlock(String)}.
   */
  @Test
  public void testMaxBlock() {
    Assert.assertEquals(2, instance.maxBlock("hoopla"));
    Assert.assertEquals(3, instance.maxBlock("abbCCCddBBBxx"));
    Assert.assertEquals(0, instance.maxBlock(""));
    Assert.assertEquals(1, instance.maxBlock("xyz"));
    Assert.assertEquals(2, instance.maxBlock("xxyz"));
    Assert.assertEquals(2, instance.maxBlock("xyzz"));
    Assert.assertEquals(3, instance.maxBlock("abbbcbbbxbbbx"));
    Assert.assertEquals(3, instance.maxBlock("XXBBBbbxx"));
    Assert.assertEquals(4, instance.maxBlock("XXBBBBbbxx"));
    Assert.assertEquals(4, instance.maxBlock("XXBBBbbxxXXXX"));
    Assert.assertEquals(4, instance.maxBlock("XX2222BBBbbXX2222"));
  }

  /**
   * Test method for {@link String3#maxNumber(int, int)}.
   */
  @Test
  public void testMaxNumber() {
    Assert.assertEquals(0, instance.maxNumber(0, 0));
    Assert.assertEquals(3, instance.maxNumber(3, 3));
    Assert.assertEquals(3, instance.maxNumber(2, 3));
    Assert.assertEquals(3, instance.maxNumber(3, 2));
    Assert.assertEquals(4, instance.maxNumber(4, 0));
    Assert.assertEquals(4, instance.maxNumber(2, 4));
  }

  /**
   * Test method for {@link String3#sumNumbers(String)}.
   */
  @Test
  public void testSumNumbers() {
    Assert.assertEquals(123, instance.sumNumbers("abc123xyz"));
    Assert.assertEquals(44, instance.sumNumbers("aa11b33"));
    Assert.assertEquals(18, instance.sumNumbers("7 11"));
    Assert.assertEquals(0, instance.sumNumbers("Chocolate"));
    Assert.assertEquals(7, instance.sumNumbers("5hoco1a1e"));
    Assert.assertEquals(7, instance.sumNumbers("5$$1;;1!!"));
    Assert.assertEquals(1245, instance.sumNumbers("a1234bb11"));
    Assert.assertEquals(0, instance.sumNumbers(""));
    Assert.assertEquals(25, instance.sumNumbers("a22bbb3"));
  }

  /**
   * Test method for {@link String3#notReplace(String)}.
   */
  @Test
  public void testNotReplace() {
    Assert.assertEquals("is not test", instance.notReplace("is test"));
    Assert.assertEquals("is not-is not", instance.notReplace("is-is"));
    Assert.assertEquals("This is not right", instance.notReplace("This is right"));
    Assert.assertEquals("This is not isabell", instance.notReplace("This is isabell"));
    Assert.assertEquals("", instance.notReplace(""));
    Assert.assertEquals("is not", instance.notReplace("is"));
    Assert.assertEquals("isis", instance.notReplace("isis"));
    Assert.assertEquals("Dis is not bliss is not", instance.notReplace("Dis is bliss is"));
    Assert.assertEquals("is not his", instance.notReplace("is his"));
    Assert.assertEquals("xis yis", instance.notReplace("xis yis"));
    Assert.assertEquals("AAAis is not", instance.notReplace("AAAis is"));
  }
}
