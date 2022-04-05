package ja18b;

public class Calculatrice{
    private Double nb1;
    private Double nb2;
    private String operateur;

    public Calculatrice(Double nb1, Double nb2, String operateur){
        this.nb1 = nb1;
        this.nb2 = nb2;
        this.operateur = operateur;
    }

    public void calculer(){
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