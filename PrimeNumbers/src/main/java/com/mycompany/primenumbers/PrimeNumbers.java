/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumbers;

/**
 *
 * @author g
 */


// Base class
class PrimeNumbers {
    // Encapsulated field
    private  int number;

    // Getter and Setter for the number
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    // Method to check if the number is prime
    public boolean isPrime() {
        if (number <= 1) {
            return false; // Numbers <= 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // Number is divisible, hence not prime
            }
        }
        return true;
    }
     public static void main(String[] args) {
        
        checker app = new checker();
        app.start();
       
    }

}


  




