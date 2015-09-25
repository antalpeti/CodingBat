package com.codingbat.warmup1;

/**
 * The class Warmup1 is contains solution for Warmup-1 section.
 */
public class Warmup1 {

  /**
   * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are
   * on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep
   * in.
   *
   * @param weekday the weekday indicate it is a weekday
   * @param vacation the vacation indicate it is a vacation
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday || vacation;
  }

  /**
   * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
   * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we
   * are in trouble.
   *
   * @param aMonkeySmiling the first monkey is smiling
   * @param bMonkeySmiling the second monkey is smiling
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean monkeyTrouble(boolean aMonkeySmiling, boolean bMonkeySmiling) {
    boolean troubleStatus = aMonkeySmiling && bMonkeySmiling || !aMonkeySmiling && !bMonkeySmiling;
    return troubleStatus;
  }

  /**
   * Given two int values, return their sum. Unless the two values are the same, then return double
   * their sum.
   *
   * @param firstNumber the first number
   * @param secondNumber the second number
   * @return the result of the above mentioned calculation
   */
  public int sumDouble(int firstNumber, int secondNumber) {
    int sumOfBoth = firstNumber + secondNumber;
    return firstNumber == secondNumber ? 2 * sumOfBoth : sumOfBoth;
  }

  /**
   * Given an int n, return the absolute difference between n and 21, except return double the
   * absolute difference if n is over 21.
   *
   * @param inputNumber the input number
   * @return the result of the above mentioned calculation
   */
  public int diff21(int inputNumber) {
    int absoluteDifferenceFrom21 = Math.abs(inputNumber - 21);
    return inputNumber > 21 ? 2 * absoluteDifferenceFrom21 : absoluteDifferenceFrom21;
  }

  /**
   * We have a loud talking parrot. The "hour" parameter is the current hour time in the range
   * 0..23. We are in trouble if the parrot is talking and the hour is before 7 or after 20. Return
   * true if we are in trouble.
   *
   * @param parrotTalking the talking parameter of the parrot
   * @param actualHourOfDay the hour parameter of the day
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean parrotTrouble(boolean parrotTalking, int actualHourOfDay) {
    boolean allowableMorningHours = -1 < actualHourOfDay && actualHourOfDay < 7;
    boolean allowableEveningHours = 20 < actualHourOfDay && actualHourOfDay < 24;
    boolean insideAllowableHours = allowableMorningHours || allowableEveningHours;
    boolean troubleStatus = parrotTalking && insideAllowableHours;
    return troubleStatus;
  }

  /**
   * Given 2 ints, a and b, return true if one of them is 10 or if their sum is 10.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean makes10(int aNumber, int bNumber) {
    int searchedNumber = 10;
    boolean oneIs10 = aNumber == searchedNumber || bNumber == searchedNumber;
    boolean sumIs10 = aNumber + bNumber == searchedNumber;
    return oneIs10 || sumIs10;
  }

  /**
   * Given an int n, return true if it is within 10 of 100 or 200. Note: Math.abs(num) computes the
   * absolute value of a number.
   *
   * @param number the number
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean nearHundred(int number) {
    int range100 = Math.abs(100 - number);
    int range200 = Math.abs(200 - number);
    return range100 < 11 || range200 < 11;
  }

  /**
   * Given 2 int values, return true if one is negative and one is positive. Except if the parameter
   * "negative" is true, then return true only if both are negative.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @param negativeAllowed indicate is only negative number allowable
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean posNeg(int aNumber, int bNumber, boolean negativeAllowed) {
    boolean bothNegative = aNumber < 0 && bNumber < 0 && negativeAllowed;
    boolean onePositiveOneNegative =
        (aNumber < 0 && bNumber > 0 || aNumber > 0 && bNumber < 0) && !negativeAllowed;
    return onePositiveOneNegative || bothNegative;
  }

  /**
   * Given a string, return a new string where "not " has been added to the front. However, if the
   * string already begins with "not", return the string unchanged. Note: use .equals() to compare 2
   * strings.
   *
   * @param string the input string
   * @return the above mentioned new string
   */
  public String notString(String string) {
    return string.startsWith("not") ? string : "not " + string;
  }

  /**
   * Given a non-empty string and an int n, return a new string where the char at index n has been
   * removed. The value of n will be a valid index of a char in the original string (i.e. n will be
   * in the range 0..str.length()-1 inclusive).
   *
   * @param string the input string
   * @param index the index of the input string
   * @return the above defined new string, or the input string if n is not valid index
   */
  public String missingChar(String string, int index) {
    boolean validIndex = index < 0 || index > string.length() - 1;
    String charOnIndexNRemoved =
        string.substring(0, index) + string.substring(index + 1, string.length());
    return validIndex ? string : charOnIndexNRemoved;
  }

