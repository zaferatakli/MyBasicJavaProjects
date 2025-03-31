package SuperHeros;

public class SuperHeroes {
    private String name;
    private String gender;
    private String aggression;
    private String wisdom;
    private String beauty;

    public SuperHeroes(String name, String gender, String aggression, String wisdom, String beauty) {
        this.aggression = aggression;
        this.gender = gender;
        this.wisdom = wisdom;
        this.beauty = beauty;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printInfo() {
        System.out.println("**************************************************");
        System.out.println("Bilgi\n-------------------------\nİsim = " + name + "\n" +
                "Cinsiyet = " + gender + "\n" +
                "Agresyon = " + aggression + "\n" +
                "Bilgelik = " + wisdom + "\n" +
                "Güzellik = " + beauty);
        System.out.println("**************************************************");
    }

    public void attack() {
        if (gender.equals("kadın"))
            System.out.println("--> Kahraman " + name + ", " + aggression + " agresyon, " + wisdom + " bilgelik ve " + beauty + " güzellik ile saldırıyor.");
        else if (gender.equals("erkek"))
            System.out.println("--> Kahraman " + name + ", " + aggression + " agresyon, " + wisdom + " bilgelik ve " + beauty + " güzellik ile saldırıyor.");
    }

    public void exposeSecretPower() {
        if (gender.equals("kadın")) System.out.println("Bu kahramanın gizli bir gücü yok.");
        else if (gender.equals("erkek")) System.out.println("Bu kahramanın gizli bir gücü yok.");
    }
}
