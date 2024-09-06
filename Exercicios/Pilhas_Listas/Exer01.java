/*
Escreva um programa que crie uma pilha para armazenar valores inteiros. Em seguida, faça a
leitura, a partir do teclado, de 20 valores e armazene na pilha. Ao final, retire todos os elementos
da pilha e imprima na tela cada um.
 */
import java.util.Scanner;
import java.util.Stack;
public class Exer01 {

    public static void main(String[] args) {
        
        Stack <Integer> pilha = new Stack <>();
        Scanner leitor = new Scanner(System.in);       
        
        System.out.println("Digite 20 valores");
        for(int i = 0; i < 20; i++){
            pilha.push(leitor.nextInt());
        }
        
        for(int i = 0; i < 20; i++){
            System.out.println("Retirado = " + pilha.pop());
        }
    }
    
}
