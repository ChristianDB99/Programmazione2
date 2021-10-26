package scuola;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
public class ReadFileDocenti {
	
	
	public static void main(String[] args) {
		Docente d;
	
	    try {
	      File myObj = new File("Docenti.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String riga = myReader.nextLine();
	        String[] splited = riga.split("\\s+");
	        d = new Docente(splited[0], splited[1], splited[2], Insegnamento.valueOf(splited[3]));
	        System.out.println(d.toString());
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("Errore.");
	      e.printStackTrace();
	    }
	  }

}
