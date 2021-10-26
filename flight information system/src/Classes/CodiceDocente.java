/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author chris
 */
public class CodiceDocente {
    private String codice;
    
    public CodiceDocente() {
    }    
    
    public CodiceDocente(String codice) {
        this.codice = codice;
    }   

    public void setCodiceDocente(String codice) {
        this.codice = codice;
    }    

     public String getCodiceDocente() {
        return codice;
    }
     
    @Override
    public String toString() {
        return codice;
    }
}


