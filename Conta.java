package Programa;

import utilitarios.Utils;

public class Conta {
	
	private static int contadorDeContas = 0;
	
   private int numeroConta;
   private Pessoa pessoa;
   private Double saldo = 0.0;

   public Conta(Pessoa pessoa) {
	this.numeroConta = numeroConta;
	this.pessoa = pessoa;
	contadorDeContas += 1;
}

public int getNumeroConta() {
	return numeroConta;
}

public void setNumeroConta(int numeroConta) {
	this.numeroConta = numeroConta;
}

public Pessoa getPessoa() {
	return pessoa;
}

public void setPessoa(Pessoa pessoa) {
	this.pessoa = pessoa;
}

public Double getSaldo() {
	return saldo;
}

public void setSaldo(Double saldo) {
	this.saldo = saldo;
}
   public String toString() {
	   return "\nNúmero da conta:" +this.getNumeroConta() +
	          "\nNome:" +this.pessoa.getNome() +
	          "\nCPF:" +this.pessoa.getCpf() +
	          "\nEmail:" +this.pessoa.getEmail() +
	          "\nSaldo:" + Utils.doubletoString(this.getSaldo()) +
	          "\n";
   }
   
   public void Depositar (Double valor) {
	   if(valor>0) {
		   setSaldo(getSaldo() + valor);
		   System.out.println("Seu depósito foi realizado com sucesso");
	   }else {
		   System.out.println("Não foi possível realizar o depósito");
	   }
   }
   
   public void Sacar (Double valor) {
	   if(valor>0 && this.getSaldo() >= valor) {
		   setSaldo(getSaldo() - valor);
		   System.out.println("Saque realizado com sucesso");
	   }else {
		   System.out.println("Não foi possível realizar o saque");
	   }
   }
   
   public void Transferir (Conta contaParaDeposito, Double valor ) {
	   if(valor >0 && this.getSaldo() >= valor) {
		   setSaldo(getSaldo() - valor);
		   
		   contaParaDeposito.saldo = contaParaDeposito.getSaldo() + valor;
		   System.out.println("Transferência realizada com sucesso");
	   }else {
		   System.out.println("Não foi possível realizar a transferência");
	   }
   }
}
