package ja51b;
import java.util.ArrayList;

public class ja51 {
    public static void main(String[] args) {
        Personne personne1 = new Personne("jack", "lefoudroiyeur");
        Personne personne2 = new Personne();
        Personne personne3 = new Personne();

        personne3.set_nom("picaso");
        personne3.set_prenom("pablo");
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
    }
}
