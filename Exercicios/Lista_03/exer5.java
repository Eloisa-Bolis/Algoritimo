/*
Escreva um programa que exiba todos os números primos menores que 100
*/
public class exer5 {

    public static void main(String[] args) {
    
        int resto = 0; 
        
        for(int i = 1; i <= 100; i++){
            if( i > 2 ) {
                int divisor = 2;
                resto = i % divisor;
                while( resto != 0 && divisor < i /2 ) {
                    divisor++;
                    resto = i % divisor;
                }
            }    
            if(resto != 0 ) {
            System.out.println(i);
            }
        }
    }   
}
