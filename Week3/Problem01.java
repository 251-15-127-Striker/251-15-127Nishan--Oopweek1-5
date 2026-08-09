/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem01 {
    public static void main(String[] args) {
 
       
       Scanner scn =new Scanner(System.in);
       String sellername = scn.nextLine();
       double fixedsalary=scn.nextDouble();
       double salestotal= scn.nextDouble();
       double finalsalary=fixedsalary+salestotal*.15;
       System.out.printf("TOTAL = R$ %.2f\n",finalsalary);
 
 
    }
  
}
