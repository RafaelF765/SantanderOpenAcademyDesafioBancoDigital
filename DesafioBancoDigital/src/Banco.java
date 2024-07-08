import java.util.HashMap;
import java.util.Map;

public class Banco {
    private Map<Cliente, Conta> clientesMap;

    
    
    public Banco() {
        this.clientesMap = new HashMap<>();
    }

    public void contasAtivas(){
        System.out.println(clientesMap);
    }

    public void adicionarClientesCorrentistas(Cliente correntista, Conta conta){
        clientesMap.put(correntista, conta);
    }

    

    @Override
    public String toString() {
        return "Banco [clientesMap=" + clientesMap + "]";
    }

    public static void main(String[] args) throws Exception {
        Banco banco = new Banco();
        Cliente cliente = new Cliente();
        Cliente cliente2 = new Cliente();

        cliente.criarContaCorrente("Rafael", 1996, 10, 23, 2000);
        cliente2.criarContaCorrente("Maria", 1998, 02, 27, 500);

        banco.adicionarClientesCorrentistas(cliente, cliente.objConta());
        banco.adicionarClientesCorrentistas(cliente2, cliente2.objConta());

        cliente.objConta().sacar(100);
        cliente.objConta().tranferir(500, cliente2.objConta());
        cliente.objConta().checarSaldo();
        cliente2.objConta().checarSaldo();

        banco.contasAtivas();
    }
}
