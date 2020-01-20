package com.company;

import java.util.ArrayList;

public class Agenda {
    public ArrayList<Contato> contatos = new ArrayList<Contato>();

    public void adicionarContato(String nome, String numero){
        Contato novoContato = new Contato(nome,numero);
        contatos.add(novoContato);
    }

    public

    public Contato adicinarNumeroContato(String nome, String numero){
        for(int i = 0; i < contatos.size(); i++){
            Contato atual = contatos.get(i);
            if (atual.nome.contains(nome)){
                atual.adicionarNumero(numero);
                return atual;
            }
        }
        return null;
    }

    public Contato acharContato(String nome){
        for(int i = 0; i < contatos.size(); i++){
            Contato atual = contatos.get(i);
            if (atual.nome.contains(nome)){
                return atual;
            }
        }
        return null;
    }

    public Contato removerContato(String nome){
        for(int i = 0; i < contatos.size(); i++){
            Contato atual = contatos.get(i);
            if (atual.nome.equals(nome)){
                contatos.remove(atual);
                return atual;
            }
        }
        return null;
    }
}
