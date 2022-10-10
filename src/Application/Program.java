package Application;

import entities.ContaCorrente;
import entities.ContaPoupanca;

public class Program {

	public static void main(String[] args) {
		
		System.out.println("\n-----TESTE CONTA CORRENTE-----");
		
		ContaCorrente cc = new ContaCorrente(200);
		cc.obterSaldo();
		System.out.println("\n-TESTE TRIBUTOS-");
		cc.calculaTributos();
		cc.obterSaldo();
		System.out.println("\n-TESTE DEPOSITO-");
		cc.depositar(100);
		cc.depositar(-100);
		cc.obterSaldo();
		System.out.println("\n-TESTE SACAR-");
		cc.sacar(50);
		cc.obterSaldo();
		
		System.out.println("\n-----TESTE CONTA POUPANCA-----");
		
		ContaPoupanca cp = new ContaPoupanca(200);
		cp.obterSaldo();
		cp.calculaTributos();

	}

}
