import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private Pessoa novoCliente;
    private List<Conta> contaCliente;

    public Cliente() {
        this.contaCliente = new ArrayList<>();
    }



    public Pessoa getNovoCliente() {
        return novoCliente;
    }

    

    public void criarContaCorrente(String cliente, int ano, int mes, int dia, double valor){
        contaCliente.add(new ContaCorrente(new Pessoa(cliente, ano, mes, dia), valor));

    }

    public void criarContaPoupanca(String cliente, int ano, int mes, int dia, double valor){
        contaCliente.add(new ContaPoupanca(new Pessoa(cliente, ano, mes, dia), valor));
    }

    @Override
    public String toString() {
        return "Cliente [contaCliente=" + contaCliente + "]";
    }

    public List<Conta> getContaCliente() {
        return contaCliente;
    }

    public Conta objConta(){
        Conta conta = null;
        for(Conta c:contaCliente){
            conta = c;
            break;
        }
        return conta;
    }

    
    
    

}
