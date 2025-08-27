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

    /**
     * Nomenclatura de métodos
     * 
     * métodos/funções indicam ações, e por padrão usamos verbos
     * 
     * ex: correr, andar, caminhar ---
     */

    public void atribuirSalario(double valor) {
        this.salario = valor;

        System.out.println("O novo salário de " + this.nome + " é " + this.salario);
    }

    public void atribuirSalario(double valor, double bonus) {
        this.salario = valor + bonus;

        System.out.println("O novo salario de " + this.nome + " é " + this.salario + " com um bonus de " + bonus);

    }
}
