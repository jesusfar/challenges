import static org.junit.jupiter.api.Assertions.*;

class RepeatedStringsTest {

    @org.junit.jupiter.api.Test
    void repeatedString() {

        assertEquals(7, RepeatedStrings.repeatedString("aba",10));
        assertEquals(10, RepeatedStrings.repeatedString("aaa",10));
        assertEquals(1000000000000L, RepeatedStrings.repeatedString("a",1000000000000L));
    }
}