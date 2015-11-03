package com.codingbat.string1;

/**
 * The class String1 is contains solution for String-1 section.
 */
public class String1 {

  /**
   * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
   *
   * @param name the input name
   * @return the above mentioned new string
   */
  public String helloName(String name) {
    return "Hello " + name + "!";
  }

  /**
   * Given two strings, a and b, return the result of putting them together in the order abba, e.g.
   * "Hi" and "Bye" returns "HiByeByeHi".
   *
   * @param aText the first input string
   * @param bText the second input string
   * @return the above mentioned new string
   */
  public String makeAbba(String aText, String bText) {
    return aText + bText + bText + aText;
  }

  /**
   * The web is built with HTML strings like "<i>Yay</i>" which draws Yay as italic text. In this
   * example, the "i" tag makes <i> and </i> which surround the word "Yay". Given tag and word
   * strings, create the HTML string with tags around the word, e.g. "<i>Yay</i>".
   *
   * @param tag the input tag string
   * @param word the input word string
   * @return the above mentioned new string
   */
  public String makeTags(String tag, String word) {
    return "<" + tag + ">" + word + "</" + tag + ">";
  }

  /**
   * Given an "out" string length 4, such as "<<>>", and a word, return a new string where the word
   * is in the middle of the out string, e.g. "<<word>>". Note: use str.substring(i, j) to extract
   * the String starting at index i and going up to but not including index j.
   *
   * @param out the input outer string
   * @param word the input word string
   * @return the above defined new string
   */
  public String makeOutWord(String out, String word) {
    return out.substring(0, 2) + word + out.substring(2, 4);
  }

  /**
   * Given a string, return a new string made of 3 copies of the last 2 chars of the original
   * string. The string length will be at least 2.
   *
   * @param str the input string
   * @return a new string made of 3 copies of the last 2 chars
   */
  public String extraEnd(String str) {
    String end = str.substring(str.length() - 2);
    return end + end + end;
  }

  /**
   * Given a string, return the string made of its first two chars, so the String "Hello" yields
   * "He". If the string is shorter than length 2, return whatever there is, so "X" yields "X", and
   * the empty string "" yields the empty string "". Note that str.length() returns the length of a
   * string.
   *
   * @param str the input string
   * @return the above defined substring of the input string
   */
  public String firstTwo(String str) {
    return str.length() < 2 ? str : str.substring(0, 2);
  }

  /**
   * Given a string of even length, return the first half. So the string "WooHoo" yields "Woo".
   *
   * @param str the input string
   * @return the first half of the input string
   */
  public String firstHalf(String str) {
    return str.substring(0, str.length() / 2);
  }

  /**
   * Given a string, return a version without the first and last char, so "Hello" yields "ell". The
   * string length will be at least 2.
   *
   * @param str the input string
   * @return the input string without the first and last char
   */
  public String withoutEnd(String str) {
    return str.length() > 1 ? str.substring(1, str.length() - 1) : "";
  }

  /**
   * Given 2 strings, a and b, return a string of the form short+long+short, with the shorter string
   * on the outside and the longer string on the inside. The strings will not be the same length,
   * but they may be empty (length 0).
   *
   * @param a the first input string
   * @param b the second input string
   * @return a string of the form short+long+short input strings
   */
  public String comboString(String a, String b) {
    return a.length() > b.length() ? b + a + b : a + b + a;
  }

  /**
   * Given 2 strings, return their concatenation, except omit the first char of each. The strings
   * will be at least length 1.
   *
   * @param a the first input string
   * @param b the second input string
   * @return the concatenation of the input strings without the first chars
   */
  public String nonStart(String a, String b) {
    String shortA = a.length() > 0 ? a.substring(1) : a;
    String shortB = b.length() > 0 ? b.substring(1) : b;
    return shortA + shortB;
  }

  /**
   * Given a string, return a "rotated left 2" version where the first 2 chars are moved to the end.
   * The string length will be at least 2.
   *
   * @param str the input string
   * @return the rotated left 2 version of the input string
   */
  public String left2(String str) {
    return str.length() > 2 ? str.substring(2) + str.substring(0, 2) : str;
  }

  /**
   * Given a string, return a "rotated right 2" version where the last 2 chars are moved to the
   * start. The string length will be at least 2.
   *
   * @param str the input string
   * @return the rotated right 2 version of the input string
   */
  public String right2(String str) {
    return str.length() > 2 ? str.substring(str.length() - 2) + str.substring(0, str.length() - 2)
        : str;
  }

  /**
   * Given a string, return a string length 1 from its front, unless front is false, in which case
   * return a string length 1 from its back. The string will be non-empty.
   *
   * @param str the input string
   * @param front request the front or the back part of the input string
   * @return the front or the back part of the input string
   */
  public String theEnd(String str, boolean front) {
    return front && str.length() > 0 ? str.substring(0, 1) : str.substring(str.length() - 1,
        str.length());
  }

