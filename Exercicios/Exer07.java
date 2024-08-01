/*
Utilizando um laço do tipo “for”, escreva um programa que calcule e exiba a soma dos inversos
(1/x) de todos os números de 2 até 10.
Ex.:O cálculo deverá ser:
soma = 1/2 + 1/3 + 1/4 + 1/5 + 1/6 + 1/7 + 1/8 + 1/9 + 1/10
Obs.: Cuidar as divisões inteiras e fracionárias.
 */
public class Exer07 {
    public static void main(String[] args) {
        
        double soma = 0.0;
        
        for(int inv = 2; inv <= 10; inv++){
            
            soma += Math.pow(inv, -1);
        }
        System.out.println("A soma dos inversos e: " + soma);
    }
    
}
