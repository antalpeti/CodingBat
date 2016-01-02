package com.codingbat.string3;

/**
 * The class String3 is contains solution for String-3 section.
 */
class String3 {

  /**
   * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the
   * 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z
   * is at the end of a word if there is not an alphabetic letter immediately following it. (Note:
   * Character.isLetter(char) tests if a char is an alphabetic letter.)
   *
   * @param text the input string
   * @return the above mentioned new number
   */
  int countYZ(String text) {
    int count = 0;

    if (isYZ(text.charAt(text.length() - 1))) {
      count++;
    }
    for (int i = 0; i < text.length() - 1; i++) {
      if (isYZ(text.charAt(i)) && !Character.isLetter(text.charAt(i + 1))) {
        count++;
      }
    }
    return count;
  }

  /**
   * Helper method to check a character is 'y' or 'z'.
   *
   * @param character the input character
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean isYZ(char character) {
    character = Character.toLowerCase(character);
    return character == 'y' || character == 'z';
  }

  /**
   * Given two strings, base and remove, return a version of the base string where all instances of
   * the remove string have been removed (not case sensitive). You may assume that the remove string
   * is length 1 or more. Remove only non-overlapping instances, so with "xxx" removing "xx" leaves
   * "x".
   *
   * @param baseText the base string
   * @param removeText the remove string
   * @return the above mentioned new string
   */
  String withoutString(String baseText, String removeText) {
    return baseText.replaceAll("(?i)" + removeText, "");
  }

  /**
   * Given a string, return true if the number of appearances of "is" anywhere in the string is
   * equal to the number of appearances of "not" anywhere in the string (case sensitive).
   *
   * @param text the input string
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean equalIsNot(String text) {
    int isCount = text.split("is", -1).length - 1;
    int notCount = text.split("not", -1).length - 1;

    return isCount == notCount;
  }

  /**
   * We'll say that a lowercase 'g' in a string is "happy" if there is another 'g' immediately to
   * its left or right. Return true if all the g's in the given string are happy.
   *
   * @param text the input string
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean gHappy(String text) {
    String result = text.replaceAll("gg+", "");
    return result.indexOf("g") == -1;
  }

  /**
   * We'll say that a "triple" in a string is a char appearing three times in a row. Return the
   * number of triples in the given string. The triples may overlap.
   *
   * @param text the input string
   * @return the above mentioned new number
   */
  int countTriple(String text) {
    int triple = 0;

    for (int i = 0; i < text.length() - 2; i++) {
      boolean tripleFrontPart = text.charAt(i) == text.charAt(i + 1);
      boolean tripleBackPart = text.charAt(i) == text.charAt(i + 2);

      if (tripleFrontPart && tripleBackPart) {
        triple++;
      }
    }

    return triple;
  }

  /**
   * Given a string, return the sum of the digits 0-9 that appear in the string, ignoring all other
   * characters. Return 0 if there are no digits in the string. (Note: Character.isDigit(char) tests
   * if a char is one of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to
   * an int.)
   *
   * @param text the input string
   * @return the above mentioned new number
   */
  int sumDigits(String text) {
    int sum = 0;

    for (int i = 0; i < text.length(); i++) {
      char c = text.charAt(i);
      if (Character.isDigit(c)) {
        sum += Character.getNumericValue(c);
      }
    }

    return sum;
  }

  /**
   * Given a string, return the longest substring that appears at both the beginning and end of the
   * string without overlapping. For example, sameEnds("abXab") is "ab".
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  String sameEnds(String text) {
    String longestSameEnd = "";

    for (int i = 1; i <= text.length() / 2; i++) {
      String end = text.substring(0, i);
      if (text.startsWith(end) && text.endsWith(end)) {
        longestSameEnd = end;
      }
    }

    return longestSameEnd;
  }
}
