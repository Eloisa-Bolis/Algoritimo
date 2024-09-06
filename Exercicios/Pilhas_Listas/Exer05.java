/*
Escreva um programa para converter um número inteiro decimal para binário. Leia um número
inteiro decimal do usuário. Enquanto o quociente da divisão for maior que zero, calcule o resto da
divisão por 2 e empilhe esse resto. Use o novo quociente como divisor e prossiga. Ao final,
Desempilhe os elementos e concatene-os para formar o número binário. Na figura abaixo é
demonstrado um exemplo da primeira etapa, que é o cálculo e empilhamento.
 */
import java.util.Scanner;
import java.util.Stack;

public class Exer05 {
    public static void main(String[] args) {
        
        Stack<Integer> pilha = new Stack<>();
        Scanner leitor = new Scanner(System.in);
        
        int decimal = 0;

        System.out.print("Digite um numero ");
        decimal = leitor.nextInt();

        while (decimal > 0) {
            pilha.push(decimal % 2);
            decimal /= 2;
        }

        StringBuilder binario = new StringBuilder();
        while (!pilha.isEmpty()) {
            binario.append(pilha.pop());
        }

        System.out.println("Numero binario: " + binario.toString());

    }
}