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
}
