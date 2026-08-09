/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.week3;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class Problem02 {
public static void main(String[] args)  {
 
    Scanner scn= new Scanner(System.in);
     double salary= scn.nextDouble();
     if(salary>=0&&salary<=400.00){
         double insalary=salary*.15;
       double tsalary=salary+insalary;  
       System.out.printf("Novo salario: %.2f\n", tsalary);
       System.out.printf("Reajuste ganho: %.2f\n", insalary);
       System.out.printf("Em percentual: %.0f %%\n", 15.0);
     }
     if(salary>=400.01&&salary<=800.00){
         double insalary=salary*.12;
       double tsalary=salary+insalary;  
        System.out.printf("Novo salario: %.2f\n",tsalary); 
        System.out.printf("Reajuste ganho: %.2f\n",insalary);
        System.out.printf("Em percentual: %.0f %%\n",12.0);
     }
     if(salary>=800.01&&salary<=1200.00){
         double insalary=salary*.10;
       double tsalary=salary+insalary;  
        System.out.printf("Novo salario: %.2f\n",tsalary); 
        System.out.printf("Reajuste ganho: %.2f\n",insalary);
        System.out.printf("Em percentual: %.0f %%\n",10.0);
     }
     if(salary>=1200.01&&salary<=2000.00){
         double insalary=salary*.07;
       double tsalary=salary+insalary;  
        System.out.printf("Novo salario: %.2f\n",tsalary); 
        System.out.printf("Reajuste ganho: %.2f\n",insalary);
        System.out.printf("Em percentual: %.0f %%\n",7.0);
     }
     if(salary>20000.00){
         double insalary=salary*.04;
       double tsalary=salary+insalary;  
       System.out.printf("Novo salario: %.2f\n",tsalary); 
        System.out.printf("Reajuste ganho: %.2f\n",insalary);
        System.out.printf("Em percentual: %.0f %%\n",4.0);
     }
    }
}
