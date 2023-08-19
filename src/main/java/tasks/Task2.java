package tasks;

import util.IoUtils;

import java.util.ArrayList;
import java.util.List;

/***
 * @author - Kiryl Karpuk
 */
public class Task2 {

    public static void main(String[] args) {
        List<Integer> input = IoUtils.askForInput();
        input.sort(Integer::compareTo);
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < input.size(); i++) {
            for (int j = i + 1; j < input.size(); j++) {
                if (input.get(i) + input.get(j) > 13) {
                    break;
                }
                if (input.get(i) + input.get(j) == 13) {
                    pairs.add(input.get(i) + IoUtils.SPACE + input.get(j));
                }
            }
        }
        pairs.forEach(System.out::println);
    }

}
