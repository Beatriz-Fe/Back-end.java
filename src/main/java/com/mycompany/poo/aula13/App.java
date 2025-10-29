package com.mycompany.poo.aula13;

import com.mycompany.poo.aula13.animais.Animal;
import com.mycompany.poo.aula13.animais.Leao;

public class App {
    public static void main(String[] args) {
        /**
         * Quando falamos em polimorfismo, estamos falando
         * que uma classe pode assumir multiplas formas
         */
        Animal leao = new Leao("Mufasa", 2, 120);
        System.out.printf("%s é um animal da espécie leão de %.1fm de altura, e pesa %.1fkg", 
        leao.getNome(), leao.getAltura(), leao.getPeso());
        leao.emitirSom();
    }
}
