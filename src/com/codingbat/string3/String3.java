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

}
