/*
Um lago foi infestado por um tipo de alga em que cada “indivíduo” tem cerca de 20 cm2
. A superfície do lago tem
aproximadamente 500 m2
 (equivalente a 5.000.000 cm2
). Essa alga duplica a cada 5 dias. Se não for feito nada para
removê-la, em quantos dias ela irá cobrir todo o lago?
*/
public class exer6 {

    public static void main(String[] args) {
        
        int tI =20;
        int tA = tI;
        int tL = 5000000;
        int contador = 0;
        
        while (tA < tL ){
            contador += 5;
            tA = tA * 2;
            System.out.println("dias=" + contador);
            System.out.println("Tam.Atual=" + tA);  
        }

    }
    
}
