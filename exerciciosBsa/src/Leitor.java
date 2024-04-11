import java.util.Scanner;
/*
não coloque o mesmo nomes nas coisas
*/
public class Leitor {
    public static void main(String[] args) {
        Scanner leitor = new Scanner( System. in );
        
        System.out.println( " Digite um numero: ");
        
        int numero = leitor.nextInt();
/*
        int numero;
        numero = leitor.nextInt();
*/
        System.out.println( "Numero = " + numero);
    }
    
}
