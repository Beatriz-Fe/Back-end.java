package com.mycompany.poo.avaliacao;

public class App2 {
    public static void main(String[] args) {
        Esporte equitacao = new Equitacao("Corrida", 5);
        System.out.printf("%s é uma modalidade com %d jogadores por partida", 
        equitacao.getNome(), equitacao.getNjogadores());
        equitacao.iniciarPartida();

        Esporte tenis = new Tenis("Esporte de rede", 2);
        System.out.printf(" é um %s com %d jogadores", 
        tenis.getNome(), tenis.getNjogadores());
        tenis.iniciarPartida();
    }
}
