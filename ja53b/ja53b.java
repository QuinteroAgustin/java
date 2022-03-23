package ja53b;

public class ja53b {
    public static void main(String[] args) {
        Boisson boisson1 = new Boisson("Perrier", 1.0);
        boisson1.setEstAlcoolise(false);
        boisson1.setCategorie("eau");
        boisson1.afficher();
        Vin vin1 = new Vin("Cabernet", 0.75, "rosé");
        vin1.setEstAlcoolise(true);
        vin1.setCategorie("vin");
        vin1.afficher();
        Vin vin2 = new Vin("Monastrell", 0.75, "noir"); // Erreur
        vin2.setEstAlcoolise(true);
        vin2.setCategorie("vin");
        vin2.afficher();
    }
}