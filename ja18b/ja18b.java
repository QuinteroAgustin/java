package ja18b;

import java.util.Scanner;

public class ja18b {
    public static void main(String[] args) {
        Double nb1;
        Double nb2;
        String operateur;
        Scanner clavier = new Scanner(System.in);

        System.out.println("Nombre 1 ?");
        nb1 = clavier.nextDouble();
        System.out.println("Opérateur ?");
        operateur = clavier.next();
        System.out.println("Nombre 2 ?");
        nb2 = clavier.nextDouble();
        clavier.close();
        
        Calculatrice calcul = new Calculatrice(nb1, nb2, operateur);
        calcul.calculer();
    }
}
