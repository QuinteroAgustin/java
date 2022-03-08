package ja51b;
import java.util.ArrayList;

public class Personne {
    // Propriétés
    private String nom;
    private String prenom;
    private ArrayList<Enfant> Enfants = new ArrayList<Enfant>();
    // Constructeur
    Personne (String prenom, String nom, ArrayList<Enfant> Enfants_p){
        set_prenom(prenom);
        set_nom(nom);
        this.Enfants = Enfants_p;
    }
    Personne (){
        set_prenom("???");
        set_nom("???");
    }
    
    // Getter
    public String get_nom() {
        return nom;
    }
    public void set_nom(String nom) {
        this.nom = nom;
    }
    // Setter
    public String get_prenom() {
        return prenom;
    }
    public void set_prenom(String prenom) {
        this.prenom = prenom;
    }
    // Retourne le prénom et le nom
    public String get_nom_complet(){
        return this.prenom+" "+this.nom;
    }
    // Ne retourne rien
    public void afficher(){
        System.out.println(this.prenom);
        System.out.println(this.nom);
    }
    /**
     * @return ArrayList<Enfant> return the Enfants
     */
    public int getNbEnfants() {
        return this.Enfants.size();
    }

    /**
     * @param Enfants the Enfants to set
     */
    public void setEnfants(ArrayList<Enfant> Enfants_p) {
        this.Enfants = Enfants_p;
    }

    /**
     * @return ArrayList<Enfant> return the Enfants
     */
    public void getEnfantsInfo() {
        for(Enfant Enfant : Enfants){
            Enfant.afficher();;
        }
    }

}
