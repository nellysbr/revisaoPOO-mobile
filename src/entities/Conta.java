package entities;

public class Conta {
	
	
	protected double saldo = 0.0;
	
	
	public Conta () {}

	public Conta(double saldo) {
		super();
		this.saldo = saldo;
	}

	public double getSaldo() {
		return saldo;
	}
	

	
	public void sacar(double valor) {
		if (valor > saldo) {
			System.out.println("\nVoce deve ter dinheiro na conta!");
			
		}else {
			saldo = saldo - valor;
			
		}
	}
	public void depositar(double valor) {
		
		if (valor < 0) {
			System.out.println("\nValor invalido!");
		}else {
			saldo += valor;
		}
		
	}
	public void obterSaldo() {
		System.out.println("\n" + getSaldo());
	}


	

}
