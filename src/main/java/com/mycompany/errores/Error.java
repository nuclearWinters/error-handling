/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.errores;
import java.util.Scanner;
/**
 *
 * @author Armando
 */
public class Error {
    public static void main(String[] args) {
        Scanner input  = new Scanner(System.in);
        int x = 1;
        do {
            try {
            System.out.println("Enter first num: ");
            int n1 = input.nextInt();
            System.out.println("Enter second num: ");
            int n2 = input.nextInt();
            int sum = n1/n2;
            System.out.println(sum);
            x=2;
        } catch (Exception e) {
            System.out.println("You can't do that.");
        }
        } while (x==1);
        
    }
}
