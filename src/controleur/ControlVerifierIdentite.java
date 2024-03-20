package controleur;

import villagegaulois.Village;
import personnages.Gaulois;

public class ControlVerifierIdentite {
    private Village village;

    public ControlVerifierIdentite(Village village) {
        this.village = village;
    }

    public boolean verifierIdentite(String nomVendeur) {
        if (village.getNom().equals(nomVendeur)) {
            return true; 
        }

        Gaulois[] villageois = village.getVillageois();

        for (Gaulois gaulois : villageois) {
            if (gaulois != null && nomVendeur.equals(gaulois.getNom())) {
                return true; 
            }
        }

        return false;
    }
    public Gaulois trouverHabitant(String nomGaulois) {
        return village.trouverHabitant(nomGaulois);
    }
}
