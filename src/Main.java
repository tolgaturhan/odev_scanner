import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Değişkenleri oluştur
        int matematik,fizik,kimya,turkce,tarih,muzik;

        // Scanner oluştur
        Scanner input = new Scanner(System.in);

        // Kullanıcıdan değerleri al
        System.out.print("Matematik Notunuz: ");
        matematik = input.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = input.nextInt();

        System.out.print("Tarih Notunuz: ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = input.nextInt();

        // Sonuç değeri tanımla
        int toplam = matematik + fizik + kimya + turkce + tarih + muzik;
        double sonuc = toplam / 6.0;
        System.out.println("Derslerinizin Ortalaması: " + sonuc);

        boolean durum = true;

        durum = sonuc >= 60;

        System.out.println(durum ? "Sınıfı Geçtiniz..." : "Sınıfta Kaldınız...");


    }
}
