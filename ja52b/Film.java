package ja52b;

import java.util.ArrayList;

public class Film {
    private String Titre;
    private String Realisateur;
    private int Date;
    private ArrayList<Acteur> Acteurs = new ArrayList<Acteur>();

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
     * @return ArrayList<Acteur> return the Acteurs
     */
    public ArrayList<Acteur> getActeurs() {
        return Acteurs;
    }

    /**
     * @param Acteurs the Acteurs to set
     */
    public void setActeurs(ArrayList<Acteur> Acteurs) {
        this.Acteurs = Acteurs;
    }

    /**
     * @param Acteurs add the Acteurs to set
     */
    public void addActeur(Acteur Acteur) {
        this.Acteurs.add(Acteur);
    }

    /**
     * @return String return the Libelle
     */
    public String getLibelle() {
        return Titre+" de "+ Realisateur + "("+Date+")";
    }

    /**
     * @return String return the LibelleActeur
     */
    public void getLibelleActeur() {
        if(this.Acteurs.size()>0){
            for(Acteur Acteur : this.Acteurs){
                System.out.println("Acteur : "+ Acteur.getNomComplet());
            }
        }else{
            System.out.println("Pas d'acteur");
        }
    }

    /**
     * @return String return the Contenu
     */
    public void afficher() {
        System.out.println("------ Contenu ------");
        System.out.println("Titre : "+ this.Titre);
        System.out.println("Réalisateur : "+ this.Realisateur);
        System.out.println("Année : "+ this.Date);
        if(Acteurs.size()>0){
            for(Acteur Acteur : Acteurs){
                System.out.println("Acteur : "+ Acteur.getNomComplet());
            }
        }
        
    }

}
