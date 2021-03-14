package com.codingbat.java;

import java.util.Locale;

/**
 * The class is contains solution for Warmup-1 section.
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
    int multiplier = 2;
    return firstNumber == secondNumber ? multiplier * sumOfBoth : sumOfBoth;
  }

  /**
   * Given an int n, return the absolute difference between n and 21, except return double the
   * absolute difference if n is over 21.
   *
   * @param inputNumber the input number
   * @return the result of the above mentioned calculation
   */
  public int diff21(int inputNumber) {
    int border = 21;
    int absoluteDifferenceFrom21 = Math.abs(inputNumber - border);
    int multiplier = 2;
    return inputNumber > border ? multiplier * absoluteDifferenceFrom21 : absoluteDifferenceFrom21;
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
    int zeroHour = 0;
    int sixHour = 6;
    boolean inForbiddenMorningHours = zeroHour <= actualHourOfDay && actualHourOfDay <= sixHour;
    int twentyOneHour = 21;
    int twentyThreeHour = 23;
    boolean inForbiddenEveningHours =
        twentyOneHour <= actualHourOfDay && actualHourOfDay <= twentyThreeHour;
    boolean inForbiddenHours = inForbiddenMorningHours || inForbiddenEveningHours;
    boolean inTrouble = parrotTalking && inForbiddenHours;
    return inTrouble;
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
    int distantFrom100 = Math.abs(100 - number);
    int distantFrom200 = Math.abs(200 - number);
    int limitOfDistance = 11;
    return distantFrom100 < limitOfDistance || distantFrom200 < limitOfDistance;
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
   * @param text the input string
   * @return the above mentioned new string
   */
  public String notString(String text) {
    String prefix = "not";
    return text.startsWith(prefix) ? text : prefix + " " + text;
  }

  /**
   * Given a non-empty string and an int n, return a new string where the char at index n has been
   * removed. The value of n will be a valid index of a char in the original string (i.e. n will be
   * in the range 0..str.length()-1 inclusive).
   *
   * @param text the input string
   * @param index the index of the input string
   * @return the above mentioned new string, or the input string if n is not valid index
   */
  public String missingChar(String text, int index) {
    boolean validIndex = 0 <= index && index < text.length();
    if (validIndex) {
      String removedCharOnIndexN =
          text.substring(0, index) + text.substring(index + 1, text.length());
      return removedCharOnIndexN;
    }
    return text;
  }

  /**
   * Given a string, return a new string where the first and last chars have been exchanged.
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  public String frontBack(String text) {
    if (text.length() > 1) {
      String exchangedFirstLastCharsText =
          text.charAt(text.length() - 1) + text.substring(1, text.length() - 1) + text.charAt(0);
      return exchangedFirstLastCharsText;
    }
    return text;
  }

  /**
   * Given a string, we'll say that the front is the first 3 chars of the string. If the string
   * length is less than 3, the front is whatever is there. Return a new string which is 3 copies of
   * the front.
   *
   * @param text the input string with arbitrary length
   * @return the above mentioned new string
   */
  public String front3(String text) {
    String frontOfText = text.length() > 2 ? text.substring(0, 3) : text;
    return frontOfText + frontOfText + frontOfText;
  }

  /**
   * Given a string, take the last char and return a new string with the last char added at the
   * front and back, so "cat" yields "tcatt". The original string will be length 1 or more.
   *
   * @param text the input string with at least length 1
   * @return the above mentioned new string
   */
  public String backAround(String text) {
    boolean notEmptyText = !text.isEmpty();
    String lastCharAroundText = null;
    if (notEmptyText) {
      lastCharAroundText = text.charAt(text.length() - 1) + text + text.charAt(text.length() - 1);
    }
    return notEmptyText ? lastCharAroundText : text;
  }

  /**
   * Return true if the given non-negative number is a multiple of 3 or a multiple of 5. Use the %
   * "mod" operator.
   *
   * @param number the non-negative number
   * @return true, if the above mentioned condition is fulfilled
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
   * @param text the arbitrary length string
   * @return the above mentioned new string
   */
  public String front22(String text) {
    int takeLength = 2;
    if (takeLength > text.length()) {
      takeLength = text.length();
    }

    String frontPart = text.substring(0, takeLength);
    return frontPart + text + frontPart;
  }

  /**
   * Given a string, return true if the string starts with "hi" and false otherwise.
   *
   * @param text the arbitrary length input string
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean startHi(String text) {
    return text.startsWith("hi");
  }

  /**
   * Given two temperatures, return true if one is less than 0 and the other is greater than 100.
   *
   * @param temperature1 the first temperature
   * @param temperature2 the second temperature
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean icyHot(int temperature1, int temperature2) {
    int minTemperature = 0;
    boolean oneIsLessThanZero = temperature1 < minTemperature || temperature2 < minTemperature;
    int maxTemperature = 100;
    boolean oneIsGreaterThanOneHundred =
        temperature1 > maxTemperature || temperature2 > maxTemperature;
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
    boolean aNumberInRange = 10 <= aNumber && aNumber <= 20;
    boolean bNumberInRange = 10 <= bNumber && bNumber <= 20;
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
   * @param text the input string
   * @return the above mentioned new string
   */
  public String delDel(String text) {
    return text.indexOf("del") == 1 ? text.replaceFirst("del", "") : text;
  }

  /**
   * Return true if the given string begins with "mix", except the 'm' can be anything, so "pix",
   * "9ix" .. all count.
   *
   * @param text the input string
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean mixStart(String text) {
    return text.length() > 2 ? text.substring(1, 3).equals("ix") : false;
  }

  /**
   * Given a string, return a string made of the first 2 chars (if present), however include first
   * char only if it is 'o' and include the second only if it is 'z', so "ozymandias" yields "oz".
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  public String startOz(String text) {
    String firstChar = text.length() > 0 && text.charAt(0) == 'o' ? "o" : "";
    String secondChar = text.length() > 1 && text.charAt(1) == 'z' ? "z" : "";
    return firstChar + secondChar;
  }

  /**
   * Given three int values, a b c, return the largest.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @param cNumber the third number
   * @return the above mentioned number
   */
  public int intMax(int aNumber, int bNumber, int cNumber) {
    int maxNumber = Math.max(aNumber, bNumber);
    return Math.max(cNumber, maxNumber);
  }

  /**
   * Given 2 int values, return whichever value is nearest to the value 10, or return 0 in the event
   * of a tie. Note that Math.abs(n) returns the absolute value of a number.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @return the above mentioned number
   */
  public int close10(int aNumber, int bNumber) {
    int aNumberDistanceFromTen = Math.abs(10 - aNumber);
    int bNumberDistanceFromTen = Math.abs(10 - bNumber);
    int result;
    if (aNumberDistanceFromTen == bNumberDistanceFromTen) {
      result = 0;
    } else {
      result = aNumberDistanceFromTen < bNumberDistanceFromTen ? aNumber : bNumber;
    }
    return result;
  }

  /**
   * Given 2 int values, return true if they are both in the range 30..40 inclusive, or they are
   * both in the range 40..50 inclusive.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean in3050(int aNumber, int bNumber) {
    boolean bothInRange3040 = 29 < aNumber && aNumber < 41 && 29 < bNumber && bNumber < 41;
    boolean bothInRange4050 = 39 < aNumber && aNumber < 51 && 39 < bNumber && bNumber < 51;
    return bothInRange3040 || bothInRange4050;
  }

  /**
   * Given 2 positive int values, return the larger value that is in the range 10..20 inclusive, or
   * return 0 if neither is in that range.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @return the above mentioned number
   */
  public int max1020(int aNumber, int bNumber) {
    int ret = 0;
    boolean aNumberInRange = 9 < aNumber && aNumber < 21;
    boolean bNumberInRange = 9 < bNumber && bNumber < 21;
    if (aNumberInRange && bNumberInRange) {
      ret = Math.max(aNumber, bNumber);
    } else if (aNumberInRange) {
      ret = aNumber;
    } else if (bNumberInRange) {
      ret = bNumber;
    }
    return ret;
  }

  /**
   * Return true if the given string contains between 1 and 3 'e' chars.
   *
   * @param text the input string
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean stringE(String text) {
    int amountOfCharE = 0;
    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) == 'e') {
        amountOfCharE++;
      }
    }
    boolean countBetween1And3 = 0 < amountOfCharE && amountOfCharE < 4;
    return countBetween1And3;
  }

  /**
   * Given two non-negative int values, return true if they have the same last digit, such as with
   * 27 and 57. Note that the % "mod" operator computes remainders, so 17 % 10 is 7.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @return true, if the above mentioned condition is fulfilled
   */
  public boolean lastDigit(int aNumber, int bNumber) {
    int aNumberLastDigit = aNumber % 10;
    int bNumberLastDigit = bNumber % 10;
    return aNumberLastDigit == bNumberLastDigit;
  }

  /**
   * Given a string, return a new string where the last 3 chars are now in upper case. If the string
   * has less than 3 chars, uppercase whatever is there. Note that str.toUpperCase() returns the
   * uppercase version of a string.
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  public String endUp(String text) {
    if (text.length() < 3) {
      return text.toUpperCase(Locale.getDefault());
    } else {
      String stringBeginPart = text.substring(0, text.length() - 3);
      String stringEndPart = text.substring(text.length() - 3, text.length());
      return stringBeginPart + stringEndPart.toUpperCase(Locale.getDefault());
    }
  }

  /**
   * Given a non-empty string and an int N, return the string made starting with char 0, and then
   * every Nth char of the string. So if N is 3, use char 0, 3, 6, ... and so on. N is 1 or more.
   *
   * @param text the input string
   * @param number the input number
   * @return the above mentioned new string
   */
  public String everyNth(String text, int number) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < text.length(); i = i + number) {
      builder.append(text.charAt(i));
    }
    return builder.toString();
  }
}
