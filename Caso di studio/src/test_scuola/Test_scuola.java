package test_scuola;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.*;
import scuola.*;

public class Test_scuola {
	
	private Scuola s;
	Prenotazione p, p1;
	Insegnamento i, i1;
	Docente d, d1;
	Aula a, a1;
	private String codice, nome, cognome, insegnamento, codice_aula, nome_aula, app;
	private int posti;
	float inizio, fine;
	File name=new File("Prenotazioni.txt");
	public static void main(String[] args) {
		
		Test_scuola test;
		System.out.println("Testo il costruttore e vedo se funziona il programma");
		test = new Test_scuola();
		
	}
	
	public Test_scuola()
	{
		//DOCENTE
		s=new Scuola();
		Scanner tastiera=new Scanner(System.in);
		System.out.println("Inserire codice docente");
		codice=tastiera.next();
		System.out.println("Inserire nome docente");
		nome=tastiera.next();
		System.out.println("Inserire cognome docente");
		cognome=tastiera.next();
		System.out.println("Inserire insegnamento docente");
		app=tastiera.next();
		d=new Docente(codice, nome, cognome, Insegnamento.valueOf(app));
		
		//AULA
		System.out.println("Inserire codice aula");
		codice_aula=tastiera.next();
		System.out.println("Inserire nome aula");
		nome_aula=tastiera.next();
		System.out.println("Inserire posti aula");
		posti=tastiera.nextInt();
		a=new Aula(codice_aula, nome_aula, posti);
		a1=new Aula(codice_aula, nome_aula, posti);
		
		//PRENOTAZIONE
		System.out.println("Inserire ora di inizio prenotazione");
		inizio=tastiera.nextFloat();
		System.out.println("Inserire ora di fine prenotazione");
		fine=tastiera.nextFloat();
		p=new Prenotazione(d, a, inizio, fine);
		/*s.nuovoDocente(d);
		s.nuovaStanza(a);*/
		
		//PROVO IL CONTROLLO DELL'ORARIO
		if(name.exists()==false||name.length()==0)
		{
			s.nuovaPrenotazione(p);
			s.scriviFile();
			System.out.println("Prenotazione effettuata con successo");
		}
		else if(s.controllaPrenotazioni(p)==1)
		{
			s.nuovaPrenotazione(p);
			s.scriviFileappend();
			System.out.println("Prenotazione effettuata con successo");
		}
		else
		{
			System.out.println("Impossibile effettuare prenotazione. Orario non disponibile");
		}

		
		
		//STAMPO GLI ESITI
		
		System.out.println("Stampo i docenti inseriti");
		/*s.stampaDocenti();*/
		System.out.println(d.toString());
		System.out.println("Stampo le aule inserite");
		/*s.stampaStanze();*/
		System.out.println(a.toString());
		System.out.println("Stampo le prenotazioni");
		s.stampaPrenotazioni();
		/*p.stampaPrenotazione();*/
		
		//SCRIVO SU FILE
		//s.scriviFile();
		
		//LEGGO DA FILE
		//s.leggiFile();
	}

}
