package SuperMarket;

import java.util.Scanner;

public class SuperMarket {
    public static void main(String[] args) {
        Scanner inputInt = new Scanner(System.in);
        String[] urunler = {"🍎 Elma  ", "🍞 Ekmek ", "🥛 Sut   ", "🍚 Pirinc"};
        double[] fiyatlar = {14.5, 10.5, 15.5, 11.5};
        int[] stok = {100, 200, 50, 40};

        System.out.println("--------------------------------------------------------\nTeam 04 🚀 Marketine ༘˚⋆\uD83D\uDECD\uFE0F ｡⋆ \uD83D\uDED2 ⋆ \uD81A\uDDB9.✧˚ Hosgeldiniz! \uD83D\uDC4B\n--------------------------------------------------------");
        boolean devamMi = true;
        double toplam = 0.0;
        String alisverisOzeti = "";
        int secilenUrun, miktar, karar, cevap;

        while (devamMi) { // STOK KONTROLÜ ❓
            boolean stokVarMi = false;
            for (int i = 0; i < stok.length; i++) {
                if (stok[i] > 0) {
                    stokVarMi = true;
                    break;
                }
            }

            // STOK KONTROLÜ ❓
            if (!stokVarMi) {
                System.out.println("\nTüm ürünlerin stoğu tükenmiştir.☹️ Alışveriş sona erdiriliyor...\n");
                break;
            }

            // ÜRÜN LİSTESİ ℹ️
            System.out.println("\n🛒 Alışveriş Yapabileceğiniz Ürünlerimiz 🛒");
            System.out.println("--------------------------------------------");
            for (int i = 0; i < urunler.length; i++) {
                System.out.println((i + 1) + ". Urun: " + urunler[i] + " Fiyat: " + fiyatlar[i] + "₺ Stok: " + stok[i]);
            }
            // ÜRÜN SEÇİMİ ✅
            System.out.print("\nHangi urunu satin almak isterseniz? (1-4) : ");
            secilenUrun = inputInt.nextInt() - 1;

            // GİRİŞ KONTROLÜ ❓
            if (secilenUrun < 0 || secilenUrun >= urunler.length) {
                System.out.println("\nHatali numara girisi yaptiniz ‼️\nLutfen tekrar deneyiniz.");
                continue;
            }

            // STOK KONTROLÜ ❓
            if (stok[secilenUrun] == 0) {
                System.out.println("\nSecilen urun stoklarda kalmadi.");
                System.out.println("Lutfen baska bir urun secimi yapiniz.");
                continue;
            }

            // MİKTAR BELİRLEME❓
            System.out.println("\nSecilen urun: " + urunler[secilenUrun]);
            System.out.print("\nAlmak istediginiz miktari giriniz : ");
            miktar = inputInt.nextInt();

            // MIKTAR KONTROLÜ ❓
            if (miktar <= 0) {
                System.out.println("Lütfen geçerli bir miktar giriniz.");
                continue;
            }

            // STOK KONTROLÜ ❓
            if (stok[secilenUrun] < miktar) {
                System.out.println("\nStok yetersiz ‼️ Stokta sadece " + stok[secilenUrun] + " adet mevcut.\n");
                System.out.print("Stoktaki adetlerin tamamini almak istiyorsanız 1'e, iptal için 0'a basın: ");
                karar = inputInt.nextInt();
                if (karar != 1 && karar != 0) {
                    System.out.println("Hatali giris yaptiniz. Lutfen tekrar deneyiniz!");
                }
                if (karar == 1) {
                    miktar = stok[secilenUrun];
                } else {
                    miktar = 0;
                    continue;
                }
            }

            // ALINAN ÜRÜN İÇİN BİLGİLENDİRME ℹ️
            stok[secilenUrun] -= miktar;
            if (miktar > 0) {
                alisverisOzeti += urunler[secilenUrun] + " - " + miktar + " adet \n";
                toplam += fiyatlar[secilenUrun] * miktar;
                System.out.println("\n" + "Alinan urun   : " + urunler[secilenUrun] + "\nAlinan miktar : " + miktar + " adet " + "\nTutar         : " + fiyatlar[secilenUrun] * miktar + " ₺");
            } else {
                System.out.println("Secilen urun stokta kalmadigi icin alinamadi ‼️");
            }

            // MÜŞTERİYE ALIŞVERİŞE DEVAM MI TAMAM MI İSTENMESİ ❓
            System.out.print("\nAlisveris devam etmek istiyor musunuz? (Evet=1 / Hayir=0) : ");
            cevap = inputInt.nextInt();
            if (cevap != 1 && cevap != 0) {
                System.out.println("Gecersiz cevap! Alisveris sonlandiriliyor...");
                devamMi = false;
            } else if (cevap == 0) {
                devamMi = false;
            }
        }
        // ALISVERIS OZETI 📃
        System.out.println("\nAlisveris Özeti:");
        System.out.println("-----------------");
        if (alisverisOzeti.isEmpty()) {
            System.out.println("Hiçbir ürün alınmadı.");
        } else {
            System.out.println(alisverisOzeti);
        }
        System.out.println("------------------------");
        System.out.println("Toplam Fiyat : " + toplam + " TL\n");
        System.out.println("Alisverisden cikiliyor 👋\n \nTeam 04 🚀 Market ༘˚⋆\uD83D\uDECD\uFE0F ｡⋆ \uD83D\uDED2 ⋆ \uD81A\uDDB9.✧˚\nİYİ GÜNLER DİLER \uD83D\uDC4B");
        System.out.println("YINE BEKLERIZ...");
        inputInt.close();

    }
}
