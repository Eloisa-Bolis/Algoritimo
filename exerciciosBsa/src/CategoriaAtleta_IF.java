
import java.util.Scanner;
public class CategoriaAtleta_IF {

    public static void main(String[] args) {
        Scanner abrobora = new Scanner(System.in);

        System.out.print("Ano de nacimento:");
        int anoNasc = abrobora.nextInt();

        if (anoNasc == 2007 || anoNasc == 2008
                || anoNasc == 2009) {
            // if( anoNasc >= 2007 || anoNasc <= 2009 ) {
            System.out.print("Categoria Juvenil");
        } else {
            if (anoNasc == 2010 || anoNasc == 2011
                    || anoNasc == 2012) {
                // if( anoNasc >= 2010 || anoNasc <= 2012 ) {
                System.out.print("Categoria SUB-15");
            } else {
                if (anoNasc == 2013 || anoNasc == 2014) {
                    System.out.print("Categoria SUB-12");
                } else {
                    System.out.print("Voce nao pode se inscrever");

                }
            }
        }
    }

}
