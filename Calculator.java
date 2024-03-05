/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

import java.util.Scanner;

/**
 *
 * @author pokor
 */
public class Calculator {

    public static void main(String[] args) {
        int operator;
        int first_number;
        int second_number;
        int answer;
        
        System.out.println("1. Add\n 2. Subtract\n 3. Multiply\n 4. Divide\n");
        System.out.println("Please choose your preferred operator: ");
        Scanner scan = new Scanner(System.in);
        operator = scan.nextInt();
        System.out.println("Please enter your first number: " );
        first_number = scan.nextInt();
        System.out.println("Please enter your second number: ");
        second_number = scan.nextInt();
        
        switch(operator){
            case 1:
                answer = first_number + second_number;
               System.out.println("Your answer is: " + answer);
               break;
               
            case 2:
                answer = first_number - second_number;
                System.out.println("Your answer is: " + answer);
               break;
               
            case 3:
                answer = first_number * second_number;
                System.out.println("Your answer is: " + answer);
               break;
               
            case 4:
                answer = first_number / second_number;
                System.out.println("Your answer is: " + answer);
               break;
               
            default:
                break;
                
        }
        
    }
}
