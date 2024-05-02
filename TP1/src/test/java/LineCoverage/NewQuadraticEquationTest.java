package LineCoverage;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NewQuadraticEquationTest {
    @Test
    public void IllegalArgumentException(){
        Assertions.assertThrows(IllegalArgumentException.class,()->NewQuadraticEquation.solve(0,9,3));
    }
    @Test
    public void testTwoRealDistinctSolutions() {
        double a = 1, b = -3, c = 2; // Equation: x^2 - 3x + 2 = 0; Solutions: x = 2, x = 1
        double[] expectedSolutions = {2.0, 1.0};
        double[] solutions = NewQuadraticEquation.solve(a, b, c);
        assertArrayEquals(expectedSolutions, solutions, 0.0001);
    }
    @Test
    public void testOneRealSolution() {
        double a = 1, b = -2, c = 1; // Equation: x^2 - 2x + 1 = 0; Solutions: x = 1
        double[] expectedSolutions = {1.0};
        double[] solutions = NewQuadraticEquation.solve(a, b, c);
        assertArrayEquals(expectedSolutions, solutions, 0.0001);
    }

    @Test
    public void testNoRealSolution() {
        double a = 1, b = 2, c = 3; // Equation: x^2 + 2x + 3 = 0; No real solutions
        double[] solutions = NewQuadraticEquation.solve(a, b, c);
        assertNull(solutions);
    }

}