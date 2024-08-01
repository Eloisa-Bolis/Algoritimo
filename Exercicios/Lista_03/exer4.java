/*
Escreva um programa que leia um número inteiro qualquer e identifique se ele é primo. Números primos são todos
aqueles que são divisíveis apenas por 1 e por si mesmos.

*/
import java.util.Scanner;
public class exer4 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int numero = leitor.nextInt();        
        if( numero > 2 ) {
            int divisor = 2;
            int resto = numero % divisor;
            while( resto != 0 && divisor < numero /2 ) {
                divisor++;
                resto = numero % divisor;
            }
            if(resto == 0 ) {
                System.out.println("nao");
            } else {
                System.out.println("sim");                
            }
        }

    }
    
}
