package PatikaProjeler;

import java.util.Scanner;

public class NotOrtHProgram {
    public static void main(String[] args) {

        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner oku=new Scanner(System.in);
        System.out.print("Matematik notunuzu giriniz= ");
        mat=oku.nextInt();

        System.out.print("Fizik notunuzu giriniz= ");
        fizik=oku.nextInt();

        System.out.print("Kimya notunuzu giriniz= ");
        kimya=oku.nextInt();

        System.out.print("Türkçe notunuzu giriniz= ");
        turkce=oku.nextInt();

        System.out.print("Tarih notunuzu giriniz= ");
        tarih=oku.nextInt();

        System.out.print("Müzik notunuzu giriniz= ");
        muzik=oku.nextInt();

        int toplam = (mat+fizik+kimya+turkce+tarih+muzik);
        double ort=toplam/6;
        String sonuc= ort>=60 ? "Sınıfı Geçtiniz..." : "Sınıfta Kaldınız...";

        System.out.println("Not ortalamanız= " + ort);
        System.out.println(sonuc);



    }
}
