package scuola;

public class Aula extends Stanza {

	public Aula(String codice, String nome, int numPosti) {
		super(codice, nome, numPosti);
	}

	@Override
	public String toString() {
		return "" + getCodice() + " " + getNome() + " " + getNumPosti() +" ";
	}
	
	

}
