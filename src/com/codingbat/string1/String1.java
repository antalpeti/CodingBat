package com.codingbat.string1;

/**
 * The class String1 is contains solution for String-1 section.
 */
public class String1 {

  /**
   * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
   *
   * @param name the input name
   * @return a greeting of the form "Hello " + input name
   */
  public String helloName(String name) {
    return "Hello " + name + "!";
  }

  /**
   * Given two strings, a and b, return the result of putting them together in the order abba, e.g.
   * "Hi" and "Bye" returns "HiByeByeHi".
   *
   * @param a the first input string
   * @param b the second input string
   * @return the concatenation of the first and the second strings as described above
   */
  public String makeAbba(String a, String b) {
    return a + b + b + a;
  }

  /**
   * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this
   * example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word
   * strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
   *
   * @param tag the input tag string
   * @param word the input word string
   * @return the HTML string with tags around the word
   */
  public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
  }

  /**
   * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word
   * is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract
   * the String starting at index i and going up to but not including index j.
   *
   * @param out the input outer string
   * @param word the input word string
   * @return a new string where the word is in the middle of the out string
   */
  public String makeOutWord(String out, String word) {
    return out.substring(0, 2) + word + out.substring(2, 4);
  }

  /**
   * Given a string, return a new string made of 3 copies of the last 2 chars of the original
   * string. The string length will be at least 2.
   *
   * @param str the input string
   * @return a new string made of 3 copies of the last 2 chars
   */
  public String extraEnd(String str) {
    String end = str.substring(str.length() - 2);
    return end + end + end;
  }

  /**
   * Given a string, return the string made of its first two chars, so the String "Hello" yields
   * "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and
   * the empty string "" yields the empty string "". Note that str.length() returns the length of a
   * string.
   *
   * @param str the input string
   * @return the above defined substring of the input string
   */
  public String firstTwo(String str) {
    return str.length() < 2 ? str : str.substring(0, 2);
  }

  /**
   * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
   *
   * @param str the input string
   * @return the first half of the input string
   */
  public String firstHalf(String str) {
    return str.substring(0, str.length() / 2);
  }

  /**
   * Given a string, return a version without the first and last char, so "Hello" yields "ell". The
   * string length will be at least 2.
   *
   * @param str the input string
   * @return the input string without the first and last char
   */
  public String withoutEnd(String str) {
    return str.length() > 1 ? str.substring(1, str.length() - 1) : "";
  }

  /**
   * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
   * on the outside and the longer string on the inside. The strings will not be the same length,
   * but they may be empty (length 0).
   *
   * @param a the first input string
   * @param b the second input string
   * @return a string of the form short+long+short input strings
   */
  public String comboString(String a, String b) {
    return a.length() > b.length() ? b + a + b : a + b + a;
  }

  /**
   * Given 2 strings, return their concatenation, except omit the first char of each. The strings
   * will be at least length 1.
   *
   * @param a the first input string
   * @param b the second input string
   * @return the concatenation of the input strings without the first chars
   */
  public String nonStart(String a, String b) {
    String shortA = a.length() > 0 ? a.substring(1) : a;
    String shortB = b.length() > 0 ? b.substring(1) : b;
    return shortA + shortB;
  }

  /**
   * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
   * The string length will be at least 2.
   *
   * @param str the input string
   * @return the rotated left 2 version of the input string
   */
  public String left2(String str) {
    return str.length() > 2 ? str.substring(2) + str.substring(0, 2) : str;
  }

  /**
   * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the
   * start. The string length will be at least 2.
   *
   * @param str the input string
   * @return the rotated right 2 version of the input string
   */
  public String right2(String str) {
    return str.length() > 2 ? str.substring(str.length() - 2) + str.substring(0, str.length() - 2)
        : str;
  }

  /**
   * Given a string, return a string length 1 from its front, unless front is false, in which case
   * return a string length 1 from its back. The string will be non-empty.
   *
   * @param str the input string
   * @param front request the front or the back part of the input string
   * @return the front or the back part of the input string
   */
  public String theEnd(String str, boolean front) {
    return front && str.length() > 0 ? str.substring(0, 1) : str.substring(str.length() - 1,
        str.length());
  }
}
