package scuola;
import java.util.*;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.File;

public class Scuola {
	
	private int id;
	private int numdocenti;
	private int numaule;
	List<Docente> docenti = new ArrayList<Docente>();
	List<Stanza> stanze = new ArrayList<Stanza>();
	List<Prenotazione> prenotazioni = new ArrayList<Prenotazione>();
	
	
	public Scuola()
	{
		this.id=1;
	}
	
	public void nuovaPrenotazione(Prenotazione p)
	{
		prenotazioni.add(p);
	}
	
	/*public void nuovoDocente(Docente d)
	{
		docenti.add(d);
	}
	
	public void nuovaStanza(Stanza s)
	{
		stanze.add(s);
	}*/

	public int getIDScuola()
	{
		return id;
	}
	
	public void stampaPrenotazioni()
	{
		for(Prenotazione prenotazione: prenotazioni)
		{
			System.out.println(prenotazione.toString());
		}
	}
	
	public int controllaPrenotazioni(Prenotazione p1)
	{
		List<Prenotazione> pr = new ArrayList<Prenotazione>();
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
		        pr.add(p);
		        /*p.stampaPrenotazione();*/
		      }
		      myReader.close();
		    } catch (FileNotFoundException e) {
		      System.out.println("Errore.");
		      e.printStackTrace();
		    }
		
		int res=0;
		for(Prenotazione prenotazione: pr)
		{
			if(p1.getcodiceStanza().equals(prenotazione.getcodiceStanza()))
			{
				if(p1.getInizio()>=prenotazione.getInizio() && p1.getFine() <= prenotazione.getFine()) 
				{
					
					res=0;
				}
				else
				{
					res=1;
				}
			}
			else res=1;
		}
		return res;
	}
	
	public void scriviFileappend()
	{
		PrintWriter outputStream = null;
		try
		{
			outputStream = new PrintWriter(new FileOutputStream("Prenotazioni.txt", true));
		}catch (FileNotFoundException e)
		{
			System.out.println("Errore nell'apertura del file " + "Prenotazioni,txt");
			System.exit(0);
		}
		
		for(Prenotazione prenotazione: prenotazioni)
		{
			outputStream.println(prenotazione);
		}
		outputStream.close();
		System.out.println("Le prenotazioni sono state scritte sul file");
	}
	
	public void scriviFile()
	{
		PrintWriter myWriter = null;
		try
		{
			myWriter = new PrintWriter("Prenotazioni.txt");
		}catch (FileNotFoundException e)
		{
			System.out.println("Errore nell'apertura del file " + "Prenotazioni,txt");
			System.exit(0);
		}
		
		for(Prenotazione prenotazione: prenotazioni)
		{
			myWriter.println(prenotazione);
		}
		myWriter.close();
		System.out.println("Le prenotazioni sono state scritte sul file");
	}
	
	public void leggiFile()
	{
		Scanner inputStream = null;
		try 
		{
			inputStream = new Scanner(new File("Prenotazioni.txt"));
		} catch (FileNotFoundException e) 
		{
			System.out.println("Errore nell'apertura del file " + "Prenotazioni.txt");
			System.exit(0);
		}
		
		while(inputStream.hasNextLine())
		{
			String riga = inputStream.nextLine();
			System.out.println(riga);
		}
		
		inputStream.close();
	}
	
	/*public void stampaDocenti()
	{
		for(Docente docente: docenti)
		{
			System.out.println(docente.toString());
		}
	}
	
	public void stampaStanze()
	{
		for(Stanza stanza: stanze)
		{
			System.out.println(stanza.toString());
		}
	}*/
}
