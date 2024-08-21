/*
Escreva um programa em Java que leia 10 números inteiros, e armazene num vetor. Em
seguida, leia mais um número e verifique se ele é igual a um dos 10 números armazenados no
vetor.
*/
import java.util.Scanner;
public class Exer03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int numeros[] = new int [10];
        
        System.out.println("Digite dez numeros");
        
        for(int i = 0; i < 10; i++){
            int Num = leitor.nextInt();
            numeros [i]= Num;
        }
        
        System.out.println("Digite o numero queira buscar ");
        int busca = leitor.nextInt ();
        
        int indice;
        for(indice = 0; indice < numeros.length && busca != numeros[indice]; indice++){
        }
        
        if(indice == numeros.length){
            System.out.println("Nao achei o numero :<");
        }else{
            System.out.println("Achei o numero e ele esta na posicao " + indice + " :>");
        }
    }
}