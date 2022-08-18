package Graphs;

import java.util.*;

public class Bfs {
    public static void main (String [] args) {
        Bfs bfs = new Bfs();
        bfs.bfs();
    }

    void bfs(){
        Map<Character, List<Character>> graph = new HashMap<>();
        graph.put('a', Arrays.asList('b', 'c'));
        graph.put('b', List.of('d'));
        graph.put('c', List.of('e'));
        graph.put('d', List.of('f'));
        graph.put('e', new ArrayList<>());
        graph.put('f', new ArrayList<>());

        Queue<Character> bfsQueue = new LinkedList<>();
        bfsQueue.add('a');

        while (!bfsQueue.isEmpty()) {
            Character node = bfsQueue.remove();
            System.out.println(node);
            List<Character> neighbours = graph.get(node);
            bfsQueue.addAll(neighbours);
        }

    }
}
