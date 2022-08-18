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
            if (adjacencyList.containsKey(edge.getKey())) {
                List<Character> neighbours = new ArrayList<>(adjacencyList.get(edge.getKey()));
                neighbours.add(edge.getValue());
                adjacencyList.put(edge.getKey(), neighbours);
            } else {
                adjacencyList.put(edge.getKey(), List.of(edge.getValue()));
            }

            if (adjacencyList.containsKey(edge.getValue())) {
                List<Character> neighbours = new ArrayList<>(adjacencyList.get(edge.getValue()));
                neighbours.add(edge.getKey());
                adjacencyList.put(edge.getValue(), neighbours);
            } else {
                adjacencyList.put(edge.getValue(), List.of(edge.getKey()));
            }
        }
        return  adjacencyList;
    }
}
