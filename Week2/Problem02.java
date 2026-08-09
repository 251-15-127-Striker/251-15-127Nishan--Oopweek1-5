/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2;

import java.util.Scanner;
public class Problem02 {
   static int B;
static int H;
static boolean flag;
static {
 Scanner scn =new Scanner(System.in);  
    B=scn.nextInt();
    H=scn.nextInt();
    if(B>0&&H>0)
    {flag=true;}
    else{
        flag=false;
        System.out.println("java.lang.Exception: Breadth and height must be positive");
    }
}


public static void main(String[] args){
		if(flag){
			int area=B*H;
			System.out.print(area);
		}
		
	}

}
