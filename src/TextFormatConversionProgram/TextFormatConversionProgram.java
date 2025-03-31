package TextFormatConversionProgram;

import java.util.Scanner;

public class TextFormatConversionProgram {
    public static void main(String[] args) {
        Scanner oku = new Scanner(System.in);
        System.out.print("Bir Cumle Giriniz: ");
        String ornekCumle = oku.nextLine();

        // Fonksiyonları çağırarak sonuçları yazdırma
        String buyukHarfSonuc = buyukHarfFormati(ornekCumle);
        String kucukHarfSonuc = kucukHarfFormati(ornekCumle);

        System.out.println("\n" + "Orijinal Cümle: " + ornekCumle + "\n");
        System.out.println("Büyük Harf Formatı: " + buyukHarfSonuc + "\n");
        System.out.println("Küçük Harf Formatı: " + kucukHarfSonuc + "\n");
    }

    // büyük harf formati
    public static String buyukHarfFormati(String str) {
        return str.toUpperCase();
    }

    // kucuk harf formati
    public static String kucukHarfFormati(String str) {
        return str.toLowerCase();
    }
}
