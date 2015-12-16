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
    } else {
      if (bigBricksNeeded < bigBricks && bigBricks * bigBrickLength + smallBricks < goal) {
        return false;
      } else if (bigBricksNeeded * bigBrickLength + smallBricks < goal) {
        return false;
      }
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
}
