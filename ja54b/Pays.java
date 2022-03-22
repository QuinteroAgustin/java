package ja54b;

import java.util.ArrayList;

public class Pays {
    private String nom;
    private String code;
    private String capitale;
    private String monnaie;
    private ArrayList<Langue> langues;

    public Pays(String nom, String code, String capitale, String monnaie){
        setNom(nom);
        setCode(code);
        setCapitale(capitale);
        setMonnaie(monnaie);
        setLangues(new ArrayList<Langue>());
    }

    /**
     * @return String return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return String return the code
     */
    public String getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * @return String return the capitale
     */
    public String getCapitale() {
        return capitale;
    }

    /**
     * @param capitale the capitale to set
     */
    public void setCapitale(String capitale) {
        this.capitale = capitale;
    }

    /**
     * @return String return the monnaie
     */
    public String getMonnaie() {
        return monnaie;
    }

    /**
     * @param monnaie the monnaie to set
     */
    public void setMonnaie(String monnaie) {
        this.monnaie = monnaie;
    }

    /**
     * @return ArrayList<Langue> return the langues
     */
    public ArrayList<Langue> getLangues() {
        return langues;
    }

    /**
     * @param langues the langues to set
     */
    public void setLangues(ArrayList<Langue> langues) {
        this.langues = langues;
    }

    public String getLibelle(){
        return getNom() + " ("+ getCode() +") dont la capitale est " + getCapitale();
    }

    /**
     * @param LANGUE add the Langue to collection
     */
    public void addLangue(Langue langue) {
        this.langues.add(langue);
    }

    public void afficher(){
        System.out.println("---- Contenu ----");
        System.out.println("Nom      : " + getNom());
        System.out.println("Code     : " + getCode());
        System.out.println("Capitale : " + getCapitale());
        System.out.println("Monnaie  : " + getMonnaie());
        System.out.println("Langues  : ");
        for(Langue langue : langues){
            System.out.println("   * "+langue.getLangueComplet());
        }
    }

}
