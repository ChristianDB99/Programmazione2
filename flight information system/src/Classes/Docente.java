package Classes;

/**
 *
 * @author new
 */
public class Docente {
    private String nome;
    private String cognome;
    private String insegnamento;
    private String codicedocente;

    public Docente() {
        
        nome = new Nome();
        cognome = new Cognome();
        insegnamento = new Insegnamento();
        codicedocente = new CodiceDocente();
    }

    public Docente(String nome, String cognome, String insegnamento, String codicedocente) {
        this.nome = nome;
        this.cognome = cognome;
        this.insegnamento = insegnamento;
        this.codicedocente = codicedocente;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public void setTelephoneNumber(String insegnamento) {
        this.insegnamento = insegnamento;
    }
    
    public void setCodice(String insegnamento) {
        this.insegnamento = insegnamento;
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCognome() {
        return cognome;
    }
    
    public String getInsegnamento() {
        return insegnamento;
    }
    
    public String getCodice() {
        return codicedocente;
    }

    @Override
    public String toString() {
        return nome + "@" + cognome + "@" + insegnamento + "@" + codicedocente;
    }
     
      
}
