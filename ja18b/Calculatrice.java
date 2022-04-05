package ja18b;
import java.util.Scanner;
public class Calculatrice{
    private Double nb1;
    private Double nb2;
    private String operateur;

    public void calculer(){
        Scanner clavier = new Scanner(System.in);
        System.out.println("Nombre 1 ?");
        this.nb1 = clavier.nextDouble();
        System.out.println("Opérateur ?");
        this.operateur = clavier.next();
        System.out.println("Nombre 2 ?");
        this.nb2 = clavier.nextDouble();
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