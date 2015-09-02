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
}
