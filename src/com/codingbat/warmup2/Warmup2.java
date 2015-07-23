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

  /**
   * Given an array of ints, return true if one of the first 4 elements in the array is a 9. The
   * array length may be less than 4.
   *
   * @param nums the input numbers
   * @return true, if one of the first 4 elements in the array is a 9
   */
  public boolean arrayFront9(int[] nums) {
    for (int i = 0; i < nums.length && i < 4; i++) {
      if (nums[i] == 9) {
        return true;
      }
    }
    return false;
  }

  /**
   * Given an array of ints, return true if .. 1, 2, 3, .. appears in the array somewhere.
   *
   * @param nums the input numbers
   * @return true, if .. 1, 2, 3, .. appears in the array somewhere
   */
  public boolean array123(int[] nums) {
    for (int i = 0; i < nums.length - 2; i++) {
      if (nums[i] == 1 && nums[i + 1] == 2 && nums[i + 2] == 3) {
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
   * @param a the first input string
   * @param b the second input string
   * @return the number of the positions where they contain the same length 2 substring
   */
  public int stringMatch(String a, String b) {
    int len = Math.min(a.length(), b.length());
    int count = 0;

    for (int i = 0; i < len - 1; i++) {
      if (a.substring(i, i + 2).equals(b.substring(i, i + 2))) {
        count++;
      }
    }

    return count;
  }

  /**
   * Given a string, return a version where all the "x" have been removed. Except an "x" at the very
   * start or end should not be removed.
   *
   * @param str the input string
   * @return the input string version where all the 'x' have been removed, except the char at the
   *         start or end position of the original string
   */
  public String stringX(String str) {
    if (str.length() > 2) {
      String sub = str.substring(1, str.length() - 1);
      sub = sub.replaceAll("x", "");
      return str.charAt(0) + sub + str.charAt(str.length() - 1);
    } else {
      return str;
    }
  }

  /**
   * Given a string, return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so "kittens"
   * yields "kien".
   *
   * @param str the input string
   * @return a string made of the chars at indexes 0,1, 4,5, 8,9 ... so of the input string
   */
  public String altPairs(String str) {
    String out = "";
    for (int i = 0; i < str.length(); i = i + 4) {
      int end = i + 2;
      end = Math.min(str.length(), end);
      out = out + str.substring(i, end);
    }
    return out;
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
