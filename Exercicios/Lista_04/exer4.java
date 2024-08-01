/*
Escreva um algoritmo que solicite a digitação de um texto/frase e, em seguida, imprima o número
de palavras existente na mesma.
 */
import java.util.Scanner;
public class exer4 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("escreva um texto/frase");

        String texto = leitor.nextLine();
        String palavra[] = texto.split(" ");
        int numero = palavra.length;
        
        System.out.println(numero); 
    }
    
}
