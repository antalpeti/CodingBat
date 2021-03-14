package java.com.codingbat.test;


import java.com.codingbat.ap1.AP1Test;
import java.com.codingbat.array1.Array1Test;
import java.com.codingbat.array2.Array2Test;
import java.com.codingbat.array3.Array3Test;
import java.com.codingbat.logic1.Logic1Test;
import java.com.codingbat.logic2.Logic2Test;
import java.com.codingbat.recursion1.Recursion1Test;
import java.com.codingbat.recursion2.Recursion2Test;
import java.com.codingbat.string1.String1Test;
import java.com.codingbat.string2.String2Test;
import java.com.codingbat.string3.String3Test;
import java.com.codingbat.warmup1.Warmup1Test;
import java.com.codingbat.warmup2.Warmup2Test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

@RunWith(Suite.class)
@SuiteClasses({AP1Test.class, Array1Test.class, Array2Test.class, Array3Test.class,
  Logic1Test.class, Logic2Test.class, Recursion1Test.class, Recursion2Test.class,
    String1Test.class, String2Test.class, String3Test.class, Warmup1Test.class, Warmup2Test.class})
public class AllTests {
}
