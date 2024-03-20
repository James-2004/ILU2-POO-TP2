package controleur;

import villagegaulois.Village;
import java.util.Scanner;


public class ControlPrendreEtal {
	private Village village;
	private ControlVerifierIdentite controlVerifierIdentite;

	
	public ControlPrendreEtal(ControlVerifierIdentite controlVerifierIdentite,
			Village village) {
		this.controlVerifierIdentite = controlVerifierIdentite;
		this.village = village;
	}

	public boolean resteEtals() {
		
		return village.rechercherEtalVide();
	}

	 public void prendreEtal(String nomVendeur,String nomProduit,int nbProduit) {
	     
	     village.installerVendeur(village.trouverHabitant(nomVendeur),nomProduit,nbProduit);
		 
	    }


	 public boolean verifierIdentite(String nomVendeur) {
	     
	        return controlVerifierIdentite.verifierIdentite(nomVendeur);
	       
	    }
	}

