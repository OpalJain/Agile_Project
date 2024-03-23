import org.junit.jupiter.api.Test;

class MyTest {

    @Test
    void testAddition() {
        int result = 2 + 2;
        int expected = 4;
        
        // Assert the expected and actual results are equal
        org.junit.jupiter.api.Assertions.assertEquals(expected, result);
    }
}
