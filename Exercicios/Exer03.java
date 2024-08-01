/*
Escreva um programa que exiba o quadrado de cada um dos números pares entre 1 e 1000,
inclusive
 */
public class Exer03 {
    public static void main(String[] args) {
        
        for(int numero = 1; numero<1000; numero++){
            
            if( numero%2 == 0){
                
                int quadrado = numero*numero;
                
                System.out.println("O quadrado de " + numero + " e: "+quadrado);
            }
        }
        
    }
    
}
