package com.company;

import java.util.Scanner;

public class Main {
    /**
     * JAVA DOCUMAN
     * Test sınıfı kendi oluşturduğumuz linked list yapısına ders ekleme, çıkarma, bir sonraki dersi gösterme
     * Ders sayısını gösterme, aynı dönemdeki dersleri sıralı veya komple gösterme, kodu verilen dersi gösterme
     * verilen indexler arası dersleri gösterme, circle list yapısı ile olşturulan dersleri gösterme
     * ve ders görünürlüğünü kapama veya etkinleştirme gibi fonksiyonları test etmemizi ve görüntülememizi
     * sağlayan sınıftır switch case yapısı ve çeşitli if blokları ile oluşturduğum sınıftır.
     *  @author EMİR MUHAMMET AYDEMİR
     *  @since 26.03.2021
     */

    public static void main(String[] args) throws InterruptedException {
        System.out.println("CİRCLE LİST YAPISI İÇİN 12 NUMARALI SEÇENEĞİ DENEYİNİZ 4 NUMARALI SEÇENEK CİRCLE YAPISI DEĞİLDİR!!!!!");
        Thread.sleep(3000);
        int key=-1;
        List1 l1=new List1();
        List2 l2=new List2();
        Scanner secim=new Scanner(System.in);
        System.out.println("Sisteme hoşgeldiniz circle list yapısını kullanmak için 12 numaralı seçeneği kullanınız diğer seçenekler standar linked list yapısına aittir");
        System.out.println("1- Ders ekle\n2- Ders sil\n3- Liste öğelerini sırasıyla göster\n4- Aynı sömestrdaki liste öğelerini sırayla göster(Normal liste ile)\n5- Listenin boyutunu göster\n6- Ders kodu verilen tüm dersleri döndür\n7- verilen sömestrdaki tüm dersleri döndür\n8- Verilen indexler arasındaki tüm dersleri döndür\n9- Disable\n10- Enable\n11- Show Disable\n12-Aynı sömestrdaki liste öğelerini sırayla göster(Circle liste ile Bu birinci listeden bağımsız sadece test amaçlı kullanılmalıdır listeye yeni ders ekleyip deneyecekseniz 4 numaralı işlemi kullanınız)\n0- Çıkış");
        dersEkle(l1,l2);
        while (key!=0){
            System.out.println("1- Ders ekle 2- Ders sil 3- Liste öğelerini sırasıyla göster 4- Aynı sömestrdaki liste öğelerini sırayla göster(Normal liste ile) 5- Listenin boyutunu göster 6- Ders kodu verilen tüm dersleri döndür 7- verilen sömestrdaki tüm dersleri döndür 8- Verilen indexler arasındaki tüm dersleri döndür 9- Disable 10- Enable 11- Show Disable 12-Aynı sömestrdaki liste öğelerini sırayla göster(Circle liste ile Bu birinci listeden bağımsız sadece test amaçlı kullanılmalıdır listeye yeni ders ekleyip deneyecekseniz 4 numaralı işlemi kullanınız) 0- Çıkış");
            System.out.println("Seçim yapınız: ");
            key=secim.nextInt();
            switch (key){
                case 1:
                    l1.add(new Dersler());
                    System.out.println("Ders ekleme işlemi başarılı...");
                    Thread.sleep(1000);
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 2:
                    System.out.println("Silinecek dersin kodunu giriniz");
                    String derskodu= secim.next();
                    boolean visible=l1.visiblecheck(derskodu);
                    if(visible){
                        boolean state=l1.remove(derskodu);
                        if(state){
                            System.out.println(" Silme işlemi başarılı");
                            Thread.sleep(1000);
                        }
                        else {
                            System.out.println("Ders bulunamadı (Silme işlemi başarısız)");
                            Thread.sleep(1000);
                        }
                    }
                    else {
                        System.out.println("Erişilebilirlik kapalıdır bu işlemi gerçekleştiremezsiniz");
                        Thread.sleep(1000);
                    }
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 3:
                    l1.next();
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 4:
                    System.out.println("Hangi yarıyılın derslerini sırasıyla görmek istiyorsanız yarıyılı giriniz (1-8 arasında) Bu yapı normal listeye aittir circle list yapısı için lütfen 12 numaralı işlemi deneyiniz!!!!");
                    int semester=secim.nextInt();
                    l1.NextInSemester(semester);
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 5:
                    int size=l1.size();
                    System.out.println("Listenin boyutu= "+size);
                    Thread.sleep(1000);
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 6:
                    System.out.println("Görmek istediğiniz derslerin ders kodunu giriniz");
                    String code=secim.next();
                    l1.getByCode(code);
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 7:
                    System.out.println("Hangi yarıyılın tüm derslerini görmek istiyorsunuz (1-8 arasında)");
                    int sem=secim.nextInt();
                    l1.listSemesterCourses(sem);
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 8:
                    int boyut=l1.size();
                    System.out.println("Listenin boyutu: "+boyut+" boyuta göre ilk ve son değer gir");
                    System.out.println("Başlangıç indisini gir");
                    int first=secim.nextInt();
                    System.out.println("Bitiş indisini gir");
                    int last=secim.nextInt();
                    l1.getByRange(first,last);
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 9:
                    System.out.println("Erişime kapatacağınız ders ismini giriniz");
                    String name=secim.next();
                    l1.Disable(name);
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 10:
                    System.out.println("Erişime açacağınız ders ismini giriniz");
                    String name2=secim.next();
                    l1.Enable(name2);
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 11:
                    l1.showDisabled();
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 12:
                    System.out.println("Part-3 Hangi yarıyılın derslerini sırasıyla görmek istiyorsanız yarıyılı giriniz (1-8 arasında)");
                    int semester2=secim.nextInt();
                    l2.save();
                    l2.NextInSemester(semester2);
                    break;
                    ////////////////////////////////////////////////////////////////////////////////////////
                case 0:
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
            }
        }

    }

