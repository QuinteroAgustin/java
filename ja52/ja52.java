package ja52;

import java.util.ArrayList;

public class ja52 {
    public static void main(String[] args) {
        Film terminator1 = new Film("The Terminator", "James Cameron", 1984);
        Film terminator2 = new Film("Terminator 2: Judgment Day", "James Cameron", 1991);
        Film terminator3 = new Film("Terminator 3: Rise of the Machines", "Jonathan Mostow", 2003);
        Film terminator4 = new Film("Terminator Salvation", "Joseph McGinty Nichol", 2009);
        Film terminator5 = new Film("Terminator Genisys", "Alan Taylor", 2015);
        Film terminator6 = new Film("Terminator: Dark Fate", "Tim Miller", 2019);

        System.out.println("---- Contenu 1 film ----");
        terminator1.afficher();
        System.out.println("---- Lib des 3 premiers films ----");
        System.out.println(terminator1.getLibelle());
        System.out.println(terminator2.getLibelle());
        System.out.println(terminator3.getLibelle());
        System.out.println("---- Contenu de la collection ----");

        ArrayList<Film> Films = new ArrayList<Film>();
        Films.add(terminator1);
        Films.add(terminator2);
        Films.add(terminator3);
        Films.add(terminator4);
        Films.add(terminator5);
        Films.add(terminator6);

        for(Film film : Films){
            System.out.println(film.getLibelle());
        }
        System.out.println("Nombre de films :"+Films.size());
    }
}