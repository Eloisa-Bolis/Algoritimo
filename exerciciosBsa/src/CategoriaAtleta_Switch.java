import java.util.Scanner;
public class CategoriaAtleta_Switch {
    public static void main(String[] args) {
        Scanner abrobora = new Scanner(System.in);
        
        System.out.print("Ano de nacimento:");
        int anoNasc = abrobora.nextInt();      
        
        switch( anoNasc ) {
            case 2007 :
            case 2008 :
            case 2009 :
                System.out.print("Categoria Juvenil");
                break;
                
            case 2010 :
            case 2011 :
            case 2012 :
                System.out.print("Categoria SUB-15");
                break;
                
            case 2013 :
            case 2014 :
                System.out.print("Categoria SUB-12");
                break;
                
            default :
                System.out.print("Voce nao pode se inscrever");
        }
    }
    
}
