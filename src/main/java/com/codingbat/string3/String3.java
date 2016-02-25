package main.java.com.codingbat.string3;




/**
 * The class String3 is contains solution for String-3 section.
 */
public class String3 {

  /**
   * Given a string, count the number of words ending in 'y' or 'z' -- so the 'y' in "heavy" and the
   * 'z' in "fez" count, but not the 'y' in "yellow" (not case sensitive). We'll say that a y or z
   * is at the end of a word if there is not an alphabetic letter immediately following it. (Note:
   * Character.isLetter(char) tests if a char is an alphabetic letter.)
   *
   * @param text the input string
   * @return the above mentioned new number
   */
  public int countYZ(String text) {
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
  public boolean isYZ(char character) {
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
  public String withoutString(String baseText, String removeText) {
    return baseText.replaceAll("(?i)" + removeText, "");
  }

  /**
   * Given a string, return true if the number of appearances of "is" anywhere in the string is
   * equal to the number of appearances of "not" anywhere in the string (case sensitive).
   *
   * @param text the input string
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean equalIsNot(String text) {
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
  public boolean gHappy(String text) {
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
  public int countTriple(String text) {
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
  public int sumDigits(String text) {
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
  public String sameEnds(String text) {
    String maxSameEnd = "";

    for (int i = 1; i <= text.length() / 2; i++) {
      String part = text.substring(0, i);
      if (text.endsWith(part)) {
        maxSameEnd = part;
      }
    }

    return maxSameEnd;
  }

  /**
   * Given a string, look for a mirror image (backwards) string at both the beginning and end of the
   * given string. In other words, zero or more characters at the very beginning of the given
   * string, and at the very end of the string in reverse order (possibly overlapping). For example,
   * the string "abXYZba" has the mirror end "ab".
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  public String mirrorEnds(String text) {
    String maxMirroredPart = "";

    for (int index = 1; index <= text.length(); index++) {
      String part = text.substring(0, index);
      String reversedPart = new StringBuilder(part).reverse().toString();

      if (text.endsWith(reversedPart)) {
        maxMirroredPart = part;
      }
    }

    return maxMirroredPart;
  }

  /**
   * Given a string, return the length of the largest "block" in the string. A block is a run of
   * adjacent chars that are the same.
   *
   * @param text the input string
   * @return the above mentioned new number
   */
  public int maxBlock(String text) {
    int maxBlockSize = 0;
    int actualBlockSize = 0;

    for (int index = 0; index < text.length(); index++) {
      actualBlockSize++;

      if (index == text.length() - 1) {

        maxBlockSize = maxNumber(maxBlockSize, actualBlockSize);
      } else if (text.charAt(index) != text.charAt(index + 1)) {

        maxBlockSize = maxNumber(maxBlockSize, actualBlockSize);
        actualBlockSize = 0;
      }
    }

    return maxBlockSize;
  }

  /**
   * Give back bigger number.
   *
   * @param maxBlockSize the first input number
   * @param actualBlockSize the second input number
   * @return the above mentioned new number
   */
  public int maxNumber(int maxBlockSize, int actualBlockSize) {
    if (maxBlockSize < actualBlockSize) {
      maxBlockSize = actualBlockSize;
    }
    return maxBlockSize;
  }

  /**
   * Given a string, return the sum of the numbers appearing in the string, ignoring all other
   * characters. A number is a series of 1 or more digit chars in a row.
   *
   * @param text the input string
   * @return the above mentioned new number
   */
  public int sumNumbers(String text) {
    int sum = 0;
    int numberStartIndex = -1;
    for (int index = 0; index < text.length(); index++) {
      // find start position
      if (Character.isDigit(text.charAt(index))
          && (index == 0 || !Character.isDigit(text.charAt(index - 1)))) {
        numberStartIndex = index;
      }
      // find the end of digit(s)
      if (!Character.isDigit(text.charAt(index)) && numberStartIndex != -1) {
        String number = text.substring(numberStartIndex, index);
        sum += Integer.parseInt(number);
        numberStartIndex = -1;
      }
      // last character is digit
      if (index == text.length() - 1 && numberStartIndex != -1) {
        String number = text.substring(numberStartIndex, index + 1);
        sum += Integer.parseInt(number);
      }
    }

    return sum;
  }

  /**
   * Given a string, return a string where every appearance of the lowercase word "is" has been
   * replaced with "is not". The word "is" should not be immediately preceeded or followed by a
   * letter -- so for example the "is" in "this" does not count.
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  public String notReplace(String text) {
    return text.replaceAll("\\bis\\b", "is not");
  }
}
