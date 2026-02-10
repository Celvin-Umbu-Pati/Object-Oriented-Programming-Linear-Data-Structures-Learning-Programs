/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnl_modul8;

/**
 *
 * @author Celvin Pati
 */
public class MainGraph2 {
    public static void main(String[] args) {

        Graph g = new Graph(20);

        g.addVertex("a"); 
        g.addVertex("b"); 
        g.addVertex("c"); 
        g.addVertex("d"); 
        g.addVertex("e"); 
        g.addVertex("f"); 
        g.addVertex("g"); 
        g.addVertex("h"); 
        g.addVertex("i");

        g.addEdge(0, 1); 
        g.addEdge(0, 5); 
        g.addEdge(0, 8); 
        g.addEdge(1, 2);
        g.addEdge(1, 4); 
        g.addEdge(2, 4); 
        g.addEdge(2, 3); 
        g.addEdge(3, 7); 
        g.addEdge(3, 6); 
        g.addEdge(4, 6); 
        g.addEdge(5, 6); 
 

        System.out.print("BFS Graph 2: ");
        g.bfs(0); 
    }
}
