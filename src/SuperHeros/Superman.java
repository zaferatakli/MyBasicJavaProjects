package SuperHeros;

public class Superman extends SuperHeroes {
    private String flyingAbility;

    public Superman(String name, String gender, String aggression, String wisdom, String beauty, String flyingAbility) {
        super(name, gender, aggression, wisdom, beauty);
        setFlyingAbility(flyingAbility);
    }

    public void setFlyingAbility(String flyingAbility) {
        this.flyingAbility = flyingAbility;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca " + super.getName() + " Uçma yeteneği ile " + flyingAbility + " guclu saldirilar yapabilir.");
    }

    @Override
    public void exposeSecretPower() {
        System.out.println(super.getName() + ", " + flyingAbility + ", hizinda uçma yeteneğine sahiptir.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Superman Özellikleri\n-------------------------\n" + "Uçma yeteneği   : " + flyingAbility + "\n**************************************************\n");
    }
}
