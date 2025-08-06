package com.mycompany.poo.aula10;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Leonardo";
        pessoa.idade = 26;
        //pessoa.salario = 1.800; atributos privados não são visíveis

        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "João";
        pessoa1.idade = 28;
        pessoa1.altura = 1.78;

        pessoa2.nome = "Isaac";
        pessoa2.idade = 26;
        pessoa2.altura = 1.72;

        pessoa1.exibirDados();
        pessoa2.exibirDados();

        pessoa1.atribuirSalario(2000.0, 500);
        pessoa2.atribuirSalario(4000.0, 800);

        /*System.out.println("--- Dados da pessoa ---");
        System.out.println("Nome: " + pessoa1.nome);
        System.out.println("Idade: " + pessoa1.idade);
        System.out.println("Altura (m): " + pessoa1.altura);

        System.out.println("--- Dados da pessoa2 ---");
        System.out.println("Nome: " + pessoa2.nome);
        System.out.println("Idade: " + pessoa2.idade);
        System.out.println("Altura (m): " + pessoa2.altura);*/
    }
}
