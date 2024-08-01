/*
Escreva um programa que exiba os números divisíveis por 7 no intervalo de 1000 a 7000,
inclusive.
 */
public class Exer02 {
    public static void main(String[] args) {
       
        for(int numero = 1000; numero<7000; numero++){
            
            if( numero%7 == 0){
                
                System.out.println("Divisivel por sete: " + numero);
            }
        }
        
    }
    
}
