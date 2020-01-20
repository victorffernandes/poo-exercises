package com.company;

import java.util.Scanner;

public class JurosCompostos {

    static void app(){
        Scanner teclado = new Scanner(System.in);

        System.out.println("Insira o valor para investir cada mês: " );
        float mes = teclado.nextFloat();
        System.out.println("Insira a taxa: " );
        float taxa = teclado.nextFloat();

        float valor = 0;
        for(int i = 0; i < 12; i++){
            valor = valor*(1 + taxa) + mes;
        }

        System.out.println("Saldo do investimento: " + valor);
        System.out.print(" Deseja processar mais um ano? (S/N)");

        if(teclado.next().trim().equals("S")){
            app();
        }
    }

    public static void main(String[] args) {
        app();
    }
}
