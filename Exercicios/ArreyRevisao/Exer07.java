/*
Escreva um programa em Java que leia a média de 10 alunos e armazene em um vetor. Nessa
instituição de ensino, todos que tiverem média inferior a 7,0 deverão fazer o exame. Cada aluno
que fará o exame, para ser aprovado, precisa ter uma nota que seja superior a diferença dessa
nota para 12,0. O algoritmo deve gerar dois vetores de saída, um com o índice de cada aluno
que deverá fazer exame e outro com a nota mínima que deve tirar no exame. Tenha atenção
para o fato de que o índice usado pela escola não é igual ao índice que são utilizados nos arrays
em programação Java.
 */
import java.util.Scanner;
public class Exer07 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        double indice[] = new double [10];
        double notaMin[] = new double [10];
        double notaAlu[] = new double [10];
        
        for(int i = 0; i < 10; i++){
            System.out.println("Digite a nota do aluno "+(i+1)+" : ");
            double nota = leitor.nextDouble();
            notaAlu[i]=nota;
            
            if(notaAlu[i] < 7){
                indice[i]++;
                
            }
            
        }
        for(int i = 0; i< 10; i++){
            if(indice[i] < 0){
                System.out.println("O aluno "+(i+1)+" nao esta em exame");
            }else{
                System.out.println("O aluno " + (i+1) + " esta em exame");
                System.out.println("");
                double media = notaAlu[i];
                double NotaMinEx = (12 - media);
                notaMin[i] = NotaMinEx;
                System.out.println("O aluno " + (i+1) + " precisa tirar " + NotaMinEx + " no exame");
            }
        }
        
    }
    
}