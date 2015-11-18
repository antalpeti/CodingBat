package com.codingbat.warmup2;

/**
 * The class Warmup2 is contains solution for Warmup-2 section.
 */
class Warmup2 {

  /**
   * Given a string and a non-negative int n, return a larger string that is n copies of the
   * original string.
   *
   * @param text the input string
   * @param number the number of copies
   * @return the above mentioned new string
   */
  String stringTimes(String text, int number) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < number; i++) {
      builder.append(text);
    }
    return builder.toString();
  }

  /**
   * Given a string and a non-negative int n, we'll say that the front of the string is the first 3
   * chars, or whatever is there if the string is less than length 3. Return n copies of the front;
   *
   * @param text the input string
   * @param number the number of copies
   * @return the above mentioned new string
   */
  String frontTimes(String text, int number) {
    int frontLength = 3;
    StringBuilder builder = new StringBuilder();
    String frontPart = text.length() > frontLength ? text.substring(0, frontLength) : text;
    for (int i = 0; i < number; i++) {
      builder.append(frontPart);
    }
    return builder.toString();
  }

  /**
   * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx"
   * contains 2 "xx".
   *
   * @param text the input string
   * @return the above mentioned number
   */
  int countXX(String text) {
    int amountOfXX = 0;
    for (int i = 0; i < text.length() - 1; i++) {
      if ("xx".equals(text.substring(i, i + 2))) {
        ++amountOfXX;
      }
    }
    return amountOfXX;
  }

  /**
   * Given a string, return true if the first instance of "x" in the string is immediately followed
   * by another "x".
   *
   * @param text the input string
   * @return true, if the above mentioned conditions is fulfilled
   */
  boolean doubleX(String text) {
    int i = text.indexOf('x');
    if (i == -1) {
      return false;
    }
    String startWithXSubstring = text.substring(i);
    return startWithXSubstring.startsWith("xx");
  }

  /**
   * Given a string, return a new string made of every other char (every second char) starting with
   * the first, so "Hello" yields "Hlo".
   *
   * @param text input string
   * @return the above mentioned new string
   */
  String stringBits(String text) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < text.length(); i += 2) {
      builder.append(text.charAt(i));
    }
    return builder.toString();
  }

  /**
   * Given a non-empty string like "Code" return a string like "CCoCodCode".
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  String stringSplosion(String text) {
    StringBuilder builder = new StringBuilder();
    for (int i = 1; i <= text.length(); i++) {
      String part = text.substring(0, i);
      builder.append(part);
    }
    return builder.toString();
  }

  /**
   * Given a string, return the count of the number of times that a substring length 2 appears in
   * the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count
   * the end substring).
   *
   * @param text the input string
   * @return the above mentioned number
   */
  int last2(String text) {
    int result = 0;
    String endPart = text.length() > 1 ? text.substring(text.length() - 2) : "";
    for (int i = 0; i < text.length() - 2; i++) {
      String part = text.substring(i, i + 2);
      if (part.equals(endPart)) {
        result++;
      }
    }
    return result;
  }

  /**
   * Given an array of ints, return the number of 9's in the array.
   *
   * @param numbers the input numbers
   * @return the above mentioned number
   */
  int arrayCount9(int[] numbers) {
    int amountOf9 = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 9) {
        amountOf9++;
      }
    }
    return amountOf9;
  }

  /**
   * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The
   * array length may be less than 4.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean arrayFront9(int[] numbers) {
    for (int i = 0; i < numbers.length && i < 4; i++) {
      if (numbers[i] == 9) {
        return true;
      }
    }
    return false;
  }

  /**
   * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean array123(int[] numbers) {
    for (int i = 0; i < numbers.length - 2; i++) {
      boolean numberOnePresent = numbers[i] == 1;
      boolean numberTwoPresent = numbers[i + 1] == 2;
      boolean numberThreePresent = numbers[i + 2] == 3;
      if (numberOnePresent && numberTwoPresent && numberThreePresent) {
        return true;
      }
    }
    return false;
  }

  /**
   * Given 2 strings, a and b, return the number of the positions where they contain the same length
   * 2 substring. So "xxcaazz" and "xxbaaz" yields 3, since the "xx", "aa", and "az" substrings
   * appear in the same place in both strings.
   *
   * @param aText the first input string
   * @param bText the second input string
   * @return the above mentioned number
   */
  int stringMatch(String aText, String bText) {
    int minLength = Math.min(aText.length(), bText.length());
    int amountOfSameStringPart = 0;

    for (int i = 0; i < minLength - 1; i++) {
      String aTextPart = aText.substring(i, i + 2);
      String bTextPart = bText.substring(i, i + 2);
      if (aTextPart.equals(bTextPart)) {
        amountOfSameStringPart++;
      }
    }

    return amountOfSameStringPart;
  }

  /**
   * Given a string, return a version where all the "x" have been removed. Except an "x" at the very
   * start or end should not be removed.
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  String stringX(String text) {
    if (text.length() > 2) {
      String withoutStartEnd = text.substring(1, text.length() - 1);
      withoutStartEnd = withoutStartEnd.replaceAll("x", "");
      char startChar = text.charAt(0);
      char endChar = text.charAt(text.length() - 1);
      return startChar + withoutStartEnd + endChar;
    } else {
      return text;
    }
  }

  /**
   * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens"
   * yields "kien".
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  String altPairs(String text) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < text.length(); i = i + 4) {
      int endPosition = i + 2;
      endPosition = Math.min(text.length(), endPosition);
      String part = text.substring(i, endPosition);
      builder.append(part);
    }

    return builder.toString();
  }

  /**
   * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are
   * removed, but the "a" can be any char. The "yak" strings will not overlap.
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  String stringYak(String text) {
    return text.replaceAll("y.k", "");
  }

  /**
   * Given an array of ints, return the number of times that two 6's are next to each other in the
   * array. Also count instances where the second "6" is actually a 7.
   *
   * @param numbers the input numbers
   * @return the above mentioned number
   */
  int array667(int[] numbers) {
    int amountOf66And67 = 0;
    for (int i = 0; i < numbers.length - 1; i++) {
      boolean firstNumberIsSix = numbers[i] == 6;
      boolean secondNumberIsSixOrSeven = numbers[i + 1] == 6 || numbers[i + 1] == 7;
      if (firstNumberIsSix && secondNumberIsSixOrSeven) {
        amountOf66And67++;
      }
    }
    return amountOf66And67;
  }

  /**
   * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the
   * array. Return true if the array does not contain any triples.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean noTriples(int[] numbers) {
    int sameNumberInRow = 1;
    for (int i = 0; i < numbers.length - 1; i++) {
      boolean nextIsSameNumber = numbers[i] == numbers[i + 1];
      if (nextIsSameNumber) {
        sameNumberInRow++;
      } else {
        sameNumberInRow = 1;
      }
      if (sameNumberInRow == 3) {
        return false;
      }
    }
    return true;
  }

  /**
   * Given an array of ints, return true if it contains a 2, 7, 1 pattern -- a value, followed by
   * the value plus 5, followed by the value minus 1. Additionally the 271 counts even if the "1"
   * differs by 2 or less from the correct value.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean has271(int[] numbers) {
    for (int i = 0; i < numbers.length - 2; i++) {
      int value = numbers[i];
      boolean valueWithPlusFive = numbers[i + 1] == value + 5;
      boolean valueDifferTwoOrLess = Math.abs(numbers[i + 2] - (value - 1)) <= 2;
      if (valueWithPlusFive && valueDifferTwoOrLess) {
        return true;
      }
    }
    return false;
  }
}
