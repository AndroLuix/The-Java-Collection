package GestioneBanca;

public class Azioni {
	private String nominativoProprietario;
	private double saldo;
	
	Azioni(String nom_prop, double saldo){
		nominativoProprietario = nom_prop;
		this.saldo = saldo;
	}
	
	public double deposita(double deposito) {
		return saldo+=deposito;
	}
	public boolean preleva(double prelievo) {
		if(prelievo < saldo) {
			saldo-=prelievo;
			return true;
		}else {
			return false;
		}
	}
	
	public double leggiSaldo() {
		return saldo;
	}

	public String getNominativoProprietario() {
		return nominativoProprietario;
	}

	public void setNominativoProprietario(String nominativoProprietario) {
		this.nominativoProprietario = nominativoProprietario;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
