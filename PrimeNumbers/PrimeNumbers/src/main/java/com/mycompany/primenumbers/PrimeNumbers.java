/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.primenumbers;

/**
 *
 * @author g
 */



class PrimeNumbers {
    
    private  int number;

    
    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

   
    public boolean isPrime() {
        if (number <= 1) {
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; 
            }
        }
        return true;
    }
     public static void main(String[] args) {
        
        checker app = new checker();
        app.start();
       
    }

}


  




