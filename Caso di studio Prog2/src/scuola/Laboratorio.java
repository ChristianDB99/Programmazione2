package scuola;

public class Laboratorio extends Abstract_Stanza{

	private int postipc;
	public Laboratorio(int id, int nposti, String nome, Utilizzo uso) {
		super(id, nposti, nome, uso);
		this.postipc=postipc;
	}

	public int getPostipc() {
		return postipc;
	}

	public void setPostipc(int postipc) {
		this.postipc = postipc;
	}

	@Override
	public String toString() {
		return "Laboratorio [postipc=" + postipc + ", id=" + id + ", nposti=" + nposti + ", nome=" + nome + "]";
	}

	@Override
	public int getNumPosti() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void richiestaPrenotazione(Stanza stanza, Insegnamento insegnamento, Docente docente, int inp,
			int outp) {
		// TODO Auto-generated method stub
		
	}

	

	

	
	
}
