/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author 5im14kelay
 */
public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        Scanner sc = new Scanner(System.in);
        int Res = calc.addition(5, 6);
        String quitterino = sc.next();
        
        while(quitterino != "q")
        {
            System.out.println("Dieses Programm addiert zwei Zahlen");
            System.out.println("Zahleingabe 1:");
            int s1 = sc.nextInt();
            System.out.println("Zahleingabe 2:");
            int s2 = sc.nextInt();
            System.out.println("Beenden? (q)");
        }
    }
}
