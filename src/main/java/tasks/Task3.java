package tasks;

import util.IoUtils;

import java.util.*;

/***
 * @author - Kiryl Karpuk
 */
public class Task3 {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            String input = scanner.nextLine();
            int n = Integer.parseInt(input);
            List<Set<Integer>> graphs = new ArrayList<>();
            while (n-- > 0) {
                String inputPair = scanner.nextLine();
                String[] vertices = inputPair.split(IoUtils.SPACE);
                int v1 = Integer.parseInt(vertices[0]);
                int v2 = Integer.parseInt(vertices[1]);
                Set<Integer> firstVGraph = null;
                Set<Integer> secondVGraph = null;
                for (Set<Integer> graph : graphs) {
                    if (graph.contains(v1)) {
                        firstVGraph = new HashSet<>(graph);
                    }
                    if (graph.contains(v2)) {
                        secondVGraph = new HashSet<>(graph);
                    }
                }
                if (firstVGraph == null && secondVGraph == null) {
                    Set<Integer> graph = new HashSet<>();
                    graph.add(v1);
                    graph.add(v2);
                    graphs.add(graph);
                } else if (firstVGraph == null) {
                    secondVGraph.add(v1);
                } else if (secondVGraph == null) {
                    firstVGraph.add(v2);
                } else if (firstVGraph != secondVGraph) {
                    firstVGraph.addAll(secondVGraph);
                    graphs.remove(secondVGraph);
                }
            }
            System.out.println(graphs.size());
        } catch (Exception e) {
            throw new RuntimeException("Error while reading input", e);
        }
    }

}
