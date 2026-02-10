/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul6sdnl;

/*
 *
 * @author Celvin Pati
 */
public class Graph {
    private int maxVertex;
    private int vertexCount;
    private Vertex[] vertices;
    private int[][] adjMatrix;

    public Graph(int maxV) {
        this.maxVertex = maxV;
        this.vertexCount = 0;
        vertices = new Vertex[maxV];
        adjMatrix = new int[maxV][maxV];

        for (int i = 0; i < maxV; i++) {
            for (int j = 0; j < maxV; j++) {
                adjMatrix[i][j] = -1;
            }
        }
    }

    public void addVertex(char node) {
        vertices[vertexCount++] = new Vertex(node);
    }

    public int indexVertex(char label) {
        for (int i = 0; i < vertexCount; i++) {
            if (vertices[i].getLabel() == label) {
                return i;
            }
        }
        return -1;
    }

    public void addEdge(int a, int b, int c) {
        adjMatrix[a][b] = c;
        adjMatrix[b][a] = c; // Undirected
    }

    public void addEdge(char a, char b, int c) {
        int i = indexVertex(a);
        int j = indexVertex(b);

        if (i != -1 && j != -1) {
            adjMatrix[i][j] = c;
            adjMatrix[j][i] = c;
        }
    }

    public void printAdjacencyMatrix() {
        System.out.print("\t");
        for (int i = 0; i < vertexCount; i++) {
            System.out.print(vertices[i].getLabel() + "\t");
        }
        System.out.println();

        for (int i = 0; i < vertexCount; i++) {
            System.out.print(vertices[i].getLabel() + "\t");
            for (int j = 0; j < vertexCount; j++) {
                System.out.print(adjMatrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
