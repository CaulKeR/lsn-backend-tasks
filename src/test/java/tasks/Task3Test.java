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
import static org.junit.jupiter.api.Assertions.assertThrows;

/***
 * @author - Kiryl Karpuk
 */
class Task3Test {

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
        List<String> input = List.of(
                "3",
                "4 3",
                "1 4",
                "5 6",
                "");
        InputStream inputStream = new ByteArrayInputStream(String.join(separator, input).getBytes());
        System.setIn(inputStream);
        List<String> output = List.of(
                "2",
                "");
        String expectedOutput = String.join(separator, output);
        Task3.main(new String[0]);
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void testMain2() {
        List<String> input = List.of(
                "4",
                "1 2",
                "1 3",
                "1 4",
                "5 5",
                "");
        InputStream inputStream = new ByteArrayInputStream(String.join(separator, input).getBytes());
        System.setIn(inputStream);
        List<String> output = List.of(
                "2",
                "");
        String expectedOutput = String.join(separator, output);
        Task3.main(new String[0]);
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void testMain3() {
        List<String> input = List.of(
                "3",
                "1 2",
                "2 1",
                "1 2",
                "");
        InputStream inputStream = new ByteArrayInputStream(String.join(separator, input).getBytes());
        System.setIn(inputStream);
        List<String> output = List.of(
                "1",
                "");
        String expectedOutput = String.join(separator, output);
        Task3.main(new String[0]);
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

    @Test
    void testMain_shouldThrowException_forInvalidInput() {
        String input = "Am I dumb?";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        assertThrows(RuntimeException.class, () -> Task3.main(new String[0]));
    }

}
