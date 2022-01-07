package ja44;

public class ja44 {
    public static void main(String[] args) {
        Voiture voiture1 = new Voiture("blanc", "Renault", "Megane");
        voiture1.demarrer();
        voiture1.avancer(50);
        voiture1.avancer(-40);
        voiture1.setCouleur("rose");
        voiture1.setMarque("Honda");
        voiture1.afficher(); 
    }
}
