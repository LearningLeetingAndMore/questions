package Graphs;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CreateAdjacencyList {
    public static void main(String[] args) {
        
    }

    private Map<Character, List<Character>> createAdjacencyList(List<AbstractMap.SimpleEntry<Character, Character>> edgeList) {
        Map<Character, List<Character>> adjacencyList = new HashMap<>();
        for (AbstractMap.SimpleEntry<Character, Character> edge : edgeList) {
            if (adjacencyList.containsKey(edge.getKey())) {
                List<Character> neighbours = adjacencyList.get(edge.getKey());
                neighbours.add(edge.getValue());
                adjacencyList.put(edge.getKey(), neighbours);
            } else {
                adjacencyList.put(edge.getKey(), List.of(edge.getValue()));
            }

            if (adjacencyList.containsKey(edge.getValue())) {
                List<Character> neighbours = adjacencyList.get(edge.getValue());
                neighbours.add(edge.getKey());
                adjacencyList.put(edge.getValue(), neighbours);
            } else {
                adjacencyList.put(edge.getValue(), List.of(edge.getKey()));
            }
        }
        return  adjacencyList;
    }
}
