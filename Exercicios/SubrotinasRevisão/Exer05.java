/*
Escreva um novo programa, alterando o exercício 4, e conte também quantos dos 50 números estão abaixo da 
média calculada.
*/
import java.util.Scanner;
public class Exer05 {
    private static Scanner leitor = new Scanner (System.in);
    
    public static void LeitorMediaAcimaContEAbaxo(){
        double vetor[] = new double [50];
        double soma =0;
        double contador = 0;
        double acima =0;
        double abaixo =0;
        
        for(int i =0; i<50; i++){
            System.out.println("Digite um valor ");
            double primeiro = leitor.nextDouble();
            vetor[i]=primeiro;
            contador++;
            soma += vetor[i];
        }
        double media = (soma / contador);
        
        for(int i =0; i<50; i++){
            if(vetor[i] > media){
                acima++;
            }else{
                abaixo++;
            }
        }
    }
}
