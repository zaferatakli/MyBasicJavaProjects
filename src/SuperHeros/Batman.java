package SuperHeros;

public class Batman extends SuperHeroes {
    private String detectiveSkillsAbility;
    public Batman(String name, String gender, String aggression, String wisdom, String beauty, String detectiveSkillsAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setDetectiveSkillsAbility(detectiveSkillsAbility);
    }
    public void setDetectiveSkillsAbility(String detectiveSkillsAbility) {
        this.detectiveSkillsAbility = detectiveSkillsAbility;
    }
    @Override
    public void attack() {
        System.out.println("Ayrıca " + super.getName() + " Dedektiflik yeteneği: " + detectiveSkillsAbility + " ile rahatlikla dusmanlarini bulabilir ve etkisiz hale getirebilir.");
        super.attack();
    }
    @Override
    public void exposeSecretPower() {
        System.out.println(super.getName() + ", dedektiflik yeteneğine sahiptir.");
    }
    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Batmanın Özellikleri\n-------------------------\n" + "Dedektiflik yeteneği   : " + detectiveSkillsAbility + "\n**************************************************\n");
    }
}
