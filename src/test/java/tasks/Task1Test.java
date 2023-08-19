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
class Task1Test {

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
        String input = "1 10 20 20 2 5";
        InputStream inputStream = new ByteArrayInputStream(input.getBytes());
        System.setIn(inputStream);
        List<String> output = List.of(
                "1 2 5 10 20",
                "count: 6",
                "distinct: 5",
                "min: 1",
                "max: 20",
                "");
        String expectedOutput = String.join(separator, output);
        Task1.main(new String[0]);
        assertEquals(expectedOutput, outputStreamCaptor.toString());
    }

}
