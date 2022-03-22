package ja54b;

public class Langue {
    private String code;
    private String libelle;

    public Langue(String code, String libelle){
        setCode(code);
        setLibelle(libelle);
    };    

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
     * @return String return the libelle
     */
    public String getLibelle() {
        return libelle;
    }

    /**
     * @param libelle the libelle to set
     */
    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public String getLangueComplet(){
        return getLibelle() + "("+getCode()+")";
    }

    public void afficher(){
        System.out.println("---- Contenu ----");
        System.out.println("Code      : " + getCode());
        System.out.println("Libelle     : " + getLibelle());
    }

}