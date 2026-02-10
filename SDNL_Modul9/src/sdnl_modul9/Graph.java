/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdnl_modul9;

/**
 *
 * @author Celvin Pati
 */
import java.util.ArrayList;

public class Graph {
    private int maxVertex;
    Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph(int max) {
        maxVertex = max;
        vertexList = new Vertex[max];
        adjacencyMatrix = new int[max][max];
        for (int i = 0; i < max; i++)
            for (int j = 0; j < max; j++)
                adjacencyMatrix[i][j] = 0;
    }

    public void addVertex(char label) {
        vertexList[countVertex++] = new Vertex(label);
    }

    public void addEdge(char a, char b, int weight) {
        int i = indexVertex(a);
        int j = indexVertex(b);
        adjacencyMatrix[i][j] = weight;
        adjacencyMatrix[j][i] = weight;
    }

    public int indexVertex(char c) {
        for (int i = 0; i < countVertex; i++)
            if (vertexList[i].getLabel() == c)
                return i;
        return -1;
    }
    public ArrayList<Edge> getPrimEdges() {

        boolean[] visited = new boolean[countVertex];
        ArrayList<Edge> primEdges = new ArrayList<>();

        int seed = 0; // default vertex A
        visited[seed] = true;
        int visitedCount = 1;

        while (visitedCount < countVertex) {
            int minWeight = Integer.MAX_VALUE;
            int vA = -1, vB = -1;
            for (int i = 0; i < countVertex; i++) {
                if (visited[i]) {
                    for (int j = 0; j < countVertex; j++) {
                        if (!visited[j] && adjacencyMatrix[i][j] > 0) {
                            if (adjacencyMatrix[i][j] < minWeight) {
                                minWeight = adjacencyMatrix[i][j];
                                vA = i;
                                vB = j;
                            }
                        }
                    }
                }
            }

            if (vA != -1) {
                visited[vB] = true;
                visitedCount++;
                primEdges.add(new Edge(vA, vB, minWeight));
            }
        }

        return primEdges;
    }
}
