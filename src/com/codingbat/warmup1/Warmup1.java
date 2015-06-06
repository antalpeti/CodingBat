package com.codingbat.warmup1;

public class Warmup1 {
  /**
   * The parameter weekday is true if it is a weekday, and the parameter vacation is true if we are
   * on vacation. We sleep in if it is not a weekday or we're on vacation. Return true if we sleep
   * in.
   * 
   * @param weekday
   * @param vacation
   * @return
   */
  public boolean sleepIn(boolean weekday, boolean vacation) {
    return !weekday || vacation;
  }
}
