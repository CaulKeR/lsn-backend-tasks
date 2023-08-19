package tasks;

import util.IoUtils;

import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;

/***
 * @author - Kiryl Karpuk
 */
public class Task1 {

    public static void main(String[] args) {
        List<Integer> input = IoUtils.askForInput();
        TreeSet<Integer> distinct = new TreeSet<>(input);
        System.out.println(
                distinct.stream()
                        .map(String::valueOf)
                        .collect(Collectors.joining(IoUtils.SPACE)));
        System.out.println("count: " + input.size());
        System.out.println("distinct: " + distinct.size());
        System.out.println("min: " + distinct.first());
        System.out.println("max: " + distinct.last());
    }

}
