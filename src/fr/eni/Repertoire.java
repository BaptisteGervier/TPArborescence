package fr.eni;

import java.util.ArrayList;
import java.util.List;

public class Repertoire extends Element{
   private List<Element> listedelements;

    public Repertoire(String nom){
        super(nom);
        listedelements = new ArrayList<>();
    }



    public void addElements(Element e) {
        this.listedelements.add(e);
    }


    public void recherche(String nomRecherche){
        if (this.nom.equals(nomRecherche)){
            System.out.println(" trouvé : " + nomRecherche);
        }
        for (Element chaqueElement : listedelements){
            if (chaqueElement instanceof Repertoire) {
                ((Repertoire) chaqueElement).recherche(nomRecherche);
            }
            if (chaqueElement instanceof Repertoire){
                if (chaqueElement.nom.equals(nomRecherche)){
                    System.out.println(" trouvé : " + nomRecherche);
                }
            }
        }
    }
}