    /**
     * Ders listelerinin oluşturulması için kullanılan fonksiyondur
     * @param l1 standart linked listimizdir
     * @param l2 circle linked listimizdir
     */
    public static void dersEkle(List1 l1,List2 l2){
        l1.add(new Dersler("BilgisayarMuhendisligineGiris",2,1,4,"BLM1001"));
        l1.add(new Dersler("Fizik1",4,1,4,"FZK1071"));
        l1.add(new Dersler("Kimya",4,1,4,"KMY1020"));
        l1.add(new Dersler("Matematik1",5,1,5,"MAT1085"));
        l1.add(new Dersler("LineerCebir",3,1,5,"MAT1087"));
        l1.add(new Dersler("TurkDili1",2,1,2,"TRD121"));
        l1.add(new Dersler("YabanciDil1",2,1,2,"YDZx121"));
        l1.add(new Dersler("AlgoritmaVeProgramlamayaGiris",2,1,4,"BLM1003"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l1.add(new Dersler("BilgisayarProgramlama1",4,2,6,"BLM1002"));
        l1.add(new Dersler("BilgisayarDonanimi",4,2,6,"BLM1004"));
        l1.add(new Dersler("Fizik2",4,2,4,"FZK1072"));
        l1.add(new Dersler("Matematik2",5,2,5,"MAT1086"));
        l1.add(new Dersler("IsSagligiVeGuvenligi",2,2,3,"ISG1081"));
        l1.add(new Dersler("YabanciDil2",2,2,2,"YDZx122"));
        l1.add(new Dersler("BilimselArastirmaVeSunumTeknikleri",2,2,2,"TF2010"));
        l1.add(new Dersler("TurkDili2",2,2,2,"TRD122"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l1.add(new Dersler("BilgisayarProgramlama2",4,3,7,"BLM2001"));
        l1.add(new Dersler("InsanBilgisayarEtkilesimiVeGorsellik",2,3,4,"BLM2003"));
        l1.add(new Dersler("MantikDevreleri",4,3,5,"BLM2007"));
        l1.add(new Dersler("NesneYonelimliProgramlama",4,3,6,"BLM2005"));
        l1.add(new Dersler("AyrikMatematik",2,3,3,"MAT2019"));
        l1.add(new Dersler("DiferansiyelDenklemler",3,3,5,"MAT2085"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l1.add(new Dersler("VeriYapilariVeAlgoritmalar",4,4,5,"BLM2002"));
        l1.add(new Dersler("MuhendislerIcinIstatistik",2,4,3,"IST3045"));
        l1.add(new Dersler("BilgisayarAglarinaGiris",4,4,5,"BLM2006"));
        l1.add(new Dersler("Mikroislemciler",4,4,6,"BLM2008"));
        l1.add(new Dersler("ElektronikDevrelereGiris",4,4,6,"BLM2010"));
        l1.add(new Dersler("Sayisalanaliz",3,4,5,"MAT2086"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l1.add(new Dersler("Staj1",4,5,4,"BLM3000"));
        l1.add(new Dersler("VeritabaniYonetimIslemleri",4,5,5,"BLM3001"));
        l1.add(new Dersler("IsletimSistemleri",4,5,5,"BLM3003"));
        l1.add(new Dersler("Mikrodenetleyiciler",4,5,5,"BLM3007"));
        l1.add(new Dersler("SinyallerVeSistemlereGiris",2,5,3,"BLM3005"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l1.add(new Dersler("BilgisayarOrganizasyonuVeMimarisi",2,6,5,"BLM3000"));
        l1.add(new Dersler("WebProgramlama",4,6,4,"BLM3001"));
        l1.add(new Dersler("SistemProgramlama",4,6,5,"BLM3003"));
        l1.add(new Dersler("YazilimMuhendisligi",2,6,4,"BLM3008"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l1.add(new Dersler("Staj2",4,7,4,"BLM4000"));
        l1.add(new Dersler("IsYeriEgitim",25,7,28,"BLM4001"));
        l1.add(new Dersler("AtaturkIlkeVeInkilapTarihi1",2,7,2,"ATA121"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l1.add(new Dersler("SistemVeSunucuYonetimi",4,8,5,"BLM4002"));
        l1.add(new Dersler("BitirmeProjesi",2,8,4,"BLM4098"));
        l1.add(new Dersler("AtaturkIlkeVeInkilapTarihi2",2,8,2,"ATA122"));
        l1.add(new Dersler("TeknikIngilizce",3,8,4,"YDI2025"));
        //////////////////////////////////////////////////////////////////////////////////////////////

        l2.add(new Dersler("BilgisayarMuhendisligineGiris",2,1,4,"BLM1001"));
        l2.add(new Dersler("Fizik1",4,1,4,"FZK1071"));
        l2.add(new Dersler("Kimya",4,1,4,"KMY1020"));
        l2.add(new Dersler("Matematik1",5,1,5,"MAT1085"));
        l2.add(new Dersler("LineerCebir",3,1,5,"MAT1087"));
        l2.add(new Dersler("TurkDili1",2,1,2,"TRD121"));
        l2.add(new Dersler("YabanciDil1",2,1,2,"YDZx121"));
        l2.add(new Dersler("AlgoritmaVeProgramlamayaGiris",2,1,4,"BLM1003"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l2.add(new Dersler("BilgisayarProgramlama1",4,2,6,"BLM1002"));
        l2.add(new Dersler("BilgisayarDonanimi",4,2,6,"BLM1004"));
        l2.add(new Dersler("Fizik2",4,2,4,"FZK1072"));
        l2.add(new Dersler("Matematik2",5,2,5,"MAT1086"));
        l2.add(new Dersler("IsSagligiVeGuvenligi",2,2,3,"ISG1081"));
        l2.add(new Dersler("YabanciDil2",2,2,2,"YDZx122"));
        l2.add(new Dersler("BilimselArastirmaVeSunumTeknikleri",2,2,2,"TF2010"));
        l2.add(new Dersler("TurkDili2",2,2,2,"TRD122"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l2.add(new Dersler("BilgisayarProgramlama2",4,3,7,"BLM2001"));
        l2.add(new Dersler("InsanBilgisayarEtkilesimiVeGorsellik",2,3,4,"BLM2003"));
        l2.add(new Dersler("MantikDevreleri",4,3,5,"BLM2007"));
        l2.add(new Dersler("NesneYonelimliProgramlama",4,3,6,"BLM2005"));
        l2.add(new Dersler("AyrikMatematik",2,3,3,"MAT2019"));
        l2.add(new Dersler("DiferansiyelDenklemler",3,3,5,"MAT2085"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l2.add(new Dersler("VeriYapilariVeAlgoritmalar",4,4,5,"BLM2002"));
        l2.add(new Dersler("MuhendislerIcinIstatistik",2,4,3,"IST3045"));
        l2.add(new Dersler("BilgisayarAglarinaGiris",4,4,5,"BLM2006"));
        l2.add(new Dersler("Mikroislemciler",4,4,6,"BLM2008"));
        l2.add(new Dersler("ElektronikDevrelereGiris",4,4,6,"BLM2010"));
        l2.add(new Dersler("Sayisalanaliz",3,4,5,"MAT2086"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l2.add(new Dersler("Staj1",4,5,4,"BLM3000"));
        l2.add(new Dersler("VeritabaniYonetimIslemleri",4,5,5,"BLM3001"));
        l2.add(new Dersler("IsletimSistemleri",4,5,5,"BLM3003"));
        l2.add(new Dersler("Mikrodenetleyiciler",4,5,5,"BLM3007"));
        l2.add(new Dersler("SinyallerVeSistemlereGiris",2,5,3,"BLM3005"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l2.add(new Dersler("BilgisayarOrganizasyonuVeMimarisi",2,6,5,"BLM3000"));
        l2.add(new Dersler("WebProgramlama",4,6,4,"BLM3001"));
        l2.add(new Dersler("SistemProgramlama",4,6,5,"BLM3003"));
        l2.add(new Dersler("YazilimMuhendisligi",2,6,4,"BLM3008"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l2.add(new Dersler("Staj2",4,7,4,"BLM4000"));
        l2.add(new Dersler("IsYeriEgitim",25,7,28,"BLM4001"));
        l2.add(new Dersler("AtaturkIlkeVeInkilapTarihi1",2,7,2,"ATA121"));
        ////////////////////////////////////////////////////////////////////////////////////////////////
        l2.add(new Dersler("SistemVeSunucuYonetimi",4,8,5,"BLM4002"));
        l2.add(new Dersler("BitirmeProjesi",2,8,4,"BLM4098"));
        l2.add(new Dersler("AtaturkIlkeVeInkilapTarihi2",2,8,2,"ATA122"));
        l2.add(new Dersler("TeknikIngilizce",3,8,4,"YDI2025"));
    }

}
