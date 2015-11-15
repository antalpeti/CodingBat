package com.codingbat.logic1;

/**
 * The class Logic1 is contains solution for Logic-1 section.
 */
public class Logic1 {

  /**
   * When squirrels get together for a party, they like to have cigars. A squirrel party is
   * successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend,
   * in which case there is no upper bound on the number of cigars. Return true if the party with
   * the given values is successful, or false otherwise.
   *
   * @param cigars the number of cigars
   * @param isWeekend the weekend indicator
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean cigarParty(int cigars, boolean isWeekend) {
    boolean partyIsSuccessfulAtWeekday = 39 < cigars && cigars < 61 && !isWeekend;
    boolean partyIsSuccessfulAtWeekend = 39 < cigars && isWeekend;

    return partyIsSuccessfulAtWeekday || partyIsSuccessfulAtWeekend;
  }

  /**
   * You and your date are trying to get a table at a restaurant. The parameter "you" is the
   * stylishness of your clothes, in the range 0..10, and "date" is the stylishness of your date's
   * clothes. The result getting the table is encoded as an int value with 0=no, 1=maybe, 2=yes. If
   * either of you is very stylish, 8 or more, then the result is 2 (yes). With the exception that
   * if either of you has style of 2 or less, then the result is 0 (no). Otherwise the result is 1
   * (maybe).
   *
   * @param you the stylishness of your clothes
   * @param date the stylishness of your date's clothes
   * @return one of the above mentioned number
   */
  public int dateFashion(int you, int date) {
    if (you < 3 || date < 3) {
      return 0;
    } else if (you > 7 || date > 7) {
      return 2;
    } else {
      return 1;
    }
  }
}
