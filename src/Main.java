import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan bir sayı girişi al
        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        if (sayi <= 1) {
            System.out.println(sayi + " Mükemmel sayı değildir.");
        } else {
            int toplam = 1;

            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    toplam += i;
                }
            }

            if (toplam == sayi) {
                System.out.println(sayi + " Mükemmel sayıdır.");
            } else {
                System.out.println(sayi + " Mükemmel sayı değildir.");
            }
        }

    }
}
