package SuperHeros;

public class WonderWoman extends SuperHeroes {
    private String lassoOfTruthAbility;

    public WonderWoman(String name, String gender, String aggression, String wisdom, String beauty, String lassoOfTruthAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setLassoOfTruthAbility(lassoOfTruthAbility);
    }
    public void setLassoOfTruthAbility(String lassoOfTruthAbility) {
        this.lassoOfTruthAbility = lassoOfTruthAbility;
    }
    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca " + super.getName() + " Gercegin kementi yeteneği: " + lassoOfTruthAbility + " ile saldırabilir ve düşmanlarını etkisiz hale getirebilir.");
    }
    @Override
    public void exposeSecretPower() {
        System.out.println("Ayrica " + super.getName() + ", dogrulugu soylemeye zorlayan " + lassoOfTruthAbility + " gerçeğin kementi yeteneğine sahiptir.");
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("WonderWoman Özellikleri\n-------------------------\n" + "Gercegin kementi yeteneği   : " + lassoOfTruthAbility + "\n**************************************************\n");
    }
}
