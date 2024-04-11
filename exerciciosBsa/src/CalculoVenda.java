
public class CalculoVenda {

   
    public static void main(String[] args) {
        int quant1, quant2;
        quant1 = 19;
        quant2 = 7;
        
        double preco1, preco2;
        preco1 = 49.45;
        preco2 = 33.44;
        
        double subtotal1, subtotal2;
        subtotal1 = quant1 * preco1;
        subtotal2 = quant2 * preco2;
        
        double total;
        total =  subtotal1 + subtotal2;
        
        System.out.println( " Subtotal 1 = " + subtotal1 );
        System.out.println( " Subtotal 2 = " + subtotal2 );
        System.out.println( " Total = " + total);
              
    }
    
}
