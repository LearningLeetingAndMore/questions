package Graphs;

import java.util.*;

public class CreateAdjacencyList {
    public static void main(String[] args) {
        List<AbstractMap.SimpleEntry<Character, Character>> edgeList = new ArrayList<>();
        edgeList.add(new AbstractMap.SimpleEntry<>('i', 'j'));
        edgeList.add(new AbstractMap.SimpleEntry<>('k', 'i'));
        edgeList.add(new AbstractMap.SimpleEntry<>('m', 'k'));
        edgeList.add(new AbstractMap.SimpleEntry<>('k', 'l'));
        edgeList.add(new AbstractMap.SimpleEntry<>('o', 'n'));

        System.out.println(createAdjacencyList(edgeList));
    }

    private static Map<Character, List<Character>> createAdjacencyList(List<AbstractMap.SimpleEntry<Character, Character>> edgeList) {
        Map<Character, List<Character>> adjacencyList = new HashMap<>();
        for (AbstractMap.SimpleEntry<Character, Character> edge : edgeList) {

            // Add edge
            addEdge(adjacencyList, edge.getKey(), edge.getValue());

            // Add Reverse Edge
            addEdge(adjacencyList, edge.getValue(), edge.getKey());

        }
        return  adjacencyList;
    }

    private static void addEdge(Map<Character, List<Character>> adjacencyList, Character source, Character destination) {
        if (adjacencyList.containsKey(source)) {
            List<Character> neighbours = new ArrayList<>(adjacencyList.get(source));
            neighbours.add(destination);
            adjacencyList.put(source, neighbours);
        } else {
            adjacencyList.put(source, List.of(destination));
        }
    }
}
