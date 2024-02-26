import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class StringManipulatorTest {

    @Test
    void concatenate() {
        String str1 = "Hello";
        String str2 = "World";
        assertEquals("HelloWorld", StringManipulator.concatenate(str1, str2));
    }

    @Test
    void findLength() {
        String str = "Hello";
        assertEquals(5, StringManipulator.findLength(str));
    }

    @Test
    void convertToUpperCase() {
        String str = "Hello";
        assertEquals("HELLO", new StringManipulator().convertToUpperCase(str));
    }

    @Test
    void convertToLowerCase() {
        String str = "HELlo";
        assertEquals("hello", new StringManipulator().convertToLowerCase(str));
    }

    @Test
    void containsSubstring() {
        String str = "Hello";
        String subStr = "ell";
        assertTrue(new StringManipulator().containsSubstring(str, subStr));
    }
}