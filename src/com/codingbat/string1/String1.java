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
}
