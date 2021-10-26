package scuola;

public abstract class Abstract_Stanza implements Stanza{

	protected int id;
	protected int nposti;
	protected String nome;
	private Utilizzo uso;
	private Prenotazione prenotazione;
	
	
	
	public Abstract_Stanza(int id, int nposti, String nome, Utilizzo uso) {
		super();
		this.id = id;
		this.nposti = nposti;
		this.nome = nome;
		this.uso = uso;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getNposti() {
		return nposti;
	}
	public void setNposti(int nposti) {
		this.nposti = nposti;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Utilizzo getUso() {
		return uso;
	}
	public void setUso(Utilizzo uso) {
		this.uso = uso;
	}
	@Override
	public String toString() {
		return "Abstract_Stanza [id=" + id + ", nposti=" + nposti + ", nome=" + nome + ", uso=" + uso + "]";
	}
	
	public void richiestaPrenotazione(Stanza stanza, Insegnamento insegnamento, Docente docente, int inp, int outp) {
		prenotazione=new Prenotazione(stanza, insegnamento, docente, inp, outp);
	}
	
	
	
}
