/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sdnl_modul9;

/**
 *
 * @author Celvin Pati
 */
public class Edge {
    private int vertexA;
    private int vertexB;
    private int weight;

    public Edge() {}

    public Edge(int a, int b, int w) {
        this.vertexA = a;
        this.vertexB = b;
        this.weight = w;
    }

    public int getVertexA() { return vertexA; }
    public int getVertexB() { return vertexB; }
    public int getWeight() { return weight; }

    public void setVertexA(int a) { this.vertexA = a; }
    public void setVertexB(int b) { this.vertexB = b; }
    public void setWeight(int w) { this.weight = w; }
}
