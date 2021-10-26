package scuola;

public class Docente {
	private String codice;
	private String nome;
	private String cognome;
	private Insegnamento insegnamento;
	
	public Docente(String codice, String nome, String cognome, Insegnamento insegnamento)
	{
		this.codice = codice;
		this.nome = nome;
		this.cognome = cognome;
		this.insegnamento = insegnamento;
	}
	
	public String getCodice()
	{
		return codice;
	}
	
	public String getNome()
	{
		return nome;
	}
	
	public String getCognome()
	{
		return cognome;
	}
	
	public Insegnamento getInsegnamento()
	{
		return insegnamento;
	}

	@Override
	public String toString() {
		return "" + codice + " " + nome + " " + cognome + " "
				+ insegnamento + " ";
	}

	
	

}
