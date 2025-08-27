package com.mycompany.poo.aula11;

public class App {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        //Modificar o valor
        pessoa.setNome("Bia");
        pessoa.setIdade(17);

        //acessar o valor
        System.out.printf("%s tem %d anos de idade\n", pessoa.getNome(), pessoa.getIdade());
    }
}
