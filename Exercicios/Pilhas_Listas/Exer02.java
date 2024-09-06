/*
Escreva um programa que crie uma pilha para armazenar valores inteiros. Faça a leitura, a partir
do teclado, de 30 valores e armazene na pilha. Retire cada um dos elementos da pilha e
armazene-os em duas novas pilhas, uma somente para valores pares e a outra para valores
ímpares.
 */
import java.util.Scanner;
import java.util.Stack;
public class Exer02 {

    public static void main(String[] args) {
        
        Stack <Integer> pilha = new Stack <>();
        Scanner leitor = new Scanner(System.in); 
        
        Stack <Integer> par = new Stack <>();
        Stack <Integer> impar = new Stack <>();
        
        System.out.println("Digite 30 valores");
        for(int i = 0; i < 30; i++){
            pilha.push(leitor.nextInt());
        }
        
        for(int i = 0; i < 30; i++){
            if(pilha.pop() % 2 == 0){
                par.push(pilha.pop());
            } else {
                impar.push(pilha.pop());
            }
            
        }
        
    }
    
}
