package ja54;

public class Pays {
    private String nom;
    private String code;
    private String capitale;
    private String monnaie;

    public Pays(String nom, String code, String capitale, String monnaie){
        setNom(nom);
        setCode(code);
        setCapitale(capitale);
        setMonnaie(monnaie);
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

    public String getLibelle(){
        return getNom() + " ("+ getCode() +") dont la capitale est " + getCapitale();
    }

    public void afficher(){
        System.out.println("---- Contenu ----");
        System.out.println("Nom      : " + getNom());
        System.out.println("Code     : " + getCode());
        System.out.println("Capitale : " + getCapitale());
        System.out.println("Monnaie  : " + getMonnaie());
    }

}
