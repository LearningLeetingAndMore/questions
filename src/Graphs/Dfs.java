package Graphs;

import java.util.*;

public class Dfs {
    public static void main(String[] args) {
        Dfs dfs = new Dfs();
        dfs.dfs();
    }

    private void dfs() {
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a', Arrays.asList('b', 'c'));
        graph.put('b', List.of('d'));
        graph.put('c', List.of('e'));
        graph.put('d', List.of('f'));
        graph.put('e', new ArrayList<>());
        graph.put('f', new ArrayList<>());

        Stack<Character> dfsStack = new Stack<>();
        dfsStack.push('a');

        while (!dfsStack.isEmpty()) {
            Character node = dfsStack.pop();
            System.out.println(node + " ");
            List<Character> neighbours = graph.get(node);
            for (Character neighbour : neighbours) {
                dfsStack.push(neighbour);
            }
        }
    }
}
