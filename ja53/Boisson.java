package ja53;

public class Boisson {
    private String nom;
    private Double contenance;
    private String categorie;
    private Boolean estAlcoolise;

    public Boisson(String nom, Double contenance){
        this.nom = nom;
        this.contenance = contenance;
        this.estAlcoolise=false;
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
     * @return Double return the contenance
     */
    public Double getContenance() {
        return contenance;
    }

    /**
     * @param contenance the contenance to set
     */
    public void setContenance(Double contenance) {
        if(contenance > 0){
            this.contenance = contenance;
        }else{
            System.out.println("ERREUR : La contenance doit être positive : "+contenance);
        }        
    }

    /**
     * @return String return the categorie
     */
    public String getCategorie() {
        return categorie;
    }

    /**
     * @param categorie the categorie to set
     */
    public void setCategorie(String categorie) {
        if(categorie.equals("vin") || categorie.equals("eau") || categorie.equals("jus")){
            this.categorie = categorie;
        }else{
            System.out.println("ERREUR : La categorie ne peux être que \"vin\", \"eau\" ou \"jus\"");
        }  
        
    }

    /**
     * @return Boolean return the estAlcoolise
     */
    public Boolean isEstAlcoolise() {
        return estAlcoolise;
    }

    /**
     * @param estAlcoolise the estAlcoolise to set
     */
    public void setEstAlcoolise(Boolean estAlcoolise) {
        this.estAlcoolise = estAlcoolise;
    }

    public String getLibEstAlcoolise(){
        if(this.estAlcoolise==true){
            return "Oui";
        }else{
            return "Non";
        }
        
    }

    public String getLibContenance(){
        return this.contenance+" L";
    }

    public void afficher(){
        System.out.println("--- Détails de "+this.nom+" ---");
        System.out.println("nom         : "+this.nom);
        System.out.println("conteneance : "+getLibContenance());
        System.out.println("catégorie   : "+this.categorie);
        System.out.println("alcoolisé ? : "+getLibEstAlcoolise());
    }

}