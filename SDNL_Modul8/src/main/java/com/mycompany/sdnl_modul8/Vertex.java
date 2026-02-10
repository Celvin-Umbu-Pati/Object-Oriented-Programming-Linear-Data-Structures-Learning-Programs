/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.sdnl_modul8;

/**
 *
 * @author Celvin Pati
 */
public class Vertex {
    private String label;
    private boolean visited;

    public Vertex(String label) {
        this.label = label;
        this.visited = false;
    }

    public String getLabel() {
        return label;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean v) {
        this.visited = v;
    }
}
