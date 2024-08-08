public class conta {
    private static int quantContas = 0;         //tudo que e static so tem 1

    //Atributo
    private double saldo;            // tudo que nao e static tem um expecifico pra cada casinha
    
    public conta(){
        quantContas++;
    }
    
    public static int getQuantContas(){
        return quantContas;
    }
    
    // MEDODO : saque
    // PARAMETRO/ARGUMENTO : valor(informacao de entrada para o medodo)
    // RETORNO (tipo) : double (informacao de saida do metodo)
    public boolean saque( double valor) {
        boolean resultado = (valor > 0) && (valor <= saldo);
        
        if (resultado){                    //verifica se o resultado é true(entra)
            saldo = saldo - valor;
        }
        
        return resultado;
    }
    // METODO : deposito
    // PARAMENTO/ARGUMENTO : valor
    // RETORNO (tipo) : boolean
    public boolean deposito( double valor ){
        boolean resultado = (valor > 0);
        if (resultado){
            saldo = saldo + valor;
        }
        return resultado;
    }
            
    // METODO : getSaldo
    //PARAMETRO/ARGUMENTO : NAO POSSUI
    // RETORNO (tipo) : double
    public double getSaldo(){
        return this.saldo;
    }
    
}
