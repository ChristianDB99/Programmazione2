package scuola;

public class Docente {

	private int codice;
	private String nome;
	private String cognome;
	public int getCodice() {
		return codice;
	}
	public void setCodice(int codice) {
		this.codice = codice;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	@Override
	public String toString() {
		return "Docente [codice=" + codice + ", nome=" + nome + ", cognome=" + cognome + "]";
	}

}
