package scuola;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
public class ReadFileAula {
	
	
	public static void main(String[] args) {
		Aula a;
		
	    try {
	      File myObj = new File("Aule.txt");
	  
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String riga = myReader.nextLine();
	        String[] splited = riga.split("\\s+");
	        a = new Aula(splited[0], splited[1], Integer.parseInt(splited[2]));
	        System.out.println(a.toString());
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("Errore.");
	      e.printStackTrace();
	    }
	  }

}
