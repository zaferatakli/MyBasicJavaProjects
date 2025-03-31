package SuperHeros;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> activeHeroes = new ArrayList<>();
        List<String> allHeroes = new ArrayList<>();
        HeroFactory heroFactory=new HeroFactory();

        allHeroes.add(heroFactory.produceSuperHero("Superman").getName());
        allHeroes.add(heroFactory.produceSuperHero("WonderWoman").getName());
        allHeroes.add(heroFactory.produceSuperHero("Wolverine").getName());
        allHeroes.add(heroFactory.produceSuperHero("SpiderMan").getName());
        allHeroes.add(heroFactory.produceSuperHero("Batman").getName());
        System.out.println("\nSüper Kahramanlar gösterisine hoş geldiniz...");
        System.out.println("Mevcut Süper Kahramanlar: " + allHeroes);
        while (true) {
            System.out.println("\nÇıkmak için q'ya basın...");
            System.out.print("Hangi süper kahramanı eklemek istiyorsunuz?\n--> ");
            String hero = scanner.nextLine().trim();
            if (hero.equalsIgnoreCase("q")) {
                System.out.println("Süper kahraman dünyasından çıkış yaptınız. Görüşmek üzere...");
                break;
            }
            if (allHeroes.contains(hero) && !activeHeroes.contains(hero)) {
                activeHeroes.add(hero);
                System.out.println("Oyunda aktif olan kahramanlar: " + activeHeroes);
                System.out.println(hero + " oyuna başarıyla eklendi.");
                heroFactory = new HeroFactory();
                heroFactory.produceSuperHero(hero).printInfo();
                heroFactory.produceSuperHero(hero).attack();
                heroFactory.produceSuperHero(hero).exposeSecretPower();
                System.out.println("\nOyuna girmemiş tüm kahramanlar: " + getRemainingHeroes(allHeroes, activeHeroes));
            } else if (activeHeroes.contains(hero)) {
                System.out.println(hero + " zaten oyunda aktif!");
            } else {
                System.out.println("Lütfen geçerli bir süper kahraman girin...");
            }
        }
    }

    private static List<String> getRemainingHeroes(List<String> allHeroes, List<String> activeHeroes) {
        List<String> remainingHeroes = new ArrayList<>(allHeroes);
        remainingHeroes.removeAll(activeHeroes);
        return remainingHeroes;
    }
}
