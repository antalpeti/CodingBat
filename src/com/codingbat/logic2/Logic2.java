package com.codingbat.logic2;

/**
 * The class Logic2 is contains solution for Logic-2 section.
 */
class Logic2 {

  /**
   * We want to make a row of bricks that is goal inches long. We have a number of small bricks (1
   * inch each) and big bricks (5 inches each). Return true if it is possible to make the goal by
   * choosing from the given bricks. This is a little harder than it looks and can be done without
   * any loops.
   *
   * @param smallBricks the number of small bricks
   * @param bigBricks the number of big bricks
   * @param goal the goal to reach
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean makeBricks(int smallBricks, int bigBricks, int goal) {
    int bigBrickLength = 5;
    int bigBricksNeeded = goal / bigBrickLength;

    int availableLength = bigBrickLength * bigBricks + smallBricks;
    if (availableLength < goal) {
      return false;
    } else if (bigBricksNeeded * bigBrickLength + smallBricks < goal) {
      return false;
    }
    return true;
  }

  /**
   * Given 3 int values, a b c, return their sum. However, if one of the values is the same as
   * another of the values, it does not count towards the sum.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @param cNumber the third number
   * @return the above mentioned new number
   */
  int loneSum(int aNumber, int bNumber, int cNumber) {
    int sum = 0;
    boolean aIsUnique = aNumber != bNumber && aNumber != cNumber;

    if (aIsUnique) {
      sum += aNumber;
    }

    boolean bIsUnique = bNumber != aNumber && bNumber != cNumber;
    if (bIsUnique) {
      sum += bNumber;
    }

    boolean cIsUnique = cNumber != aNumber && cNumber != bNumber;
    if (cIsUnique) {
      sum += cNumber;
    }

    return sum;
  }

  /**
   * Given 3 int values, a b c, return their sum. However, if one of the values is 13 then it does
   * not count towards the sum and values to its right do not count. So for example, if b is 13,
   * then both b and c do not count.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @param cNumber the third number
   * @return the above mentioned new number
   */
  int luckySum(int aNumber, int bNumber, int cNumber) {
    int result = aNumber + bNumber + cNumber;

    int luckyNumber = 13;
    if (aNumber == luckyNumber) {
      result = 0;
    } else if (bNumber == luckyNumber) {
      result -= bNumber + cNumber;
    } else if (cNumber == luckyNumber) {
      result -= cNumber;
    }

    return result;
  }

  /**
   * Given 3 int values, a b c, return their sum. However, if any of the values is a teen -- in the
   * range 13..19 inclusive -- then that value counts as 0, except 15 and 16 do not count as a
   * teens.
   *
   * @param aTeen the first teen
   * @param bTeen the second teen
   * @param cTeen the third teen
   * @return the above mentioned new number
   */
  int noTeenSum(int aTeen, int bTeen, int cTeen) {
    return fixTeen(aTeen) + fixTeen(bTeen) + fixTeen(cTeen);
  }

  /**
   * Separate helper for {@link #fixTeen(int) fixTeen} method.
   *
   * @param age the age
   * @return the filtered age
   */
  int fixTeen(int age) {
    if (age >= 13 && age < 15 || age > 16 && age <= 19) {
      return 0;
    }
    return age;
  }

  /**
   * For this problem, we'll round an int value up to the next multiple of 10 if its rightmost digit
   * is 5 or more, so 15 rounds up to 20. Alternately, round down to the previous multiple of 10 if
   * its rightmost digit is less than 5, so 12 rounds down to 10. Given 3 ints, a b c, return the
   * sum of their rounded values.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @param cNumber the third number
   * @return the above mentioned new number
   */
  int roundSum(int aNumber, int bNumber, int cNumber) {
    return roundTo10(aNumber) + roundTo10(bNumber) + roundTo10(cNumber);
  }

  /**
   * Helper function to round a value based on its last digit.
   *
   * @param number the number
   * @return the above mentioned new number
   */
  int roundTo10(int number) {
    double divided = number / 10.0;
    divided = Math.round(divided);
    return (int) (divided * 10);
  }

  /**
   * Given three ints, a b c, return true if one of b or c is "close" (differing from a by at most
   * 1), while the other is "far", differing from both other values by 2 or more.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @param cNumber the third number
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean closeFar(int aNumber, int bNumber, int cNumber) {
    boolean bIsClose = Math.abs(bNumber - aNumber) <= 1;
    boolean cIsFar = Math.abs(cNumber - aNumber) >= 2;
    boolean cIsClose = Math.abs(cNumber - aNumber) <= 1;
    boolean bIsFar = Math.abs(bNumber - aNumber) >= 2;
    boolean abAreFar = Math.abs(cNumber - bNumber) >= 2;

    return abAreFar && (bIsClose && cIsFar || cIsClose && bIsFar);
  }

  /**
   * Given 2 int values greater than 0, return whichever value is nearest to 21 without going over.
   * Return 0 if they both go over.
   *
   * @param aNumber the first number
   * @param bNumber the second number
   * @return the above mentioned new number
   */
  public int blackjack(int aNumber, int bNumber) {
    int treshold = 21;
    aNumber = aNumber > treshold ? 0 : aNumber;
    bNumber = bNumber > treshold ? 0 : bNumber;

    return aNumber > bNumber ? aNumber : bNumber;
  }
}
