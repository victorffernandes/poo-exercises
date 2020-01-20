package com.company;
/*Lista 1 - Questão 17*/
public class Romano {

    public static void main(String[] args) {
        int numero = 0;
        int[] algarismos = new int[3];

        algarismos[0] = numero/100;
        algarismos[1] = (numero%100) / 10;
        algarismos[2] = (numero % 100) % 10;

        String [][] algarismosRomanos = {
                {"","I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX"},
                {"","X", "XX", "XXX", "XL", "L", "LX", "LXX", "LXXX", "XC"},
                {"", "C", "CC", "CCC", "CD", "D", "DC", "DCC", "DCCC", "CM"}
        };

        System.out.println("unidade: "+ algarismos[2] + " dezena: "+ algarismos[1] + " centena: "+ algarismos[0]);
        System.out.println(algarismosRomanos[2][algarismos[0]] +  algarismosRomanos[1][algarismos[1]] + algarismosRomanos[0][algarismos[2]]);
    }
}
