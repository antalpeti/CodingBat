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

}
