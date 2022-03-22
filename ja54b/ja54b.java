package ja54b;

import java.util.ArrayList;

public class ja54b {

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
        
        Langue bg = new Langue("bg", "bulgare");
        Langue cz = new Langue("cz", "tchèque");
        Langue da = new Langue("da", "danois");
        Langue de = new Langue("de", "allemand");
        Langue el = new Langue("el", "grec");
        Langue en = new Langue("en", "anglais");
        Langue es = new Langue("es", "espagnol");
        Langue et = new Langue("et", "estonien");
        Langue fi = new Langue("fi", "finnois");
        Langue fr = new Langue("fr","français");
        Langue ga = new Langue("ga", "irlandais");
        Langue hr = new Langue("hr", "croate");
        Langue hu = new Langue("hu", "hongrois");
        Langue it = new Langue("it", "italien");
        Langue lb = new Langue("lb", "luxembourgeois");
        Langue lt = new Langue("lt", "lituanien");
        Langue lv = new Langue("lv", "letton");
        Langue mt = new Langue("mt", "maltais");
        Langue nl = new Langue("nl", "néerlandais");
        Langue pl = new Langue("pl", "polonais");
        Langue pt = new Langue("pt", "portugais");
        Langue ro = new Langue("ro", "roumain");
        Langue sk = new Langue("sk", "slovaque");
        Langue sl = new Langue("sl", "slovène");
        Langue sv = new Langue("sv", "suédois");
        Langue tr = new Langue("tr", "turc");

        pays1.addLangue(de);
        pays2.addLangue(de);
        pays3.addLangue(fr);
        pays3.addLangue(nl);
        pays3.addLangue(de);
        pays4.addLangue(bg);
        pays5.addLangue(el);
        pays5.addLangue(tr);
        pays6.addLangue(hr);
        pays7.addLangue(da);
        pays8.addLangue(es);
        pays9.addLangue(et);
        pays10.addLangue(fi);
        pays10.addLangue(sv);
        pays11.addLangue(fr);
        pays12.addLangue(el);
        pays13.addLangue(hu);
        pays14.addLangue(ga);
        pays14.addLangue(en);
        pays15.addLangue(it);
        pays16.addLangue(lv);
        pays17.addLangue(lt);
        pays18.addLangue(lb);
        pays18.addLangue(fr);
        pays18.addLangue(de);
        pays19.addLangue(mt);
        pays19.addLangue(en);
        pays20.addLangue(nl);
        pays21.addLangue(pl);
        pays22.addLangue(pt);
        pays23.addLangue(cz);
        pays24.addLangue(ro);
        pays25.addLangue(sk);
        pays26.addLangue(sl);
        pays27.addLangue(sv);

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

        System.out.println("Affichage proprietes de la Belgique");
        pays3.afficher();

        System.out.println("Affichage proprietes du Lux");
        pays18.afficher();
    }
}