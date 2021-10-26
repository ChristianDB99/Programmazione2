package scuola;
import java.io.File;  
import java.io.FileNotFoundException;  
import java.util.Scanner; 
public class ReadFileLab {
	
	
	public static void main(String[] args) {
		Laboratorio l;
		
	    try {
	      File myObj = new File("Lab.txt");
	      Scanner myReader = new Scanner(myObj);
	      while (myReader.hasNextLine()) {
	        String riga = myReader.nextLine();
	        String[] splited = riga.split("\\s+");
	        l = new Laboratorio(splited[0], splited[1], Integer.parseInt(splited[2]), Integer.parseInt(splited[3]));
	        System.out.println(l.toString());
	      }
	      myReader.close();
	    } catch (FileNotFoundException e) {
	      System.out.println("Errore.");
	      e.printStackTrace();
	    }
	  }

}
