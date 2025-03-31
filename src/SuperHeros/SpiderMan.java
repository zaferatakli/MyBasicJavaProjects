package SuperHeros;

public class SpiderMan extends SuperHeroes {
    private String webShootingAbility;
    public SpiderMan(String name, String gender, String aggression, String wisdom, String beauty, String webShootingAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setWebShootingAbility(webShootingAbility);
    }

    public void setWebShootingAbility(String webShootingAbility) {
        this.webShootingAbility = webShootingAbility;
    }

    @Override
    public void attack() {
        System.out.println("Ayrica " + super.getName() + " Ag Atma Becerisi: " + webShootingAbility + " ile saldırabilir ve düşmanlarını etkisiz hale getirebilir.");
        super.attack();
    }

    @Override
    public void exposeSecretPower() {
        System.out.println(super.getName() + ", örümcek ağı püskürtme yeteneğine sahiptir.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Örümcek Adamın Özellikleri\n-------------------------\nÖrümcek ağı püskürtme yeteneği : " + webShootingAbility + "\n**************************************************\n");
    }
}
