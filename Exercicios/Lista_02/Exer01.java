/*
Escreva um programa que exiba os números pares no intervalo de 1 a 1000, inclusive.
 */
public class Exer01 {
    public static void main(String[] args) {
        
        for(int numero = 1; numero<1000; numero++){
            
            if( numero%2 == 0){
                
                System.out.println("Este numero e par: " + numero);
            }
        }
    }
    
}
