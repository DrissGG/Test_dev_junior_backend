package io.risf.exo1;

import org.junit.jupiter.api.Test;

import static io.risf.exo1.Exo1.hasOnlyOnePositiveNumber;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.assertFalse;;

class Exo1Test {

    @Test
    void hasOnlyOnePositiveNumber_positiveNegativeNegative_returnTrue() {
        assertTrue(hasOnlyOnePositiveNumber(10, -1, -1));
    }

    @Test
    public void testHasOnlyOnePositiveNumber_OnePositiveNumber_ReturnsTrue() {
        boolean result = Exo1.hasOnlyOnePositiveNumber(10, 0, -5);
        assertTrue(result);
    }

    @Test
    public void testHasOnlyOnePositiveNumber_NoPositiveNumber_ReturnsFalse() {
        boolean result = Exo1.hasOnlyOnePositiveNumber(0, 0, 0);
        assertFalse(result);
    }

    @Test
    public void testHasOnlyOnePositiveNumber_TwoPositiveNumbers_ReturnsFalse() {
        boolean result = Exo1.hasOnlyOnePositiveNumber(10, 20, -5);
        assertFalse(result);
    }

    @Test
    public void testHasOnlyOnePositiveNumber_AllPositiveNumbers_ReturnsFalse() {
        boolean result = Exo1.hasOnlyOnePositiveNumber(10, 20, 5);
        assertFalse(result);
    }

}
