package entities;

public class ContaPoupanca extends Conta implements contaInterface {
	
	public ContaPoupanca() {
		super();
		
	}

	public ContaPoupanca(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}
	
	

	@Override
	public double calculaTributos() {
		System.out.println("\nconta poupanca nao paga tributos");
		return saldo;
		
	}
	
	

}
