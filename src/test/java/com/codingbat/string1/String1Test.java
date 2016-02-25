package test.java.com.codingbat.string1;

import main.java.com.codingbat.string1.String1;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

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

  /**
   * Test method for {@link String1#comboString(String, String)}.
   */
  @Test
  public void testComboString() {
    Assert.assertEquals("hiHellohi", instance.comboString("Hello", "hi"));
    Assert.assertEquals("hiHellohi", instance.comboString("hi", "Hello"));
    Assert.assertEquals("baaab", instance.comboString("aaa", "b"));
    Assert.assertEquals("baaab", instance.comboString("b", "aaa"));
    Assert.assertEquals("aaa", instance.comboString("", "aaa"));
    Assert.assertEquals("aaa", instance.comboString("aaa", ""));
    Assert.assertEquals("bb", instance.comboString("", "bb"));
    Assert.assertEquals("bb", instance.comboString("bb", ""));
    Assert.assertEquals("c", instance.comboString("", "c"));
    Assert.assertEquals("c", instance.comboString("c", ""));
    Assert.assertEquals("", instance.comboString("", ""));
    Assert.assertEquals("aaa1234aaa", instance.comboString("aaa", "1234"));
    Assert.assertEquals("aaa1234aaa", instance.comboString("1234", "aaa"));
    Assert.assertEquals("bbaaabb", instance.comboString("aaa", "bb"));
    Assert.assertEquals("bbaaabb", instance.comboString("bb", "aaa"));
    Assert.assertEquals("abba", instance.comboString("bb", "a"));
    Assert.assertEquals("abba", instance.comboString("a", "bb"));
    Assert.assertEquals("abxyzab", instance.comboString("xyz", "ab"));
  }

  /**
   * Test method for {@link String1#nonStart(String, String)}.
   */
  @Test
  public void testNonStart() {
    Assert.assertEquals("ellohere", instance.nonStart("Hello", "There"));
    Assert.assertEquals("avaode", instance.nonStart("java", "code"));
    Assert.assertEquals("hotlava", instance.nonStart("shotl", "java"));
    Assert.assertEquals("by", instance.nonStart("ab", "xy"));
    Assert.assertEquals("b", instance.nonStart("ab", "x"));
    Assert.assertEquals("c", instance.nonStart("x", "ac"));
    Assert.assertEquals("", instance.nonStart("x", "a"));
    Assert.assertEquals("", instance.nonStart("a", "x"));
    Assert.assertEquals("", instance.nonStart("", "x"));
    Assert.assertEquals("", instance.nonStart("a", ""));
    Assert.assertEquals("itat", instance.nonStart("kit", "kat"));
    Assert.assertEquals("artart", instance.nonStart("mart", "dart"));
  }

  /**
   * Test method for {@link String1#left2(String)}.
   */
  @Test
  public void testLeft2() {
    Assert.assertEquals("lloHe", instance.left2("Hello"));
    Assert.assertEquals("vaja", instance.left2("java"));
    Assert.assertEquals("Hi", instance.left2("Hi"));
    Assert.assertEquals("deco", instance.left2("code"));
    Assert.assertEquals("tca", instance.left2("cat"));
    Assert.assertEquals("34512", instance.left2("12345"));
    Assert.assertEquals("ocolateCh", instance.left2("Chocolate"));
    Assert.assertEquals("icksbr", instance.left2("bricks"));
  }

  /**
   * Test method for {@link String1#right2(String)}.
   */
  @Test
  public void testRight2() {
    Assert.assertEquals("loHel", instance.right2("Hello"));
    Assert.assertEquals("vaja", instance.right2("java"));
    Assert.assertEquals("Hi", instance.right2("Hi"));
    Assert.assertEquals("deco", instance.right2("code"));
    Assert.assertEquals("atc", instance.right2("cat"));
    Assert.assertEquals("45123", instance.right2("12345"));
  }

  /** Helper to test the */
  @Rule
  public final ExpectedException exception = ExpectedException.none();

  /**
   * Test method for {@link String1#theEnd(String, boolean)}.
   */
  @Test
  public void testTheEnd() {
    Assert.assertEquals("H", instance.theEnd("Hello", true));
    Assert.assertEquals("o", instance.theEnd("Hello", false));
    Assert.assertEquals("o", instance.theEnd("oh", true));
    Assert.assertEquals("h", instance.theEnd("oh", false));
    Assert.assertEquals("x", instance.theEnd("x", true));
    Assert.assertEquals("x", instance.theEnd("x", false));
    Assert.assertEquals("j", instance.theEnd("java", true));
    Assert.assertEquals("e", instance.theEnd("chocolate", false));
    Assert.assertEquals("C", instance.theEnd("Chocolate", true));
    Assert.assertEquals("1", instance.theEnd("1234", true));
    Assert.assertEquals("4", instance.theEnd("1234", false));
    Assert.assertEquals("e", instance.theEnd("code", false));
    exception.expect(StringIndexOutOfBoundsException.class);
    Assert.assertEquals("", instance.theEnd("", true));
  }

  /**
   * Test method for {@link String1#withouEnd2(String)}.
   */
  @Test
  public void testWithouEnd2() {
    Assert.assertEquals("ell", instance.withouEnd2("Hello"));
    Assert.assertEquals("b", instance.withouEnd2("abc"));
    Assert.assertEquals("", instance.withouEnd2("ab"));
    Assert.assertEquals("", instance.withouEnd2("a"));
    Assert.assertEquals("", instance.withouEnd2(""));
    Assert.assertEquals("old", instance.withouEnd2("coldy"));
    Assert.assertEquals("ava cod", instance.withouEnd2("java code"));
  }

  /**
   * Test method for {@link String1#middleTwo(String)}.
   */
  @Test
  public void testMiddleTwo() {
    Assert.assertEquals("ri", instance.middleTwo("string"));
    Assert.assertEquals("od", instance.middleTwo("code"));
    Assert.assertEquals("ct", instance.middleTwo("Practice"));
    Assert.assertEquals("ab", instance.middleTwo("ab"));
    Assert.assertEquals("45", instance.middleTwo("0123456789"));
    Assert.assertEquals("x", instance.middleTwo("x"));
    Assert.assertEquals("", instance.middleTwo(""));
  }

  /**
   * Test method for {@link String1#endsLy(String)}.
   */
  @Test
  public void testEndsLy() {
    Assert.assertEquals(true, instance.endsLy("oddly"));
    Assert.assertEquals(false, instance.endsLy("y"));
    Assert.assertEquals(false, instance.endsLy("oddy"));
    Assert.assertEquals(false, instance.endsLy("oddl"));
    Assert.assertEquals(false, instance.endsLy("olydd"));
    Assert.assertEquals(true, instance.endsLy("ly"));
    Assert.assertEquals(false, instance.endsLy(""));
    Assert.assertEquals(false, instance.endsLy("falsey"));
    Assert.assertEquals(true, instance.endsLy("evenly"));
  }

  /**
   * Test method for {@link String1#nTwice(String, int)}.
   */
  @Test
  public void testNTwice() {
    Assert.assertEquals("Helo", instance.nTwice("Hello", 2));
    Assert.assertEquals("Choate", instance.nTwice("Chocolate", 3));
    Assert.assertEquals("Ce", instance.nTwice("Chocolate", 1));
    Assert.assertEquals("", instance.nTwice("Chocolate", 0));
    Assert.assertEquals("Hellello", instance.nTwice("Hello", 4));
    Assert.assertEquals("CodeCode", instance.nTwice("Code", 4));
    Assert.assertEquals("Code", instance.nTwice("Code", 2));
    Assert.assertEquals("Code", instance.nTwice("Code", 5));
    Assert.assertEquals("A", instance.nTwice("A", 2));
  }

  /**
   * Test method for {@link String1#twoChar(String, int)}.
   */
  @Test
  public void testTwoChar() {
    Assert.assertEquals("ja", instance.twoChar("java", 0));
    Assert.assertEquals("va", instance.twoChar("java", 2));
    Assert.assertEquals("ja", instance.twoChar("java", 3));
    Assert.assertEquals("ja", instance.twoChar("java", 4));
    Assert.assertEquals("ja", instance.twoChar("java", -1));
    Assert.assertEquals("He", instance.twoChar("Hello", 0));
    Assert.assertEquals("el", instance.twoChar("Hello", 1));
    Assert.assertEquals("He", instance.twoChar("Hello", 99));
    Assert.assertEquals("lo", instance.twoChar("Hello", 3));
    Assert.assertEquals("He", instance.twoChar("Hello", 4));
    Assert.assertEquals("He", instance.twoChar("Hello", 5));
    Assert.assertEquals("He", instance.twoChar("Hello", -7));
    Assert.assertEquals("He", instance.twoChar("Hello", 6));
    Assert.assertEquals("He", instance.twoChar("Hello", -1));
    Assert.assertEquals("ya", instance.twoChar("yay", 0));
    Assert.assertEquals("fo", instance.twoChar("foo", -1));
    Assert.assertEquals("fo", instance.twoChar("foo", 0));
    Assert.assertEquals("oo", instance.twoChar("foo", 1));
    Assert.assertEquals("fo", instance.twoChar("foo", 2));
    Assert.assertEquals("fo", instance.twoChar("foo", 3));
    Assert.assertEquals("fo", instance.twoChar("fo", -1));
    Assert.assertEquals("fo", instance.twoChar("fo", 0));
    Assert.assertEquals("fo", instance.twoChar("fo", 1));
  }

  /**
   * Test method for {@link String1#middleThree(String)}.
   */
  @Test
  public void testMiddleThree() {
    Assert.assertEquals("and", instance.middleThree("Candy"));
    Assert.assertEquals("and", instance.middleThree("and"));
    Assert.assertEquals("lvi", instance.middleThree("solving"));
    Assert.assertEquals("yet", instance.middleThree("Hi yet Hi"));
    Assert.assertEquals("yet", instance.middleThree("java yet java"));
    Assert.assertEquals("col", instance.middleThree("Chocolate"));
    Assert.assertEquals("xyz", instance.middleThree("XabcxyzabcX"));
    Assert.assertEquals("ab", instance.middleThree("ab"));
    Assert.assertEquals("a", instance.middleThree("a"));
    Assert.assertEquals("", instance.middleThree(""));
  }

  /**
   * Test method for {@link String1#hasBad(String)}.
   */
  @Test
  public void testHasBad() {
    Assert.assertEquals(true, instance.hasBad("badxx"));
    Assert.assertEquals(true, instance.hasBad("xbadxx"));
    Assert.assertEquals(false, instance.hasBad("xxbadxx"));
    Assert.assertEquals(false, instance.hasBad("code"));
    Assert.assertEquals(true, instance.hasBad("bad"));
    Assert.assertEquals(false, instance.hasBad("ba"));
    Assert.assertEquals(false, instance.hasBad("xba"));
    Assert.assertEquals(true, instance.hasBad("xbad"));
    Assert.assertEquals(false, instance.hasBad(""));
    Assert.assertEquals(true, instance.hasBad("badyy"));
  }

  /**
   * Test method for {@link String1#atFirst(String)}.
   */
  @Test
  public void testAtFirst() {
    Assert.assertEquals("he", instance.atFirst("hello"));
    Assert.assertEquals("hi", instance.atFirst("hi"));
    Assert.assertEquals("h@", instance.atFirst("h"));
    Assert.assertEquals("@@", instance.atFirst(""));
    Assert.assertEquals("ki", instance.atFirst("kitten"));
    Assert.assertEquals("ja", instance.atFirst("java"));
    Assert.assertEquals("j@", instance.atFirst("j"));
  }

  /**
   * Test method for {@link String1#lastChars(String, String)}.
   */
  @Test
  public void testLastChars() {
    Assert.assertEquals("ls", instance.lastChars("last", "chars"));
    Assert.assertEquals("ya", instance.lastChars("yo", "java"));
    Assert.assertEquals("h@", instance.lastChars("hi", ""));
    Assert.assertEquals("@o", instance.lastChars("", "hello"));
    Assert.assertEquals("@@", instance.lastChars("", ""));
    Assert.assertEquals("ki", instance.lastChars("kitten", "hi"));
    Assert.assertEquals("kp", instance.lastChars("k", "zip"));
    Assert.assertEquals("k@", instance.lastChars("kitten", ""));
    Assert.assertEquals("kp", instance.lastChars("kitten", "zip"));
  }

  /**
   * Test method for {@link String1#conCat(String, String)}.
   */
  @Test
  public void testConCat() {
    Assert.assertEquals("abcat", instance.conCat("abc", "cat"));
    Assert.assertEquals("abc", instance.conCat("abc", ""));
    Assert.assertEquals("cat", instance.conCat("", "cat"));
    Assert.assertEquals("pig", instance.conCat("pig", "g"));
    Assert.assertEquals("pig", instance.conCat("p", "pig"));
    Assert.assertEquals("pigdoggy", instance.conCat("pig", "doggy"));
    Assert.assertEquals("", instance.conCat("", ""));
    Assert.assertEquals("c", instance.conCat("c", "c"));
  }

  /**
   * Test method for {@link String1#lastTwo(String)}.
   */
  @Test
  public void testLastTwo() {
    Assert.assertEquals("codign", instance.lastTwo("coding"));
    Assert.assertEquals("cta", instance.lastTwo("cat"));
    Assert.assertEquals("ba", instance.lastTwo("ab"));
    Assert.assertEquals("21", instance.lastTwo("12"));
    Assert.assertEquals("a", instance.lastTwo("a"));
    Assert.assertEquals("", instance.lastTwo(""));
  }

  /**
   * Test method for {@link String1#seeColor(String)}.
   */
  @Test
  public void testSeeColor() {
    Assert.assertEquals("red", instance.seeColor("redxx"));
    Assert.assertEquals("", instance.seeColor("xxred"));
    Assert.assertEquals("blue", instance.seeColor("blueTimes"));
    Assert.assertEquals("", instance.seeColor("NoColor"));
    Assert.assertEquals("red", instance.seeColor("red"));
    Assert.assertEquals("", instance.seeColor("re"));
    Assert.assertEquals("", instance.seeColor("blu"));
    Assert.assertEquals("blue", instance.seeColor("blue"));
    Assert.assertEquals("", instance.seeColor("a"));
    Assert.assertEquals("", instance.seeColor(""));
    Assert.assertEquals("", instance.seeColor("xyzred"));
  }

  /**
   * Test method for {@link String1#frontAgain(String)}.
   */
  @Test
  public void testFrontAgain() {
    Assert.assertEquals(true, instance.frontAgain("edited"));
    Assert.assertEquals(false, instance.frontAgain("edit"));
    Assert.assertEquals(true, instance.frontAgain("ed"));
    Assert.assertEquals(true, instance.frontAgain("jj"));
    Assert.assertEquals(true, instance.frontAgain("jjj"));
    Assert.assertEquals(false, instance.frontAgain("jjjk"));
    Assert.assertEquals(false, instance.frontAgain("x"));
    Assert.assertEquals(false, instance.frontAgain(""));
    Assert.assertEquals(false, instance.frontAgain("java"));
    Assert.assertEquals(true, instance.frontAgain("javaja"));
  }

  /**
   * Test method for {@link String1#minCat(String, String)}.
   */
  @Test
  public void testMinCat() {
    Assert.assertEquals("loHi", instance.minCat("Hello", "Hi"));
    Assert.assertEquals("ellojava", instance.minCat("Hello", "java"));
    Assert.assertEquals("javaello", instance.minCat("java", "Hello"));
    Assert.assertEquals("cx", instance.minCat("abc", "x"));
    Assert.assertEquals("xc", instance.minCat("x", "abc"));
    Assert.assertEquals("", instance.minCat("abc", ""));
    Assert.assertEquals("", instance.minCat("", ""));
  }

  /**
   * Test method for {@link String1#extraFront(String)}.
   */
  @Test
  public void testExtraFont() {
    Assert.assertEquals("HeHeHe", instance.extraFront("Hello"));
    Assert.assertEquals("ababab", instance.extraFront("ab"));
    Assert.assertEquals("HHH", instance.extraFront("H"));
    Assert.assertEquals("", instance.extraFront(""));
    Assert.assertEquals("CaCaCa", instance.extraFront("Candy"));
    Assert.assertEquals("CoCoCo", instance.extraFront("Code"));
  }

  /**
   * Test method for {@link String1#without2(String)}.
   */
  @Test
  public void testWithout2() {
    Assert.assertEquals("lloHe", instance.without2("HelloHe"));
    Assert.assertEquals("HelloHi", instance.without2("HelloHi"));
    Assert.assertEquals("", instance.without2("Hi"));
    Assert.assertEquals("Chocolate", instance.without2("Chocolate"));
    Assert.assertEquals("x", instance.without2("xxx"));
    Assert.assertEquals("", instance.without2("xx"));
    Assert.assertEquals("x", instance.without2("x"));
    Assert.assertEquals("", instance.without2(""));
    Assert.assertEquals("Fruits", instance.without2("Fruits"));
  }

  /**
   * Test method for {@link String1#deFront(String)}.
   */
  @Test
  public void testDeFront() {
    // first is 'a' second is not 'b'
    Assert.assertEquals("a", instance.deFront("ax"));
    Assert.assertEquals("ay", instance.deFront("axy"));
    Assert.assertEquals("ab", instance.deFront("axb"));
    Assert.assertEquals("aay", instance.deFront("away"));
    Assert.assertEquals("aa", instance.deFront("aaa"));
    Assert.assertEquals("a", instance.deFront("a"));
    // first is not 'a' second is 'b'
    Assert.assertEquals("by", instance.deFront("xby"));
    Assert.assertEquals("bc", instance.deFront("xbc"));
    Assert.assertEquals("bb", instance.deFront("bbb"));
    // first is not 'a' second is not 'b'
    Assert.assertEquals("llo", instance.deFront("Hello"));
    Assert.assertEquals("va", instance.deFront("java"));
    Assert.assertEquals("zz", instance.deFront("bazz"));
    Assert.assertEquals("", instance.deFront("ba"));
    Assert.assertEquals("", instance.deFront("hi"));
    Assert.assertEquals("", instance.deFront("xz"));
    Assert.assertEquals("z", instance.deFront("zzz"));
    // length is smaller than 2
    Assert.assertEquals("", instance.deFront("t"));
    Assert.assertEquals("", instance.deFront(""));
    // first is 'a' second is 'b'
    Assert.assertEquals("ab", instance.deFront("ab"));
    Assert.assertEquals("abc", instance.deFront("abc"));
    Assert.assertEquals("abxyz", instance.deFront("abxyz"));
  }

  /**
   * Test method for {@link String1#startWord(String, String)}.
   */
  @Test
  public void testStartWord() {
    Assert.assertEquals("h", instance.startWord("h", "z"));
    Assert.assertEquals("hi", instance.startWord("hippo", "hi"));
    Assert.assertEquals("hip", instance.startWord("hippo", "xip"));
    Assert.assertEquals("h", instance.startWord("hippo", "i"));
    Assert.assertEquals("hi", instance.startWord("hip", "zi"));
    Assert.assertEquals("hip", instance.startWord("hip", "zip"));
    Assert.assertEquals("hippo", instance.startWord("hippo", "xippo"));
    Assert.assertEquals("", instance.startWord("hippo", "xyz"));
    Assert.assertEquals("hip", instance.startWord("hippo", "hip"));
    Assert.assertEquals("kit", instance.startWord("kitten", "cit"));
    Assert.assertEquals("kit", instance.startWord("kit", "cit"));
    Assert.assertEquals("", instance.startWord("hippo", ""));
    Assert.assertEquals("", instance.startWord("hippo", "ix"));
    Assert.assertEquals("", instance.startWord("h", "ix"));
    Assert.assertEquals("", instance.startWord("hip", "zig"));
    Assert.assertEquals("", instance.startWord("", "i"));
  }

  /**
   * Test method for {@link String1#withoutX(String)}.
   */
  @Test
  public void testWithoutX() {
    Assert.assertEquals("Hi", instance.withoutX("Hi"));
    Assert.assertEquals("Hi", instance.withoutX("xHi"));
    Assert.assertEquals("Hi", instance.withoutX("Hix"));
    Assert.assertEquals("Hi", instance.withoutX("xHix"));
    Assert.assertEquals("Hxi", instance.withoutX("Hxix"));
    Assert.assertEquals("xHi", instance.withoutX("xxHi"));
    Assert.assertEquals("Hix", instance.withoutX("Hixx"));
    Assert.assertEquals("axb", instance.withoutX("xaxbx"));
    Assert.assertEquals("", instance.withoutX(""));
    Assert.assertEquals("", instance.withoutX("x"));
    Assert.assertEquals("", instance.withoutX("xx"));
    Assert.assertEquals("Hello", instance.withoutX("Hello"));
    Assert.assertEquals("Hexllo", instance.withoutX("Hexllo"));
  }

  /**
   * Test method for {@link String1#withoutX2(String)}.
   */
  @Test
  public void testWithoutX2() {
    Assert.assertEquals("", instance.withoutX2(""));
    Assert.assertEquals("c", instance.withoutX2("c"));
    Assert.assertEquals("", instance.withoutX2("x"));
    Assert.assertEquals("", instance.withoutX2("xx"));
    Assert.assertEquals("Hi", instance.withoutX2("Hi"));
    Assert.assertEquals("Hi", instance.withoutX2("xHi"));
    Assert.assertEquals("Hi", instance.withoutX2("Hxi"));
    Assert.assertEquals("Hi", instance.withoutX2("xxHi"));
    Assert.assertEquals("xHi", instance.withoutX2("xxxHi"));
    Assert.assertEquals("Hix", instance.withoutX2("Hix"));
    Assert.assertEquals("axb", instance.withoutX2("xaxb"));
    Assert.assertEquals("Hxllo", instance.withoutX2("xHxllo"));
    Assert.assertEquals("Hello", instance.withoutX2("Hello"));
    Assert.assertEquals("Hexllo", instance.withoutX2("Hexllo"));
  }
}
