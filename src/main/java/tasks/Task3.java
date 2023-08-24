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
            List<List<Integer>> edges = new ArrayList<>();
            while (n-- > 0) {
                String inputPair = scanner.nextLine();
                String[] vertices = inputPair.split(IoUtils.SPACE);
                edges.add(
                        Arrays.asList(
                                Integer.parseInt(vertices[0]),
                                Integer.parseInt(vertices[1])));
            }
            System.out.println(countSeparateGraphs(edges));
        } catch (Exception e) {
            throw new RuntimeException("Error while reading input", e);
        }
    }

    private static Map<Integer, List<Integer>> createGraphs(List<List<Integer>> edges) {
        Map<Integer, List<Integer>> graphs = new HashMap<>();
        for (List<Integer> edge : edges) {
            graphs.putIfAbsent(edge.get(0), new ArrayList<>());
            graphs.putIfAbsent(edge.get(1), new ArrayList<>());
            graphs.get(edge.get(0)).add(edge.get(1));
            graphs.get(edge.get(1)).add(edge.get(0));
        }
        return graphs;
    }

    private static int countSeparateGraphs(List<List<Integer>> edges) {
        Map<Integer, List<Integer>> graphs = createGraphs(edges);
        Set<Integer> visited = new HashSet<>();
        int separatedGraphs = 0;
        for (int vertex : graphs.keySet()) {
            if (!visited.contains(vertex)) {
                separatedGraphs++;
                Stack<Integer> stack = new Stack<>();
                stack.push(vertex);
                while (!stack.isEmpty()) {
                    Integer currentValue = stack.pop();
                    if (!visited.contains(currentValue)) {
                        visited.add(currentValue);
                        stack.addAll(graphs.get(currentValue));
                    }
                }
            }
        }
        return separatedGraphs;
    }

}