  /**
   * Given a string, return a new string where the first and last chars have been exchanged.
   *
   * @param string the input string
   * @return the above mentioned new string
   */
  public String frontBack(String string) {
    boolean notEmptyString = !string.isEmpty();
    String firstLastCharsExchanged = null;
    if (notEmptyString) {
      firstLastCharsExchanged =
          string.charAt(string.length() - 1) + string.substring(1, string.length() - 1)
              + string.charAt(0);
    }
    return notEmptyString ? firstLastCharsExchanged : string;
  }

  /**
   * Given a string, we'll say that the front is the first 3 chars of the string. If the string
   * length is less than 3, the front is whatever is there. Return a new string which is 3 copies of
   * the front.
   *
   * @param string the input string with arbitrary length
   * @return the above mentioned new string
   */
  public String front3(String string) {
    String front = string.length() > 2 ? string.substring(0, 3) : string;
    return front + front + front;
  }

  /**
   * Given a string, take the last char and return a new string with the last char added at the
   * front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
   *
   * @param string the input string with at least length 1
   * @return the above mentioned new string
   */
  public String backAround(String string) {
    boolean notEmptyString = !string.isEmpty();
    String lastCharAroundString = null;
    if (notEmptyString) {
      lastCharAroundString =
          string.charAt(string.length() - 1) + string + string.charAt(string.length() - 1);
    }
    return notEmptyString ? lastCharAroundString : string;
  }

  /**
   * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the %
   * "mod" operator.
   *
   * @param number the non-negative number
   * @return true, if the above defined condition is fulfilled
   */
  public boolean or35(int number) {
    boolean divisibleWithThree = number % 3 == 0;
    boolean divisibleWithFive = number % 5 == 0;
    return divisibleWithThree || divisibleWithFive;
  }

  /**
   * Given a string, take the first 2 chars and return the string with the 2 chars added at both the
   * front and back, so "kitten" yields"kikittenki". If the string length is less than 2, use
   * whatever chars are there.
   *
   * @param string the arbitrary length string
   * @return the above mentioned new string
   */
  public String front22(String string) {
    int takeLength = 2;
    if (takeLength > string.length()) {
      takeLength = string.length();
    }

    String frontPart = string.substring(0, takeLength);
    return frontPart + string + frontPart;
  }

  /**
   * Given a string, return true if the string starts with "hi" and false otherwise.
   *
   * @param string the arbitrary length input string
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean startHi(String string) {
    return string.startsWith("hi");
  }

  /**
   * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
   *
   * @param temperature1 the first temperature
   * @param temperature2 the second temperature
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean icyHot(int temperature1, int temperature2) {
    boolean oneIsLessThanZero = temperature1 < 0 || temperature2 < 0;
    boolean oneIsGreaterThanOneHundred = temperature1 > 100 || temperature2 > 100;
    return oneIsLessThanZero && oneIsGreaterThanOneHundred;
  }

  /**
   * Given 2 int values, return true if either of them is in the range 10..20 inclusive.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean in1020(int aNumber, int bNumber) {
    boolean aNumberInRange = 9 < aNumber && aNumber < 21;
    boolean bNumberInRange = 9 < bNumber && bNumber < 21;
    return aNumberInRange || bNumberInRange;
  }

  /**
   * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 3 int values,
   * return true if 1 or more of them are teen.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @param cNumber the third number
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean hasTeen(int aNumber, int bNumber, int cNumber) {
    boolean aNumberInRange = 12 < aNumber && aNumber < 20;
    boolean bNumberInRange = 12 < bNumber && bNumber < 20;
    boolean cNumberInRange = 12 < cNumber && cNumber < 20;
    return aNumberInRange || bNumberInRange || cNumberInRange;
  }

  /**
   * We'll say that a number is "teen" if it is in the range 13..19 inclusive. Given 2 int values,
   * return true if one or the other is teen, but not both.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean loneTeen(int aNumber, int bNumber) {
    boolean aNumberInRange = 12 < aNumber && aNumber < 20;
    boolean bNumberInRange = 12 < bNumber && bNumber < 20;
    return aNumberInRange ^ bNumberInRange;
  }

  /**
   * Given a string, if the string "del" appears starting at index 1, return a string where that
   * "del" has been deleted. Otherwise, return the string unchanged.
   *
   * @param string the input string
   * @return the above mentioned new string
   */
  public String delDel(String string) {
    return string.indexOf("del") == 1 ? string.replaceFirst("del", "") : string;
  }

  /**
   * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix",
   * "9ix" .. all count.
   *
   * @param str the input string
   * @return true, if the above mentioned condition is fulfilled
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

  /**
   * Given a non-empty string and an int N, return the string made starting with char 0, and then
   * every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
   *
   * @param str the input string
   * @param n the input number
   * @return the string that starting with char 0, and then every Nth char of the input string
   */
  public String everyNth(String str, int n) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < str.length(); i = i + n) {
      sb.append(str.charAt(i));
    }
    return sb.toString();
  }
}
