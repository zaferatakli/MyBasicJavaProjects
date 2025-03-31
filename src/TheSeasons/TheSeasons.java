package TheSeasons;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        /* Project 2 / Task 4 */
        Scanner oku = new Scanner(System.in);
        int ay = 0, gun = 0;
        boolean tarihGecerli = false;
        String mevsim = "";
        System.out.println();

        while (!tarihGecerli) {
            // Ay Girişi
            System.out.print("Ay giriniz (1-12) : ");
            ay = oku.nextInt();

            // Gün Girişi
            System.out.print("Gün giriniz (1-31) : ");
            gun = oku.nextInt();

            // Tarih Kontrolü
            if (ay >= 1 && ay <= 12 && gun <= 31 && gun >= 1)
                tarihGecerli = true;
            else
                System.out.println("\nHATALI veri girdiniz ‼️");
        }

        // Mevsim Belirleme
        if ((ay == 3 && gun >= 20) || ay == 4 || ay == 5 || (ay == 6 && gun <= 20)) {
            mevsim = "İLKBAHAR 🌺";
        } else if ((ay == 6 && gun > 21) || ay == 7 || ay == 8 || (ay == 9 && gun <= 21)) {
            mevsim = "YAZ 🌞";
        } else if ((ay == 9 && gun > 22) || ay == 10 || ay == 11 || (ay == 12 && gun <= 20)) {
            mevsim = "SONBAHAR 🍂";
        } else
            mevsim = "KIŞ ❄️";
        System.out.println("\nBulunduğumuz mevsim " + mevsim);

        oku.close();
    }
}