  /**
   * Given a string, return a version without both the first and last char of the string. The string
   * may be any length, including 0.
   *
   * @param str the input string
   * @return a version without both the first and last char of the input string
   */
  public String withouEnd2(String str) {
    return str.length() > 2 ? str.substring(1, str.length() - 1) : "";
  }

  /**
   * Given a string of even length, return a string made of the middle two chars, so the string
   * "string" yields "ri". The string length will be at least 2.
   *
   * @param str the input string with even length
   * @return a string made of the middle two chars
   */
  public String middleTwo(String str) {
    return str.length() > 1 ? str.substring(str.length() / 2 - 1, str.length() / 2 + 1) : str;
  }

  /**
   * Given a string, return true if it ends in "ly".
   *
   * @param str the input string
   * @return true, if the string ends with "ly"
   */
  public boolean endsLy(String str) {
    return str.length() > 1 ? str.substring(str.length() - 2, str.length()).equals("ly") : false;
  }

  /**
   * Given a string and an int n, return a string made of the first and last n chars from the
   * string. The string length will be at least n.
   *
   * @param str the input string
   * @param n the number of chars from the front and the back of the input string
   * @return a string made of the first and last n chars
   */
  public String nTwice(String str, int n) {
    return str.length() > n - 1 ? str.substring(0, n)
        + str.substring(str.length() - n, str.length()) : str;
  }

  /**
   * Given a string and an index, return a string length 2 starting at the given index. If the index
   * is too big or too small to define a string length 2, use the first 2 chars. The string length
   * will be at least 2.
   *
   * @param str the input string
   * @param index the start index from the input string
   * @return a string length 2 starting at the given index
   */
  public String twoChar(String str, int index) {
    return index > 0 && index < str.length() - 1 ? str.substring(index, index + 2) : str.substring(
        0, 2);
  }

  /**
   * Given a string of odd length, return the string length 3 from its middle, so "Candy" yields
   * "and". The string length will be at least 3.
   *
   * @param str the input string
   * @return the string length 3 from its middle of the input string
   */
  public String middleThree(String str) {
    int middlePoint = str.length() / 2;
    return str.length() > 2 ? str.substring(middlePoint - 1, middlePoint + 2) : str;
  }

  /**
   * Given a string, return true if "bad" appears starting at index 0 or 1 in the string, such as
   * with "badxxx" or "xbadxx" but not "xxbadxx". The string may be any length, including 0.
   *
   * @param str the input string
   * @return true, if "bad" appears starting at index 0 or 1 in the string
   */
  public boolean hasBad(String str) {
    String word = "bad";
    // this is a short but not efficient solution because of the whole string check
    int indexOf = str.indexOf(word);
    return indexOf == 0 || indexOf == 1;
  }

  /**
   * Given a string, return a string length 2 made of its first 2 chars. If the string length is
   * less than 2, use '@' for the missing chars.
   *
   * @param str the input string
   * @return a string length 2 made of its first 2 chars
   */
  public String atFirst(String str) {
    return str.length() > 1 ? str.substring(0, 2) : (str + "@@").substring(0, 2);
  }

  /**
   * Given 2 strings, a and b, return a new string made of the first char of a and the last char of
   * b, so "yo" and "java" yields "ya". If either string is length 0, use '@' for its missing char.
   *
   * @param a the first input string
   * @param b the second input string
   * @return a new string made of the first char of a and the last char of b
   */
  public String lastChars(String a, String b) {
    String result = "";
    if (a.isEmpty()) {
      result += "@";
    } else {
      result += a.charAt(0);
    }
    if (b.isEmpty()) {
      result += "@";
    } else {
      result += b.charAt(b.length() - 1);
    }
    return result;
  }

  /**
   * Given two strings, append them together (known as "concatenation") and return the result.
   * However, if the concatenation creates a double-char, then omit one of the chars, so "abc" and
   * "cat" yields "abcat".
   *
   * @param a the first input string
   * @param b the second input string
   * @return the concatenation of the two input strings
   */
  public String conCat(String a, String b) {
    String res = "";
    if (a.length() > 0 && b.length() > 0) {
      if (a.charAt(a.length() - 1) == b.charAt(0)) {
        res = a + b.substring(1);
      } else {
        res = a + b;
      }
    } else {
      res = a + b;
    }
    return res;
  }

  /**
   * Given a string of any length, return a new string where the last 2 chars, if present, are
   * swapped, so "coding" yields "codign".
   *
   * @param str the input string
   * @return a new string where the last 2 chars, are swapped
   */
  public String lastTwo(String str) {
    return str.length() > 1 ? str.substring(0, str.length() - 2) + str.charAt(str.length() - 1)
        + str.charAt(str.length() - 2) : str;
  }

