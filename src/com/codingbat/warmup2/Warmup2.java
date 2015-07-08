package com.codingbat.warmup2;

/**
 * The class Warmup2 is contains solution for Warmup-2 section.
 */
public class Warmup2 {

  /**
   * Given a string and a non-negative int n, return a larger string that is n copies of the
   * original string.
   *
   * @param str the input string
   * @param n the number of copies
   * @return a larger string that is n copies of the input string
   */
  public String stringTimes(String str, int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(str);
    }
    return sb.toString();
  }

  /**
   * Given a string and a non-negative int n, we'll say that the front of the string is the first 3
   * chars, or whatever is there if the string is less than length 3. Return n copies of the front;
   *
   * @param str the input string
   * @param n the number of copies
   * @return the n copies of front chars (3 chars or less)
   */
  public String frontTimes(String str, int n) {
    int fLength = 3;
    StringBuilder sb = new StringBuilder();
    String front = str.length() > fLength ? str.substring(0, fLength) : str;
    for (int i = 0; i < n; i++) {
      sb.append(front);
    }
    return sb.toString();
  }

  /**
   * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx"
   * contains 2 "xx".
   *
   * @param str the input string
   * @return the number of "xx"
   */
  public int countXX(String str) {
    int ret = 0;
    for (int i = 0; i < str.length() - 1; i++) {
      if ("xx".equals(str.substring(i, i + 2))) {
        ++ret;
      }
    }
    return ret;
  }

  /**
   * Given a string, return true if the first instance of "x" in the string is immediately followed
   * by another "x".
   *
   * @param str the input string
   * @return true, if the first 'x' in the input string is immediately followed by another 'x'
   */
  boolean doubleX(String str) {
    int i = str.indexOf("x");
    if (i == -1) {
      return false;
    }
    String xSubStr = str.substring(i);
    return xSubStr.startsWith("xx");
  }

  /**
   * Given a string, return a new string made of every other char (every second char) starting with
   * the first, so "Hello" yields "Hlo".
   *
   * @param str input string
   * @return a new string made of every other char starting with the first
   */
  public String stringBits(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i += 2) {
      sb.append(str.charAt(i));
    }
    return sb.toString();
  }
}
