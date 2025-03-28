package com.mycompany;

public class Aula01 {

    public static void main(String[] args) {
       //variavel logica
       //tipo primitivo
       
       Boolean valorLogicoPrimitivo = true;

       //exibe o valor
       System.out.println(valorLogicoPrimitivo);

       //tipo abstrato
       Boolean valorLogicoAbstrato = false;

       System.out.println("O valor da variavel valorLogicoAbstrato é:" +valorLogicoAbstrato);

       //variaveis inteiras
       //Tipo primitivo

       int valorInteiro = 10; //32bits
       long valorInteiroLongo = 10L; //64bits

       //valor abstrato
       Integer valorInteiroAbs = 20;
       Long valorLongAbs = 20L;

       //tipo primitivo
       float numeroFloat = 10.5f;
       double numeroDouble = 10.5f;

       Float numeroFloatAbs = 10.5f;
       Double numeroDoubleAbs = 10.5;
       System.out.println("O valor de numeroFloat é: " +numeroFloat+ ", e o valor numeroDouble é: " +numeroDouble);

        

       System.out.println("O valor inteiro é: " + valorInteiro + ", e o valor inteiro longo é: " + valorInteiroLongo);
    }
}