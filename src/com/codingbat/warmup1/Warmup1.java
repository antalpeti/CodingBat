package com.codingbat.warmup1;

/**
 * The Class Warmup1 is contains solution for Warmup-1 section.
 */
public class Warmup1 {

  /**
   * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are
   * on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep
   * in.
   *
   * @param weekday the weekday indicate it is a weekday
   * @param vacation the vacation indicate it is a vacation
   * @return true, if sleep in
   */
  public boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday || vacation;
  }

  /**
   * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
   * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we
   * are in trouble.
   *
   * @param aSmile the first monkey is smiling
   * @param bSmile the second monkey is smiling
   * @return true, if we are in trouble
   */
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return aSmile && bSmile || !aSmile && !bSmile;
  }

  /**
   * Given two int values, return their sum. Unless the two values are the same, then return double
   * their sum.
   *
   * @param a the first number
   * @param b the second number
   * @return the sum of the two number, or double their sum in case of equality
   */
  public int sumDouble(int a, int b) {
    return a == b ? 4 * a : a + b;
  }

  /**
   * Given an int n, return the absolute difference between n and 21, except return double the
   * absolute difference if n is over 21.
   *
   * @param n the examinable number
   * @return the difference beetween 21 and the input number, or double the difference if input
   *         number is bigger than 21
   */
  public int diff21(int n) {
    int diff = Math.abs(n - 21);
    return n > 21 ? 2 * diff : diff;
  }

  /**
   * We have a loud talking parrot. The "hour" parameter is the current hour time in the range
   * 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return
   * true if we are in trouble.
   *
   * @param talking the talking parameter of the parrot
   * @param hour the hour parameter of the day
   * @return true, if we are in trouble
   */
  public boolean parrotTrouble(boolean talking, int hour) {
    return talking && (-1 < hour && hour < 7 || 20 < hour && hour < 24);
  }

  /**
   * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
   *
   * @param a the first number
   * @param b the second number
   * @return true, if one of them is 10 or their sum is 10
   */
  public boolean makes10(int a, int b) {
    return a == 10 || b == 10 || a + b == 10;
  }

  /**
   * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the
   * absolute value of a number.
   *
   * @param n the number
   * @return true, if it is range of 10 of 100, or 200
   */
  public boolean nearHundred(int n) {
    return Math.abs(100 - n) < 11 || Math.abs(200 - n) < 11;
  }

  /**
   * Given 2 int values, return true if one is negative and one is positive. Except if the parameter
   * "negative" is true, then return true only if both are negative.
   *
   * @param a the first number
   * @param b the second number
   * @param negative indicate is only negative number allowable
   * @return true, if one of the number is negative and to other is positive and negative number is
   *         not allowable, or both of them is negative and negative number is allowable
   */
  public boolean posNeg(int a, int b, boolean negative) {
    return (a < 0 && b > 0 || a > 0 && b < 0) && !negative || a < 0 && b < 0 && negative;
  }

  /**
   * Given a string, return a new string where "not " has been added to the front. However, if the
   * string already begins with "not", return the string unchanged. Note: use .equals() to compare 2
   * strings.
   *
   * @param str the input string
   * @return the input string with only one "not " prefix
   */
  public String notString(String str) {
    return str.startsWith("not") ? str : "not " + str;
  }

  /**
   * Given a non-empty string and an int n, return a new string where the char at index n has been
   * removed. The value of n will be a valid index of a char in the original string (i.e. n will be
   * in the range 0..str.length()-1 inclusive).
   *
   * @param str the input string
   * @param n the index of the input string
   * @return the input string without the char at index n, or the input string if n is not valid
   *         index
   */
  public String missingChar(String str, int n) {
    return n < 0 || n > str.length() - 1 ? str : str.substring(0, n)
        + str.substring(n + 1, str.length());
  }

  /**
   * Given a string, return a new string where the first and last chars have been exchanged.
   *
   * @param str the input string
   * @return the input string where the first and last chars have been exchanged
   */
  public String frontBack(String str) {
    return str.length() > 1 ? str.charAt(str.length() - 1) + str.substring(1, str.length() - 1)
        + str.charAt(0) : str;
  }

  /**
   * Given a string, we'll say that the front is the first 3 chars of the string. If the string
   * length is less than 3, the front is whatever is there. Return a new string which is 3 copies of
   * the front.
   *
   * @param str the input string with arbitrary length
   * @return the first 3 character of the string by three times
   */
  public String front3(String str) {
    String front = str.length() > 2 ? str.substring(0, 3) : str;
    return front + front + front;
  }

  /**
   * Given a string, take the last char and return a new string with the last char added at the
   * front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
   *
   * @param str the input string with at least length 1
   * @return the input string with the last char added at the front and back
   */
  public String backAround(String str) {
    return str.length() > 0 ? str.charAt(str.length() - 1) + str + str.charAt(str.length() - 1)
        : str;
  }
}
