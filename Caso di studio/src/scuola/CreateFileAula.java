package scuola;
import java.io.File;  
import java.io.IOException;  

public class CreateFileAula {
	
	public static void main(String[] args) {
	    try {
	      File myObj = new File("Aule.txt");
	      if (myObj.createNewFile()) {
	        System.out.println("File creato: " + myObj.getName());
	      } else {
	        System.out.println("File gia' esistente.");
	      }
	    } catch (IOException e) {
	      System.out.println("Errore.");
	      e.printStackTrace();
	    }
	  }

}
