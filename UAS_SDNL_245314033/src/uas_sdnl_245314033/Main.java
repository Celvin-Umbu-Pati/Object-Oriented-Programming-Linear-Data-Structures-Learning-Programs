/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uas_sdnl_245314033;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {

        Graph g = new Graph();

        g.addVertex("a", 1);
        g.addVertex("b", 2);
        g.addVertex("c", 3);
        g.addVertex("d", 4);
        g.addVertex("g", 5);
        g.addVertex("e", 6);
        g.addVertex("f", 7);
        g.addVertex("h", 8);
        g.addVertex("i", 9);

        g.addUndirectedEdge("a", "f");
        g.addUndirectedEdge("a", "i");
        g.addUndirectedEdge("a", "b");

        g.addUndirectedEdge("b", "c");
        g.addUndirectedEdge("b", "e");
        g.addUndirectedEdge("b", "a");

        g.addUndirectedEdge("c", "e");
        g.addUndirectedEdge("c", "d");
         g.addUndirectedEdge("c", "b");

        g.addUndirectedEdge("d", "g");
        g.addUndirectedEdge("d", "h");
        g.addUndirectedEdge("d", "c");
        

        g.addUndirectedEdge("g", "e");
        g.addUndirectedEdge("g", "f");
        g.addUndirectedEdge("g", "d");

        g.dfs("b");
    }
}
