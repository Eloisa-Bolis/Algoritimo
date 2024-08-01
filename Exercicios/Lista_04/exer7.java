/*
Escreva um algoritmo que solicite a digitação de um número de telefone, incluindo o DDD, como
a seguir: “5433211111” e gere uma nova sequência com o número do telefone formatado da
seguinte maneira: “(54)3321-1111”
 */
import java.util.Scanner;
public class exer7 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("escreva o numero telefonico com o DDD");
        
        String telefone = leitor.next();
        
        for(int i=0; i<=telefone.length() - 1; i++) {
            char caractere = telefone.charAt(i);
            
            if(i == 0) {System.out.print("("+caractere);} else {
                if(i == 1) {System.out.print(caractere+")");} else {
                    if(i == 5) {System.out.print(i + "-");} 
                        else {System.out.print(caractere);}
                } 
                    
            }
                      
        }
        
    }
    
}
