package ja53b;

public class Vin extends Boisson{
    private String couleur;

    public Vin(String nom, Double contenance, String couleur){
        super(nom, contenance);
        setCouleur(couleur);
    }

    /**
     * @return String return the couleur
     */
    public String getCouleur() {
        return couleur;
    }

    /**
     * @param couleur the couleur to set
     */
    public void setCouleur(String couleur) {
        if(couleur.equals("rouge") || couleur.equals("rosé") || couleur.equals("blanc")){
            this.couleur = couleur;
        }else{
            System.out.println("ERREUR : La couleur ne peux être que \"rouge\", \"rosé\" ou \"blanc\"");
        }
    }

    public void afficher(){
        super.afficher();
        System.out.println("couleur     : " +this.couleur);
    }

}
