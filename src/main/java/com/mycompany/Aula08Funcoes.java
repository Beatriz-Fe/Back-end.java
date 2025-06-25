package com.mycompany;
import java.util.Scanner;

public class Aula08Funcoes {

    public static void main (String[] args){
      int numero = 0;

      Scanner scan = new Scanner(System.in);
      System.out.println("Informe um número:");
      numero = scan.nextInt();

      System.out.println("--- Tabuada do " + numero + "---");
      
      for(int i = 1; i <= 10; i++){
        System.out.println(numero + " x " + i + " = " + multiplicacao(numero, i));
      }
    }
    public static int multiplicacao(int num, int num2) {
        return num * num2;
    }
}
