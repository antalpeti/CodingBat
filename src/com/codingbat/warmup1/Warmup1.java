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

  /**
   * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the %
   * "mod" operator.
   *
   * @param n the non-negative number
   * @return true, if the input number is multiple of 3 or multiple of 5
   */
  public boolean or35(int n) {
    return n % 3 == 0 || n % 5 == 0;
  }

  /**
   * Given a string, take the first 2 chars and return the string with the 2 chars added at both the
   * front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use
   * whatever chars are there.
   *
   * @param str the arbitrary length string
   * @return the input string with the first 2 chars added at both the front and back
   */
  public String front22(String str) {
    int take = 2;
    if (take > str.length()) {
      take = str.length();
    }

    String front = str.substring(0, take);
    return front + str + front;
  }

  /**
   * Given a string, return true if the string starts with "hi" and false otherwise.
   *
   * @param str the arbitrary length input string
   * @return true, if the input string starts with "hi"
   */
  public boolean startHi(String str) {
    return str.startsWith("hi");
  }

  /**
   * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
   *
   * @param temp1 the first temperature
   * @param temp2 the second temperature
   * @return true, if one of the input temperature is smaller than 0, and the other input
   *         temperature is bigger than 100
   */
  public boolean icyHot(int temp1, int temp2) {
    return (temp1 < 0 || temp2 < 0) && (temp1 > 100 || temp2 > 100);
  }

  /**
   * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
   *
   * @param a the first number
   * @param b the second number
   * @return true, if either of the input number is in range 10..20 inclusive
   */
  public boolean in1020(int a, int b) {
    return 9 < a && a < 21 || 9 < b && b < 21;
  }

  /**
   * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
   * return true if 1 or more of them are teen.
   *
   * @param a the first number
   * @param b the second number
   * @param c the third number
   * @return true, if one of the input number is in the range 13..19 inclusive
   */
  public boolean hasTeen(int a, int b, int c) {
    return 12 < a && a < 20 || 12 < b && b < 20 || 12 < c && c < 20;
  }

  /**
   * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
   * return true if one or the other is teen, but not both.
   *
   * @param a the first number
   * @param b the second number
   * @return true, if one of the input number is in the range 13..19, but not both
   */
  public boolean loneTeen(int a, int b) {
    return (12 < a && a < 20) ^ (12 < b && b < 20);
  }

  /**
   * Given a string, if the string "del" appears starting at index 1, return a string where that
   * "del" has been deleted. Otherwise, return the string unchanged.
   *
   * @param str the input string
   * @return the input string without the "del" substring according to the described starting
   *         position
   */
  public String delDel(String str) {
    return str.indexOf("del") == 1 ? str.replaceFirst("del", "") : str;
  }

  /**
   * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix",
   * "9ix" .. all count.
   *
   * @param str the input string
   * @return true, if the input string second character is 'i' and the third character is 'x'
   */
  public boolean mixStart(String str) {
    return str.length() > 2 ? str.substring(1, 3).equals("ix") : false;
  }

  /**
   * Given a string, return a string made of the first 2 chars (if present), however include first
   * char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
   *
   * @param str the input string
   * @return the first two characters ("", "o", "z","oz") according to to above description
   */
  public String startOz(String str) {
    String fc = str.length() > 0 && str.charAt(0) == 'o' ? "o" : "";
    String sc = str.length() > 1 && str.charAt(1) == 'z' ? "z" : "";
    return fc + sc;
  }

  /**
   * Given three int values, a b c, return the largest.
   *
   * @param a the first number
   * @param b the second number
   * @param c the third number
   * @return the largest number from the input numbers
   */
  public int intMax(int a, int b, int c) {
    int max = a > b ? a : b;
    return c > max ? c : max;
  }

  /**
   * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event
   * of a tie. Note that Math.abs(n) returns the absolute value of a number.
   *
   * @param a the first number
   * @param b the second number
   * @return the nearest input number to the value 10, or 0
   */
  public int close10(int a, int b) {
    int diffa = Math.abs(10 - a);
    int diffb = Math.abs(10 - b);
    int ret;
    if (diffa == diffb) {
      ret = 0;
    } else {
      ret = diffa < diffb ? a : b;
    }
    return ret;
  }

  /**
   * Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are
   * both in the range 40..50 inclusive.
   *
   * @param a the first number
   * @param b the second number
   * @return true, if both input number in range 30..40 inclusive or in range 40..50 inclusive
   */
  public boolean in3050(int a, int b) {
    return 29 < a && a < 41 && 29 < b && b < 41 || 39 < a && a < 51 && 39 < b && b < 51 ? true
        : false;
  }

  /**
   * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or
   * return 0 if neither is in that range.
   *
   * @param a the first number
   * @param b the second number
   * @return the larger value that is in the range 10..20 inclusive, or 0 if neither is in the range
   */
  public int max1020(int a, int b) {
    int ret = 0;
    boolean aInRange = 9 < a && a < 21;
    boolean bInRange = 9 < b && b < 21;
    if (aInRange && bInRange) {
      ret = a > b ? a : b;
    }
    if (aInRange && !bInRange) {
      ret = a;
    }
    if (!aInRange && bInRange) {
      ret = b;
    }
    if (!aInRange && !bInRange) {
      ret = 0;
    }
    return ret;
  }

  /**
   * Return true if the given string contains between 1 and 3 'e' chars.
   *
   * @param str the input string
   * @return true, if the input string contains between 1 and 3 'e' chars
   */
  public boolean stringE(String str) {
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      if (str.charAt(i) == 'e') {
        count++;
      }
    }
    return 0 < count && count < 4;
  }

  /**
   * Given two non-negative int values, return true if they have the same last digit, such as with
   * 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
   *
   * @param a the first number
   * @param b the second number
   * @return true, if both number have the same last digit
   */
  public boolean lastDigit(int a, int b) {
    return a % 10 == b % 10;
  }

  /**
   * Given a string, return a new string where the last 3 chars are now in upper case. If the string
   * has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the
   * uppercase version of a string.
   *
   * @param str the input string
   * @return the string with the last 3 chars are in upper case
   */
  public String endUp(String str) {
    return str.length() < 3 ? str.toUpperCase() : str.substring(0, str.length() - 3)
        + str.substring(str.length() - 3, str.length()).toUpperCase();
  }
}
