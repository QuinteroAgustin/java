package ja44;

public class Voiture {
    private String couleur;
    private String marque;
    private String modele;
    private int compteur;
    private Boolean demarrer;

    public Voiture(String couleur, String marque, String modele) {
        this.setCouleur(couleur);
        this.setMarque(marque);
        this.setModele(modele);
        this.compteur = 0;
        this.demarrer = false;
    }

    public void setCouleur(String couleur) {
        if(couleur.equals("bleu") || couleur.equals("blanc") || couleur.equals("rouge")){
            this.couleur = couleur;
        }else{
            System.out.println("La couleur doit être bleu, blanc ou rouge : "+couleur);
        }
        
    }

    public void setMarque(String marque) {
        if(marque.equals("Renault") || marque.equals("Dacia")){
            this.marque = marque;
        }else{
            System.out.println("La marque doit être Renault ou Dacia : "+marque);
        }
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public void setCompteur(int compteur) {
        if(compteur > 0){
            this.compteur = compteur;
        }else{
            System.out.println("Le compteur ne peux être négatif");
        }
        
    }

    public void setDemarrer(Boolean demarrer) {
        this.demarrer = demarrer;
    }

    public String getCouleur() {
        return couleur;
    }

    public String getMarque() {
        return marque;
    }

    public String getModele() {
        return modele;
    }

    public int getCompteur() {
        return compteur;
    }

    public boolean getDemarrer() {
        return demarrer;
    }
    
    public void demarrer(){
        setDemarrer(true);
    }
    
    public void arreter(){
        setDemarrer(false);
    }
    
    public void avancer(int km){
        if(getDemarrer() == true && km > 0){
            setCompteur(getCompteur() + km);
        }else{
            if(km < 0){
                System.out.println("Pas de valeur négative pour le compteur : "+km);
            }
            if(getDemarrer() == false){
                System.out.println("La voiture doit être démarré");
            }
        }
        
    }
    
    public void afficher(){
        System.out.println("-- Infos sur la voiture --");
        System.out.println("couleur : " + getCouleur());
        System.out.println("marque : " + getMarque());
        System.out.println("modèle : " + getModele());
        System.out.println("compteur : " + getCompteur());
        System.out.println("moteur démarré ? " + getDemarrer());
    }
}
