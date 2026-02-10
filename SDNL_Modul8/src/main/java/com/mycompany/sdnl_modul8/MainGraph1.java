/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdnl_modul8;

/**
 *
 * @author Celvin Pati
 */
public class MainGraph1 {
    public static void main(String[] args) {

        Graph g = new Graph(10);

        g.addVertex("A"); 
        g.addVertex("B"); 
        g.addVertex("C"); 
        g.addVertex("D"); 
        g.addVertex("E"); 
        g.addVertex("F"); 

        g.addEdge(0, 1); 
        g.addEdge(0, 2); 
        g.addEdge(0, 3); 
        g.addEdge(1, 2); 
        g.addEdge(1, 4); 
        g.addEdge(2, 5); 
        g.addEdge(2, 3); 
        g.addEdge(3, 5); 

        System.out.print("BFS Graph 1: ");
        g.bfs(0); 
    }
}

