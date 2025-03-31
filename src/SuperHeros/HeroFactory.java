package SuperHeros;

public class HeroFactory {
     // TODO BU CLASS'TA BİR DEĞİŞİKLİK YAPMANIZA GEREK YOK
    public SuperHeroes produceSuperHero(String superHero) {
        if (superHero.equalsIgnoreCase("Superman")) {
            return new Superman("Superman", "erkek", "1000", "800", "900", "Supersonic Flight");
        } else if (superHero.equalsIgnoreCase("WonderWoman")) {
            return new WonderWoman("WonderWoman", "kadın", "800", "1000", "950", "Golden Lasso");
        } else if (superHero.equalsIgnoreCase("SpiderMan")) {
            return new SpiderMan("SpiderMan", "erkek", "700", "750", "800", "Web Shooting");
        } else if (superHero.equalsIgnoreCase("Batman")) {
            return new Batman("Batman", "erkek", "900", "950", "850", "Detective Skills");
        } else if (superHero.equalsIgnoreCase("Wolverine")) {
            return new Wolverine("Wolverine", "erkek", "950", "700", "800", "Adamantium Claws");
        } else {
            return null;
        }
    }
}

