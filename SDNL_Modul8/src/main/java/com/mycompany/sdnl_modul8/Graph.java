/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnl_modul8;

/**
 *
 * @author Celvin Pati
 */
public class Graph {
    private Vertex[] vertexList;
    private int[][] adjMatrix;
    private int nVertex;

    public Graph(int maxVertex) {
        vertexList = new Vertex[maxVertex];
        adjMatrix = new int[maxVertex][maxVertex];
        nVertex = 0;

        for (int i = 0; i < maxVertex; i++)
            for (int j = 0; j < maxVertex; j++)
                adjMatrix[i][j] = 0;
    }

    public void addVertex(String label) {
        vertexList[nVertex++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjMatrix[start][end] = 1;
        adjMatrix[end][start] = 1;
    }

    public void bfs(int seed) {
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(seed);

        while (!queue.isEmpty()) {
            int x = queue.dequeue();

            if (!vertexList[x].isVisited()) {
                System.out.print(vertexList[x].getLabel() + " ");
                vertexList[x].setVisited(true);

                for (int i = 0; i < nVertex; i++) {
                    if (adjMatrix[x][i] == 1 && !vertexList[i].isVisited()) {
                        queue.enqueue(i);
                    }
                }
            }
        }
    }
}
