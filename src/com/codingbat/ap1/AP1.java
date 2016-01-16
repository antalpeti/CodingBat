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
}
