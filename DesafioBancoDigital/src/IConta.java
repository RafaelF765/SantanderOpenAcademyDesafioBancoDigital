public interface IConta {
    boolean sacar(double valor);
    void tranferir(double valor, Conta contaDestino);
    void depositar(double valor);
}
