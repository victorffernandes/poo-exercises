package com.company;

import java.util.Scanner;
/* Lista 1 - Questao 4*/
public class Produto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira as informações do produto: nome preço quantidade");
        String nome = teclado.next().trim();
        float preco = teclado.nextFloat();
        int quantidade = teclado.nextInt();

        float desconto = 1f;
        if( quantidade >= 11 && quantidade <= 20 ){
            desconto = 0.9f;
        } else if(quantidade >= 21 && quantidade <= 50){
            desconto = 0.8f;
        } else if( quantidade > 50){
            desconto = 0.75f;
        }

        System.out.print("Total a pagar: " + (preco * quantidade * desconto) + " -> " + nome);
    }
}
