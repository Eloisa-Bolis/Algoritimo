/*
 Crie um programa para uma pizzaria. Informe os tamanhos de pizza existentes (1- pequena, 2- média, 3- grande, 4- super, 
5- família). Peça ao usuário para informar o tamanho de pizza desejado. Caso o tamanho escolhido seja pequena ou média, 
deve informar que só é possível escolher 1 sabor. Caso escolha grande, é possível escolher até 3 sabores diferentes. 
Caso escolha super, é possível escolher 4 sabores. 
Caso escolha família, é possível escolher até 5 sabores. Se não informar um tamanho disponível, deve indicar que é um tamanho 
inválido
 */
import java.util.Scanner;
public class progPizza {
   
    public static void main(String[] args) {
        Scanner gatos = new Scanner(System.in);
        
        System.out.print("Informe qual sabor voce vai querer pelos numeros temos: 1 pequena, 2 media, 3 grande, "
                + "4 super, 5 familia ");
        int tamanho = gatos.nextInt();
        
        switch( tamanho ) {
            case 1 :
            case 2 :
                System.out.print("Voce pode escolher 1 sabor");
                break;
                
            case 3 :
                System.out.print("Voce pode escolher 3 sabor");
                break;
                
            case 4 :
                System.out.print("Voce pode escolher 4 sabor");
                break;
                
            case 5 :
                System.out.print("Voce pode escolher 5 sabor");
                break;
                
            default : 
                System.out.print("Esse tanhanho é invalido");
        }
    }
}
