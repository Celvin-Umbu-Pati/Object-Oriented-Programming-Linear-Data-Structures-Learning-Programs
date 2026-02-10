/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.strukturdata;

/**
 *
 * @author Celvin Pati
 */
public class latihan {
    public static void main (String args[]) 
	{
		count(3);
		System.out.println();
	}

	public static void count (int index) 
	{
		System.out.print(index);
		if (index < 2) 
			count(index+1);
	}
}
 
