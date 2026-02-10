/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.modul6sdnl;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {
        Graph graph = new Graph(5);

        graph.addVertex('A');
        graph.addVertex('H');
        graph.addVertex('W');
        graph.addVertex('C');
        graph.addVertex('D');

        graph.addEdge('A', 'H', 100);
        graph.addEdge('A', 'W', 800);
        graph.addEdge('H', 'W', 750);
        graph.addEdge('W', 'C', 400);
        graph.addEdge('C', 'D', 370);

        graph.printAdjacencyMatrix();
    }
}
