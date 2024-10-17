package harjutus_ruutvõrrandi_juured;

public class Harjutus_ruutvõrrandi_juured {

    public static double[] findRoots(double a, double b, double c) {
        double discriminant = b * b - 4 * a * c;
        double[] roots;

        if (discriminant > 0) {
            roots = new double[2];
            roots[0] = (-b + Math.sqrt(discriminant)) / (2 * a);
            roots[1] = (-b - Math.sqrt(discriminant)) / (2 * a);
        } else if (discriminant == 0) {
            roots = new double[1];
            roots[0] = -b / (2 * a);
        } else {
            roots = new double[0]; // Нет действительных корней
        }

        return roots;
    }
}

import org.junit.Test;
import static org.junit.Assert.assertArrayEquals;
import harjutus_ruutvõrrandi_juured.Harjutus_ruutvõrrandi_juured;

public class Harjutus_ruutvõrrandi_juured {

    @Test
    public void testTwoDistinctRealRoots() {
        double[] expected = {2.0, -3.0};
        assertArrayEquals(expected, Harjutus_ruutvõrrandi_juured.findRoots(1, 1, -6), 0.001);
    }

    @Test
    public void testSingleRoot() {
        double[] expected = {-2.0};
        assertArrayEquals(expected, Harjutus_ruutvõrrandi_juured.findRoots(1, 4, 4), 0.001);
    }

    @Test
    public void testNoRealRoots() {
        double[] expected = {};
        assertArrayEquals(expected, Harjutus_ruutvõrrandi_juured.findRoots(1, 2, 3), 0.001);
    }

    @Test
    public void testLinearEquationSolution() {
        double[] expected = {-2.0};
        assertArrayEquals(expected, Harjutus_ruutvõrrandi_juured.findRoots(0, 2, -4), 0.001);
    }

    @Test
    public void testZeroDiscriminant() {
        double[] expected = {-1.0};
        assertArrayEquals(expected, Harjutus_ruutvõrrandi_juured.findRoots(1, 2, 1), 0.001);
    }

    @Test
    public void testNegativeDiscriminant() {
        double[] expected = {};
        assertArrayEquals(expected, Harjutus_ruutvõrrandi_juured.findRoots(1, 1, 1), 0.001);
    }
}
