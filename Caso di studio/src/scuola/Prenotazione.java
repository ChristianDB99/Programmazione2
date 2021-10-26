package scuola;

public class Prenotazione {

	private int id=0;
	private Docente docente;
	private Stanza stanza;
	private float inizio, fine;
	
	
	
	public Prenotazione(){}

	public Prenotazione(Docente docente, Stanza stanza, float inizio, float fine){

	    this.docente = docente;
	    this.stanza = stanza;
	    this.inizio = inizio;
	    this.fine = fine;
	    id++;

	}
	
	public int getID()
	{
		return id;
	}
	
	public float getInizio()
	{
		return inizio;
	}
	
	public float getFine()
	{
		return fine;
	}
	
	public String getcodiceStanza()
	{
		return stanza.getCodice();
	}
	
	public void stampaPrenotazione(){

		   System.out.println("Docente: " + docente.toString());
		   System.out.println("Stanza: " + stanza.toString());

	}

	@Override
	public String toString() {
		return ""+ docente + " "+ stanza + " " +inizio + " " +fine;
	}

	

	
	
	
	
	
	
}
