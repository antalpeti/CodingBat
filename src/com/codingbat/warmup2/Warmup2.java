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

  /**
   * Given a non-empty string like "Code" return a string like "CCoCodCode".
   *
   * @param str the input string
   * @return the concatenation of substrings of the input string
   */
  public String stringSplosion(String str) {
    StringBuilder sb = new StringBuilder();
    for (int i = 1; i <= str.length(); i++) {
      sb.append(str.substring(0, i));
    }
    return sb.toString();
  }

  /**
   * Given a string, return the count of the number of times that a substring length 2 appears in
   * the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count
   * the end substring).
   *
   * @param str the input string
   * @return the number of times that a substring length 2 appears in the string and also as the
   *         last 2 chars of the string
   */
  public int last2(String str) {
    int ret = 0;
    String end = str.length() > 1 ? str.substring(str.length() - 2) : "";
    for (int i = 0; i < str.length() - 2; i++) {
      String sub = str.substring(i, i + 2);
      if (sub.equals(end)) {
        ret++;
      }
    }
    return ret;
  }

  /**
   * Given an array of ints, return the number of 9's in the array.
   *
   * @param nums the input numbers
   * @return the number of 9's in the array
   */
  public int arrayCount9(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length; i++) {
      if (nums[i] == 9) {
        count++;
      }
    }
    return count;
  }
}
