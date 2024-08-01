/*
Astolfo tem hoje 1,50 m (150 cm) de altura e cresce 3 cm por ano. Seu primo Basileu tem,
atualmente, 1,30 m (130 cm) e cresce 5 cm por ano. Utilizando um laço de repetição, escreva um
programa Java que imprima ano a ano a variação de altura dos dois, enquanto Basileu for menor
que Astolfo.
 */
public class Exer08 {
    public static void main(String[] args) {
        
        int AltAst = 150;
        int AltBas = 130;
        int ano = 2024;
        
        while(AltAst > AltBas){
            
            ano++;
            AltAst += 3;
            AltBas += 5;
            
            System.out.println("Em " + ano + " Astolfo tera " + AltAst + "cm e Basileu tera " + AltBas + "cm");
        
        }
    
    }
    
}
