package com.mycompany;

import java.util.Scanner;

public class Aula05 {
    public static void main(String[] args) throws InterruptedException {
        /*
         * For (Para) 
         * 
         *Para cada elemento, repita
         * 
         *1° variável de interação
         *2° condição de parada
         *3° incremento ou decremento
         */
          //Incremento
     // {for(int i = 0; i <= 10 ; i = i +2)
       //  System.out.println(i);
     //}

        //Decremento
        //System.out.println("contagem regressiva...");
     //for (int i = 10; i >= 0; i --){
       //   Thread.sleep(1000L);
        //  System.out.println(i + "....");
    // }
     //System.out.println("Boom!!");

      /**
         * Classe scanner
         * é utilizada para ler valores inseridos pelo prompt
         */
        //Scanner scan = new Scanner(System.in);
       // System.out.println("Digite um número: ");

        //int numero = scan.nextInt();
        //System.out.println("Você digitou " + numero+"!!");

        /**
         * While (enquanto)
         */

         int num1 = 1;

         while (num1 != 0) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Digite um número: (0 para parar)");

            num1 = scan.nextInt();
            
            System.out.println("você digitou " + num1 +"!!");
         }
         System.out.println("Execução encerrada!");

         int num2 = 1;

         do {
             Scanner scan = new Scanner(System.in);
             System.out.println("Digite um número: (0 para parar)");
             num2 = scan.nextInt();
         } while (num2 !=0);
         System.out.println("Execução encerrada!!");
     }
    
}
