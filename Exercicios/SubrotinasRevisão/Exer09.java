/*
Escreva um novo programa, alterando o exercício 8, e pesquise quantos números dos 7 do
primeiro vetor são iguais a algum dos 6 números do segundo vetor.
*/
import java.util.Scanner;
public class Exer09 {
    private static Scanner leitor = new Scanner (System.in);
    
    public static void Leitor2ArreyBuscaEntre(){
        int vetor[] = new int [7];
        for(int i =0; i<vetor.length; i++){
            System.out.println("Digite um valor entre 1 e 99 para o PRIMEIRO Arrey ");
            int valor = leitor.nextInt();
            if(valor > 99){
                System.out.println("Voce digitou errado!");
                i--;
            }else{
                if(valor < 1){
                    System.out.println("Voce digitou errado");
                    i--;
                }else{
                    vetor[i]=valor;
                }
            }
        }
        int array[] = new int [6];
        for(int i =0; i<array.length; i++){
            System.out.println("Digite um valor entre 1 e 99 para o SEGUNDO Arrey ");
            int valor = leitor.nextInt();
            if(valor > 99){
                System.out.println("Voce digitou errado!");
                i--;
            }else{
                if(valor < 1){
                    System.out.println("Voce digitou errado");
                    i--;
                }else{
                    array[i]=valor;
                }
            }
        }
        int contador=0;
        for(int i =0; i< vetor.length; i++){
            for(int j = 0; j < array.length; j++) {
          if(vetor[i] == array[j])
              contador++;
            }
        }
    }
}
