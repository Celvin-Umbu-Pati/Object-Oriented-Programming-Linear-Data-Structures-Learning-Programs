/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul7_sdnl;

/**
 *
 * @author Celvin Pati
 */
import java.util.Stack;

public class Graph {
    private int maxVertex = 10;
    private Vertex[] vertexList;
    private int[][] adjacencyMatrix;
    private int countVertex = 0;

    public Graph() {
        vertexList = new Vertex[maxVertex];
        adjacencyMatrix = new int[maxVertex][maxVertex];
    }

    public void addVertex(char label) {
        vertexList[countVertex++] = new Vertex(label);
    }

    public void addEdge(int a, int b, int weight) {
        adjacencyMatrix[a][b] = weight;
        adjacencyMatrix[b][a] = weight; 
    }

    public void addEdge(char a, char b, int weight) {
        int i = indexVertex(a);
        int j = indexVertex(b);
        if (i != -1 && j != -1) {
            addEdge(i, j, weight);
        }
    }

    private int indexVertex(char label) {
        for (int i = 0; i < countVertex; i++) {
            if (vertexList[i].label == label)
                return i;
        }
        return -1;
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

    public void dfs(int seed) {
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < countVertex; i++) {
            vertexList[i].flagVisited = false;
        }

        stack.push(seed);

        while (!stack.isEmpty()) {
            int x = stack.pop();

            if (!vertexList[x].flagVisited) {

                System.out.print(vertexList[x].label + " ");
         
                vertexList[x].flagVisited = true;

                for (int i = countVertex - 1; i >= 0; i--) {
                    if (adjacencyMatrix[x][i] != 0 && !vertexList[i].flagVisited) {
                        stack.push(i);
                    }
                }
            }
        }
    }

    public void dfs() {
        dfs(0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < countVertex; i++) {
            sb.append(vertexmList[i].label).append(" ");
        }
        return sb.toString();
    }
}
