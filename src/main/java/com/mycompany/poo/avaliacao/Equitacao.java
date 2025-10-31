package com.mycompany.poo.avaliacao;

public class Equitacao extends Esporte{
    public Equitacao (String nome, int nJogadores){
        super(nome, nJogadores);
    }

    public void iniciarPartida(){
        System.out.println(" A corrida está começando...");
    }
}
