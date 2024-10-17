package testimine_harjutus5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class Testimine_Harjutus5_Test {

private final int lowerBound;
private final int upperBound;
private final int expectedResult;

public Testimine_Harjutus5_Test(int lowerBound, int upperBound, int expectedResult) {
this.lowerBound = lowerBound;
this.upperBound = upperBound;
this.expectedResult = expectedResult;
}

@Parameterized.Parameters
public static Collection<Object[]> getData() {
return Arrays.asList(new Object[][] {
{10, 20, 3},
{6, 20, 5},
{-5, 5, 3},
{1, 10, 3},
{0, 0, 0},
{-3, 3, 3},
{10, 5, 0},
{5, 5, 0},
{20, 10, 0}
});
}

@Test
public void shouldReturnCorrectCount() {
assertEquals(expectedResult, Testimine_Harjutus5.countMultiplesOfThree(lowerBound, upperBound));
}
}
