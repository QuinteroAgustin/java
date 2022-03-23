package ja53;

public class ja53 {
    public static void main(String[] args) {
        Boisson boisson1 = new Boisson("Perrier", 1.0);
        boisson1.setEstAlcoolise(false);
        boisson1.setCategorie("eau");
        boisson1.afficher();
        Boisson boisson2 = new Boisson("Cabernet", 0.75);
        boisson2.setEstAlcoolise(true);
        boisson2.setCategorie("vin");
        boisson2.afficher();
        Boisson boisson3 = new Boisson("Multifruits", 1.5);
        boisson3.setEstAlcoolise(false);
        boisson3.setCategorie("jus");
        boisson3.afficher();
        Boisson boisson4 = new Boisson("Corona", 0.33);
        boisson4.setEstAlcoolise(true);
        boisson4.setCategorie("biere"); // Erreur
        boisson4.setContenance(-10.0); // Erreur
        boisson4.afficher();
    }
}