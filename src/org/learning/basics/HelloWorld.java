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

//      ARRAY: Collezioni ordinate di elementi
//      non bisogna dichiarare la lunghezza se assegni direttamente i valori
        int[] numeri = {1, 2, 3, 4, 5};
        String[] nomi = {"Alice", "Bob", "Charlie"};



        System.out.println("Hello world");
        System.out.println(result);
    }
}
