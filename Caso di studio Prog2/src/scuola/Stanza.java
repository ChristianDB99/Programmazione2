package scuola;

public interface Stanza {

	public int getId();
	
	public int getNumPosti();
	
	public String getNome();
	
	public void richiestaPrenotazione(Stanza stanza, Insegnamento insegnamento, Docente docente, int inp, int outp);
}
