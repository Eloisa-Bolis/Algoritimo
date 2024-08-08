
public class testeConta {

    public static void main(String[] args) {
        conta minhaConta = new conta ();
        
        System.out.println("Saldo: " + minhaConta.getSaldo());
        System.out.println(minhaConta.saque(50.0));
        System.out.println(minhaConta.deposito(-50.0));
        System.out.println(minhaConta.deposito(50.0));
        System.out.println("Saldo: " + minhaConta.getSaldo());
        System.out.println(minhaConta.saque(34.0));
        System.out.println("Saldo: "+ minhaConta.getSaldo());
        
        System.out.println(conta.getQuantContas());
        
        conta outraConta = new conta();
        conta novaConta = new conta();
        
        System.out.println(conta.getQuantContas());
    }
    
}
