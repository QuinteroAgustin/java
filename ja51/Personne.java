package ja51;

public class Personne {
    // Propriétés
    private String nom;
    private String prenom;
    // Constructeur
    Personne (String prenom, String nom){
        set_prenom(prenom);
        set_nom(nom);
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

}
