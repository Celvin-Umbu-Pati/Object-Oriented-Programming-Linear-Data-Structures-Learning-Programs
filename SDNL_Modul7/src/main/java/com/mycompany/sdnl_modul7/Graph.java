/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnl_modul7;

/**
 *
 * @author Celvin Pati
 */
import java.util.Stack;

public class Graph {
    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
        countVertex = 0;
    }

    public void addVertex(char label) {
        vertexList[countVertex++] = new Vertex(label);
    }

    public void addEdge(int start, int end) {
        adjacencyMatrix[start][end] = 1;
        adjacencyMatrix[end][start] = 1; // graph tidak berarah
    }

    public void print() {
        System.out.println("Adjacency Matrix:");
        for (int i = 0; i < countVertex; i++) {
            for (int j = 0; j < countVertex; j++) {
                System.out.print(adjacencyMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public void resetVisited() {
        for (int i = 0; i < countVertex; i++) {
            vertexList[i].flagVisited = false;
        }
    }

    public void dfs(int seed) {
        Stack<Integer> stack = new Stack<>();
        stack.push(seed);

        while (!stack.isEmpty()) {
            int x = stack.pop();

            if (!vertexList[x].flagVisited) {
                System.out.print(vertexList[x].label + " ");
                vertexList[x].flagVisited = true;

                for (int i = countVertex - 1; i >= 0; i--) {
                    if (adjacencyMatrix[x][i] == 1 && !vertexList[i].flagVisited) {
                        stack.push(i);
                    }
                }
            }
        }
        System.out.println();
    }
}
