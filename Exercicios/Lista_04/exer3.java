/*
Escreva um algoritmo que solicite a digitação de um texto/frase e, em seguida, extraia e imprima
a primeira palavra da cadeia.
*/
import java.util.Scanner;
public class exer3 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("escreva um texto/frase");
        
        String texto = leitor.next();        
        int espaco = texto.indexOf(' ');
        
        if (espaco != -1) {
            String frase = texto.substring(0, espaco);

            System.out.println(frase);       
        }
        
    }
    
}
