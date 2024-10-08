import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.ArrayList;

public class leituraArquivoFormatar {

    public static void main(String[] args) {
        File arqLeitura = new File("notas.txt");
        Scanner leitor = null;
        
        ArrayList< Integer > codMatricula = new ArrayList();
        ArrayList< Double > nota1 = new ArrayList();
        ArrayList< Double > nota2 = new ArrayList();
        ArrayList< Integer > faltas = new ArrayList();

        
        try {
            leitor = new Scanner (arqLeitura);
            
            while(leitor.hasNext()){
                codMatricula.add(leitor.nextInt());
                nota1.add(leitor.nextDouble());
                nota2.add(leitor.nextDouble());
                faltas.add(leitor.nextInt());
            }
            System.out.println(codMatricula.size());
        } catch (FileNotFoundException exc){
            exc.printStackTrace();
        
        } finally {
            if (leitor != null){
                    leitor.close();
            }
        }
        for(int i=0; i<codMatricula.size(); i++){
            // %d inteiro decimal  // %f ponto flutuante(real) // \n  nova lingua
            // %7(todos alinhasdos em 7 casas)  //%.1 (1 casa decimal)apos a virgula
            //formato que vai inprimir
            System.out.printf("%7d %4.1f %4.1f %2d\n",   
                    codMatricula.get(i),
                    nota1.get(i),
                    nota2.get(i),
                    faltas.get(i) ); 
            
        }
        
    }
    
}
