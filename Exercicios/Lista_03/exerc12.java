/*
Implemente um programa em Java que leia diversas Strings até que uma seja igual a “tchau” (pode estar escrito
com minúsculas, maiúsculas ou misturado). O programa deve imprimir cada um dos caracteres da string, um por
linha, em minúsculas, informando se é “vogal”, “consoante” ou “branco”. Em todos os outros casos, incluindo letras
acentuadas e com cedilha ou outros caracteres, deve informar “inválido”.
 */
import java.util.Scanner;
public class exerc12 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        String certa = "thau";
        String tentativa;
        
        do {
            System.out.println("tente acertar a palavra");
            tentativa = leitor.next();
            
            if(tentativa.equals(certa)){
                System.out.println("acertou");
            } else {
                System.out.println("errou");
            }

        } while (tentativa.equals(certa));
        
        for(int i=0; i<tentativa.length(); i++) {
                char caractere = tentativa.charAt(i);
                
                if(caractere == 'a' || caractere == 'e' || caractere == 'i' 
                || caractere == 'o' || caractere == 'u') {
                    System.out.println(caractere + " = vogal");
                } else {
                    if (Character.isWhitespace(caractere)) {
                        System.out.println(caractere + " = caractere em branco");
                    } else {
                        System.out.println(caractere + " = consoante");}                  
                } 
                

                
            }
    }
    
}
