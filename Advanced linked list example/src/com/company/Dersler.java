package com.company;

import java.util.Scanner;

/**
 *JAVA DOCUMAN
 * Bu sınıf derslerin isim, saat, somestr, kredi ve kod bilgilerinin tutulduğu sınıftır. Bir ders nesnesi oluşturmamızı sağlar
 * ve bu ders nesnelerini List isimli sınıfımız sayeside depolayacağız. Kısacası ders bilgilerini tutmamızı sağlayan sınıftır.
 * @author EMİR MUHAMMET AYDEMİR
 * @since 26.03.2021
 */
public class Dersler {
    /**
     * Ders isminin tutulduğu değişkendir
     */
    private String isim=new String();
    /**
     * Ders saat bilgisinin tutulduğu değişkendir
     */
    private int saat;
    /**
     * Ders somestr bilgisinin tutulduğu değişkendir
     */
    private int somestr;
    /**
     * Ders kredi bilgisinin tutulduğu değişkendir
     */
    private int kredi;
    /**
     * Ders kod bilgisinin tutulduğu değişkendir
     */
    private String kod=new String();
    Scanner scanner=new Scanner(System.in);

    /**
     * Yeni bir ders eklerken kullandığımız parametresiz constructordur. Bu constructoru kullanıcı kendisi ders
     * eklerken kullanırız ve constructor içinde gerekli bilgiler kullanıcıdan alınacaktır.
     */
    public Dersler() {
        System.out.println("Dersin adını giriniz");
        this.isim = scanner.next();
        System.out.println("Dersin saatini giriniz");
        this.saat = scanner.nextInt();
        System.out.println("Dersin dönemini giriniz");
        this.somestr = scanner.nextInt();
        System.out.println("Dersin kredisini giriniz");
        this.kredi =scanner.nextInt();
        System.out.println("Dersin kodunu giriniz");
        this.kod = scanner.next();
    }

    /**
     * Bu constructor ise kullanıcı tarafından girilmeyen hali hazırda girili olan dersler için kullanılır
     * Gerekli bilgiler constructora yollanır ve ders nesnesi oluşturulur.
     * @param isim  Dersin isminin olduğu parametredir
     * @param saat   Dersin saatinin olduğu parametredir
     * @param somestr  Dersin dönem bilgisinin olduğu parametredir
     * @param kredi    Dersin kredi bilgisinin olduğu parametredir
     * @param kod      Dersin kodunun olduğu parametredir
     */

    public Dersler(String isim, int saat, int somestr, int kredi, String kod) {
        this.isim = isim;
        this.saat = saat;
        this.somestr = somestr;
        this.kredi = kredi;
        this.kod = kod;
    }

    /**
     *
     * @return dersin dönem bilgisine döndüren fonksiyondur
     */

    public int getSomestr() {
        return somestr;
    }

    /**
     *
     * @param somestr Dersin dönem bilgisini göncellememizi sağlayan fonksşyondur.
     */

    public void setSomestr(int somestr) {
        this.somestr = somestr;
    }

    /**
     *
     * @return Dersin kredi bilgisini döndüren fonksiyondur
     */

    public int getKredi() {
        return kredi;
    }

    /**
     *
     * @param kredi Dersin kredi bilgisini güncellememizi sağlanayn fonksiyondur
     */

    public void setKredi(int kredi) {
        this.kredi = kredi;
    }

    /**
     *
     * @return Dersin kod bilgisini döndüren fonksiyondur
     */

    public String getKod() {
        return kod;
    }

    /**
     *
     * @param kod Dersin kod bilgisini güncellememizi sağlayan fonksiyondur
     */

    public void setKod(String kod) {
        this.kod = kod;
    }

    /**
     *
     * @return Dersin isim bilgisini döndüren fonksiyondur
     */

    public String getIsim() {
        return isim;
    }

    /**
     * D
     * @param isim Dersin isim bilgisini güncellememizi sağlayan fonksiyondur
     */

    public void setIsim(String isim) {
        this.isim = isim;
    }

    /**
     *
     * @return Dersin saat bilgisini döndüren fonksiyondur
     */

    public int getSaat() {
        return saat;
    }

    /**
     *
     * @param saat Dersin saat bilgisini güncellememizi sağlayan fonksiyondur
     */

    public void setSaat(int saat) {
        this.saat = saat;
    }
}

