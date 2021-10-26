package Classes;

/**
 *
 * @author new
 */
public class Insegnamento {
    private String insegnamento;

    public Insegnamento() {
    }    
    
    public Insegnamento(String insegnamento) {
        this.insegnamento = insegnamento;
    }   

    public void setInsegnamento(String insegnamento) {
        this.insegnamento = insegnamento;
    }    

     public String getInsegnamento() {
        return insegnamento;
    }
     
    @Override
    public String toString() {
        return insegnamento;
    }
    
}
