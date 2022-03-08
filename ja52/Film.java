package ja52;

public class Film {
    private String Titre;
    private String Realisateur;
    private int Date;

    Film(String Titre, String Realisateur, int Date){
        setTitre(Titre);
        setRealisateur(Realisateur);
        setDate(Date);
    }

    Film(){
        setTitre("???");
        setRealisateur("???");
        setDate(0000);
    }

    /**
     * @return String return the Titre
     */
    public String getTitre() {
        return Titre;
    }

    /**
     * @param Titre the Titre to set
     */
    public void setTitre(String Titre) {
        this.Titre = Titre;
    }

    /**
     * @return String return the Realisateur
     */
    public String getRealisateur() {
        return Realisateur;
    }

    /**
     * @param Realisateur the Realisateur to set
     */
    public void setRealisateur(String Realisateur) {
        this.Realisateur = Realisateur;
    }

    /**
     * @return int return the Date
     */
    public int getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(int Date) {
        this.Date = Date;
    }

    /**
     * @return String return the Libelle
     */
    public String getLibelle() {
        return Titre+" de "+ Realisateur + "("+Date+")";
    }

    /**
     * @return String return the Contenu
     */
    public void afficher() {
        System.out.println("------ Contenu ------");
        System.out.println("Titre : "+ this.Titre);
        System.out.println("Réalisateur : "+ this.Realisateur);
        System.out.println("Année : "+ this.Date);
    }

}
