/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sdlsenaraiberantai;

/**
 *
 * @author Celvin Pati
 */
public class ListNode {
    private int data;
    private ListNode next;
    
    public ListNode(int data) {
        this.data = data;
        this.next = null;
    }
    public ListNode(int data, ListNode next) {
        this.data = data;
        this.next = next;
    }
    public void setData(int data) {
        this.data = data;
    }
    public int getData() {
        return data;
    }
    public void setNext(ListNode next) {
        this.next = next;
    }
    public ListNode getNext() {
        return next;
    }
}

