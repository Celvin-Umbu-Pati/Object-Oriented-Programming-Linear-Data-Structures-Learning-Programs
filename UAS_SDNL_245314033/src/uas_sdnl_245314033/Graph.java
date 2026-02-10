/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_sdnl_245314033;

/**
 *
 * @author Celvin Pati
 */
import java.util.*;

public class Graph {

    private Map<String, Vertex> vertexMap;
    private Map<String, List<String>> adjacencyList;

    public Graph() {
        vertexMap = new HashMap<>();
        adjacencyList = new HashMap<>();
    }

    public void addVertex(String label, int par) {
        vertexMap.put(label, new Vertex(label));
        adjacencyList.put(label, new ArrayList<>());
    }

    public void addEdge(String from, String to) {
        adjacencyList.get(from).add(to);
    }

    public void addUndirectedEdge(String v1, String v2) {
        adjacencyList.get(v1).add(v2);
        adjacencyList.get(v2).add(v1);
    }

    public void resetVisited() {
        for (Vertex v : vertexMap.values()) {
            v.visited = false;
        }
    }

    public void dfs(String startLabel) {
        resetVisited();
        System.out.print("DFS dari vertex " + startLabel + ": ");
        dfsRecursive(startLabel);
        System.out.println();
    }

    private void dfsRecursive(String label) {
        Vertex v = vertexMap.get(label);
        v.visited = true;
        System.out.print(label + " ");

        for (String neighbor : adjacencyList.get(label)) {
            if (!vertexMap.get(neighbor).visited) {
                dfsRecursive(neighbor);
            }
        }
    }
}
