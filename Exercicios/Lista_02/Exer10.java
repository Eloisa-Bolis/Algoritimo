/*
Jocasta precisa escrever um programa para a aula de biologia, no qual ela irá classificar animais.
Ela vai informar se são aves (1), mamíferos (2) ou répteis (3). Em seguida, vai informar o tipo de
alimentação: herbívoros (1) ou carnívoros (2). Ao final, o programa vai identificar o animal com
base nessas duas informações, de acordo com a tabela abaixo:
 */
import java.util.Scanner;
public class Exer10 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int soma = 0;
        
        System.out.println("Digite o valor para [1]- Ave, [2]- Mamifero e [3]- Reptil");
        int classe = leitor.nextInt();
        
        System.out.println("Digite o valor para [1]- Herbivoro e [2]- Carnivoro");
        int alimentacao = leitor.nextInt();
        
        
        switch(classe){
            case 1:
                if(alimentacao == 1){
                    System.out.println("O seu animal e Papagaio");
                    break;
                }if(alimentacao == 2){
                    System.out.println("O seu animal e Aguia");
                    break;
                } else{
                    System.out.println("Erro");
                    break;
                }
            case 2:
                 if(alimentacao == 1) {
                        System.out.println("O seu animal e Vaca");
                        break;
                    }
                    if(alimentacao == 2) {
                        System.out.println("O seu animal e Leao");
                        break;
                    } 
                    
                    else {
                        System.out.println("Erro");
                        break;
                    }
            case 3:
                    if(alimentacao == 1) {
                        System.out.println("O seu animal e Tartaruga");
                        break;
                    }
                    if(alimentacao == 2) {
                        System.out.println("O seu animal e Cobra");
                        break;
                    } 
                    
                    else {
                        System.out.println("Erro");
                        break;
                    }
            default:
                System.out.println("Erro");
                break;
                
        }
    }
    
}
