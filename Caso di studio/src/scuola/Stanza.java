package scuola;

public abstract class Stanza {
	
	private String codice;
	private String nome;
	private int numPosti;
	
	public Stanza(String codice, String nome, int numPosti)
	{
		this.codice = codice;
		this.nome = nome;
		this.numPosti = numPosti;
	}
	
	public String getCodice() {
		return codice;
	}


	public String getNome() {
		return nome;
	}
	
	public int getNumPosti() {
		return numPosti;
	}

	@Override
	public String toString() {
		return "" + codice + " " + nome + " " + numPosti + " ";
	}
	
	

}
