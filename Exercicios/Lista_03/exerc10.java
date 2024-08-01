/*
Implemente um algoritmo que leia um número indefinido de pares de informação, contendo faixa etária (‘A’ para
adulto e ‘C’ para criança) e time de torcida (‘G’ para Grêmio e ‘I’ para Internacional). O usuário vai informar a faixa
etária e depois o time, separadamente. Quando o usuário digitar ‘X’ para faixa etária, o programa deve encerrar e
informar o percentual de adultos e crianças, o percentual de gremistas e colorados, bem como o percentual de
adultos gremistas e adultos colorados (do total de adultos) e o percentual de crianças gremistas e crianças
coloradas (do total de crianças).
*/
import java.util.Scanner;
public class exerc10 {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        int AG = 0 , AI = 0;
        int CG = 0, CI = 0;
        String faixa;
        
        while( !(faixa = leitor.next()).equalsIgnoreCase("x")) {
            String time = leitor.next();
            if (faixa.equalsIgnoreCase ("A")){
                if ( time.equalsIgnoreCase("G")) {
                    AG++;
                } else {
                    AI++;
                }
            } else {
                if( time.equalsIgnoreCase("G")) {
                    CG++;
                } else {
                    CI++;
                }
            }
            int tc = CG + CI;  
            int ta = AG + AI;  
            int tg = CG + AG; 
            int ti = AI + CI;
            int total = CG + CI + AG + AI; 
            System.out.println("Crianças" + tc*100.0/total);
            System.out.println("Adutos" + ta*100.0/total);
            System.out.println("Gremio" + tg*100.0/total);
            System.out.println("Colorado" + ti*100.0/total);
        }
    }    
}
