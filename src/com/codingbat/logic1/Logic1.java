package com.codingbat.logic1;

/**
 * The class Logic1 is contains solution for Logic-1 section.
 */
class Logic1 {

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
  boolean cigarParty(int cigars, boolean isWeekend) {
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
  int dateFashion(int you, int date) {
    if (you < 3 || date < 3) {
      return 0;
    } else if (you > 7 || date > 7) {
      return 2;
    } else {
      return 1;
    }
  }

  /**
   * The squirrels in Palo Alto spend most of the day playing. In particular, they play if the
   * temperature is between 60 and 90 (inclusive). Unless it is summer, then the upper limit is 100
   * instead of 90. Given an int temperature and a boolean isSummer, return true if the squirrels
   * play and false otherwise.
   *
   * @param temperature the temperature
   * @param isSummer the summer indicator
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean squirrelPlay(int temperature, boolean isSummer) {
    if (isSummer) {
      return 60 <= temperature && temperature <= 100;
    } else {
      return 60 <= temperature && temperature <= 90;
    }
  }

  /**
   * You are driving a little too fast, and a police officer stops you. Write code to compute the
   * result, encoded as an int value: 0=no ticket, 1=small ticket, 2=big ticket. If speed is 60 or
   * less, the result is 0. If speed is between 61 and 80 inclusive, the result is 1. If speed is 81
   * or more, the result is 2. Unless it is your birthday -- on that day, your speed can be 5 higher
   * in all cases.
   *
   * @param speed the driving speed
   * @param isBirthday the birthday indicator
   * @return the above mentioned number
   */
  int caughtSpeeding(int speed, boolean isBirthday) {
    int noTicket = 0;
    int smallTicket = 1;
    int bigTicket = 2;
    int receivedTicket = -1;

    if (!isBirthday) {
      if (speed <= 60) {
        receivedTicket = noTicket;
      } else if (speed <= 80) {
        receivedTicket = smallTicket;
      } else {
        receivedTicket = bigTicket;
      }
    } else {
      if (speed <= 65) {
        receivedTicket = noTicket;
      } else if (speed <= 85) {
        receivedTicket = smallTicket;
      } else {
        receivedTicket = bigTicket;
      }
    }

    return receivedTicket;
  }

  /**
   * Given 2 ints, a and b, return their sum. However, sums in the range 10..19 inclusive, are
   * forbidden, so in that case just return 20.
   *
   * @param aNumber the a number
   * @param bNumber the b number
   * @return the above mentioned number
   */
  public int sortaSum(int aNumber, int bNumber) {
    int sum = aNumber + bNumber;
    boolean sumIsForbidden = 10 <= sum && sum <= 19;

    if (sumIsForbidden) {
      sum = 20;
    }

    return sum;
  }
}
