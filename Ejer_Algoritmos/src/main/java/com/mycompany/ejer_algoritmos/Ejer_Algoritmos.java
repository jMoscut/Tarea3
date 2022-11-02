/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.ejer_algoritmos;

import java.util.Scanner;

/**
 *
 * @author jackiesanchez
 */
public class Ejer_Algoritmos {

    public static void main(String[] args) {
       
        int op;
        float res,op1,op2;
        
        op= 0;
        res = 0;
        
        Scanner scan = new Scanner(System.in);

        System.out.println("1.- Suma");
        System.out.println("2.- Resta");
        System.out.println("3.- Multiplicación");
        System.out.println("4.- División");
        System.out.print("Ingrese la operación que desea realizar: ");
        op= scan.nextInt();
        
        System.out.print("Ingrese el primero operando: ");
        op1 = scan.nextFloat();
        
        System.out.print("Ingrese el segundo operando: ");
        op2 = scan.nextFloat();
        
     
        
        switch (op) {
            case 1: res = suma(op1,op2);
                    break;
            case 2: res = resta(op1,op2);
                    break;
            case 3: res = multiplicacion(op1,op2);
                    break;
            case 4: res = division(op1,op2);
                    break;
        }
        
        System.out.print("El resultado de su operacion es: " + res);
    }
    

    public static float suma(float op1, float op2) {
        float  res1;     
               
        res1= op1 + op2;
        
        return res1;
    }
    
    public static float resta(float op1, float op2) {
        float  res1;    
        
        res1 = op1 - op2;
        
        return res1;
    }
    
     public static float multiplicacion(float op1, float op2) {
         float  res1;           
        
        res1= op1 * op2;
        
        return res1;
    }
     
      public static float division(float op1, float op2) {
         float  res1;           
        
        res1 = op1/ op2;
        
        return res1;
    }
    }

