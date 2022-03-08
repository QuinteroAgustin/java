package ja51b;
import java.util.ArrayList;

public class ja51 {
    public static void main(String[] args) {
        //Ajout d'enfant
        Enfant enfant1 = new Enfant("Timoty", 18);
        Enfant enfant2 = new Enfant("Meg", 21);
        ArrayList<Enfant> Enfants_p = new ArrayList<Enfant>();
        Enfants_p.add(enfant1);
        Enfants_p.add(enfant2);
        

        System.out.println("-- partie 1 --");
        Personne personne1 = new Personne("jack", "lefoudroiyeur", Enfants_p);
        Personne personne2 = new Personne();
        Personne personne3 = new Personne();

        personne3.set_nom("picasso");
        personne3.set_prenom("pablo");

        //Ajout d'enfant
        Enfant enfant3 = new Enfant("Hector", 50);
        Enfant enfant4 = new Enfant("Pepito", 12);
        ArrayList<Enfant> Enfants_d = new ArrayList<Enfant>();
        Enfants_d.add(enfant3);
        Enfants_d.add(enfant4);

        personne3.setEnfants(Enfants_d);
        System.out.println(personne1.get_nom_complet());
        System.out.println(personne2.get_nom_complet());
        System.out.println(personne3.get_nom_complet());

        System.out.println("-- partie 2 --");
        ArrayList<Personne> lesPersonnes = new ArrayList<Personne>();
        lesPersonnes.add(personne1);
        lesPersonnes.add(personne2);
        lesPersonnes.add(personne3);
        for(Personne personne : lesPersonnes){
            System.out.println(personne.get_nom());
        }

        System.out.println("Nombres de personnes : "+ lesPersonnes.size());

        System.out.println("-- partie 3 --");
        for(Personne personne : lesPersonnes){
            System.out.println(personne.get_nom());
            if(personne.getNbEnfants() > 0){
                personne.getEnfantsInfo();
            }
        }
    }
}