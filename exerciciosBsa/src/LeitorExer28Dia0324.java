import java.util.Scanner;

public class LeitorExer28Dia0324 {
    public static void main(String[] args) {
        System.out.println("Digite um numero para saber se ele é multiplo de 3, 5, 7");
        Scanner Teclado = new Scanner( System. in );
        int numero = Teclado.nextInt ();
/*
  int significa variavel, teclado eo nome do scanner       
*/
        int resto3 = numero % 3;
        if ( resto3 == 0) {
            System.out.println("numero e multiplo de 3");
        } else {
            System.out.println("numero nao e multiplo de 3");
        }
        
        int resto5 = numero % 5;
        if ( resto5 == 0) {
            System.out.println("numero e multiplo de 5");
        } else {
            System.out.println("numero nao e multiplo de 5");
        }
        
        int resto7 = numero % 7;
        if ( resto7 == 0) {
            System.out.println("numero e multiplo de 7");
        } else {
            System.out.println("numero nao e multiplo de 7");
        }
    }
    
}

