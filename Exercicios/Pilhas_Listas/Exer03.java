/*
Escreva um programa que crie uma pilha para armazenar valores inteiros. Faça a leitura, a partir
do teclado, de 25 valores e armazene na pilha. Retire cada um dos elementos da pilha e
armazene-os em duas novas pilhas, uma somente para valores pares negativos e a outra para
valores ímpares positivos. Descarte todos os demais.
*/
import java.util.Scanner;
import java.util.Stack;
public class Exer03 {
    
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        Stack<Integer> pilha = new Stack<>();
        
        Stack<Integer> parNegativo = new Stack<>();
        Stack<Integer> imparPositivo = new Stack<>();

        System.out.print("Digite 25 valores");
        for (int i = 0; i < 25; i++) {    
            pilha.push(leitor.nextInt());
        }

        while (!pilha.isEmpty()) {
            int valor = pilha.pop();
            if (valor < 0 && valor % 2 == 0) {
                parNegativo.push(valor);
            } else if (valor > 0 && valor % 2 != 0) {
                imparPositivo.push(valor);
            }
        }
     
        System.out.println("Valores pares negativos:");
        while (!parNegativo.isEmpty()) {
            System.out.println(parNegativo.pop());
        }

        System.out.println("Valores ímpares positivos:");
        while (!imparPositivo.isEmpty()) {
            System.out.println(imparPositivo.pop());
        }
    }
}
