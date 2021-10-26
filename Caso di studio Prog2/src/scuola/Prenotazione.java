package scuola;

public class Prenotazione {

	private Stanza stanza;
	private Insegnamento insegnamento;
	private Docente docente;
	private int inp;
	private int outp;
	
	public Prenotazione(Stanza stanza, Insegnamento insegnamento, Docente docente, int inp, int outp){
		this.inp=inp;
		this.outp=outp;
		this.docente=docente;
		this.stanza=stanza;
		this.insegnamento=insegnamento;
	}

	public Stanza getStanza() {
		return stanza;
	}

	public void setStanza(Abstract_Stanza stanza) {
		this.stanza = stanza;
	}

	public Insegnamento getInsegnamento() {
		return insegnamento;
	}

	public void setInsegnamento(Insegnamento insegnamento) {
		this.insegnamento = insegnamento;
	}

	public Docente getDocente() {
		return docente;
	}

	public void setDocente(Docente docente) {
		this.docente = docente;
	}

	public int getInp() {
		return inp;
	}

	public void setInp(int inp) {
		this.inp = inp;
	}

	public int getOutp() {
		return outp;
	}

	public void setOutp(int outp) {
		this.outp = outp;
	}
	
	
}
