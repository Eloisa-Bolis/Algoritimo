/*
Implemente em Java um programa que leia uma quantidade não determinada de pares de números inteiros. O
programa deve parar quando um dos números for zero (0). Para cada par (M e N) lido, mostre a sequência
crescente de números do menor até o maior e a soma de todos os valores da sequência (incluindo o M e N)
 */
import java.util.Scanner;
public class exerc11 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
       
        int soma = 0;
        int M = 1;
        int N = 1;
       
        while(N != 0 || M != 0){
            System.out.print("Digite o primeiro número (M): ");
            M = leitor.nextInt();
            
            System.out.print("Digite o segundo número (N): ");
            N = leitor.nextInt();
            
            if (M == 0 || N == 0) {
                break;
            }
            
            if(M < N) {
                for(int i=M; i<=N; i++) {
                    System.out.println(i);
                    soma += i;
                }
            }
            
            if(M > N) {
                for(int i=N; i<=M; i++) {
                    System.out.println(i);
                    soma += i;
                }
            }
            
            System.out.println("Soma="+ soma);
            
        }
        
    }
    
}
