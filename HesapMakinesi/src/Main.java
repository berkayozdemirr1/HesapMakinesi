import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int s1, s2, islem;

        Scanner secim = new Scanner(System.in);

        System.out.print("Ilk sayiyi giriniz: ");
        s1 = secim.nextInt();

        System.out.print("Ikinci sayiyi giriniz: ");
        s2 = secim.nextInt();

        System.out.println("Toplama=1\nCikarma=2\nCarpma=3\nBolme=4");
        System.out.print("Seciminiz: ");
        islem = secim.nextInt();

        switch (islem) {
            case 1:
                System.out.println("Sonuc: " + (s1 + s2));
                break;
            case 2:
                System.out.println("Sonuc: " + (s1 - s2));
                break;
            case 3:
                System.out.println("Sonuc: " + (s1 * s2));
                break;
            case 4:
                if (s2 == 0) {
                    System.out.println("Sifira bolunemez.");
                } else if (s1 == 0) {
                    System.out.println("Sonuc: 0");
                } else {
                    System.out.println("Sonuc: " + (s1 / s2));
                }
                break;

            default:
                System.out.println("Sonuc: Lutfen yukaridaki islemlerden birini secin. ");
        }

    }

}