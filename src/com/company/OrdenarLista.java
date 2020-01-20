package com.company;

/*Lista 1 - Questão 13*/
public class OrdenarLista {

    public static double[] ordenar(double[] lista, int length){
        double[] listaOrdenada = lista.clone();

        boolean alterouLista;
        do{
            alterouLista = false;
            for(int i = 0; i < length - 1; i++){
                if(listaOrdenada[i] > listaOrdenada[i + 1]){
                    double temp = listaOrdenada[i];
                    listaOrdenada[i] = listaOrdenada[i + 1];
                    listaOrdenada[i+1] = temp;
                    alterouLista = true;
                }
            }
        }
        while(alterouLista);

        return  listaOrdenada;
    }

    public static double[] criarVetorALeatorio(int length){
        double[] lista = new double[length];

        for(int i = 0; i < length; i++){
            double random = Math.floor(Math.random() * 1000);
            lista[i] = random;
            System.out.println(lista[i]);
        }

        return lista;
    }

    public static void main(String[] args) {
        double[] lista = criarVetorALeatorio(100);

        double[] listaOrdenada = ordenar(lista, 100);

        for(int i = 0; i < 100; i ++){
            System.out.println(listaOrdenada[i]);
        }
    }
}
