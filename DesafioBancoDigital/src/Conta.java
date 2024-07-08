
public abstract class Conta implements IConta{

    private static final int AGENCIA_PADRAO = 0001;
    private static int SEQUENCIAL;

    protected int agencia;
    protected int numero;
    protected Pessoa titular;
    protected double saldo;
  

    

    public Conta(Pessoa titular, double saldo) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.titular = titular;
        this.saldo = saldo;
    }

    @Override
    public boolean sacar(double valor) {
        double novoSaldo = valor;
        if (this.saldo < novoSaldo) {
            System.out.println("Saldo insuficiente tente outro valor");
            return false;
        }else{
            this.saldo -= novoSaldo;
        }
        return true;
    }

    @Override
    public void tranferir(double valor, Conta contaDestino) {
        this.sacar(valor);
        if (this.sacar(valor)) {
            contaDestino.depositar(valor);
        }
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
        
    }

    
    @Override
    public String toString() {
        return "Conta [agencia=" + agencia + ", numero=" + numero + ", titular=" + titular + ", saldo=" + saldo
                + "]";
    }

    public void checarSaldo(){
        System.out.println("===========================");
        System.out.printf("Titular: %s\n", this.titular);
        System.out.printf("Agência: %s\n", this.agencia);
        System.out.printf("Número da Conta: %d\n", this.numero);
        System.out.println("============================");
        System.out.printf("O saldo atual é :R$ %.2f\n\n",this.saldo);
    }
}
