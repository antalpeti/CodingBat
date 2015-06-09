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

  /**
   * We have two monkeys, a and b, and the parameters aSmile and bSmile indicate if each is smiling.
   * We are in trouble if they are both smiling or if neither of them is smiling. Return true if we
   * are in trouble.
   *
   * @param aSmile the first monkey is smiling
   * @param bSmile the second monkey is smiling
   * @return true, if we are in trouble
   */
  public boolean monkeyTrouble(boolean aSmile, boolean bSmile) {
    return aSmile && bSmile || !aSmile && !bSmile;
  }
}
