package util;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/***
 * @author - Kiryl Karpuk
 */
public class IoUtils {

    public static final String SPACE = " ";

    private IoUtils() {
        throw new UnsupportedOperationException("This is a utility class and cannot be instantiated");
    }

    public static List<Integer> askForInput() {
        try (Scanner scanner = new Scanner(System.in);) {
            String input = scanner.nextLine();
            return Arrays
                    .stream(input.split(SPACE))
                    .map(Integer::parseInt)
                    .collect(Collectors.toList());
        } catch (Exception e) {
            throw new RuntimeException("Error while reading input", e);
        }
    }

}
