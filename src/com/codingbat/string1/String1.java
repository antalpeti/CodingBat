package com.codingbat.string1;

/**
 * The class String1 is contains solution for String-1 section.
 */
public class String1 {

  /**
   * Given a string name, e.g. "Bob", return a greeting of the form "Hello Bob!".
   *
   * @param name the input name
   * @return a greeting of the form "Hello " + input name
   */
  public String helloName(String name) {
    return "Hello " + name + "!";
  }

  /**
   * Given two strings, a and b, return the result of putting them together in the order abba, e.g.
   * "Hi" and "Bye" returns "HiByeByeHi".
   *
   * @param a the first input string
   * @param b the second input string
   * @return the concatenation of the first and the second strings as described above
   */
  public String makeAbba(String a, String b) {
    return a + b + b + a;
  }
}
