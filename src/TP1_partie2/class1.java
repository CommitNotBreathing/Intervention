package TP1_partie2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;




public class class1 {
	
	public static void principale() {
	
		
		try {
			BufferedReader br = new BufferedReader(new FileReader(System.getProperty("user.dir") + "\\Style.txt"));
			ArrayList<String> info = new ArrayList<String>();
			String line;
			while ((line = br.readLine()) !=null) {
					info.add(line);
			}
			
			br.close();
			
			Client.CreateClients(info);
			Plat.CreatePlats(info);
			Commande.CreateCommande(info);
			Facture.PrintFacture();
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public static void main(String[] args) {
		principale();
	}


}


