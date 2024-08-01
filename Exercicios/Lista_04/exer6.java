/*
Escreva um algoritmo que solicite a digitação de um texto/frase e, em seguida, crie uma cadeia
de caracteres com todos os caracteres da cadeia original separados por “-”.
 */
import java.util.Scanner;
public class exer6 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("escreva um texto/frase");
        
        String texto = leitor.next();
        
        for(int i=0; i<=texto.length() - 1; i++) {
            char letra = texto.charAt(i);
            
            System.out.print(letra + " - ");
        }
        
    }
    
}
