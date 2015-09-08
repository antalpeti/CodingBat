package com.codingbat.string2;


/**
 * The class String2 is contains solution for String-2 section.
 */
public class String2 {

  /**
   * Given a string, return a string where for every char in the original, there are two chars.
   *
   * @param str the input string
   * @return an above described new string
   */
  public String doubleChar(String str) {
    String doubleStr = "";
    for (int i = 0; i < str.length(); i++) {
      String ch = str.charAt(i) + "";
      doubleStr += ch + ch;
    }
    return doubleStr;
  }

  /**
   * Return the number of times that the string "hi" appears anywhere in the given string.
   *
   * @param str the input string
   * @return the number of times that the string "hi" appears anywhere in the given string
   */
  public int countHi(String str) {
    int count = 0;
    int index = 0;
    while (index != -1) {
      index = str.indexOf("hi", index);
      if (index != -1) {
        count++;
        index++;
      }
    }
    return count;
  }

  /**
   * Return true if the string "cat" and "dog" appear the same number of times in the given string.
   *
   * @param str the input string
   * @return true, if the string "cat" and "dog" appear the same number of times in the given string
   */
  public boolean catDog(String str) {
    int countCat = 0;
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).equals("cat")) {
        countCat++;
      }
    }
    int countDog = 0;
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).equals("dog")) {
        countDog++;
      }
    }
    return countCat == countDog;
  }

  /**
   * Return the number of times that the string "code" appears anywhere in the given string, except
   * we'll accept any letter for the 'd', so "cope" and "cooe" count.
   *
   * @param str the input string
   * @return the number of the above defined substring
   */
  public int countCode(String str) {
    str = str.replaceAll("co.e", "*");
    int count = 0;
    for (int i = 0; i < str.length(); i++) {
      count = str.charAt(i) == '*' ? count + 1 : count;
    }
    return count;
  }

  /**
   * Given two strings, return true if either of the strings appears at the very end of the other
   * string, ignoring upper/lower case differences (in other words, the computation should not be
   * "case sensitive"). Note: str.toLowerCase() returns the lowercase version of a string.
   *
   * @param a the first string
   * @param b the second string
   * @return true, if either of the strings appears at the very end of the other string
   */
  public boolean endOther(String a, String b) {
    a = a.toLowerCase();
    b = b.toLowerCase();
    return a.endsWith(b) || b.endsWith(a);
  }

  /**
   * Return true if the given string contains an appearance of "xyz" where the xyz is not directly
   * preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
   *
   * @param str the input string
   * @return true, if appears the above described substring
   */
  public boolean xyzThere(String str) {
    boolean ok = false;
    for (int i = 0; i < str.length() - 2; i++) {
      if (str.substring(i, i + 3).equals("xyz")) {
        if (i == 0) {
          ok = true;
        }
        if (i > 0 && str.charAt(i - 1) != '.') {
          ok = true;
        }
      }
    }
    return ok;
  }

  /**
   * Return true if the given string contains a "bob" string, but where the middle 'o' char can be
   * any char.
   *
   * @param str the input string
   * @return true, if appears the above described substring
   */
  public boolean bobThere(String str) {
    if (str.length() < 3) {
      return false;
    } else {
      for (int i = 0; i < str.length() - 2; i++) {
        if (str.charAt(i) == 'b' && str.charAt(i + 2) == 'b') {
          return true;
        }
      }
    }
    return false;
  }

  /**
   * We'll say that a String is xy-balanced if for all the 'x' chars in the string, there exists a
   * 'y' char somewhere later in the string. So "xxy" is balanced, but "xyx" is not. One 'y' can
   * balance multiple 'x's. Return true if the given string is xy-balanced.
   *
   * @param str the input string
   * @return true, if the above described condition is fulfilled
   */
  public boolean xyBalance(String str) {
    int indexOfX = str.lastIndexOf('x');
    int indexOfY = str.lastIndexOf('y');
    return indexOfY >= indexOfX;
  }

  /**
   * Given two strings, A and B, create a bigger string made of the first char of A, the first char
   * of B, the second char of A, the second char of B, and so on. Any leftover chars go at the end
   * of the result.
   *
   * @param a the first string
   * @param b the second string
   * @return the above described new string
   */
  public String mixString(String a, String b) {
    int maxLength = Math.max(a.length(), b.length());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < maxLength; i++) {
      if (i < a.length()) {
        sb.append(a.charAt(i));
      }
      if (i < b.length()) {
        sb.append(b.charAt(i));
      }
    }
    return sb.toString();
  }

  /**
   * Given a string and an int N, return a string made of N repetitions of the last N characters of
   * the string. You may assume that N is between 0 and the length of the string, inclusive.
   *
   * @param str the input string
   * @param n the repetition
   * @return the above described news string
   */
  public String repeatEnd(String str, int n) {
    String rep = str.substring(str.length() - n, str.length());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(rep);
    }
    return sb.toString();
  }
}