package com.codingbat.ap1;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * The class AP1Test is contains tests for AP-1 section.
 */
public class AP1Test {

  /** The instance variable to test the not static methods. */
  private static AP1 instance;

  /**
   * Setup before the tests start.
   *
   * @throws Exception the exception if something go wrong
   */
  @BeforeClass
  public static void setUp() throws Exception {
    instance = new AP1();
  }

  /**
   * Test method for {@link AP1#scoresIncreasing(int[])}.
   */
  @Test
  public void testScoresIncreasing() {
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {1, 3, 4}));
    Assert.assertEquals(false, instance.scoresIncreasing(new int[] {1, 3, 2}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {1, 1, 4}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {1, 1, 2, 4, 4, 7}));
    Assert.assertEquals(false, instance.scoresIncreasing(new int[] {1, 1, 2, 4, 3, 7}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {-5, 4, 11}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {0, 0, 0}));
    Assert.assertEquals(true, instance.scoresIncreasing(new int[] {-19, -18, -10}));
  }

  /**
   * Test method for {@link AP1#scores100(int[])}.
   */
  @Test
  public void testScores100() {
    Assert.assertEquals(false, instance.scores100(new int[] {}));
    Assert.assertEquals(true, instance.scores100(new int[] {1, 100, 100}));
    Assert.assertEquals(false, instance.scores100(new int[] {1, 100, 99, 100}));
    Assert.assertEquals(true, instance.scores100(new int[] {100, 1, 100, 100}));
    Assert.assertEquals(false, instance.scores100(new int[] {100, 1, 100, 1}));
    Assert.assertEquals(false, instance.scores100(new int[] {1, 2, 3, 4, 5}));
    Assert.assertEquals(false, instance.scores100(new int[] {1, 2, 100, 4, 5}));
  }

  /**
   * Test method for {@link AP1#scoresClump(int[])}.
   */
  @Test
  public void testScoresClump() {
    Assert.assertEquals(false, instance.scoresClump(new int[] {}));
    Assert.assertEquals(false, instance.scoresClump(new int[] {3}));
    Assert.assertEquals(false, instance.scoresClump(new int[] {3, 4}));
    Assert.assertEquals(true, instance.scoresClump(new int[] {3, 4, 5}));
    Assert.assertEquals(false, instance.scoresClump(new int[] {3, 4, 6}));
    Assert.assertEquals(true, instance.scoresClump(new int[] {1, 3, 5, 5}));
    Assert.assertEquals(true, instance.scoresClump(new int[] {2, 4, 5, 6}));
    Assert.assertEquals(true, instance.scoresClump(new int[] {2, 4, 6, 5}));
    Assert.assertEquals(false, instance.scoresClump(new int[] {2, 4, 5, 7}));
    Assert.assertEquals(false, instance.scoresClump(new int[] {2, 4, 5, 7}));
    Assert.assertEquals(true, instance.scoresClump(new int[] {2, 4, 4, 7}));
    Assert.assertEquals(false, instance.scoresClump(new int[] {3, 3, 6, 7, 9}));
    Assert.assertEquals(true, instance.scoresClump(new int[] {3, 3, 7, 7, 9}));
    Assert.assertEquals(false, instance.scoresClump(new int[] {4, 5, 8}));
  }

  /**
   * Test method for {@link AP1#scoresAverage(int[])}.
   */
  @Test
  public void testScoresAverage() {
    Assert.assertEquals(4, instance.scoresAverage(new int[] {2, 2, 4, 4}));
    Assert.assertEquals(4, instance.scoresAverage(new int[] {4, 4, 4, 2, 2, 2}));
    Assert.assertEquals(4, instance.scoresAverage(new int[] {3, 4, 5, 1, 2, 3}));
    Assert.assertEquals(6, instance.scoresAverage(new int[] {5, 6}));
    Assert.assertEquals(5, instance.scoresAverage(new int[] {5, 4}));
    Assert.assertEquals(1, instance.scoresAverage(new int[] {1, 1}));
    Assert.assertEquals(5, instance.scoresAverage(new int[] {5, 4, 5, 6, 2, 1, 2, 3}));
  }

  /**
   * Test method for {@link AP1#calculateAverage(int[], int, int)}.
   */
  @Test
  public void testCalculateAverage() {
    Assert.assertEquals(1, instance.calculateAverage(new int[] {1, 3, 5, 7, 9}, 0, 1));
    Assert.assertEquals(2, instance.calculateAverage(new int[] {1, 3, 5, 7, 9}, 0, 2));
    Assert.assertEquals(3, instance.calculateAverage(new int[] {1, 3, 5, 7, 9}, 0, 3));
    Assert.assertEquals(4, instance.calculateAverage(new int[] {1, 3, 5, 7, 9}, 0, 4));
    Assert.assertEquals(5, instance.calculateAverage(new int[] {1, 3, 5, 7, 9}, 0, 5));
  }

  /**
   * Test method for {@link AP1#wordsCount(String[], int)}.
   */
  @Test
  public void testWordsCount() {
    Assert.assertEquals(0, instance.wordsCount(new String[] {}, 1));
    Assert.assertEquals(2, instance.wordsCount(new String[] {"a", "bb", "b", "ccc"}, 1));
    Assert.assertEquals(1, instance.wordsCount(new String[] {"a", "bb", "b", "ccc"}, 3));
    Assert.assertEquals(0, instance.wordsCount(new String[] {"a", "bb", "b", "ccc"}, 4));
    Assert.assertEquals(2, instance.wordsCount(new String[] {"xx", "yyy", "x", "yy", "z"}, 1));
    Assert.assertEquals(2, instance.wordsCount(new String[] {"xx", "yyy", "x", "yy", "z"}, 2));
    Assert.assertEquals(1, instance.wordsCount(new String[] {"xx", "yyy", "x", "yy", "z"}, 3));
  }

  /**
   * Test method for {@link AP1#wordsFront(String[], int)}.
   */
  @Test
  public void testWordsFront() {
    Assert.assertArrayEquals(new String[] {"a"},
        instance.wordsFront(new String[] {"a", "b", "c", "d"}, 1));
    Assert.assertArrayEquals(new String[] {"a", "b"},
        instance.wordsFront(new String[] {"a", "b", "c", "d"}, 2));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.wordsFront(new String[] {"a", "b", "c", "d"}, 3));
    Assert.assertArrayEquals(new String[] {"a", "b", "c", "d"},
        instance.wordsFront(new String[] {"a", "b", "c", "d"}, 4));
    Assert.assertArrayEquals(new String[] {"Hi"},
        instance.wordsFront(new String[] {"Hi", "There"}, 1));
    Assert.assertArrayEquals(new String[] {"Hi", "There"},
        instance.wordsFront(new String[] {"Hi", "There"}, 2));
  }

  /**
   * Test method for {@link AP1#wordsWithoutList(String[], int)}.
   */
  @Test
  public void testWordsWithoutList() {
    Assert.assertThat(instance.wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 1),
        CoreMatchers.hasItems("bb", "ccc"));
    Assert.assertThat(instance.wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 2),
        CoreMatchers.hasItems("a", "b", "ccc"));
    Assert.assertThat(instance.wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 3),
        CoreMatchers.hasItems("a", "bb", "b"));
    Assert.assertThat(instance.wordsWithoutList(new String[] {"a", "bb", "b", "ccc"}, 4),
        CoreMatchers.hasItems("a", "bb", "b", "ccc"));
    Assert.assertThat(instance.wordsWithoutList(new String[] {"xx", "yyy", "x", "yy", "z"}, 1),
        CoreMatchers.hasItems("xx", "yyy", "yy"));
    Assert.assertThat(instance.wordsWithoutList(new String[] {"xx", "yyy", "x", "yy", "z"}, 2),
        CoreMatchers.hasItems("yyy", "x", "z"));
    Assert.assertThat(instance.wordsWithoutList(new String[] {"xx", "yyy", "x", "yy", "z"}, 3),
        CoreMatchers.hasItems("xx", "x", "yy", "z"));
  }

  /**
   * Test method for {@link AP1#hasOne(int)}.
   */
  @Test
  public void testHasOne() {
    Assert.assertEquals(true, instance.hasOne(10));
    Assert.assertEquals(false, instance.hasOne(22));
    Assert.assertEquals(false, instance.hasOne(220));
    Assert.assertEquals(true, instance.hasOne(212));
    Assert.assertEquals(true, instance.hasOne(1));
    Assert.assertEquals(false, instance.hasOne(9));
    Assert.assertEquals(true, instance.hasOne(211112));
    Assert.assertEquals(true, instance.hasOne(121121));
    Assert.assertEquals(false, instance.hasOne(22222));
    Assert.assertEquals(true, instance.hasOne(56156));
    Assert.assertEquals(false, instance.hasOne(56556));
  }

  /**
   * Test method for {@link AP1#dividesSelf(int)}.
   */
  @Test
  public void testDividesSelf() {
    Assert.assertEquals(true, instance.dividesSelf(128));
    Assert.assertEquals(true, instance.dividesSelf(12));
    Assert.assertEquals(false, instance.dividesSelf(120));
    Assert.assertEquals(true, instance.dividesSelf(122));
    Assert.assertEquals(false, instance.dividesSelf(13));
    Assert.assertEquals(false, instance.dividesSelf(32));
    Assert.assertEquals(true, instance.dividesSelf(22));
    Assert.assertEquals(false, instance.dividesSelf(42));
    Assert.assertEquals(true, instance.dividesSelf(212));
    Assert.assertEquals(false, instance.dividesSelf(213));
    Assert.assertEquals(true, instance.dividesSelf(162));
  }

  /**
   * Test method for {@link AP1#copyEvens(int[], int)}.
   */
  @Test
  public void testCopyEvens() {
    Assert.assertArrayEquals(new int[] {}, instance.copyEvens(new int[] {}, 0));
    Assert.assertArrayEquals(new int[] {2}, instance.copyEvens(new int[] {3, 2, 4, 5, 8}, 1));
    Assert.assertArrayEquals(new int[] {2, 4}, instance.copyEvens(new int[] {3, 2, 4, 5, 8}, 2));
    Assert.assertArrayEquals(new int[] {2, 4, 8}, instance.copyEvens(new int[] {3, 2, 4, 5, 8}, 3));
    Assert.assertArrayEquals(new int[] {6}, instance.copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 1));
    Assert.assertArrayEquals(new int[] {6, 2}, instance.copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 2));
    Assert.assertArrayEquals(new int[] {6, 2, 4},
        instance.copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 3));
    Assert.assertArrayEquals(new int[] {6, 2, 4, 8},
        instance.copyEvens(new int[] {6, 1, 2, 4, 5, 8}, 4));
    Assert.assertArrayEquals(new int[] {4}, instance.copyEvens(new int[] {3, 1, 4, 1, 5}, 1));
    Assert.assertArrayEquals(new int[] {2}, instance.copyEvens(new int[] {2}, 1));
    Assert.assertArrayEquals(new int[] {6}, instance.copyEvens(new int[] {6, 2, 4, 8}, 1));
    Assert.assertArrayEquals(new int[] {6, 2}, instance.copyEvens(new int[] {6, 2, 4, 8}, 2));
    Assert.assertArrayEquals(new int[] {6, 2, 4}, instance.copyEvens(new int[] {6, 2, 4, 8}, 3));
    Assert.assertArrayEquals(new int[] {6, 2, 4, 8}, instance.copyEvens(new int[] {6, 2, 4, 8}, 4));
    Assert.assertArrayEquals(new int[] {8}, instance.copyEvens(new int[] {1, 8, 4}, 1));
    Assert.assertArrayEquals(new int[] {8, 4}, instance.copyEvens(new int[] {1, 8, 4}, 2));
    Assert.assertArrayEquals(new int[] {2, 8}, instance.copyEvens(new int[] {2, 8, 4}, 2));
  }

  /**
   * Test method for {@link AP1#copyEndy(int[], int)}.
   */
  @Test
  public void testCopyEndy() {
    Assert.assertArrayEquals(new int[] {}, instance.copyEndy(new int[] {}, 0));
    Assert.assertArrayEquals(new int[] {0, 10, 90, 100},
        instance.copyEndy(new int[] {-1, 11, 89, 101, 0, 10, 90, 100}, 4));
    Assert.assertArrayEquals(new int[] {9}, instance.copyEndy(new int[] {9, 11, 90, 22, 6}, 1));
    Assert.assertArrayEquals(new int[] {9, 90}, instance.copyEndy(new int[] {9, 11, 90, 22, 6}, 2));
    Assert.assertArrayEquals(new int[] {9, 90, 6},
        instance.copyEndy(new int[] {9, 11, 90, 22, 6}, 3));
    Assert.assertArrayEquals(new int[] {1}, instance.copyEndy(new int[] {12, 1, 1, 13, 0, 20}, 1));
    Assert.assertArrayEquals(new int[] {1, 1},
        instance.copyEndy(new int[] {12, 1, 1, 13, 0, 20}, 2));
    Assert.assertArrayEquals(new int[] {1, 1, 0},
        instance.copyEndy(new int[] {12, 1, 1, 13, 0, 20}, 3));
    Assert.assertArrayEquals(new int[] {0}, instance.copyEndy(new int[] {0}, 1));
    Assert.assertArrayEquals(new int[] {10}, instance.copyEndy(new int[] {10, 11, 90}, 1));
    Assert.assertArrayEquals(new int[] {10, 90}, instance.copyEndy(new int[] {10, 11, 90}, 2));
    Assert.assertArrayEquals(new int[] {90}, instance.copyEndy(new int[] {90, 22, 100}, 1));
    Assert.assertArrayEquals(new int[] {90, 100}, instance.copyEndy(new int[] {90, 22, 100}, 2));
    Assert.assertArrayEquals(new int[] {10},
        instance.copyEndy(new int[] {12, 11, 10, 89, 101, 4}, 1));
    Assert.assertArrayEquals(new int[] {10, 4},
        instance.copyEndy(new int[] {12, 11, 10, 89, 101, 4}, 2));
    Assert.assertArrayEquals(new int[] {2}, instance.copyEndy(new int[] {13, 2, 2, 0}, 1));
    Assert.assertArrayEquals(new int[] {2, 2}, instance.copyEndy(new int[] {13, 2, 2, 0}, 2));
    Assert.assertArrayEquals(new int[] {2, 2, 0}, instance.copyEndy(new int[] {13, 2, 2, 0}, 3));
    Assert.assertArrayEquals(new int[] {2}, instance.copyEndy(new int[] {13, 2, 13, 2, 0, 30}, 1));
    Assert.assertArrayEquals(new int[] {2, 2},
        instance.copyEndy(new int[] {13, 2, 13, 2, 0, 30}, 2));
    Assert.assertArrayEquals(new int[] {2, 2, 0},
        instance.copyEndy(new int[] {13, 2, 13, 2, 0, 30}, 3));
  }

  /**
   * Test method for {@link AP1#matchUp(String[], String[])}.
   */
  @Test
  public void testMatchUp() {
    Assert.assertEquals(1,
        instance.matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"aaa", "xx", "bb"}));
    Assert.assertEquals(2,
        instance.matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"aaa", "b", "bb"}));
    Assert.assertEquals(1,
        instance.matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"", "", "ccc"}));
    Assert.assertEquals(1,
        instance.matchUp(new String[] {"", "", "ccc"}, new String[] {"aa", "bb", "cc"}));
    Assert.assertEquals(0,
        instance.matchUp(new String[] {"", "", ""}, new String[] {"", "bb", "cc"}));
    Assert.assertEquals(0,
        instance.matchUp(new String[] {"aa", "bb", "cc"}, new String[] {"", "", ""}));
    Assert.assertEquals(1,
        instance.matchUp(new String[] {"aa", "", "ccc"}, new String[] {"", "bb", "cc"}));
    Assert.assertEquals(0,
        instance.matchUp(new String[] {"x", "y", "z"}, new String[] {"y", "z", "x"}));
    Assert.assertEquals(1,
        instance.matchUp(new String[] {"", "y", "z"}, new String[] {"", "y", "x"}));
    Assert.assertEquals(3,
        instance.matchUp(new String[] {"x", "y", "z"}, new String[] {"xx", "yyy", "zzz"}));
    Assert.assertEquals(2,
        instance.matchUp(new String[] {"x", "y", "z"}, new String[] {"xx", "yyy", ""}));
    Assert
    .assertEquals(
        3,
        instance.matchUp(new String[] {"b", "x", "y", "z"}, new String[] {"a", "xx", "yyy",
        "zzz"}));
    Assert.assertEquals(1,
        instance.matchUp(new String[] {"aaa", "bb", "c"}, new String[] {"aaa", "xx", "bb"}));
  }

  /**
   * Test method for {@link AP1#scoreUp(String[], String[])}.
   */
  @Test
  public void testScoreUp() {
    Assert.assertEquals(0, instance.scoreUp(new String[] {}, new String[] {}));
    Assert.assertEquals(2,
        instance.scoreUp(new String[] {"a", "b", "c"}, new String[] {"c", "b", "a"}));
    Assert.assertEquals(6,
        instance.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"a", "c", "b", "c"}));
    Assert.assertEquals(11,
        instance.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"a", "a", "b", "c"}));
    Assert.assertEquals(16,
        instance.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"a", "a", "b", "b"}));
    Assert.assertEquals(3,
        instance.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"?", "c", "b", "?"}));
    Assert.assertEquals(-1,
        instance.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"?", "c", "?", "?"}));
    Assert.assertEquals(7,
        instance.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"c", "?", "b", "b"}));
    Assert.assertEquals(3,
        instance.scoreUp(new String[] {"a", "a", "b", "b"}, new String[] {"c", "?", "b", "?"}));
    Assert.assertEquals(2,
        instance.scoreUp(new String[] {"a", "b", "c"}, new String[] {"a", "c", "b"}));
    Assert.assertEquals(
        4,
        instance.scoreUp(new String[] {"a", "a", "b", "b", "c", "c"}, new String[] {"a", "c", "a",
            "c", "a", "c"}));
    Assert.assertEquals(
        6,
        instance.scoreUp(new String[] {"a", "a", "b", "b", "c", "c"}, new String[] {"a", "c", "?",
            "?", "a", "c"}));
    Assert.assertEquals(
        11,
        instance.scoreUp(new String[] {"a", "a", "b", "b", "c", "c"}, new String[] {"a", "c", "?",
            "?", "c", "c"}));
    Assert.assertEquals(12,
        instance.scoreUp(new String[] {"a", "b", "c"}, new String[] {"a", "b", "c"}));
  }

  /**
   * Test method for {@link AP1#wordsWithout(String[], String)}.
   */
  @Test
  public void testWordsWithout() {
    Assert.assertArrayEquals(new String[] {}, instance.wordsWithout(new String[] {}, "e"));
    Assert.assertArrayEquals(new String[] {},
        instance.wordsWithout(new String[] {"a", "a", "a"}, "a"));
    Assert.assertArrayEquals(new String[] {"b", "c"},
        instance.wordsWithout(new String[] {"a", "b", "c", "a"}, "a"));
    Assert.assertArrayEquals(new String[] {"b", "c"},
        instance.wordsWithout(new String[] {"a", "b", "c", "a"}, "a"));
    Assert.assertArrayEquals(new String[] {"a", "c", "a"},
        instance.wordsWithout(new String[] {"a", "b", "c", "a"}, "b"));
    Assert.assertArrayEquals(new String[] {"a", "b", "a"},
        instance.wordsWithout(new String[] {"a", "b", "c", "a"}, "c"));
    Assert.assertArrayEquals(new String[] {"c", "a", "a"},
        instance.wordsWithout(new String[] {"b", "c", "a", "a"}, "b"));
    Assert.assertArrayEquals(new String[] {"xx", "yyy", "yy"},
        instance.wordsWithout(new String[] {"xx", "yyy", "x", "yy", "x"}, "x"));
    Assert.assertArrayEquals(new String[] {"xx", "yyy", "x", "x"},
        instance.wordsWithout(new String[] {"xx", "yyy", "x", "yy", "x"}, "yy"));
    Assert.assertArrayEquals(new String[] {"ab", "ac"},
        instance.wordsWithout(new String[] {"aa", "ab", "ac", "aa"}, "aa"));
  }

  /**
   * Test method for {@link AP1#scoresSpecial(int[], int[])}.
   */
  @Test
  public void testScoresSpecial() {
    Assert.assertEquals(40, instance.scoresSpecial(new int[] {12, 10, 4}, new int[] {2, 20, 30}));
    Assert.assertEquals(40, instance.scoresSpecial(new int[] {20, 10, 4}, new int[] {2, 20, 10}));
    Assert.assertEquals(20, instance.scoresSpecial(new int[] {12, 11, 4}, new int[] {2, 20, 31}));
    Assert.assertEquals(50, instance.scoresSpecial(new int[] {1, 20, 2, 50}, new int[] {3, 4, 5}));
    Assert.assertEquals(50, instance.scoresSpecial(new int[] {3, 4, 5}, new int[] {1, 50, 2, 20}));
    Assert.assertEquals(50, instance.scoresSpecial(new int[] {10, 4, 20, 30}, new int[] {20}));
    Assert.assertEquals(50,
        instance.scoresSpecial(new int[] {10, 4, 20, 30}, new int[] {3, 20, 99}));
    Assert.assertEquals(60,
        instance.scoresSpecial(new int[] {10, 4, 20, 30}, new int[] {30, 20, 99}));
    Assert.assertEquals(0, instance.scoresSpecial(new int[] {}, new int[] {2}));
    Assert.assertEquals(20, instance.scoresSpecial(new int[] {}, new int[] {20}));
    Assert.assertEquals(40, instance.scoresSpecial(new int[] {14, 10, 4}, new int[] {4, 20, 30}));
  }

  /**
   * Test method for {@link AP1#findLargestSpecialScore(int[])}.
   */
  @Test
  public void testFindLargestSpecialScore() {
    Assert.assertEquals(10, instance.findLargestSpecialScore(new int[] {1, 2, 0, 10, 15}));
    Assert.assertEquals(20, instance.findLargestSpecialScore(new int[] {1, 20, 0, 10, 15}));
    Assert.assertEquals(0, instance.findLargestSpecialScore(new int[] {}));
    Assert.assertEquals(50, instance.findLargestSpecialScore(new int[] {99, 50}));
    Assert.assertEquals(20, instance.findLargestSpecialScore(new int[] {20, 10, 20}));
    Assert.assertEquals(30, instance.findLargestSpecialScore(new int[] {30, 20, 10}));
    Assert.assertEquals(40, instance.findLargestSpecialScore(new int[] {39, 40, 41}));
  }

  /**
   * Test method for {@link AP1#sumHeights(int[], int, int)}.
   */
  @Test
  public void testSumHeights() {
    Assert.assertEquals(6, instance.sumHeights(new int[] {5, 3, 6, 7, 2}, 2, 4));
    Assert.assertEquals(2, instance.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 1));
    Assert.assertEquals(11, instance.sumHeights(new int[] {5, 3, 6, 7, 2}, 0, 4));
    Assert.assertEquals(0, instance.sumHeights(new int[] {5, 3, 6, 7, 2}, 1, 1));
    Assert.assertEquals(3, instance.sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
    Assert.assertEquals(11, instance.sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8));
    Assert.assertEquals(8, instance.sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8));
    Assert.assertEquals(0, instance.sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8));
    Assert.assertEquals(0, instance.sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2));
    Assert.assertEquals(3, instance.sumHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6));
    Assert.assertEquals(1, instance.sumHeights(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 4));
    Assert.assertEquals(2, instance.sumHeights(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 5));
    Assert.assertEquals(0, instance.sumHeights(new int[] {10, 8, 7, 7, 7, 6, 7}, 2, 4));
  }

  /**
   * Test method for {@link AP1#sumHeights2(int[], int, int)}.
   */
  @Test
  public void testSumHeights2() {
    Assert.assertEquals(7, instance.sumHeights2(new int[] {5, 3, 6, 7, 2}, 2, 4));
    Assert.assertEquals(2, instance.sumHeights2(new int[] {5, 3, 6, 7, 2}, 0, 1));
    Assert.assertEquals(15, instance.sumHeights2(new int[] {5, 3, 6, 7, 2}, 0, 4));
    Assert.assertEquals(0, instance.sumHeights2(new int[] {5, 3, 6, 7, 2}, 1, 1));
    Assert.assertEquals(6, instance.sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
    Assert.assertEquals(19, instance.sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8));
    Assert.assertEquals(16, instance.sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 7, 8));
    Assert.assertEquals(0, instance.sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 8, 8));
    Assert.assertEquals(0, instance.sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 2, 2));
    Assert.assertEquals(4, instance.sumHeights2(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 3, 6));
    Assert.assertEquals(1, instance.sumHeights2(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 4));
    Assert.assertEquals(2, instance.sumHeights2(new int[] {10, 8, 7, 7, 7, 6, 7}, 1, 5));
    Assert.assertEquals(0, instance.sumHeights2(new int[] {10, 8, 7, 7, 7, 6, 7}, 2, 4));
  }

  /**
   * Test method for {@link AP1#bigHeights(int[], int, int)}.
   */
  @Test
  public void testBigHeights() {
    Assert.assertEquals(1, instance.bigHeights(new int[] {5, 3, 6, 7, 2}, 2, 4));
    Assert.assertEquals(0, instance.bigHeights(new int[] {5, 3, 6, 7, 2}, 0, 1));
    Assert.assertEquals(1, instance.bigHeights(new int[] {5, 3, 6, 7, 2}, 0, 4));
    Assert.assertEquals(0, instance.bigHeights(new int[] {5, 3, 6, 7, 3}, 0, 4));
    Assert.assertEquals(0, instance.bigHeights(new int[] {5, 3, 6, 7, 2}, 1, 1));
    Assert.assertEquals(1, instance.bigHeights(new int[] {5, 13, 6, 7, 2}, 1, 2));
    Assert.assertEquals(2, instance.bigHeights(new int[] {5, 13, 6, 7, 2}, 0, 2));
    Assert.assertEquals(2, instance.bigHeights(new int[] {5, 13, 6, 7, 2}, 1, 4));
    Assert.assertEquals(3, instance.bigHeights(new int[] {5, 13, 6, 7, 2}, 0, 4));
    Assert.assertEquals(2, instance.bigHeights(new int[] {5, 13, 6, 7, 2}, 0, 3));
    Assert.assertEquals(0, instance.bigHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 0, 3));
    Assert.assertEquals(1, instance.bigHeights(new int[] {1, 2, 3, 4, 5, 4, 3, 2, 10}, 4, 8));
    Assert.assertEquals(1, instance.bigHeights(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 0, 3));
    Assert.assertEquals(1, instance.bigHeights(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 7, 8));
    Assert.assertEquals(2, instance.bigHeights(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 3, 8));
    Assert.assertEquals(3, instance.bigHeights(new int[] {1, 2, 3, 14, 5, 4, 3, 2, 10}, 2, 8));
  }

  /**
   * Test method for {@link AP1#userCompare(String, int, String, int)}.
   */
  @Test
  public void testUserCompare() {
    Assert.assertEquals(0, instance.userCompare("", 0, "", 0));
    Assert.assertEquals(-1, instance.userCompare("", 0, "a", 0));
    Assert.assertEquals(1, instance.userCompare("a", 0, "", 0));
    Assert.assertEquals(0, instance.userCompare("a", 0, "a", 0));
    Assert.assertEquals(1, instance.userCompare("a", 1, "a", 0));
    Assert.assertEquals(-1, instance.userCompare("a", 0, "a", 1));
    Assert.assertEquals(-1, instance.userCompare("", 5, "", 6));
    Assert.assertEquals(1, instance.userCompare("", 4, "", 3));
    Assert.assertEquals(0, instance.userCompare("", 2, "", 2));
    Assert.assertEquals(-1, instance.userCompare("", 1, "b", 2));
    Assert.assertEquals(1, instance.userCompare("e", 1, "", 2));
    Assert.assertEquals(-1, instance.userCompare("a", 1, "b", 2));
    Assert.assertEquals(-1, instance.userCompare("a", 1, "a", 2));
    Assert.assertEquals(1, instance.userCompare("a", 7, "a", 5));
    Assert.assertEquals(0, instance.userCompare("a", 8, "a", 8));
    Assert.assertEquals(1, instance.userCompare("c", 1, "b", 2));
    Assert.assertEquals(-1, instance.userCompare("abcd", 1, "abcdef", 1));
    Assert.assertEquals(1, instance.userCompare("abcdef", 1, "abcd", 1));
    Assert.assertEquals(-1, instance.userCompare("bb", 1, "zz", 2));
    Assert.assertEquals(1, instance.userCompare("bb", 1, "aa", 2));
    Assert.assertEquals(0, instance.userCompare("bb", 1, "bb", 1));
    Assert.assertEquals(1, instance.userCompare("bb", 5, "bb", 2));
    Assert.assertEquals(-1, instance.userCompare("bb", 1, "bb", 10));
    Assert.assertEquals(-1, instance.userCompare("adam", 1, "bob", 2));
    Assert.assertEquals(-1, instance.userCompare("bob", 1, "bob", 2));
    Assert.assertEquals(1, instance.userCompare("bzb", 1, "bob", 2));
  }

  /**
   * Test method for {@link AP1#mergeTwo(String[], String[], int)}.
   */
  @Test
  public void testMergeTwo() {
    Assert.assertArrayEquals(new String[] {},
        instance.mergeTwo(new String[] {}, new String[] {}, 0));
    Assert.assertArrayEquals(new String[] {},
        instance.mergeTwo(new String[] {"a"}, new String[] {}, 0));
    Assert.assertArrayEquals(new String[] {},
        instance.mergeTwo(new String[] {}, new String[] {"b"}, 0));
    Assert.assertArrayEquals(new String[] {},
        instance.mergeTwo(new String[] {"a"}, new String[] {"b"}, 0));
    Assert.assertArrayEquals(new String[] {"a"},
        instance.mergeTwo(new String[] {"a"}, new String[] {"a"}, 1));
    Assert.assertArrayEquals(new String[] {"a"},
        instance.mergeTwo(new String[] {"a"}, new String[] {"b"}, 1));
    Assert.assertArrayEquals(new String[] {"aa"},
        instance.mergeTwo(new String[] {"aa"}, new String[] {"b"}, 1));
    Assert.assertArrayEquals(new String[] {"ac"},
        instance.mergeTwo(new String[] {"ad"}, new String[] {"ac"}, 1));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.mergeTwo(new String[] {"a", "c", "z"}, new String[] {"b", "f", "z"}, 3));
    Assert.assertArrayEquals(new String[] {"a", "c", "f"},
        instance.mergeTwo(new String[] {"a", "c", "z"}, new String[] {"c", "f", "z"}, 3));
    Assert.assertArrayEquals(new String[] {"c", "f", "g"},
        instance.mergeTwo(new String[] {"f", "g", "z"}, new String[] {"c", "f", "g"}, 3));
    Assert.assertArrayEquals(new String[] {"a", "c", "z"},
        instance.mergeTwo(new String[] {"a", "c", "z"}, new String[] {"a", "c", "z"}, 3));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.mergeTwo(new String[] {"a", "b", "c", "z"}, new String[] {"a", "c", "z"}, 3));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.mergeTwo(new String[] {"a", "b", "z"}, new String[] {"a", "c", "z"}, 3));
    Assert.assertArrayEquals(new String[] {"a", "b", "c"},
        instance.mergeTwo(new String[] {"a", "c", "z"}, new String[] {"a", "b", "c", "z"}, 3));
    Assert.assertArrayEquals(new String[] {"a", "c"},
        instance.mergeTwo(new String[] {"a", "c", "z"}, new String[] {"a", "c", "z"}, 2));
    Assert.assertArrayEquals(new String[] {"a", "c", "y"},
        instance.mergeTwo(new String[] {"a", "c", "z"}, new String[] {"a", "c", "y", "z"}, 3));
    Assert.assertArrayEquals(new String[] {"a", "b", "x"},
        instance.mergeTwo(new String[] {"x", "y", "z"}, new String[] {"a", "b", "z"}, 3));
    Assert.assertArrayEquals(new String[] {"a", "b", "c", "d"},
        instance.mergeTwo(new String[] {"a", "b", "x", "y"}, new String[] {"c", "d", "e", "f"}, 4));
    Assert.assertArrayEquals(new String[] {"a", "b", "c", "d"},
        instance.mergeTwo(new String[] {"a", "b", "x", "y"}, new String[] {"a", "b", "c", "d"}, 4));
    Assert.assertArrayEquals(new String[] {"a", "b", "c", "d"},
        instance.mergeTwo(new String[] {"a", "b", "c", "y"}, new String[] {"d", "e", "f", "g"}, 4));
    Assert.assertArrayEquals(new String[] {"a", "b", "c", "d"},
        instance.mergeTwo(new String[] {"a", "d", "e", "f"}, new String[] {"b", "c", "f", "g"}, 4));
    Assert.assertArrayEquals(
        new String[] {"aa", "ba", "ca", "da"},
        instance.mergeTwo(new String[] {"aa", "da", "ea", "fa"}, new String[] {"ba", "ca", "fa",
            "ga"}, 4));
    Assert.assertArrayEquals(new String[] {"1", "2", "3"}, instance.mergeTwo(new String[] {"1",
        "2", "3", "fa"}, new String[] {"4", "5", "6", "ga"}, 3));
  }
}
