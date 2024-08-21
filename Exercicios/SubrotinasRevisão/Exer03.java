/*
Escreva um novo programa, alterando o exercício 2, e após o cálculo da média, conte quantos dos 50 números estão acima da média calculada.
*/
import java.util.Scanner;
public class Exer03 {
    private static Scanner leitor = new Scanner (System.in);
    
    public static void LeitorMenorMaior(){
        double vetor[] = new double [50];
        double maximo, minimo, atual;
        
        System.out.println("Digite um valor ");
        maximo = minimo = leitor.nextInt();
        
        for(int i =1; i<50; i++){
            System.out.println("Digite um valor ");
            atual = leitor.nextDouble();
            vetor[i]=atual;
            if( atual > maximo ) {
                maximo = atual;
            } else {
                if( atual < minimo ) {
                    minimo = atual;
                }
            }
        }
    }
}
