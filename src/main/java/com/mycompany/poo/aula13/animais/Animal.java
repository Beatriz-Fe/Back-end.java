package com.mycompany.poo.aula13.animais;

public abstract class Animal {
    
    private String nome;
    private double altura;
    private double peso;

    public Animal(){

    }
    public Animal(String nome, double altura, double peso){
        this.nome = nome;
        this.altura = altura;
        this.peso = peso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    //O método som será implementado somente pelas subclasses que herdarem de animal
    public abstract void emitirSom();

    public void respirar() {
        System.out.println("respirando...");
    }

    //sobrecarga: o método mover possui 2 definições

    public void mover(){
        System.out.println(this.nome + " está se movendo...");
    }

    public void mover(String direcao){
        System.out.println(this.nome + "está se movendo para o/a" + direcao + "...");
    }

    public double getAltura(){
        return altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getPeso(){
        return peso;
    }

    public void setPeso(double peso){
        this.peso = peso;
    }

}
