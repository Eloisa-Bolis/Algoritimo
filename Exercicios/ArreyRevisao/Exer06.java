/*
Escreva um programa em Java que leia 100 números naturais, cujos valores estão no intervalo
[1, 10], e conte quantos números de cada valor (1 a 10) existe.
 */
import java.util.Scanner;
public class Exer06 {

    public static void main(String[] args) {
        Scanner dado = new Scanner(System.in);
        
        int valores[] = new int[10];
        int contVal[] = new int[10];
        
        for(int i = 0; i < valores.length; i++) {
            valores[i] = dado.nextInt();
        }
        for(int i = 0; i < 10; i++) {
            for(int j = 0; j < valores.length; j++) {
                if(valores[j] == i+1) {
                    contVal[i]++;
                }
            }
            System.out.println(contVal[i]);
        }       
    }  
}