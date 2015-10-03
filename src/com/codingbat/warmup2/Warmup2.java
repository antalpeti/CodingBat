package com.codingbat.warmup2;

/**
 * The class Warmup2 is contains solution for Warmup-2 section.
 */
public class Warmup2 {

  /**
   * Given a string and a non-negative int n, return a larger string that is n copies of the
   * original string.
   *
   * @param string the input string
   * @param number the number of copies
   * @return the above mentioned new string
   */
  public String stringTimes(String string, int number) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < number; i++) {
      builder.append(string);
    }
    return builder.toString();
  }

  /**
   * Given a string and a non-negative int n, we'll say that the front of the string is the first 3
   * chars, or whatever is there if the string is less than length 3. Return n copies of the front;
   *
   * @param string the input string
   * @param number the number of copies
   * @return the above mentioned new string
   */
  public String frontTimes(String string, int number) {
    int frontLength = 3;
    StringBuilder builder = new StringBuilder();
    String frontPart = string.length() > frontLength ? string.substring(0, frontLength) : string;
    for (int i = 0; i < number; i++) {
      builder.append(frontPart);
    }
    return builder.toString();
  }

  /**
   * Count the number of "xx" in the given string. We'll say that overlapping is allowed, so "xxx"
   * contains 2 "xx".
   *
   * @param string the input string
   * @return the above defined number
   */
  public int countXX(String string) {
    int numberOfXX = 0;
    for (int i = 0; i < string.length() - 1; i++) {
      if ("xx".equals(string.substring(i, i + 2))) {
        ++numberOfXX;
      }
    }
    return numberOfXX;
  }

  /**
   * Given a string, return true if the first instance of "x" in the string is immediately followed
   * by another "x".
   *
   * @param string the input string
   * @return true, if the above defined conditions fulfilled
   */
  boolean doubleX(String string) {
    int i = string.indexOf("x");
    if (i == -1) {
      return false;
    }
    String startWithXSubstring = string.substring(i);
    return startWithXSubstring.startsWith("xx");
  }

  /**
   * Given a string, return a new string made of every other char (every second char) starting with
   * the first, so "Hello" yields "Hlo".
   *
   * @param string input string
   * @return the above defined new string
   */
  public String stringBits(String string) {
    StringBuilder builder = new StringBuilder();
    for (int i = 0; i < string.length(); i += 2) {
      builder.append(string.charAt(i));
    }
    return builder.toString();
  }

  /**
   * Given a non-empty string like "Code" return a string like "CCoCodCode".
   *
   * @param string the input string
   * @return the above defined new string
   */
  public String stringSplosion(String string) {
    StringBuilder builder = new StringBuilder();
    for (int i = 1; i <= string.length(); i++) {
      String part = string.substring(0, i);
      builder.append(part);
    }
    return builder.toString();
  }

  /**
   * Given a string, return the count of the number of times that a substring length 2 appears in
   * the string and also as the last 2 chars of the string, so "hixxxhi" yields 1 (we won't count
   * the end substring).
   *
   * @param string the input string
   * @return the above defined number
   */
  public int last2(String string) {
    int result = 0;
    String endPart = string.length() > 1 ? string.substring(string.length() - 2) : "";
    for (int i = 0; i < string.length() - 2; i++) {
      String part = string.substring(i, i + 2);
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
   * @return the above defined number
   */
  public int arrayCount9(int[] numbers) {
    int numberOf9 = 0;
    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] == 9) {
        numberOf9++;
      }
    }
    return numberOf9;
  }

  /**
   * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The
   * array length may be less than 4.
   *
   * @param numbers the input numbers
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean arrayFront9(int[] numbers) {
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
  public boolean array123(int[] numbers) {
    for (int i = 0; i < numbers.length - 2; i++) {
      boolean one = numbers[i] == 1;
      boolean two = numbers[i + 1] == 2;
      boolean three = numbers[i + 2] == 3;
      if (one && two && three) {
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
   * @param aString the first input string
   * @param bString the second input string
   * @return the above defined number
   */
  public int stringMatch(String aString, String bString) {
    int minLength = Math.min(aString.length(), bString.length());
    int numberOfSameStringPart = 0;

    for (int i = 0; i < minLength - 1; i++) {
      String aStringPart = aString.substring(i, i + 2);
      String bStringPart = bString.substring(i, i + 2);
      if (aStringPart.equals(bStringPart)) {
        numberOfSameStringPart++;
      }
    }

    return numberOfSameStringPart;
  }

  /**
   * Given a string, return a version where all the "x" have been removed. Except an "x" at the very
   * start or end should not be removed.
   *
   * @param string the input string
   * @return the above mentioned new string
   */
  public String stringX(String string) {
    if (string.length() > 2) {
      String withoutStartEnd = string.substring(1, string.length() - 1);
      withoutStartEnd = withoutStartEnd.replaceAll("x", "");
      char startChar = string.charAt(0);
      char endChar = string.charAt(string.length() - 1);
      return startChar + withoutStartEnd + endChar;
    } else {
      return string;
    }
  }

  /**
   * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens"
   * yields "kien".
   *
   * @param string the input string
   * @return the above mentioned new string
   */
  public String altPairs(String string) {
    String result = "";
    for (int i = 0; i < string.length(); i = i + 4) {
      int endPosition = i + 2;
      endPosition = Math.min(string.length(), endPosition);
      String part = string.substring(i, endPosition);
      result = result + part;
    }
    return result;
  }

  /**
   * Suppose the string "yak" is unlucky. Given a string, return a version where all the "yak" are
   * removed, but the "a" can be any char. The "yak" strings will not overlap.
   *
   * @param str the input string
   * @return a string without the y.k substring
   */
  public String stringYak(String str) {
    return str.replaceAll("y.k", "");
  }

  /**
   * Given an array of ints, return the number of times that two 6's are next to each other in the
   * array. Also count instances where the second "6" is actually a 7.
   *
   * @param nums the input numbers
   * @return the number of times that two 6's are next to each other in the array, or 7's come after
   *         the 6's
   */
  public int array667(int[] nums) {
    int count = 0;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == 6 && (nums[i + 1] == 6 || nums[i + 1] == 7)) {
        count++;
      }
    }
    return count;
  }

  /**
   * Given an array of ints, we'll say that a triple is a value appearing 3 times in a row in the
   * array. Return true if the array does not contain any triples.
   *
   * @param nums the input numbers
   * @return true, if the array does not contain any triples
   */
  public boolean noTriples(int[] nums) {
    int count = 1;
    for (int i = 0; i < nums.length - 1; i++) {
      if (nums[i] == nums[i + 1]) {
        count++;
      } else {
        count = 1;
      }
      if (count == 3) {
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
   * @param nums the input numbers
   * @return true, if the input numbers fulfill the above restrictions
   */
  public boolean has271(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      int val = nums[i];
      if (nums[i + 1] == val + 5 && Math.abs(nums[i + 2] - (val - 1)) <= 2) {
        return true;
      }
    }
    return false;
  }
}
