package com.mycompany.poo.aula10;

public class Pessoa {
    /*
     * Modificadores de acesso
     * 
     * Quando trabalhamos com o conceito de poo, utilizamos modificadores de acesso, 
     * para dar segurança para nossas classes.
     * 
     * Utilizamos ela como prefixo para:
     * - Classes
     * - Interfaces
     * - Atributos
     * - Métodos
     */
    public String nome; //Público é vísivel em qualquer classe.
    protected int idade; //Protegido e vísivel somente em classes filhas
    private double salario; //Privado, é vísivel somente dentro da própria classe
    double altura; //Friendly ou Público, apesar de não estra explicíto, ele também é visível

    public void exibirDados() {
        System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
        System.out.println("Altura (m): " + altura);
    }
}
