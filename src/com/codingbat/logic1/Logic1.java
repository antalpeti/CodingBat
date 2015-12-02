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
  int sortaSum(int aNumber, int bNumber) {
    int sum = aNumber + bNumber;
    boolean sumIsForbidden = 10 <= sum && sum <= 19;

    if (sumIsForbidden) {
      sum = 20;
    }

    return sum;
  }

  /**
   * Given a day of the week encoded as 0=Sun, 1=Mon, 2=Tue, ...6=Sat, and a boolean indicating if
   * we are on vacation, return a string of the form "7:00" indicating when the alarm clock should
   * ring. Weekdays, the alarm should be "7:00" and on the weekend it should be "10:00". Unless we
   * are on vacation -- then on weekdays it should be "10:00" and weekends it should be "off".
   *
   * @param actualDay the day of the week
   * @param onVacation the vacation indicator
   * @return the above mentioned new string
   */
  String alarmClock(int actualDay, boolean onVacation) {
    int monday = 1;
    int friday = 5;
    boolean itIsWeekday = monday <= actualDay && actualDay <= friday;
    String alarmTime = null;

    if (onVacation) {
      if (itIsWeekday) {
        alarmTime = "10:00";
      } else {
        alarmTime = "off";
      }
    } else {
      if (itIsWeekday) {
        alarmTime = "7:00";
      } else {
        alarmTime = "10:00";
      }
    }

    return alarmTime;
  }

  /**
   * The number 6 is a truly great number. Given two int values, a and b, return true if either one
   * is 6. Or if their sum or difference is 6. Note: the function Math.abs(num) computes the
   * absolute value of a number.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean love6(int aNumber, int bNumber) {
    boolean conditionIsFulfilled = false;

    if (aNumber == 6 || bNumber == 6) {
      conditionIsFulfilled = true;
    } else if (aNumber + bNumber == 6) {
      conditionIsFulfilled = true;
    } else if (Math.abs(aNumber - bNumber) == 6) {
      conditionIsFulfilled = true;
    }

    return conditionIsFulfilled;
  }

  /**
   * Given a number n, return true if n is in the range 1..10, inclusive. Unless "outsideMode" is
   * true, in which case return true if the number is less or equal to 1, or greater or equal to 10.
   *
   * @param number the input number
   * @param outsideMode the indicator of outside mode
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean in1To10(int number, boolean outsideMode) {
    boolean inRangeNotOutside = 1 <= number && number <= 10 && !outsideMode;
    boolean inRangeOutside = (number <= 1 || 10 <= number) && outsideMode;
    return inRangeNotOutside || inRangeOutside;
  }

  /**
   * We'll say a number is special if it is a multiple of 11 or if it is one more than a multiple of
   * 11. Return true if the given non-negative number is special.
   *
   * @param number the input number
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean specialEleven(int number) {
    boolean remainderIsZero = number % 11 == 0;
    boolean remainderIsOne = number % 11 == 1;

    return remainderIsZero || remainderIsOne;
  }

  /**
   * Return true if the given non-negative number is 1 or 2 more than a multiple of 20.
   *
   * @param number the input number
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean more20(int number) {
    boolean reminderIsOne = number % 20 == 1;
    boolean reminderIsTwo = number % 20 == 2;

    return reminderIsOne || reminderIsTwo;
  }

  /**
   * Return true if the given non-negative number is a multiple of 3 or 5, but not both.
   *
   * @param number the input number
   * @return true, if above mentioned conditions fulfilled
   */
  boolean odd35(int number) {
    boolean onlyDividableByThree = number % 3 == 0 && number % 5 != 0;
    boolean onlyDividableByFive = number % 3 != 0 && number % 5 == 0;

    return onlyDividableByThree || onlyDividableByFive;
  }

  /**
   * Return true if the given non-negative number is 1 or 2 less than a multiple of 20. So for
   * example 38 and 39 return true, but 40 returns false.
   *
   * @param number the input number
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean less20(int number) {
    boolean remainderIs19 = number % 20 == 19;
    boolean remainderIs18 = number % 20 == 18;

    return remainderIs19 || remainderIs18;
  }

  /**
   * Given a non-negative number "num", return true if num is within 2 of a multiple of 10. Note: (a
   * % b) is the remainder of dividing a by b, so (7 % 5) is 2.
   *
   * @param number the input number
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean nearTen(int number) {
    boolean remainderIsLessThan3 = number % 10 < 3;
    boolean remainderIsBiggerThan7 = number % 10 > 7;

    return remainderIsLessThan3 || remainderIsBiggerThan7;
  }

  /**
   * Given 2 ints, a and b, return their sum. However, "teen" values in the range 13..19 inclusive,
   * are extra lucky. So if either value is a teen, just return 19.
   *
   * @param aNumber the first input number
   * @param bNumber the second input number
   * @return the above mentioned new number
   */
  int teenSum(int aNumber, int bNumber) {
    int leftBound = 13;
    int rightBound = 19;
    boolean aNumberIsInTeenRange = leftBound <= aNumber && aNumber <= rightBound;
    boolean bNumberIsInTeenRange = leftBound <= bNumber && bNumber <= rightBound;

    return aNumberIsInTeenRange || bNumberIsInTeenRange ? rightBound : aNumber + bNumber;
  }

  /**
   * Your cell phone rings. Return true if you should answer it. Normally you answer, except in the
   * morning you only answer if it is your mom calling. In all cases, if you are asleep, you do not
   * answer.
   *
   * @param isMorning the morning indicator
   * @param isMom the is mom indicator
   * @param isAsleep the asleep indicator
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {

    return (!isMorning || isMom) && !isAsleep;
  }

  /**
   * We are having a party with amounts of tea and candy. Return the int outcome of the party
   * encoded as 0=bad, 1=good, or 2=great. A party is good (1) if both tea and candy are at least 5.
   * However, if either tea or candy is at least double the amount of the other one, the party is
   * great (2). However, in all cases, if either tea or candy is less than 5, the party is always
   * bad (0).
   *
   * @param tea the number of tea
   * @param candy the number of candy
   * @return the above mentioned new number
   */
  int teaParty(int tea, int candy) {
    int greatParty = 2;
    int goodParty = 1;
    int badParty = 0;

    if (tea < 5 || candy < 5) {
      return badParty;
    } else if (tea < candy * 2 && candy < tea * 2) {
      return goodParty;
    } else {
      return greatParty;
    }
  }

  /**
   * Given a string str, if the string starts with "f" return "Fizz". If the string ends with "b"
   * return "Buzz". If both the "f" and "b" conditions are true, return "FizzBuzz". In all other
   * cases, return the string unchanged.
   *
   * @param text the input string
   * @return the above mentioned new string
   */
  public String fizzString(String text) {
    StringBuilder builder = new StringBuilder();
    if (text.startsWith("f")) {
      builder.append("Fizz");
    }
    if (text.endsWith("b")) {
      builder.append("Buzz");
    }

    return builder.length() == 0 ? text : builder.toString();
  }

  /**
   * Given an int n, return the string form of the number followed by "!". So the int 6 yields "6!".
   * Except if the number is divisible by 3 use "Fizz" instead of the number, and if the number is
   * divisible by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz". Note: the % "mod"
   * operator computes the remainder after division, so 23 % 10 yields 3.
   *
   * @param number the input number
   * @return the above mentioned new string
   */
  public String fizzString2(int number) {
    StringBuilder sb = new StringBuilder();
    if (number % 3 == 0) {
      sb.append("Fizz");
    }
    if (number % 5 == 0) {
      sb.append("Buzz");
    }
    if (sb.length() == 0) {
      sb.append(number);
    }
    sb.append("!");
    return sb.toString();
  }

  /**
   * Given three ints, a b c, return true if it is possible to add two of the ints to get the third.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @param cNumber the third number
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean twoAsOne(int aNumber, int bNumber, int cNumber) {
    boolean firstIsEqual = bNumber + cNumber == aNumber;
    boolean secondIsEqual = aNumber + cNumber == bNumber;
    boolean thirdIsEqual = aNumber + bNumber == cNumber;

    return thirdIsEqual || secondIsEqual || firstIsEqual;
  }
}
