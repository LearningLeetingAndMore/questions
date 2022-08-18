package Graphs;

import java.util.*;

public class HasPath {
    public static void main (String[] args){
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a', Arrays.asList('c', 'b'));
        graph.put('b', List.of('d'));
        graph.put('c', List.of('e'));
        graph.put('d', List.of('f'));
        graph.put('e', new ArrayList<>());
        graph.put('f', new ArrayList<>());

        HasPath hasPath = new HasPath();
        System.out.println(hasPath.hasPath(graph, 'e', 'f'));
        System.out.println(hasPath.hasPathIterative(graph, 'e', 'f'));
    }

    private boolean hasPath(Map<Character, List<Character>> graph, Character src, Character dest) {
        System.out.println("Source:"+ src + " Destination " + dest);
        if (src.equals(dest)) {
            return true;
        } else {
            List<Character> neighbours = graph.get(src);
            for (Character neighbour : neighbours) {
               if(hasPath(graph, neighbour, dest)) {
                   return true;
               }
            }
        }

        return false;
    }

    private boolean hasPathIterative(Map<Character, List<Character>> graph, Character src, Character dest) {
        Stack<Character> dfsStack = new Stack<>();
        dfsStack.push(src);
        while(!dfsStack.isEmpty()) {
            Character node = dfsStack.pop();
            if (node.equals(dest)) {
                return true;
            }
            List<Character> neighbours = graph.get(node);
            for (Character neighbour : neighbours) {
                dfsStack.push(neighbour);
            }
        }

        return false;
    }
}
