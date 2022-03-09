package ja52b;

public class Acteur {
    private String Prenom;
    private String Nom;

    Acteur(String Prenom, String Nom){
        setPrenom(Prenom);
        setNom(Nom);
    }

    Acteur(){
        setPrenom("???");
        setNom("???");
    }

    /**
     * @return String return the Prenom
     */
    public String getPrenom() {
        return Prenom;
    }

    /**
     * @param Prenom the Prenom to set
     */
    public void setPrenom(String Prenom) {
        this.Prenom = Prenom;
    }

    /**
     * @return String return the Nom
     */
    public String getNom() {
        return Nom;
    }

    /**
     * @param Nom the Nom to set
     */
    public void setNom(String Nom) {
        this.Nom = Nom;
    }

    /**
     * @return String return the Nom complet
     */
    public String getNomComplet() {
        return Nom+" "+Prenom;
    }

    /**
     * @return String return the Contenu
     */
    public void afficher() {
        System.out.println("------ Proprietes ------");
        System.out.println("Nom : "+ this.Nom);
        System.out.println("Prénom : "+ this.Prenom);
    }

}
