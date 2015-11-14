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
}
