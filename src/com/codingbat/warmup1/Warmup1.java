package com.codingbat.warmup1;

/**
 * The Class Warmup1 is contains solution for Warmup-1 section.
 */
public class Warmup1 {

  /**
   * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are
   * on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep
   * in.
   *
   * @param weekday the weekday indicate it is a weekday
   * @param vacation the vacation indicate it is a vacation
   * @return true, if sleep in
   */
  public boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday || vacation;
  }
}
