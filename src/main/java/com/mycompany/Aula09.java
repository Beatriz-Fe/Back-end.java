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
        /*
         * Instanciando uma classe
         */
        Carro carro = new Carro ("Chevrolet", "Celta");
        carro.andar(60);
    }
    /*
     * Criando uma classe dentro de outra classe
     * 
     * é necessário usar a instrução static
     * entre public e class
     */

    public static class Carro {
      String modelo;
      String marca;
      int ano;
      int quilometragem = 0;

      /*
       * método construtor
       * é chamado quando criamos uma nova instância 
       * de classe
       */

      public Carro(String modelo, String marca) {
        this.modelo = modelo;
        this.marca = marca;
      }

      void andar(int km) {
        this.quilometragem += km;
        System.out.println("o carro está percorrendo " + km + "km");
      }
    }
}
