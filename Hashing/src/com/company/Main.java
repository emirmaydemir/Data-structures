package com.company;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {
	String isim ,tel;
	int choose=1;
	ALinkedList aLinkedList=new ALinkedList();
	BLinkedList bLinkedList=new BLinkedList();
	ELinkedList eLinkedList=new ELinkedList();
	KLinkedList kLinkedList=new KLinkedList();
	TLinkedList tLinkedList=new TLinkedList();
        System.out.println("REHBERE HOŞ GELDİNİZ...");
        Thread.sleep(2000);
	Scanner secim=new Scanner(System.in);
	String isimler[]={"Ahmet","Akın","Ayşe","Ali","Batı","Batuhan","Berkan","Beril","Emir","Emre","Elif","Eren","Kadir","Kemal","Kasım","Kübra","Tarık","Talha","Tuğçe","Tekin"};
	String numaralar[]={"1","2","3","4","5","6","7","8","9","10","11","12","13","14","15","16","17","18","19","20"};
	for(int i=0;i<isimler.length;i++){
        if(isimler[i].charAt(0)=='A' || isimler[i].charAt(0)=='a'){
            aLinkedList.add(isimler[i],numaralar[i]);
        }
        if(isimler[i].charAt(0)=='B' || isimler[i].charAt(0)=='b'){
            bLinkedList.add(isimler[i],numaralar[i]);
        }
        if(isimler[i].charAt(0)=='E' || isimler[i].charAt(0)=='e'){
            eLinkedList.add(isimler[i],numaralar[i]);
        }
        if(isimler[i].charAt(0)=='K' || isimler[i].charAt(0)=='k'){
            kLinkedList.add(isimler[i],numaralar[i]);
        }
        if(isimler[i].charAt(0)=='T' || isimler[i].charAt(0)=='t'){
            tLinkedList.add(isimler[i],numaralar[i]);
        }
    }


        while (choose!=0){
            System.out.println("1-Rehberdeki tüm numaraları göster\n2-Rehberden numara sil\n3-Rehbere numara ekle (Eklediğiniz isim A,B,E,K VEYA T Harfi ile başlamak zorundadır aksi halde program algılamayacaktır.)\n4-Rehberde girilen harf ile başlayan numaraları göster(Örneğin (A))\n5-Rehberde girilen isme ait numarayı bul\n6-Rehberdeki toplam isim sayısı\n0-Çıkış\n");
            System.out.println("Seçim yapınız: ");
            choose=secim.nextInt();
            switch (choose){
                case 1:
                    System.out.println("A harfi ile başlayan numaralar");
                    aLinkedList.keys();
                    System.out.println("B harfi ile başlayan numaralar");
                    bLinkedList.keys();
                    System.out.println("E harfi ile başlayan numaralar");
                    eLinkedList.keys();
                    System.out.println("K harfi ile başlayan numaralar");
                    kLinkedList.keys();
                    System.out.println("T harfi ile başlayan numaralar");
                    tLinkedList.keys();
                    break;

                case 2:
                    Scanner scanner=new Scanner(System.in);
                    System.out.println("Rehberden silinecek ismi buraya giriniz");
                    String namee=scanner.nextLine();
                    Boolean durum=true;

                    if(namee.charAt(0)=='A' || namee.charAt(0)=='a'){
                        durum=aLinkedList.remove(namee);
                    }
                    else if(namee.charAt(0)=='B' || namee.charAt(0)=='b'){
                        durum=bLinkedList.remove(namee);
                    }
                    else if(namee.charAt(0)=='E' || namee.charAt(0)=='e'){
                        durum=eLinkedList.remove(namee);
                    }
                    else if(namee.charAt(0)=='K' || namee.charAt(0)=='k'){
                        durum=kLinkedList.remove(namee);
                    }
                    else if(namee.charAt(0)=='T' || namee.charAt(0)=='t'){
                        durum=tLinkedList.remove(namee);
                    }
                    else{
                       durum=false;
                    }


                    if(durum){
                        System.out.println("Silme işlemi başarılı");
                        Thread.sleep(2500);
                    }
                    else {
                        System.out.println("İsim bulunamadı");
                        Thread.sleep(2500);
                    }

                    break;

                case 3:
                    Scanner scanner1=new Scanner(System.in);
                    System.out.println("Eklenecek ismi giriniz");
                    String name=scanner1.nextLine();
                    System.out.println("Eklenecek numarayı giriniz");
                    String phone=scanner1.nextLine();
                    if(name.charAt(0)=='A' || name.charAt(0)=='a'){
                        aLinkedList.add(name,phone);
                    }
                    if(name.charAt(0)=='B' || name.charAt(0)=='b'){
                        bLinkedList.add(name,phone);
                    }
                    if(name.charAt(0)=='E' || name.charAt(0)=='e'){
                        eLinkedList.add(name,phone);
                    }
                    if(name.charAt(0)=='K' || name.charAt(0)=='k'){
                        kLinkedList.add(name,phone);
                    }
                    if(name.charAt(0)=='T' || name.charAt(0)=='t'){
                        tLinkedList.add(name,phone);
                    }
                    System.out.println("Ekleme işlemi başarılı...");
                    Thread.sleep(2500);
                    break;
                case 4:
                    Scanner scanner2=new Scanner(System.in);
                    System.out.println("Hangi harf ile başlayan isimleri görmek istiyorsunuz");
                    String nam=scanner2.nextLine();

                    if(nam.charAt(0)=='A' || nam.charAt(0)=='a'){
                        aLinkedList.keys();
                    }
                    else if(nam.charAt(0)=='B' || nam.charAt(0)=='b'){
                        bLinkedList.keys();
                    }
                    else if(nam.charAt(0)=='E' || nam.charAt(0)=='e'){
                        eLinkedList.keys();
                    }
                    else if(nam.charAt(0)=='K' || nam.charAt(0)=='k'){
                        kLinkedList.keys();
                    }
                    else if(nam.charAt(0)=='T' || nam.charAt(0)=='t'){
                        tLinkedList.keys();
                    }
                    else{
                        System.out.println("Geçersiz harf lütfen A,B,E,K,T harflerinden birini kullanınız");
                    }
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
                case 5:
                    Scanner scanner3=new Scanner(System.in);
                    System.out.println("Rehberden aradığınız numaraya ait ismi giriniz");
                    String name2=scanner3.nextLine();

                    if(name2.charAt(0)=='A' || name2.charAt(0)=='a'){
                        aLinkedList.search(name2);
                        Thread.sleep(2500);
                    }
                    else if(name2.charAt(0)=='B' || name2.charAt(0)=='b'){
                        bLinkedList.search(name2);
                        Thread.sleep(2500);
                    }
                    else if(name2.charAt(0)=='E' || name2.charAt(0)=='e'){
                        eLinkedList.search(name2);
                        Thread.sleep(2500);
                    }
                    else if(name2.charAt(0)=='K' || name2.charAt(0)=='k'){
                        kLinkedList.search(name2);
                        Thread.sleep(2500);
                    }
                    else if(name2.charAt(0)=='T' || name2.charAt(0)=='t'){
                        tLinkedList.search(name2);
                        Thread.sleep(2500);
                    }

                    break;

                case 6:
                    System.out.println("Rehberdeki toplam isim sayısı: "+(aLinkedList.size()+bLinkedList.size()+eLinkedList.size()+ kLinkedList.size()+ tLinkedList.size()));
                    Thread.sleep(2500);
                    break;
                case 0:
                    break;
                ////////////////////////////////////////////////////////////////////////////////////////
            }
        }


















    }
}
