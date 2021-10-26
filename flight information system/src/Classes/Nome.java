package Classes;

/**
 *
 * @author new
 */
public class Nome {
    private String nome;

    public Nome() {
    }

    public Nome(String nome) {
        this.nome = nome;
    }

    public void setFirstName(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }

    @Override
    public String toString() {
        return nome;
    }
    
    
}
