package com.mycompany;

import java.util.Scanner;

   public class Ex02 { 
    public static void main(String[] args) throws InterruptedException {

           int i;
      do {
          Scanner scan = new Scanner(System.in);
          System.out.println("Informar um número: (0 para finalizar):");

          i = scan.nextInt();
          if (i != 0) {
              int x = 0;
              while (x < 10) {
                  x++;
                System.out.println(i + " * " + mult + "  = " + (i * mult));
                }
            } 
        } while (i != 0);
    }
}
