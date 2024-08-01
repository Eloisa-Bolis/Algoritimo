/*
Usando um laço “while”, escreva o programa descrito a seguir. Um usuário quer controlar a carga colocada em um
caminhão. Ele digita inicialmente a carga máxima do caminhão. Em seguida, digita uma sequência de valores
correspondente ao peso de itens a serem carregados. O programa deve somar o peso dos itens, enquanto o peso
digitado não for igual a 0 (zero) e não ultrapassar a capacidade do caminhão. Quando uma das condições ocorrer,
deve parar e informar a carga total carregada, sem incluir o último, que ultrapassaria a carga máxima.
*/
import java.util.Scanner;
public class exer7 {

    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("digite a carga maxima");
        
        double max = leitor.nextInt();
        double cargaTotal = 0;
             
        while(cargaTotal <= max) {
            System.out.println("digite a carga");
            double cargaMomento = leitor.nextInt();
        
            if (cargaMomento == 0 || cargaTotal + cargaMomento > max) {
                break;
            }
            
        cargaTotal = cargaMomento + cargaTotal;
        }
        
        System.out.println("Carga total carregada: " + cargaTotal);
        
    }
    
}
