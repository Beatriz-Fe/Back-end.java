package com.mycompany.poo.aula13.animais;

public class Leao extends Animal {
    public Leao(String nome, double altura, double peso) {
        super(nome, altura, peso);
    }

    /**
     * Cada classe precisa implementar o método abstrato seguindo
     * suas particularidades
    */
    @Override
    public void emitirSom() {
        // TODO Auto-generated method stub
        System.out.println("O leão está rugindo");
    }
}
