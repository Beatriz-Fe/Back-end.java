package com.mycompany;

import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class AnaliseNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[10];
        int soma = 0;
        int maior, menor;

        // Leitura dos 10 valores
        System.out.println("Digite 10 números inteiros:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Valor " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        // Inicializa maior e menor com o primeiro valor do vetor
        maior = menor = numeros[0];

        // Encontrando maior, menor e construindo frequências
        HashMap<Integer, Integer> frequencias = new HashMap<>();
        for (int num : numeros) {
            if (num > maior) maior = num;
            if (num < menor) menor = num;

            frequencias.put(num, frequencias.getOrDefault(num, 0) + 1);
        }

        // Encontrando o valor que mais se repete
        int maisFrequente = numeros[0];
        int maxFrequencia = 1;
        for (Map.Entry<Integer, Integer> entry : frequencias.entrySet()) {
            if (entry.getValue() > maxFrequencia) {
                maisFrequente = entry.getKey();
                maxFrequencia = entry.getValue();
            }
        }

        // Resultados
        double media = (double) soma / numeros.length;
        System.out.println("\nResultados:");
        System.out.println("Soma dos valores: " + soma);
        System.out.println("Média dos valores: " + media);
        System.out.println("Maior valor: " + maior);
        System.out.println("Menor valor: " + menor);
        System.out.println("Valor que mais se repete: " + maisFrequente +
                           " (ocorreu " + maxFrequencia + " vezes)");

        scanner.close();
    }
}



