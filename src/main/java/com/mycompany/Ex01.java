package com.mycompany;

import java.util.Scanner;
public class Ex01 {
    public static void main(String args[])  {
      //Atividade 01:
      int num1 = 46;
      int num2 = 45;
      int num3 = 20;
      int num4 = 9;

      int media = (num1 + num2 + num3 + num4) /4;
      System.out.println("Total  =" + media);

       //Atividade 02:
      Scanner entrada = new Scanner(System.in);

      System.out.print("Raio? ");
      double raio = entrada.nextDouble();
      
      double area = Math.PI * Math.pow(raio,2);
     
      System.out.printf("area = %.2f ", area);


       //atividade 03

      double percent = (1200*0.15);
      double total = (1200 + percent);
      System.out.println("porcentagem é: " +percent + " total é: " +total);

      //atividade 04
      double percent2 = (850*0.30);
      double total2 = (850 - percent2);
      System.out.println("porcentagem é: " +percent2 + " com menos 850, fica: " + total2);
    }
}
