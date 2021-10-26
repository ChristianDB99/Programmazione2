package scuola;

import javax.swing.*;

import javax.swing.text.BoxView;
import javax.swing.text.Element;
import javax.swing.text.View;
import javax.swing.text.html.ListView;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Home {

	Container contenuto = null;
	JComboBox doc = new JComboBox();
	JComboBox stanza = new JComboBox();
	JSpinner orain = new JSpinner();
	JSpinner orafi = new JSpinner();

	int flag = 0;

	List<Prenotazione> prenotazioni = new ArrayList<Prenotazione>();
	JList pren = new JList();
	
	DefaultListModel lm = null;
	public Home()
	{
		List<Docente> docenti = new ArrayList<Docente>();
		Docente d;
		Aula a;
		Prenotazione p;
		int i=0;
		@SuppressWarnings("deprecation")
		Float value = new Float(8.00);
		Float step = new Float(0.50);
		Float max = new Float(19.00);
		Float min = new Float(8.00);
		SpinnerNumberModel value1 = new SpinnerNumberModel(value, min,max, step);
		SpinnerNumberModel value2 = new SpinnerNumberModel(value, min,max, step);
		//aggiungere alla lista i docenti salvati sul file
		try
		{
			 File myObj = new File("Docenti.txt");
		     Scanner myReader = new Scanner(myObj);
		     while (myReader.hasNextLine()) 
		     {
		        String riga = myReader.nextLine();
		        String[] splited = riga.split("\\s+");
		        
		        d= new Docente(splited[0], splited[1], splited[2], Insegnamento.valueOf(splited[3]));
		        docenti.add(d);
		     }
		     myReader.close();
	    }
		catch (FileNotFoundException e) 
		{
	      System.out.println("Errore.");
	      e.printStackTrace();
	    }
		List<Stanza> stanze = new ArrayList<Stanza>();
		try
		{
			 File myObj = new File("Aule.txt");
		     Scanner myReader = new Scanner(myObj);
		     while (myReader.hasNextLine()) 
		     {
		        String riga = myReader.nextLine();
		        String[] splited = riga.split("\\s+");
		        
		        a= new Aula (splited[0], splited[1], Integer.parseInt(splited[2]));
		        stanze.add(a);
		     }
		     myReader.close();
	    }
		catch (FileNotFoundException e) 
		{
	      System.out.println("Errore.");
	      e.printStackTrace();
	    }
		//aggiungere alla lista le stanze salavate sul file
		
		//aggiungere alla lista le prenotazione salvate sul file
		try
		{
			 File myObj = new File("Prenotazioni.txt");
		     Scanner myReader = new Scanner(myObj);
		     while (myReader.hasNextLine()) 
		     {
		        String riga = myReader.nextLine();
		        String[] splited = riga.split("\\s+");
		        d= new Docente(splited[0], splited[1], splited[2], Insegnamento.valueOf(splited[3]));
		        a= new Aula(splited[4], splited[5],Integer.parseInt(splited[6])); 
		        p = new Prenotazione(d, a, Float.parseFloat(splited[7]), Float.parseFloat(splited[8]));
		        
		        prenotazioni.add(p);
		     }
		     myReader.close();
	    }
		catch (FileNotFoundException e) 
		{
	      System.out.println("Errore.");
	      e.printStackTrace();
	    }
		
		JFrame finestra = new JFrame ("Prenotazioni");
		finestra.setBounds(500, 500,800, 700);
		contenuto=finestra.getContentPane();
		
		JLabel label1 = new JLabel("Prenotazione Aule");
		
		JButton AddPrenotazione = new JButton("Aggiungi Prenotazione");
		JButton ViewPrenotazioni = new JButton("Visualizza Prenotazioni");
	
	/*	SpinnerModel value1 =  
	             new SpinnerNumberModel(8, //initial value  
	                8, //minimum value  
	                18, //maximum value  
	                1); //step  
		*/
		/*SpinnerModel value2 =  
	             new SpinnerNumberModel(8, //initial value  
	                8, //minimum value  
	                18, //maximum value  
	                1); //step  
		*/
		doc = new JComboBox(docenti.toArray());
		orain = new JSpinner(value1);
		orafi = new JSpinner(value2);
		stanza = new JComboBox  (stanze.toArray());
		lm = new DefaultListModel();
		for( Prenotazione prenotazione: prenotazioni)
		{
			lm.add(i, prenotazioni.toArray()[i]);
			i++;
		}
		
		pren = new JList(lm);
		pren.setVisible(false);
		
	
		/*JPanel sx = new JPanel();
		JPanel dx = new JPanel();
		JPanel sep = new JPanel();
		
		sx.setLayout(new BoxLayout(sx, BoxLayout.Y_AXIS));
		sep.setLayout(new BoxLayout(sep, BoxLayout.Y_AXIS));
		dx.setLayout(new BoxLayout(dx, BoxLayout.Y_AXIS));
		contenuto.add(sx);
	
		contenuto.add(sep);
	
		contenuto.add(dx);
		
		*/
		GridLayout experimentLayout = new GridLayout(3,3,3,3);
		final JPanel compsToExperiment = new JPanel();
		compsToExperiment.setLayout(experimentLayout);
		compsToExperiment.add(AddPrenotazione);
	
		compsToExperiment.add(doc);
		
		
		
		compsToExperiment.add(stanza);
		
		compsToExperiment.add(orain);
		compsToExperiment.add(orafi);
		compsToExperiment.add(ViewPrenotazioni);
		compsToExperiment.add(pren);
		
		contenuto.add(compsToExperiment);
		AddPrenotazione.addActionListener( (ActionListener) new clickAddPrenotazione() );
		//sx.add(label1);
		ViewPrenotazioni.addActionListener((ActionListener) new clickViewPrenotazioni() );
	
		finestra.setVisible(true);
		
		
	
		
	
		finestra.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
private class clickAddPrenotazione implements ActionListener
	{
		public void actionPerformed(ActionEvent evento)
		{ 
			Docente d;
			Stanza s;
			Prenotazione p;
			int i = 0;
			float oi, of;
			int c;
			d=(Docente) doc.getSelectedItem();
			s= (Stanza) stanza.getSelectedItem();
			oi= (float) orain.getValue();
			of= (float) orafi.getValue();
			
			p = new Prenotazione(d,s,oi,of);
			c = controllaPrenotazioni(p);
			if(c==1)
				
			{prenotazioni.add(p);
			
				lm.removeAllElements();
			
			
				scriviFileappend();
				for( Prenotazione prenotazione: prenotazioni)
				{
					lm.add(i, prenotazioni.toArray()[i]);
				
					i++;
				}
			}else {
				JOptionPane.showMessageDialog(null, "Errore");
			}
		}

	}
private class clickViewPrenotazioni implements ActionListener
{
	public void actionPerformed(ActionEvent evento)
	{ 
		if(flag==0)
		{
			pren.setVisible(true);
			flag=1;
		}else
		{
			pren.setVisible(false);
			flag=0;
		}
		
	}

}
public void scriviFileappend()
{
	PrintWriter outputStream = null;
	try
	{
		outputStream = new PrintWriter(new FileOutputStream("Prenotazioni.txt", false));
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
	
	int res=1;
	if(pr.isEmpty()==false) {
	for(Prenotazione prenotazione: pr)
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
	}
	
	return res;
}
}

