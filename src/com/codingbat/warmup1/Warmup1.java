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
}
