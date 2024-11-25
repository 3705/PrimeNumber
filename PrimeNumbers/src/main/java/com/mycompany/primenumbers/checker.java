/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.primenumbers;

import java.util.Scanner;

/**
 *
 * @author g
 */

class checker extends PrimeNumbers {
    public void start() {
       Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        setNumber(number); // Set the number using setter

        // Check if the number is prime and print the result
        if (isPrime()) {
            System.out.println(getNumber() + " is a prime number.");
        } else {
            System.out.println(getNumber() + " is not a prime number.");
        }

        scanner.close();
    }


// Main class to run the program
 public static void main(String[] args) {
        
      
    
        
     
    }
}
