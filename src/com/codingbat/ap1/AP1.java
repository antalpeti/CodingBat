package com.codingbat.ap1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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
  boolean scoresClump(int[] scores) {
    for (int i = 0; i < scores.length - 2; i++) {
      boolean firstComparison = Math.abs(scores[i] - scores[i + 1]) <= 2;
      boolean secondComparison = Math.abs(scores[i] - scores[i + 2]) <= 2;
      if (firstComparison && secondComparison) {
        return true;
      }
    }
    return false;
  }

  /**
   * Given an array of scores, compute the int average of the first half and the second half, and
   * return whichever is larger. We'll say that the second half begins at index length/2. The array
   * length will be at least 2.
   *
   * @param scores the input scores
   * @return the above mentioned new number
   */
  int scoresAverage(int[] scores) {
    int firstHalf = calculateAverage(scores, 0, scores.length / 2);
    int secondHalf = calculateAverage(scores, scores.length / 2, scores.length);

    return firstHalf > secondHalf ? firstHalf : secondHalf;
  }

  /**
   * Helper function for {@link #scoresAverage(int[])} Computes the average of the elements between
   * indexes start..end.
   *
   * @param scores the input scores
   * @param start the start index
   * @param end the end index
   * @return the above mentioned new number
   */
  int calculateAverage(int[] scores, int start, int end) {
    int sum = 0;
    for (int i = start; i < end; i++) {
      sum += scores[i];
    }

    return sum / (end - start);
  }

  /**
   * Given an array of strings, return the count of the number of strings with the given length.
   *
   * @param words the input words
   * @param length the length of word
   * @return the above mentioned new number
   */
  int wordsCount(String[] words, int length) {
    int countOfWordsWithGivenLength = 0;

    for (int i = 0; i < words.length; i++) {
      if (words[i].length() == length) {
        countOfWordsWithGivenLength++;
      }
    }

    return countOfWordsWithGivenLength;
  }

  /**
   * Given an array of strings, return a new array containing the first N strings. N will be in the
   * range 1..length.
   *
   * @param words the input words
   * @param number the input number
   * @return the above mentioned new array
   */
  String[] wordsFront(String[] words, int number) {
    return Arrays.copyOfRange(words, 0, number);
  }

  /**
   * Given an array of strings, return a new List (e.g. an ArrayList) where all the strings of the
   * given length are omitted.
   *
   * @param words the input words
   * @param length the given length
   * @return the above mentioned new list
   */
  List<String> wordsWithoutList(String[] words, int length) {
    List<String> lengthOmittedList = new ArrayList<String>();
    for (int i = 0; i < words.length; i++) {
      if (words[i].length() != length) {
        lengthOmittedList.add(words[i]);
      }
    }

    return lengthOmittedList;
  }

  /**
   * Given a positive int n, return true if it contains a 1 digit.
   *
   * @param number the input number
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean hasOne(int number) {
    while (number != 0) {
      if (number % 10 == 1) {
        return true;
      }
      number /= 10;
    }

    return false;
  }

  /**
   * We'll say that a positive int divides itself if every digit in the number divides into the
   * number evenly. So for example 128 divides itself since 1, 2, and 8 all divide into 128 evenly.
   * We'll say that 0 does not divide into anything evenly, so no number with a 0 digit divides
   * itself.
   *
   * @param number the input number
   * @return true, if the above mentioned conditions fulfilled
   */
  boolean dividesSelf(int number) {
    int dividend = number;
    while (dividend != 0) {
      int remainder = dividend % 10;
      dividend = dividend / 10;
      if (remainder == 0 || number % remainder != 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Given an array of positive ints, return a new array of length "count" containing the first even
   * numbers from the original array. The original array will contain at least "count" even numbers.
   *
   * @param numbers the input numbers
   * @param count the given count
   * @return the above mentioned new array
   */
  int[] copyEvens(int[] numbers, int count) {
    int[] evens = new int[count];
    int evenIndex = 0;

    for (int i = 0; i < numbers.length; i++) {
      if (numbers[i] % 2 == 0) {
        evens[evenIndex++] = numbers[i];
        if (evenIndex == count) {
          break;
        }
      }
    }

    return evens;
  }

  /**
   * We'll say that a positive int n is "endy" if it is in the range 0..10 or 90..100 (inclusive).
   * Given an array of positive ints, return a new array of length "count" containing the first endy
   * numbers from the original array. The original array will contain at least "count" endy numbers.
   *
   * @param numbers the input numbers
   * @param count the given count
   * @return the above mentioned new array
   */
  int[] copyEndy(int[] numbers, int count) {
    int[] endies = new int[count];
    int endiesIndex = 0;

    for (int i = 0; i < numbers.length; i++) {
      boolean insideLowerRange = numbers[i] >= 0 && numbers[i] <= 10;
      boolean insideUpperRange = numbers[i] >= 90 && numbers[i] <= 100;
      if (insideLowerRange || insideUpperRange) {
        endies[endiesIndex++] = numbers[i];
        if (endiesIndex == count) {
          break;
        }
      }
    }

    return endies;
  }

  /**
   * Given 2 arrays that are the same length containing strings, compare the 1st string in one array
   * to the 1st string in the other array, the 2nd to the 2nd and so on. Count the number of times
   * that the 2 strings are non-empty and start with the same char. The strings may be any length,
   * including 0.
   *
   * @param a the first array
   * @param b the second array
   * @return the above mentioned new number
   */
  int matchUp(String[] a, String[] b) {
    int sameCharCount = 0;

    for (int i = 0; i < a.length; i++) {
      boolean empty = a[i].isEmpty() || b[i].isEmpty();
      if (empty) {
        continue;
      }
      boolean sameFirstChar = a[i].charAt(0) == b[i].charAt(0);
      if (sameFirstChar) {
        sameCharCount++;
      }
    }

    return sameCharCount;
  }

  /**
   * The "key" array is an array containing the correct answers to an exam, like {"a", "a", "b",
   * "b"}. the "answers" array contains a student's answers, with "?" representing a question left
   * blank. The two arrays are not empty and are the same length. Return the score for this array of
   * answers, giving +4 for each correct answer, -1 for each incorrect answer, and +0 for each blank
   * answer.
   *
   * @param key the key array
   * @param answers the answers array
   * @return the above mentioned number
   */
  int scoreUp(String[] key, String[] answers) {
    int points = 0;

    for (int i = 0; i < key.length; i++) {
      boolean blankAnswer = answers[i].equals("?");
      boolean rightAnswer = key[i] == answers[i];

      if (blankAnswer) {
        continue;
      } else if (rightAnswer) {
        points += 4;
      } else {
        points -= 1;
      }
    }

    return points;
  }

  /**
   * Given an array of strings, return a new array without the strings that are equal to the target
   * string. One approach is to count the occurrences of the target string, make a new array of the
   * correct length, and then copy over the correct strings. Another approach is to convert it to a
   * list then remove all the target elements an finally convert it back to an array.
   *
   * @param words the words array
   * @param target the target word
   * @return the above mentioned new array
   */
  String[] wordsWithout(String[] words, String target) {
    ArrayList<String> wordsList = new ArrayList<String>(Arrays.asList(words));
    while (wordsList.remove(target)) {
    }

    return wordsList.toArray(new String[wordsList.size()]);
  }

  /**
   * Given two arrays, A and B, of non-negative int scores. A "special" score is one which is a
   * multiple of 10, such as 40 or 90. Return the sum of largest special score in A and the largest
   * special score in B.
   *
   * @param aScores the first scores
   * @param bScores the second scores
   * @return the above mentioned number
   */
  int scoresSpecial(int[] aScores, int[] bScores) {
    return findLargestSpecialScore(aScores) + findLargestSpecialScore(bScores);
  }

  /**
   * Helper method which finds the largest special score in an array.
   *
   * @param scores the input scores
   * @return the above mentioned number
   */
  int findLargestSpecialScore(int[] scores) {
    int maxScore = 0;
    for (int score : scores) {
      maxScore = score % 10 == 0 && score > maxScore ? score : maxScore;
    }
    return maxScore;
  }

  /**
   * We have an array of heights, representing the altitude along a walking trail. Given start/end
   * indexes into the array, return the sum of the changes for a walk beginning at the start index
   * and ending at the end index. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4
   * yields a sum of |6 - 7| + |7 - 2| = 1 + 5 = 6. The start and end index will both be valid
   * indexes into the array with start <= end.
   *
   * @param heights the input heights
   * @param startIndex the start index
   * @param endIndex the end index
   * @return the above mentioned number
   */
  int sumHeights(int[] heights, int startIndex, int endIndex) {
    int changes = 0;
    for (int i = startIndex; i < endIndex; i++) {
      changes += Math.abs(heights[i] - heights[i + 1]);
    }
    return changes;
  }

  /**
   * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude
   * along a walking trail. Given start/end indexes into the array, return the sum of the changes
   * for a walk beginning at the start index and ending at the end index, however increases in
   * height count double. For example, with the heights {5, 3, 6, 7, 2} and start=2, end=4 yields a
   * sum of 1*2 + 5 = 7. The start end end index will both be valid indexes into the array with
   * start <= end.
   *
   * @param heights the input heights
   * @param startIndex the start index
   * @param endIndex the end index
   * @return the above mentioned number
   */
  int sumHeights2(int[] heights, int startIndex, int endIndex) {
    int changes = 0;

    for (int i = startIndex; i < endIndex; i++) {
      if (heights[i] < heights[i + 1]) {
        changes += (heights[i + 1] - heights[i]) * 2;
      } else {
        changes += heights[i] - heights[i + 1];
      }
    }

    return changes;
  }

  /**
   * (A variation on the sumHeights problem.) We have an array of heights, representing the altitude
   * along a walking trail. Given start/end indexes into the array, return the number of "big" steps
   * for a walk starting at the start index and ending at the end index. We'll say that step is big
   * if it is 5 or more up or down. The start end end index will both be valid indexes into the
   * array with start <= end.
   *
   * @param heights the input heights
   * @param startIndex the start index
   * @param endIndex the end index
   * @return the above mentioned number
   */
  int bigHeights(int[] heights, int startIndex, int endIndex) {
    int bigSteps = 0;

    for (int i = startIndex; i < endIndex; i++) {
      if (Math.abs(heights[i] - heights[i + 1]) >= 5) {
        ++bigSteps;
      }
    }

    return bigSteps;
  }

  /**
   * We have data for two users, A and B, each with a String name and an int id. The goal is to
   * order the users such as for sorting. Return -1 if A comes before B, 1 if A comes after B, and 0
   * if they are the same. Order first by the string names, and then by the id numbers if the names
   * are the same.
   *
   * @param aName the first input name
   * @param aId the first input id
   * @param bName the second input name
   * @param bId the second input id
   * @return the above mentioned new number
   */
  public int userCompare(String aName, int aId, String bName, int bId) {
    float comparison = Math.signum(aName.compareTo(bName));
    if (comparison == 0) {
      comparison = Math.signum(aId - bId);
    }
    return (int) comparison;
  }
}
