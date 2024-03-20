package frontiere;

import java.util.Scanner;
import controleur.ControlPrendreEtal;

public class BoundaryPrendreEtal {
    private ControlPrendreEtal controlPrendreEtal;
    private Scanner scan = new Scanner(System.in);

    public BoundaryPrendreEtal(ControlPrendreEtal controlPrendreEtal) {
        this.controlPrendreEtal = controlPrendreEtal;
    }

    public void prendreEtal(String nomVendeur) {
        // Vérifier l'identité du vendeur
        boolean identiteVerifiee = controlPrendreEtal.verifierIdentite(nomVendeur);
        
        if (identiteVerifiee) {
            // Le vendeur est connu, recherche d'un étal
            System.out.println("Bonjour"+ nomVendeur + "je vais regarder si je peux vous trouver une étal");
        	boolean etalDisponible = controlPrendreEtal.resteEtals();
            if (etalDisponible) {
            	installerVendeur(nomVendeur);
                
            }
        } else {
            System.out.println("Je suis désolée"+ nomVendeur + "mais il faut être un habitant du village pour commencer ici");
        }
    }

    private void installerVendeur(String nomVendeur) {
        Scanner sc = new Scanner(System.in);
    	System.out.println("C'est parfait, il me reste un étale pour vous !");
        System.out.println("Il me faudrait quelques renseignment:");
        System.out.println("Quel produit souhaitez-vous vendre ?");
        String nomprod = sc.nextLine();      

        System.out.println("Combien souhaitez-vous en vendre ?");
        int nbprod = sc.nextInt();
        //a continuer
        if(controlPrendreEtal.prendreEtal(nomVendeur,nomprod,nbprod)) {
            System.out.println("Désolé"+ nomVendeur + "je n'ai plus d'étal qui ne soit pas déjà occupé ");

        }
        
        
        scan.close();

    }
}
