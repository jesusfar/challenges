import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class JumpingCloudsTest {

    @Test
    void jumpingOnClouds() {
        assertEquals(4, JumpingClouds.jumpingOnClouds(List.of(0, 0, 1, 0, 0, 1, 0)), "Expected 4");
        assertEquals(3, JumpingClouds.jumpingOnClouds(List.of(0, 0, 0, 0, 1, 0)), "Expected 3, lenght: 5");
        assertEquals(3, JumpingClouds.jumpingOnClouds(List.of(0, 0, 0, 1, 0, 0)), "Expected 3");
    }

}