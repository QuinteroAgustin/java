package ja53c;

public class ja53c {
    public static void main(String[] args) {
        Boisson boisson1 = new Boisson("Perrier", 1.0);
        boisson1.setEstAlcoolise(false);
        boisson1.setCategorie("eau");
        boisson1.afficher();
        Jus jus1 = new Jus("Jus d'ananas", 0.5, "ananas");
        jus1.setEstAlcoolise(false);
        jus1.setCategorie("jus");
        jus1.afficher();
        Jus jus2 = new Jus("Jus de canneberges", 1.5, "canneberges");
        jus2.setEstAlcoolise(false);
        jus2.setCategorie("jus");
        jus2.setEmballage(2); // bouteille verre
        jus2.afficher();
        Jus jus3 = new Jus("Jus de citron", 2.5, "citron");
        jus3.setEstAlcoolise(false);
        jus3.setCategorie("jus");
        jus2.setEmballage(99); // Erreur
        jus3.afficher();
    }
}