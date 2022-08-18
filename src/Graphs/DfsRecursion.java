package Graphs;

import java.util.*;

public class DfsRecursion {
    public static void main(String [] args) {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a', Arrays.asList('c', 'b'));
        graph.put('b', List.of('d'));
        graph.put('c', List.of('e'));
        graph.put('d', List.of('f'));
        graph.put('e', new ArrayList<>());
        graph.put('f', new ArrayList<>());
        DfsRecursion dfsRecursion = new DfsRecursion();
        dfsRecursion.dfsRecursive(graph, 'a');
    }

    private void dfsRecursive (Map<Character, List<Character>> graph, Character node) {
        System.out.println(node);
        List<Character> neighbours = graph.get(node);
        for (Character neighbour : neighbours) {
            dfsRecursive(graph, neighbour);
        }
    }

}
