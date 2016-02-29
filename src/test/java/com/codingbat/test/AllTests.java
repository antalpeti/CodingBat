package com.codingbat.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import com.codingbat.array1.Array1Test;
import com.codingbat.array2.Array2Test;
import com.codingbat.string1.String1Test;
import com.codingbat.string2.String2Test;
import com.codingbat.warmup1.Warmup1Test;
import com.codingbat.warmup2.Warmup2Test;

@RunWith(Suite.class)
@SuiteClasses({Warmup1Test.class, Warmup2Test.class, Array1Test.class, Array2Test.class,
  String1Test.class, String2Test.class})
public class AllTests {

}