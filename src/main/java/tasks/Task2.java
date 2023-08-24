package tasks;

import util.IoUtils;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/***
 * @author - Kiryl Karpuk
 */
public class Task2 {

    public static void main(String[] args) {
        List<String> pairs = new ArrayList<>();
        Set<Integer> difference = new HashSet<>();
        for (Integer number : IoUtils.askForInput()) {
            int currentDifference = 13 - number;
            if (difference.contains(number)) {
                pairs.add(
                        Math.min(number, currentDifference) +
                        IoUtils.SPACE +
                        Math.max(number, currentDifference));
            }
            difference.add(currentDifference);
        }
        pairs.stream().sorted().forEach(System.out::println);
    }

}
