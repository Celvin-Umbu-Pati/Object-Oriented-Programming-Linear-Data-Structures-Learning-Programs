/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdlsenaraiberantai;

/**
 *
 * @author Celvin Pati
 */
public class LinkedList {
    private ListNode firstNode, lastNode;
    private String nama;

    public LinkedList() {}

    public LinkedList(String nama) {
        this.nama = nama;
    }
    public boolean isEmpty() {
        if (firstNode == null) {
            return true;
        } else {
            return false;
        }
    }
    public void addFirst(int data) {
        ListNode newNode = new ListNode(data, firstNode);
        if (isEmpty()) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            firstNode = newNode;
        }
    }
    public void addLast(int data) {
        ListNode newNode = new ListNode(data);
        if (isEmpty()) {
            firstNode = newNode;
            lastNode = newNode;
        } else {
            lastNode.setNext(newNode);
            lastNode = newNode;
        }
    }
     public ListNode removeFirst() {
        if (isEmpty()) {
            return null;
        } else {
            ListNode removed = firstNode;
            firstNode = firstNode.getNext();
            if (firstNode == null) {
                lastNode = null;
            }
            return removed;
        }
    }
    public ListNode removeLast() {
        if (isEmpty()) {
            return null;
        } else {
            ListNode removed = lastNode;

            if (firstNode == lastNode) {
                firstNode = null;
                lastNode = null;
            } else {
                ListNode current = firstNode;
                while (current.getNext() != lastNode) {
                    current = current.getNext();
                }
                current.setNext(null);
                lastNode = current;
            }
            return removed;
        }
        }
    public String toString() {
        StringBuilder sb = new StringBuilder();
        ListNode current = firstNode;

        while (current != null) {
            sb.append(current.getData()).append(",");
            current = current.getNext();
        }
        sb.append(" ");
        return sb.toString();
    }
}



