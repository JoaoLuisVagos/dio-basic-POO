public class App {
    public static void main(String[] args) {
	
		Client venilton = new Client();
		venilton.setNome("venilton");
		
		
		Conta cc = new ContaCorrente(venilton);
		ContaPoupanca poupanca = new ContaPoupanca(venilton);
		

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato();		
		
	}
}
