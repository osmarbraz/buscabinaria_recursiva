/*
 * Universidade Federal de Santa Catarina - UFSC
 * Departamento de Informática e Estatística - INE
 * Programa de Pós-Graduação em Ciências da Computação - PROPG
 * Disciplina: Projeto e Análise de Algoritmos
 * Prof Alexandre Gonçalves da Silva 
 *
 * Baseado nos slides 62 da aula 01/09/2017  
 *
 * Algoritmo de Busca Binária Recursiva/Recursive BinarySearch
 *
 * Atenção:
 * Vetor em java inicia em 0, os algoritmos consideram início em 1.
 * A subtração de -1 ocorre somente no local de acesso ao vetor ou matriz 
 * para manter a compatibilidade entre os algoritmos.
 * 
 */

/**
 *
 * @author Osmar de Oliveira Braz Junior
 */
public class Principal {
 
    /**
     * Busca Binária Recursiva.
     * Entrada: Vetor A, delimitadores e e d do subvetor e x.
     * B Saída: Índice 1 <= i <= n tal que A[i] = x ou i = 0
     * 
     * Slide 62 da aula 01/09/2017 
     * 
     * @param A vetor com os valores 
     * @param e índice do início do vetor
     * @param d índice do final do vetor
     * @param x valor a ser procurado no vetor
     */
    public static int buscaBinaria(int[] A, int e , int d, int x) {
        //Chegou no final do intervalo
        if(e==d){
            //Verifica se é o valor desejado
            if(A[e-1]==x){
                //Acho o valor
                return e;
            } else {
                //Não achou
                return 0;
            }
        } else {
            //Divide o intervalo
            int i = (e+d)/2;
            //Vefifica se é igual
            if ((A[i-1])==x){
                //Retorna a posição
                return i;
            } else {
                //Verifica se o valor da posição i e maior que x
                if (A[i-1] > x){
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
    
    public static void main(String[] args) {
        //Vetor dos dados    
        int A[] = {10, 20, 30, 40, 50, 60, 70, 80};
        
        //Inicio do vetor
        int e = 1;
        //Fim do vetor
        int d = A.length;
        
        System.out.println(">>> Algoritmo de Busca Binária Recursiva/Recursive BinarySearch <<<");
        
        //Valor a ser procurado
        int x = 10;        
        int i = buscaBinaria(A, e , d, x);
        System.out.println("Teste 1: o valor: "+ x + " está na posição :"+i);
        
        //Valor a ser procurado
        x = 40;        
        i = buscaBinaria(A, e , d, x);
        System.out.println("Teste 2: o valor: "+ x + " está na posição :"+i);
        
        //Valor a ser procurado
        x = 80;        
        i = buscaBinaria(A, e , d, x);
        System.out.println("Teste 3: o valor: "+ x + " está na posição :"+i);
    }    
}