package ja54;

import java.util.ArrayList;

public class ja54 {

    public static void main(String[] args) {
        Pays pays1 = new Pays("Allemagne", "DE", "Berlin", "euro");
        Pays pays2 = new Pays("Autriche", "AT", "Vienne", "euro");
        Pays pays3 = new Pays("Belgique", "BE", "Bruxelles", "euro");
        Pays pays4 = new Pays("Bulgarie", "BG", "Sofia", "lev");
        Pays pays5 = new Pays("Chypre", "CY", "Nicosie", "euro");
        Pays pays6 = new Pays("Croatie", "HR", "Zagreb", "kuna");
        Pays pays7 = new Pays("Danemark", "DK", "Copenhague", "couronne");
        Pays pays8 = new Pays("Espagne", "ES", "Madrid", "euro");
        Pays pays9 = new Pays("Estonie", "EE", "Tallinn", "euro");
        Pays pays10 = new Pays("Finlande", "FI", "Helsinki", "euro");
        Pays pays11 = new Pays("France", "FR", "Paris", "euro");
        Pays pays12 = new Pays("Grèce", "EL, GR", "Athènes", "euro");
        Pays pays13 = new Pays("Hongrie", "HU", "Budapest", "forint");
        Pays pays14 = new Pays("Irlande", "IE", "Dublin", "euro");
        Pays pays15 = new Pays("Italie", "IT", "Rome", "euro");
        Pays pays16 = new Pays("Lettonie", "LV", "Riga", "euro");
        Pays pays17 = new Pays("Lituanie", "LT", "Vilnius", "euro");
        Pays pays18 = new Pays("Luxembourg", "LU", "Luxembourg", "euro");
        Pays pays19 = new Pays("Malte", "MT", "La Valette", "euro");
        Pays pays20 = new Pays("Pays-Bas", "NL", "Amsterdam", "euro");
        Pays pays21 = new Pays("Pologne", "PL", "Varsovie", "złoty");
        Pays pays22 = new Pays("Portugal", "PT", "Lisbonne", "euro");
        Pays pays23 = new Pays("Tchéquie", "CZ", "Prague", "couronne");
        Pays pays24 = new Pays("Roumanie", "RO", "Bucarest", "leu");
        Pays pays25 = new Pays("Slovaquie", "SK", "Bratislava", "euro");
        Pays pays26 = new Pays("Slovénie", "SI", "Ljubljana", "euro");
        Pays pays27 = new Pays("Suède", "SE", "Stockholm", "couronne");
        
        ArrayList<Pays> listePays = new ArrayList<Pays>();
        listePays.add(pays1);
        listePays.add(pays2);
        listePays.add(pays3);
        listePays.add(pays4);
        listePays.add(pays5);
        listePays.add(pays6);
        listePays.add(pays7);
        listePays.add(pays8);
        listePays.add(pays9);
        listePays.add(pays10);
        listePays.add(pays11);
        listePays.add(pays12);
        listePays.add(pays13);
        listePays.add(pays14);
        listePays.add(pays15);
        listePays.add(pays16);
        listePays.add(pays17);
        listePays.add(pays18);
        listePays.add(pays19);
        listePays.add(pays20);
        listePays.add(pays21);
        listePays.add(pays22);
        listePays.add(pays23);
        listePays.add(pays24);
        listePays.add(pays25);
        listePays.add(pays26);
        listePays.add(pays27);


        System.out.println("Affichage proprietes du premier pays");
        pays1.afficher();

        System.out.println("Affichage du libelle des trois premiers pays");
        System.out.println(pays1.getLibelle());
        System.out.println(pays2.getLibelle());
        System.out.println(pays3.getLibelle());

        System.out.println("Affichage le contenu de la collection");
        int i = 1;
        for(Pays seulPays : listePays){
            System.out.println(i + " " +seulPays.getNom());
            i++;
        }
        System.out.println("Il y a "+ listePays.size() +" pays dans cette collection");
        System.out.println("Afficher les pays qui n'utilisent pas l'Euro");
        for(Pays seulPays : listePays){
            if(!seulPays.getMonnaie().equals("euro"))
                System.out.println(seulPays.getNom() + " : " + seulPays.getMonnaie());
        }
    }
}