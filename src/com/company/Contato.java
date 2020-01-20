package com.company;

import java.util.ArrayList;

public class Contato {
    public ArrayList<String> numeros = new ArrayList<>();
    public String nome;

    public Contato(String nome, String numero){
        nome = nome;
        adicionarNumero(numero);
    }

    public void adicionarNumero(String numero){
        numeros.add(numero);
    }

}
