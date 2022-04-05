package ja18;

import java.util.Scanner;

public class ja18 {
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
        if(operateur.equals("+")){
            System.out.println(nb1+"+"+nb2+"="+(nb1+nb2));
        }else if(operateur.equals("-")){
            System.out.println(nb1+"-"+nb2+"="+(nb1-nb2));
        }else if(operateur.equals("*")){
            System.out.println(nb1+"*"+nb2+"="+(nb1*nb2));
        }else if(operateur.equals("/")){
            if(nb2==0){
                System.out.println("Erreur division par zéro impossible");
            }else{
                System.out.println(nb1+"/"+nb2+"="+(nb1/nb2));
            }
        }else{
            System.out.println(nb1+""+operateur+""+nb2+"=0");
            System.out.println("ERREUR, opérateur inconu : "+operateur);
        }
    }
}
