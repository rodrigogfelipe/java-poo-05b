package aula_05;

public class ContaBanco {

	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;

	/* Declarando o construtor */
	public ContaBanco() {
		this.setSaldo(0);
		this.setStatus(false);

	}

	/* GETTER AND SETTER */
	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getDono() {
		return dono;
	}

	public void setDono(String dono) {
		this.dono = dono;
	}

	public float getSaldo() {
		return saldo;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public void setReal(float saldo) {
		this.saldo = saldo;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	/* Declarando os metados */
	public void abrirConta(String tipo) {
		this.setTipo(tipo);
		this.setStatus(true);
		if (tipo == "CC") {
			this.setSaldo(50);
		} else if (tipo == "CP") {
			this.setSaldo(150);

		}
		System.out.println("Conta aberta com sucesso !");
	}

	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.print("Conta com dinheiro ");

		} else if (this.getSaldo() < 0) {
			System.out.print("Conta em debito");
		} else {
			this.setStatus(false);
			System.out.println("Conta fechada com sucesso !");
		}

	}

	public void depositar(float valor) {
		if (this.getStatus()) {
			this.setSaldo(getSaldo() + valor);
			System.out.println("Deposito realizado na conta de" + this.getDono());

		} else {
			System.out.println("Impossivel depositar em conta fechada");
		}
	}

	public void sacar(float valor) {
		if (this.getStatus()) {
			if (this.getSaldo() >= valor) {
				this.setSaldo(getSaldo() - valor);
				System.out.println("Saque realizado na conta de " + this.getDono());

			} else {
				System.out.println("Saldo insuficiente para saque ");
			}
		} else {
			System.out.println("Impossivel sacar uma conta fechada ");
		}

	}

	public void pagarMensal() {
		int v = 0;
		if (this.getTipo() == "CC") {
			v = 12;
		} else if (this.getTipo() == "CP") {
			v = 20;
		}

		if (this.getStatus()) {
			if (this.getSaldo() > v) {
				this.setSaldo(getSaldo() - v);
				System.out.println("Mensalidade pagar com sucesso " + this.getDono());

			} else {

				System.out.println("Impossivel pagar a conta com sucesso");

			}
		}

	}
	
	public void estadoAtual() {
		System.out.println("+=====================================");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo " + this.getTipo());
		System.out.println("Dono " + this.getDono());
		System.out.println("Saldo " + this.getSaldo());
		System.out.println("Status " + this.getStatus());
		
	}

}
