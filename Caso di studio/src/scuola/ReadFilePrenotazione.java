package scuola;
import java.io.File;  

import java.io.FileNotFoundException;  
import java.util.Scanner; 


public class ReadFilePrenotazione {
	
	static void read() {
		Prenotazione p;
		Docente d;
		Stanza s;
		
		try {
		      File myObj = new File("Prenotazioni.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine()) {
		        String riga = myReader.nextLine();
		        String[] splited = riga.split("\\s+");
		        
		        d= new Docente(splited[0], splited[1], splited[2], Insegnamento.valueOf(splited[3]));
		        s= new Aula(splited[4], splited[5],Integer.parseInt(splited[6])); 
		        p = new Prenotazione(d, s, Float.parseFloat(splited[7]), Float.parseFloat(splited[8]));
		        p.stampaPrenotazione();
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Errore.");
		      e.printStackTrace();
		    }
		
	}
	
	public static void main(String[] args) {
		
	
	  }

}
