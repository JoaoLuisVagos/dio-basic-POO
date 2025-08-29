public class ContaPoupanca extends Conta {
	
    public ContaPoupanca(Client client) {
        super(client);
        
    }
    public void imprimirExtrato() {
        System.out.println("=== Extrato conta Poupanca ===");
        super.imprimirInfosComuns();
    
    }
        
	
}
