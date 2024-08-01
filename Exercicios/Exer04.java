/*
Escreva um programa que leia 10 valores quaisquer, informados pelo usuário. A seguir, informe
quantos deles estão dentro do intervalo [10,20] e quantos estão fora do intervalo.
 */
import java.util.Scanner;
public class Exer04 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner (System.in);
        
        int Dentro = 0;
        int Fora = 0;
        
        for( double i =0; i<10;i++){
            
            System.out.println("Digite um valor:");
           
            double valor = leitor.nextDouble();
            
            if(valor>=10 && valor<20){
                
                Dentro++;
            } else{
                
                Fora++;
            }
        }
        System.out.println(Dentro + " desses numeros estao entre 10 e 20");
            
        System.out.println(Fora + " desses numeros nao foram entre 10 e 20");
    }
    
}
