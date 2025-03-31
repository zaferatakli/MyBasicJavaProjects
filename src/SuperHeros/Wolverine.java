package SuperHeros;

public class Wolverine extends SuperHeroes {
    private String adamantiumClaws;

    public Wolverine(String name, String gender, String aggression, String wisdom, String beauty, String adamantiumClaws) {
        super(name, gender, aggression, wisdom, beauty);
        setAdamantiumClaws(adamantiumClaws);
    }

    public void setAdamantiumClaws(String adamantiumClaws) {
        this.adamantiumClaws = adamantiumClaws;
    }

    @Override
    public void attack() {
        super.attack();
        System.out.println("Ayrıca " + super.getName() + " Adamantium Pençeleri: " + adamantiumClaws + " ile saldırabilir ve düşmanlarını etkisiz hale getirebilir.");
    }

    @Override
    public void exposeSecretPower() {
        super.exposeSecretPower();
        System.out.println(super.getName() + ", " + adamantiumClaws + ", Pençelere sahiptir ve bu penceler ile her turlu maddeyi kesip parcalayabilir.");
    }

    @Override
    public void printInfo() {
        super.printInfo();
        System.out.println("Wolverine Özellikleri\n-------------------------\n" + "Adamantium Pençeleri   : " + adamantiumClaws + "\n**************************************************\n");
    }
}

