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
}
