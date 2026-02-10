/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdnl_modul9;

import java.util.ArrayList;

/**
 *
 * @author Celvin Pati
 */
public class TestPrimMST {
    public static void main(String[] args) {

        Graph g = new Graph(10);

        g.addVertex('A');
        g.addVertex('B');
        g.addVertex('C');
        g.addVertex('D');
        g.addVertex('E');
        g.addVertex('F');
        g.addVertex('G');
        g.addVertex('H');
        g.addVertex('I');
        g.addVertex('J');

        g.addEdge('A','B',5);
        g.addEdge('A','C',5);
        g.addEdge('B','D',4);
        g.addEdge('B','C',4);
        g.addEdge('C','D',4);
        g.addEdge('C','F',7);
        g.addEdge('D','F',6);
        g.addEdge('B','E',9);
        g.addEdge('D','E',8);
        g.addEdge('E','F',10);

        g.addEdge('E','G',10);
        g.addEdge('E','H',8);
        g.addEdge('E','I',9);

        g.addEdge('F','G',3);

        g.addEdge('G','H',6);
        g.addEdge('G','J',7);
        g.addEdge('H','J',6);

        g.addEdge('H','I',4);
        g.addEdge('I','J',7);

        ArrayList<Edge> mst = g.getPrimEdges();

        int total = 0;
        System.out.println("=== Minimum Spanning Tree (Prim) ===");
        for (Edge e : mst) {
            char a = g.vertexList[e.getVertexA()].getLabel();
            char b = g.vertexList[e.getVertexB()].getLabel();
            System.out.println(a + " - " + b + " : " + e.getWeight());
            total += e.getWeight();
        }
        System.out.println("Total Weight = " + total);
    }
}
