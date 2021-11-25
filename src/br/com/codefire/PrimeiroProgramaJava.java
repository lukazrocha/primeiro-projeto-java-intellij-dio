package br.com.codefire;

import br.com.codefire.model.Gato;

public class PrimeiroProgramaJava {
    public static void main(String[] args) {

        Gato gato = new Gato();
        gato.setNome("Numb");
        gato.setIdade(3);

        System.out.println("Hello World!");
        System.out.println(gato);

    }

}
