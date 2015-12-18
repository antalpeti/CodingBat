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
  public int noTeenSum(int aTeen, int bTeen, int cTeen) {
    return fixTeen(aTeen) + fixTeen(bTeen) + fixTeen(cTeen);
  }

  /**
   * Separate helper for {@link #fixTeen(int) fixTeen} method.
   *
   * @param age the age
   * @return the filtered age
   */
  public int fixTeen(int age) {
    if (age >= 13 && age < 15 || age > 16 && age <= 19) {
      return 0;
    }
    return age;
  }
}
