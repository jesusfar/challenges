import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class HourGlassSumTest {

    @Test
    void hourglassSum() {
        assertEquals(19, HourGlassSum.hourglassSum(List.of(List.of(1, 1, 1, 0, 0, 0), List.of(0, 1, 0, 0, 0, 0), List.of(1, 1, 1, 0, 0, 0), List.of(0, 0, 2, 4, 4, 0), List.of(0, 0, 0, 2, 0, 0), List.of(0, 0, 1, 2, 4, 0))));
        assertEquals(28, HourGlassSum.hourglassSum(List.of(List.of(-9, -9, -9, 1, 1, 1), List.of(0, -9, 0, 4, 3, 2), List.of(-9, -9, -9, 1, 2, 3), List.of(0, 0, 8, 6, 6, 0), List.of(0, 0, 0, -2, 0, 0), List.of(0, 0, 1, 2, 4, 0))));
        assertEquals(63, HourGlassSum.hourglassSum(List.of(List.of(-9, -9, -9, 1, 1, 1), List.of(0, -9, 0, 4, 3, 2), List.of(-9, -9, -9, 1, 2, 3), List.of(0, 0, 8, 9, 9, 9), List.of(0, 0, 0, -2, 9, 0), List.of(0, 0, 1, 9, 9, 9))));
        assertEquals(-6, HourGlassSum.hourglassSum(List.of(List.of(-1, -1, 0, -9, -2, -2), List.of(-2, -1, -6, -8, -2, -5), List.of(-1, -1, -1, -2, -3, -4), List.of(-1, -9, -2, -4, -4, -5), List.of(-7, -3, -3, -2, -9, -9), List.of(-1, -3, -1, -2, -4, -5))));

    }
}