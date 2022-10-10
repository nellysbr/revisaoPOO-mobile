package entities;

public class ContaCorrente extends Conta implements contaInterface{

	
	public ContaCorrente(double saldo) {
		super(saldo);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double calculaTributos() {
		
		double seguroDeVida = 42;
		double tributos = saldo * (1 / 100);
		double novoSaldo = saldo - tributos - seguroDeVida;
		saldo = novoSaldo;
		
		return saldo;
		
		
	}
	
	

}
