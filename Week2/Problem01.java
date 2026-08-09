/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Problem01 {
    public static void main(String[] args)  {
        Scanner scn = new Scanner(System.in); 
            int number=scn.nextInt();
            int hour=scn.nextInt();
            float salary=scn.nextFloat();
            float totalsalary=hour*salary;
            System.out.println("NUMBER = "+number);
            System.out.printf("SALARY = U$ %.2f%n", totalsalary);
        }
    } 
