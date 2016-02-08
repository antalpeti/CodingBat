package com.codingbat.recursion1;

/**
 * The class Recursion1 is contains solution for Recursion-1 section.
 */
public class Recursion1 {

  /**
   * Given n of 1 or more, return the factorial of n, which is n * (n-1) * (n-2) ... 1. Compute the
   * result recursively (without loops).
   *
   * @param n the input number
   * @return the above mentioned new number
   */
  int factorial(int n) {
    if (n == 0 || n == 1) {
      return 1;
    }
    return n * factorial(n - 1);
  }

  /**
   * We have a number of bunnies and each bunny has two big floppy ears. We want to compute the
   * total number of ears across all the bunnies recursively (without loops or multiplication).
   *
   * @param bunnies the number of bunnies
   * @return the above mentioned new number
   */
  int bunnyEars(int bunnies) {
    if (bunnies == 0) {
      return 0;
    }
    return 2 + bunnyEars(bunnies - 1);
  }

}
