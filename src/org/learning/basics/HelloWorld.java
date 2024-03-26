package org.learning.basics;

public class HelloWorld {
    public static void main(String[] args){
//      DECLARATION:Dichiaro una variabile
        int num1;
//      ASSIGNMENT:Assegno il valore
        num1 = 10;
//      INITIALIZATION: Declaration + Assignment
        int num2 = 20;
//      FINAL: il valore assegnato non può essere cambiato successivamente
        final int result = num1 + num2;



        System.out.println("Hello world");
        System.out.println(result);
    }
}
