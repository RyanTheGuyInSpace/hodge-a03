package baseline;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FinanceTest {

    @Test
    void testCalculateYearsForDoubleROI() {
        assertEquals(18, Finance.calculateYearsForDoubleROI(4));
    }

    @Test
    void testCalculateYearsForDoubleROI2() {
        assertEquals(12, Finance.calculateYearsForDoubleROI(6));
    }

}