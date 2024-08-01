/*
Astolfo tem hoje 1,50 m (150 cm) e cresce 3 cm por ano. Basileu tem 1,30 m (130 cm) e cresce 5 cm por ano.
Usando um laço “while”, escreva um programa que calcule e exiba quantos anos são necessários para Basileu ser
mais alto que Astolfo, bem como as alturas dos dois após esse tempo.
 */
public class exer8 {
    public static void main(String[] args) {
        
        int AlturaAs = 150;
        int AlturaBa = 130;
        int contador = 0;
        
        while(AlturaAs > AlturaBa){
            AlturaAs = AlturaAs + 3;
            AlturaBa = AlturaBa + 5;
            contador++; 
        }
        System.out.println("Passou em " + contador + " anos, com " + AlturaBa + " cm");
    }
    
}
