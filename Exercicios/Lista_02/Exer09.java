/*
Escreva um programa que leia um número não determinado de valores inteiros, parando quando
o usuário digitar 0 (zero) e, durante esse processo de leitura, conte a quantidade de valores
positivos e a quantidade de valores negativos. Por fim, exiba o percentual de positivos e
negativos.
Exemplo: O usuário digitou a seguinte sequência de números:
3 4 98 -10 -9 4 5 -32 -56 28 0
Foram digitados 6 valores positivos e 4 valores negativos, totalizando 10 valores (o ZERO não conta).
Dessa forma, 6/10 valores positivos é igual a 60%, e 4/10 valores negativos é igual a 40%. A saída do programa
deve ser:
6 positivos – 60%
4 positivos – 40%
 */
import java.util.Scanner;
public class Exer09 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite valores quando quiser parar digite 0: ");
        
        int valor;
        int ContPos = 0;
        int ContNeg = 0;
              
        while((valor = leitor.nextInt()) != 0){
            
            if(valor > 0){
                
                ContPos++;
            
            }
            if( valor < 0){
                
                ContNeg++;
            }
        }
        
        int total = ContPos + ContNeg;
        int PercentualPos = (ContPos * 100) / total;
        int PercentualNeg = (ContNeg * 100) / total;
        System.out.println("Foram digitados " + ContPos + " numeros positivos o que equivale a " + PercentualPos + "%");
        System.out.println("Foram digitados " + ContNeg + " numeros negativos o que equivale a " + PercentualNeg + "%");
    
    }
    
}
