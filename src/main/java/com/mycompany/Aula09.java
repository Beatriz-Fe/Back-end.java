package com.mycompany;

public class Aula09 {
    public static void main(String[] args) {
        /*
         * Em java, toda classe do tipo abstrato é um objeto, pois possue características
         * e funcionalidades.
         * 
         * Eles herdam funções da classe mãe java.lang.object, é correto afirmar que java.lang.object é uma super classe
         * de qualquer outra classe ou tipo abstrato
         */
        Integer numero = 10; //tipo abstrato
        int numero2 = 10; //tipo primitivo


        //Retorna se a variável/classe é uma instância de outra classe
        System.out.println(numero instanceof Object);

        //Método compareTo pertence ao tipo abstrato Integer
        numero.compareTo(numero2);
    }
}
