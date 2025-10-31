package com.mycompany.poo.avaliacao;

public abstract class Esporte {
    private String nome;
    private int nJogadores;

    public Esporte(){

    }

    public Esporte (String nome, int nJogadores){
        this.nome = nome;
        this.nJogadores = nJogadores;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getNjogadores(){
        return nJogadores;
    }

    public void setNjogadores(int nJogadores){
        this.nJogadores = nJogadores;
    }
    
    public abstract void iniciarPartida();

    public void exibirInformaçoes(){
        System.out.println(this.nome + this.nJogadores);
    }
}
