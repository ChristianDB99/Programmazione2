package Classes;

/**
 *
 * @author new
 */
public class Cognome {
    private String cognome;

    public Cognome() {
    }

    public Cognome(String cognome) {
        this.cognome = cognome;
    }

    public void setLastName(String cognome) {
        this.cognome = cognome;
    }
    
    public String getCognome() {
        return cognome;
    }

    @Override
    public String toString() {
        return cognome;
    }
    
    
}