package Graphs;

import java.util.*;

public class HasPathBfs {

    public static void main(String[] args){
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a', Arrays.asList('c', 'b'));
        graph.put('b', List.of('d'));
        graph.put('c', List.of('e'));
        graph.put('d', List.of('f'));
        graph.put('e', new ArrayList<>());
        graph.put('f', new ArrayList<>());

        HasPathBfs hasPathBfs = new HasPathBfs();
        System.out.println(hasPathBfs.hasPath(graph, 'a', 'f'));
    }

    private boolean hasPath(Map<Character, List<Character>> graph, Character src, Character dest) {
        Queue<Character> bfsQueue = new LinkedList<>();
        bfsQueue.add(src);

        while(!bfsQueue.isEmpty()) {
            Character node = bfsQueue.remove();
            if (node.equals(dest)) {
                return true;
            }
            List<Character> neighbours = graph.get(node);
            bfsQueue.addAll(neighbours);
        }

        return false;
    }
}
