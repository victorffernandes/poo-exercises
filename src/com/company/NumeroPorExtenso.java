package com.company;

import java.util.Scanner;

/*Lista 1 - Questão 19*/
public class NumeroPorExtenso {

    static String retornaCentenaExtenso(int numero){
        int[] algarismos = new int[3];
        algarismos[0] = numero/100;
        algarismos[1] = (numero%100) / 10;
        algarismos[2] = (numero % 100) % 10;

        String[] excessao = {"dez", "onze", "doze", "treze", "quatorze", "quinze", "dezesseis", "dezessete", "dezoito", "dezenove"};

        String[][] traducao = {
                {"", "um", "dois", "tres", "quatro", "cinco", "seis", "sete", "oito", "nove"},
                {"", null, "vinte", "trinta", "quarenta", "cinquenta", "sessenta", "setenta", "oitenta", "noventa"},
                {null, "cento", "duzentos", "trezentos", "quatrocentos", "quinhentos", "seiscentos", "setecentos", "oitocentos", "novecentos"}
        };

        String centenaTraduzido = traducao[2][algarismos[0]] != null ? traducao[2][algarismos[0]] : "";
        String dezena, unidade;
        if(algarismos[1] == 1) {
            dezena = excessao[algarismos[2]];
            unidade = "";
        } else if(algarismos[1] == 0 && algarismos[2] == 0){
            dezena = "";
            unidade = "";
        }
        else{
            dezena =  !centenaTraduzido.equals("") ?" e " + traducao[1][algarismos[1]] + " ": traducao[1][algarismos[1]]  + " ";
            unidade = traducao[0][algarismos[2]];
        }

        return centenaTraduzido + dezena + unidade;
    }

    static String retornarSufixo(String numero){
        String[] traducao = {"", " mil ", " milhões "};

        String[] numeroSeparado = { "", "", ""};

        int j = 0;
        for(int i = numero.length(); i > 0 ; i-=3 ){
            numeroSeparado[j] = numero.substring(Math.max(0, i - 3), i);
            j++;
        }

        String numeroFinal = "";
        for(int i = numeroSeparado.length - 1; i >= 0; i--){
            if(!numeroSeparado[i].equals("") && !numeroSeparado[i].equals("000")){
                numeroFinal += retornaCentenaExtenso(Integer.parseInt(numeroSeparado[i])) + traducao[i];
            }
        }

        return numeroFinal;
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        String numero = teclado.next();

        if(numero.equals("0")){
            System.out.println("zero");
        } else{
            System.out.println(retornarSufixo(numero));
        }
    }
}
