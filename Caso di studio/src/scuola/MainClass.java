package scuola;
import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
public class MainClass {

	static void pausa(int secondi)
	{
		try {
			Thread.sleep(1000*secondi);
		}catch(InterruptedException e)
		{
			e.printStackTrace();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		Home home = new Home();
		
		
	}

}
