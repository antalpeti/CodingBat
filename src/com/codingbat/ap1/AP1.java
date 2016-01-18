package com.codingbat.ap1;

/**
 * The class AP1 is contains solution for AP-1 section.
 */
public class AP1 {

  /**
   * Given an array of scores, return true if each score is equal or greater than the one before.
   * The array will be length 2 or more.
   *
   * @param scores the scores
   * @return true, if successful
   */
  boolean scoresIncreasing(int[] scores) {
    for (int i = 0; i < scores.length - 1; i++) {
      if (scores[i] > scores[i + 1]) {
        return false;
      }
    }
    return true;
  }

  /**
   * Given an array of scores, return true if there are scores of 100 next to each other in the
   * array. The array length will be at least 2.
   *
   * @param scores the input scores
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean scores100(int[] scores) {
    for (int i = 0; i < scores.length - 1; i++) {
      if (scores[i] == 100 && scores[i + 1] == 100) {
        return true;
      }
    }
    return false;
  }

  /**
   * Given an array of scores sorted in increasing order, return true if the array contains 3
   * adjacent scores that differ from each other by at most 2, such as with {3, 4, 5} or {3, 5, 5}.
   *
   * @param scores the input scores
   * @return true, if the above mentioned conditions fulfilled
   */
  public boolean scoresClump(int[] scores) {
    for (int i = 0; i < scores.length - 2; i++) {
      boolean firstComparison = Math.abs(scores[i] - scores[i + 1]) <= 2;
      boolean secondComparison = Math.abs(scores[i] - scores[i + 2]) <= 2;
      if (firstComparison && secondComparison) {
        return true;
      }
    }
    return false;
  }
}
