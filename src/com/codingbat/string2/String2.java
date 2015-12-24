package com.codingbat.string2;

import java.util.Locale;

/**
 * The class String2 is contains solution for String-2 section.
 */
class String2 {

  /**
   * Given a string, return a string where for every char in the original, there are two chars.
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  String doubleChar(String text) {
    StringBuilder builder = new StringBuilder();

    for (int i = 0; i < text.length(); i++) {
      char part = text.charAt(i);
      builder.append(part);
      builder.append(part);
    }

    return builder.toString();
  }

  /**
   * Return the number of times that the string "hi" appears anywhere in the given string.
   *
   * @param text the input string
   * @return the above mentioned new number
   */
  int countHi(String text) {
    int count = 0;
    int index = 0;

    while (index != -1) {
      index = text.indexOf("hi", index);
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
   * @param text the input string
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean catDog(String text) {
    int catCount = 0;

    for (int index = 0; index < text.length() - 2; index++) {
      if (text.substring(index, index + 3).equals("cat")) {
        catCount++;
      }
    }

    int dogCount = 0;
    for (int index = 0; index < text.length() - 2; index++) {
      if (text.substring(index, index + 3).equals("dog")) {
        dogCount++;
      }
    }

    return catCount == dogCount;
  }

  /**
   * Return the number of times that the string "code" appears anywhere in the given string, except
   * we'll accept any letter for the 'd', so "cope" and "cooe" count.
   *
   * @param text the input string
   * @return the above mentioned new number
   */
  int countCode(String text) {
    text = text.replaceAll("co.e", "*");

    int count = 0;
    for (int index = 0; index < text.length(); index++) {
      if (text.charAt(index) == '*') {
        count = count + 1;
      }
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
  boolean endOther(String a, String b) {
    a = a.toLowerCase(Locale.getDefault());
    b = b.toLowerCase(Locale.getDefault());
    return a.endsWith(b) || b.endsWith(a);
  }

  /**
   * Return true if the given string contains an appearance of "xyz" where the xyz is not directly
   * preceeded by a period (.). So "xxyz" counts but "x.xyz" does not.
   *
   * @param str the input string
   * @return true, if appears the above described substring
   */
  boolean xyzThere(String str) {
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
  boolean bobThere(String str) {
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
  boolean xyBalance(String str) {
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
  String mixString(String a, String b) {
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
  String repeatEnd(String str, int n) {
    String rep = str.substring(str.length() - n, str.length());
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n; i++) {
      sb.append(rep);
    }
    return sb.toString();
  }

  /**
   * Given a string and an int n, return a string made of the first n characters of the string,
   * followed by the first n-1 characters of the string, and so on. You may assume that n is between
   * 0 and the length of the string, inclusive (i.e. n >= 0 and n <= str.length()).
   *
   * @param str the input string
   * @param n the n >= 0 and n <= str.length()
   * @return the above described new string
   */
  String repeatFront(String str, int n) {
    n = str.length() < n ? str.length() : n;
    StringBuilder sb = new StringBuilder();
    while (n > 0) {
      sb.append(str.substring(0, n--));
    }
    return sb.toString();
  }

  /**
   * Given two strings, word and a separator, return a big string made of count occurences of the
   * word, separated by the separator string.
   *
   * @param word the input word
   * @param sep the separator
   * @param count the count
   * @return the above described new string
   */
  String repeatSeparator(String word, String sep, int count) {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      sb.append(word);
      sb.append(sep);
    }
    sb.delete(sb.length() - sep.length(), sb.length());
    return sb.toString();
  }

  /**
   * Given a string, consider the prefix string made of the first N chars of the string. Does that
   * prefix string appear somewhere else in the string? Assume that the string is not empty and that
   * N is in the range 1..str.length().
   *
   * @param str the input string
   * @param n the prefix length
   * @return true, if the above defined appearance fulfill
   */
  boolean prefixAgain(String str, int n) {
    String prefix = str.substring(0, n);
    String sub = str.substring(n);
    return sub.contains(prefix);
  }

  /**
   * Given a string, does "xyz" appear in the middle of the string? To define middle, we'll say that
   * the number of chars to the left and right of the "xyz" must differ by at most one. This problem
   * is harder than it looks.
   *
   * @param str the input string
   * @return true, if the above described restriction fulfill
   */
  boolean xyzMiddle(String str) {
    boolean middle = false;
    int length = str.length();
    if (length >= 3) {
      int pos = str.indexOf("xyz");
      do {
        int leftSideChars = pos;
        int rightSideChars = length - 3 - pos;
        middle = Math.abs(leftSideChars - rightSideChars) < 2 ? true : false;
        pos = str.indexOf("xyz", pos + 1);
      } while (pos != -1 && middle != true);
    }
    return middle;
  }

  /**
   * A sandwich is two pieces of bread with something in between. Return the string that is between
   * the first and last appearance of "bread" in the given string, or return the empty string "" if
   * there are not two pieces of bread.
   *
   * @param str the input string
   * @return the above described new string
   */
  String getSandwich(String str) {
    String bread = "bread";
    String filling = "";
    int firstSlicePos = str.indexOf(bread);
    int lastSlicePos = str.lastIndexOf(bread);
    if (firstSlicePos != -1 && firstSlicePos != lastSlicePos) {
      filling = str.substring(firstSlicePos + bread.length(), lastSlicePos);
    }
    return filling;
  }

  /**
   * Returns true if for every '*' (star) in the string, if there are chars both immediately before
   * and after the star, they are the same.
   *
   * @param str the input string
   * @return true, if the above described restriction fulfill
   */
  boolean sameStarChar(String str) {
    for (int i = 1; i < str.length() - 1; i++) {
      if (str.charAt(i) == '*' && str.charAt(i - 1) != str.charAt(i + 1)) {
        return false;
      }
    }
    return true;
  }

  /**
   * Given a string, compute a new string by moving the first char to come after the next two chars,
   * so "abc" yields "bca". Repeat this process for each subsequent group of 3 chars, so "abcdef"
   * yields "bcaefd". Ignore any group of fewer than 3 chars at the end.
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  String oneTwo(String text) {
    StringBuilder builder = new StringBuilder();

    for (int index = 0; index < text.length(); index = index + 3) {
      if (index + 2 < text.length()) {
        char frontPart = text.charAt(index);
        String endPart = text.substring(index + 1, index + 3);
        builder.append(endPart);
        builder.append(frontPart);
      }
    }

    return builder.toString();
  }


  /**
   * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending
   * with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap"
   * yields "zpXzp".
   *
   * @param str the input string
   * @return the above described new string
   */
  String zipZap(String str) {
    return str.replaceAll("z.p", "zp");
  }

  /**
   * Return a version of the given string, where for every star (*) in the string the star and the
   * chars immediately to its left and right are gone. So "ab*cd" yields "ad" and "ab**cd" also
   * yields "ad".
   *
   * @param str
   * @return
   */
  String starOut(String str) {
    return str.replaceAll(".{0,1}\\*+.{0,1}", "");
  }

  /**
   * Given a string and a non-empty word string, return a version of the original String where all
   * chars have been replaced by pluses ("+"), except for appearances of the word string which are
   * preserved unchanged.
   *
   * @param text the input text
   * @param word the word
   * @return the above described new string
   */
  String plusOut(String text, String word) {
    String wordWithoutPlusSign = word.replaceAll("\\+", "");
    String plusSignWithWord;

    if (!wordWithoutPlusSign.isEmpty()) {
      String wordReplacedWithEqualSign = text.replaceAll(wordWithoutPlusSign, "=");
      String otherCharsReplacedWithPlusSign = wordReplacedWithEqualSign.replaceAll("[^=]", "+");
      plusSignWithWord = otherCharsReplacedWithPlusSign.replaceAll("=", word);
    } else {
      plusSignWithWord = text.replaceAll(".", "+");
    }

    return plusSignWithWord;
  }

  /**
   * Given a string and a non-empty word string, return a string made of each char just before and
   * just after every appearance of the word in the string. Ignore cases where there is no char
   * before or after the word, and a char may be included twice if it is between two words.
   *
   * @param str the input string
   * @param word the word
   * @return the above described new string
   */
  String wordEnds(String str, String word) {
    StringBuilder sb = new StringBuilder();
    int actualWordStartPosition = 0;
    while (actualWordStartPosition != -1) {
      actualWordStartPosition = str.indexOf(word, actualWordStartPosition);
      if (actualWordStartPosition - 1 >= 0) {
        sb.append(str.charAt(actualWordStartPosition - 1));
      }
      if (actualWordStartPosition != -1 && actualWordStartPosition + word.length() < str.length()) {
        sb.append(str.charAt(actualWordStartPosition + word.length()));
      }
      actualWordStartPosition = actualWordStartPosition == -1 ? -1 : actualWordStartPosition + 1;
    }
    return sb.toString();
  }
}
