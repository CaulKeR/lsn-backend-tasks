package tasks;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

/***
 * @author - Kiryl Karpuk
 */
class Task2Test {

    private final String separator = System.lineSeparator();
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    void testMain() {
        String input = "1 2 10 7 5 3 6 6 13 0";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        List<String> output = List.of(
                "0 13",
                "3 10",
                "6 7",
                "6 7",
                "");
        String expectedOutput = String.join(separator, output);
        Task2.main(new String[0]);
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

}
