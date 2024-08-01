/*
Elabore um programa que receba um número informado pelo teclado e escreva na tela uma
sequência dos próximos 10 números após o número recebido. Esse código deve ser
implementado utilizando a estrutura de repetição “while”.
Ex: Número = 20
21 22 23 24 25 26 27 28 29 30
 */
import java.util.Scanner;
public class Exer05 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        System.out.print("Digite um valor: ");
        
        double valor = leitor.nextDouble();
        double parar = valor + 10;
        
        System.out.print(valor + ", ");
        
        while(valor < parar){
            
            valor++;
            System.out.print(valor + ", ");
        }
        
    }
    
}
