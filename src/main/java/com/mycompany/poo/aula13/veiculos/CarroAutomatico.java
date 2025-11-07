package com.mycompany.poo.aula13.veiculos;

public class CarroAutomatico implements Veiculo {

    @Override
    public void seguirEmFrente() {
        System.out.println ("Colocar em D e acelerar");
    }
    @Override
    public void estacionar() {
        System.out.println("Manobrar o veiculo na vaga, colocar em P e estacionar");
    }

    @Override
    public void re() {
       System.out.println("Colocar em R");
    }
}

