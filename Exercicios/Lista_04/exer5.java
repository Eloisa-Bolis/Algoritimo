/*
Escreva um algoritmo que solicite a digitação de uma sequência de números (na forma de um
texto, ex.: “939387473827023904823984274611230934756”) e procure se existe algum par de
números iguais (ex.: “11”, “22” etc)
 */
import java.util.Scanner;
public class exer5 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String numeros = leitor.nextLine();
        
        char atual = numeros.charAt(0);
        char prox = numeros.charAt(1);
        
        for(int i=2; i< numeros.length() && atual != prox; i++ ) {
            atual = numeros.charAt(i-1);
            prox = numeros.charAt(i);
        }
        if (atual == prox ) {
            System.out.println("encontre um par");     
        } else {
            System.out.println("nao encontrei um par");
        }

    }
    
}
