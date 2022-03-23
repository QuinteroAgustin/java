package ja53c;

public class Jus extends Boisson{
    private String fruit;
    private int emballage;

    public Jus(String nom, Double contenance){
        super(nom, contenance);
        setFruit("pomme");
        setEmballage(1);
    }

    public Jus(String nom, Double contenance, String fruit){
        super(nom, contenance);
        setFruit(fruit);
        setEmballage(1);
    }

    /**
     * @return String return the fruit
     */
    public String getFruit() {
        return fruit;
    }

    /**
     * @param fruit the fruit to set
     */
    public void setFruit(String fruit) {
        this.fruit = fruit;
    }

    /**
     * @return int return the emballage
     */
    public int getEmballage() {
        return emballage;
    }

    /**
     * @param emballage the emballage to set
     */
    public void setEmballage(int emballage) {
        if(emballage >= 1 && emballage<= 4){
            this.emballage = emballage;
        }else{
            System.out.println("ERREUR : L'emballage est compris entre 1 et 4 : "+emballage);
        }
        
    }

    public String getLibEmballage(){
        if(this.emballage == 1){
            return "bouteille PET";
        }else if(this.emballage == 2){
            return "bouteille verre";
        }else if(this.emballage == 3){
            return "brique";
        }else{
            return "sachet";
        }
    }

    public void afficher(){
        super.afficher();
        System.out.println("fruit       : "+ this.fruit);
        System.out.println("emballage   : "+ getLibEmballage());
    }

}
