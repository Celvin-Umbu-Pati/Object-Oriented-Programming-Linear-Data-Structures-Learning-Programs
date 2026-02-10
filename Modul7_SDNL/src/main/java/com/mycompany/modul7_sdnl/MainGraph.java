/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.modul7_sdnl;

/**
 *
 * @author Celvin Pati
 */
public class MainGraph {
    public static void main(String[] args) {
     
        Graph g1 = new Graph();

        g1.addVertex('A'); 
        g1.addVertex('B'); 
        g1.addVertex('C'); 
        g1.addVertex('D'); 
        g1.addVertex('E'); 

        g1.addEdge('A', 'B', 1);
        g1.addEdge('A', 'D', 1);
        g1.addEdge('A', 'E', 1);
        g1.addEdge('B', 'C', 1);
        g1.addEdge('B', 'D', 1);
        g1.addEdge('C', 'D', 1);

        System.out.println("graph 1");
        g1.print();
        System.out.println("\nDFS Traversal vertex A:");
        g1.dfs(0); 
        System.out.println("\n");

        Graph g2 = new Graph();

        g2.addVertex('A'); 
        g2.addVertex('B'); 
        g2.addVertex('C'); 
        g2.addVertex('D'); 
        g2.addVertex('E'); 
        g2.addVertex('F'); 
        g2.addVertex('G'); 
        g2.addVertex('H'); 
        g2.addVertex('I'); 

        g2.addEdge('A', 'B', 2);
        g2.addEdge('A', 'I', 9);
        g2.addEdge('B', 'E', 6);
        g2.addEdge('B', 'C', 2);
        g2.addEdge('E', 'G', 5);
        g2.addEdge('C', 'D', 4);
        g2.addEdge('E', 'C', 3);
        g2.addEdge('D', 'H', 8);
        g2.addEdge('F', 'G', 5);

        System.out.println("graph");
        g2.print();
        System.out.println("\nDFS Traversal vertex A:");
        g2.dfs(0); 
        System.out.println();
    }
}
