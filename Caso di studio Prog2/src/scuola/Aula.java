package scuola;

public class Aula extends Abstract_Stanza{

	public Aula(int id, int nposti, String nome, Utilizzo uso) {
		super(id, nposti, nome, uso);
		// TODO Auto-generated constructor stub
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
