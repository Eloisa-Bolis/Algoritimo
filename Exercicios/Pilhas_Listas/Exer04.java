/*
Escreva um programa que leia uma string. Em seguida, empilhe cada um dos caracteres da
string, desde o início. Desempilhe os caracteres e junte-os (concatene-os numa nova string).
Imprima a nova string.
 */
import java.util.Scanner;
import java.util.Stack;
public class Exer04 {

    public static void main(String[] args) {
        
        Stack <Character> pilha = new Stack <>();
        Scanner leitor = new Scanner(System.in);

        String palavra1;
        String palavra2 = "";
        
        System.out.println("digite una palavra");
        palavra1 = leitor.nextLine();
            
        for (int i = 0; i < palavra1.length(); i++) {
            char letra = palavra1.charAt(i);
            pilha.push(letra);
        }    
        
        while (!pilha.isEmpty()) {
            palavra2 += pilha.pop();
        }

        System.out.println("String invertida: " + palavra2);
    }
    
}