  /**
   * Given a string, if the string begins with "red" or "blue" return that color string, otherwise
   * return the empty string.
   *
   * @param str the input string
   * @return a "red", a "blue" or an empty string
   */
  public String seeColor(String str) {
    if (str.startsWith("red")) {
      return "red";
    }
    if (str.startsWith("blue")) {
      return "blue";
    }
    return "";
  }

  /**
   * Given a string, return true if the first 2 chars in the string also appear at the end of the
   * string, such as with "edited".
   *
   * @param str the input string
   * @return true if the first 2 chars in the string also appear at the end of the string
   */
  public boolean frontAgain(String str) {
    if (str.length() > 1 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
      return true;
    }
    return false;
  }

  /**
   * Given two strings, append them together (known as "concatenation") and return the result.
   * However, if the strings are different lengths, omit chars from the longer string so it is the
   * same length as the shorter string. So "Hello" and "Hi" yield "loHi". The strings may be any
   * length.
   *
   * @param a the first string
   * @param b the second string
   * @return the above described concatenation
   */
  public String minCat(String a, String b) {
    if (a.length() > b.length()) {
      return a.substring(a.length() - b.length()) + b;
    } else {
      return a + b.substring(b.length() - a.length());
    }
  }

  /**
   * Given a string, return a new string made of 3 copies of the first 2 chars of the original
   * string. The string may be any length. If there are fewer than 2 chars, use whatever is there.
   *
   * @param str the input string
   * @return a new string made of 3 copies of the first 2 chars of the input string
   */
  public String extraFront(String str) {
    String base = str.length() > 2 ? str.substring(0, 2) : str;
    return base + base + base;
  }

  /**
   * Given a string, if a length 2 substring appears at both its beginning and end, return a string
   * without the substring at the beginning, so "HelloHe" yields "lloHe". The substring may overlap
   * with itself, so "Hi" yields "". Otherwise, return the original string unchanged.
   *
   * @param str the input string
   * @return an above defined new string
   */
  public String without2(String str) {
    if (str.length() > 2 && str.substring(0, 2).equals(str.substring(str.length() - 2))) {
      return str.substring(2);
    }
    if (str.length() == 2) {
      return "";
    }
    return str;
  }

  /**
   * Given a string, return a version without the first 2 chars. Except keep the first char if it is
   * 'a' and keep the second char if it is 'b'. The string may be any length. Harder than it looks.
   *
   * @param str the input string
   * @return an above defined new string
   */
  public String deFront(String str) {
    if (!str.isEmpty()) {
      if (str.length() > 1) {
        if (str.charAt(0) == 'a' && str.charAt(1) != 'b') {
          return "a" + str.substring(2);
        } else if (str.charAt(0) != 'a' && str.charAt(1) == 'b') {
          return str.substring(1);
        } else if (str.charAt(1) != 'b') {
          return str.substring(2);
        }
      }
      if (str.length() == 1) {
        if (str.charAt(0) != 'a') {
          return "";
        }
      }
    }
    return str;
  }

  /**
   * Given a string and a second "word" string, we'll say that the word matches the string if it
   * appears at the front of the string, except its first char does not need to match exactly. On a
   * match, return the front of the string, or otherwise return the empty string. So, so with the
   * string "hippo" the word "hi" returns "hi" and "xip" returns "hip". The word will be at least
   * length 1.
   *
   * @param str the input string
   * @param word the input word
   * @return an above defined new string
   */
  public String startWord(String str, String word) {
    if (str.length() > 0 && word.length() > 0) {
      String strSub = str.substring(1);
      String wordSub = word.substring(1);
      if (strSub.startsWith(wordSub)) {
        return str.charAt(0) + wordSub;
      }
    }
    return "";
  }

  /**
   * Given a string, if the first or last chars are 'x', return the string without those 'x' chars,
   * and otherwise return the string unchanged.
   *
   * @param str the input string
   * @return an above defined new string
   */
  public String withoutX(String str) {
    if (str.length() > 0 && str.charAt(0) == 'x') {
      str = str.substring(1);
    }

    if (str.length() > 0 && str.charAt(str.length() - 1) == 'x') {
      str = str.substring(0, str.length() - 1);
    }
    return str;
  }

  /**
   * Given a string, if one or both of the first 2 chars is 'x', return the string without those 'x'
   * chars, and otherwise return the string unchanged. This is a little harder than it looks.
   *
   * @param str the input string
   * @return an above described new string
   */
  public String withoutX2(String str) {
    if (str.length() == 1 && str.charAt(0) == 'x') {
      return "";
    }
    if (str.length() >= 2) {
      if (str.charAt(0) == 'x' && str.charAt(1) != 'x') {
        return str.substring(1);
      } else if (str.charAt(0) != 'x' && str.charAt(1) == 'x') {
        return str.charAt(0) + str.substring(2);
      } else if (str.charAt(0) == 'x') {
        return str.substring(2);
      }
    }
    return str;
  }
}
