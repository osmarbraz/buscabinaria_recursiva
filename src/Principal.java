/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplinas: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 * Baseado nos slides da aula 01/09/2017 
 */

/**
 *
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {

    /**
     * Entrada: Vetor A, delimitadores e e d do subvetor e x.
     * B Saída: Indice 1 <= i <= n tal que A[i] = x ou i = 0
     * Slide 62
     * @param A vetor com os valores
     * @param e indice do inicio do vetor
     * @param d indice do final do vetor
     * @param x valor a ser procurado no vetor
     */
    public static int buscaBinaria(int[] A, int e , int d, int x) {
        //Chegou no final do intervalo
        if(e==d){
            //Verifica se é o valor desejado
            if(A[e]==x){
                //Acho o valor
                return e;
            } else {
                //Não achou
                return -1;
            }
        } else {
            //Divide o intervalo
            int i = (e+d)/2;
            //Vefifica se é igual
            if ((A[i])==x){
                //Retorna a posição
                return i;
            } else {
                //Verifica se o valor da posição i e maior que x
                if (A[i] > x){
                    //Busca na parte inferior
                    i=buscaBinaria(A,e,i-1,x);
                }else {//A[i] < x
                    //Busca na parte superior
                    i=buscaBinaria(A,i+1,d,x);
                }
            }
            return i;
        }
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Vetor dos dados    
        int A[] = {10, 20, 30, 40, 50, 60, 70, 80};
        
        //Inicio do vetor
        int e = 0;
        //Fim do vetor
        int d = A.length-1;
        //Valor a ser procurado
        int x = 10;
        
        int i = buscaBinaria(A, e , d, x);
        System.out.println("O valor "+ x + " está na posição :"+i);
        
    }
    
}
