package com.company;

/*Lista 1 - Questão 14*/
public class MergeSortedLists {
    public static void main(String[] args) {
        final int TAMANHO_LISTA = 100;

        double[] listaA = OrdenarLista.ordenar(OrdenarLista.criarVetorALeatorio(TAMANHO_LISTA / 2), TAMANHO_LISTA / 2);
        double[] listaB = OrdenarLista.ordenar(OrdenarLista.criarVetorALeatorio(TAMANHO_LISTA / 2), TAMANHO_LISTA / 2);

        double[] listaFinal = new double[TAMANHO_LISTA];

        int aIndex = 0;
        int bIndex = 0;
        for(int i = 0; i < TAMANHO_LISTA; i++){

            if(bIndex >= TAMANHO_LISTA / 2 || (aIndex < TAMANHO_LISTA / 2 && listaA[aIndex] < listaB[bIndex])){
                listaFinal[i] = listaA[aIndex];
                aIndex++;
            } else if(aIndex >= TAMANHO_LISTA / 2 || (bIndex < TAMANHO_LISTA / 2 && listaA[aIndex] > listaB[bIndex])){
                listaFinal[i] = listaB[bIndex];
                bIndex++;
            } else if(aIndex < TAMANHO_LISTA / 2 && bIndex < TAMANHO_LISTA / 2){
                listaFinal[i++] = listaA[aIndex];
                listaFinal[i] = listaA[aIndex];
                aIndex++;
                bIndex++;
            }
        }

        for(int i = 0; i < TAMANHO_LISTA; i++){
            System.out.println("List: "+ listaFinal[i]);
        }
    }
}
