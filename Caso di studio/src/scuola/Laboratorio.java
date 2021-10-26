package scuola;

public class Laboratorio extends Stanza {
	
	private int PostiPC;

	public Laboratorio(String codice, String nome, int numPosti, int PostiPC) {
		super(codice, nome, numPosti);
		this.PostiPC = PostiPC;
	}
	
	public int getPostPC()
	{
		return PostiPC;
	}

	@Override
	public String toString() {
		return "" + getCodice() + " " + getNome() + " " + PostiPC + " " + getNumPosti() + " ";
	}
	
	

}
