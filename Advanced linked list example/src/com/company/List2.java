package com.company;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *  JAVA DOCUMAN
 *Circle linked listimiz için kurduğumuz sınıftır bu sınıf içinde Node sınıfından nesneleri depolarız. Node
 * sınıfımız ise içinde dersleri depolamamızı sağlayan bir ders nesnesi barındırır. Bu sayede bütün dersleri
 * BU oluşturudpumuz linked listesi sayesinde depolayabiliriz. Aynı zamanda aynı döneme ait dersleri birbirine
 * bağlamamızı sağlayan bir yapı oluştururuz.
 * @author EMİR MUHAMMET AYDEMİR
 * @since 26.03.2021
 */

public class List2 {
    /**
     * sayac olarak kullandık
     */
    public static int c=1;
    /**
     * derslerin tutulduğu dizi
     */
    Node [] list=new Node[1000];
    /**
     * Derslerin dönemlere ayrıldığı matristir
     */
    Node [][] list2=new Node[1000][1000];
    /**
     * vagonun ilk elemanının tutulduğu işaretçi
     */
    Node head=null;
    /**
     * klavye giriş değişkenidir.
     */
    Scanner scanner=new Scanner(System.in);


    /**
     * Circle linked list yapımızı oluşturmamızı sağlayan fonksşyondur. Bu yapıda her döneme ait dersleri
     * matris dizisi sayesinde ayırdık ve sonrasında döngüler yardımıyla aynı dönemdeki dersleri birbirine
     * bağladık en sondaki elemanı ise ayırdığımız dönem matrisindeki ilk elemana bağlayarak circle linked
     * list yapımızı düzgün bir şekilde kurmuş olduk.
     */
    public void save(){
        /**
         * sayac olarak artımlarda kullandığımız değişkendir
         */
        int sayac=0;
        /**
         * matrisin satır boyutudur.
         */
        int boyut=0;
        /**
         * sayac olarak kullanılan değişkendir
         */
        int b=0;
        /**
         * sayac olarak artımlarda kullandığımız değişkendir
         */
        int a=0;
        /**
         * sayac olarak artımlarda kullandığımız değişkendir
         */
        int sizee=0;
        /**
         * boyutlar dizisinin sayacıdır
         */
        int c=0;
        /**
         * sayac olarak artımlarda kullandığımız değişkendir
         */
        int d=0;
        /**
         * Her dönemin ders sayısını tutan dizimizdir.
         */
        int []boyutlar={8,8,6,6,5,4,3,4};


        for(int i=0;i<8;i++){
            for(int j=0;j<44;j++){
                if(list[j].ders.getSomestr()==i+1){
                    list2[i][b]=list[j];
                    b++;
                }
            }
            b=0;
        }



        while (boyut<8){

            for(int i=0;i<boyutlar[c];i++){
                if(i+1==boyutlar[c]){
                    list2[boyut][i].semesterNext=list2[boyut][0];
                }
                else {
                    list2[boyut][i].semesterNext = list2[boyut][i + 1];
                }
            }
            boyut++;
            c++;
        }


    }
    /**
     * Listemize yeni bir ders eklemek için kullandığımız fonksiyondur.
     * Eğer ilk defa ders eklencek ise head değişkenimize eklenir. Daha önce ders eklenmiş ise yeni bir node
     * nesnesi oluştururuz ve bunu en sondaki vagonumuzun next işaretisine koyarız. Bunun yapma sebebimiz oluşturulan
     * ders nesnesini en sona yerleştirmektir.
     * @param dersler Test sınıfından eklenecek ders nesnesini alan parametredir.
     */

    public void add(Dersler dersler){
        if (head==null){
            head=new Node();
            head.ders=dersler;
            head.next=null;
            list[0]=head;
        }
        else {
            Node node=new Node();
            node.ders=dersler;
            node.next=null;
            Node temp=head;
            while (temp.next!=null){
                temp=temp.next;
            }
            temp.next=node;
            list[c]=temp.next;
            c++;
        }

    }
    /**
     * Listemizdeki toplam ders sayısını hesaplamamızı sağlayan fonksiyondur.
     * vagonumuzun ilk nodesini yani headı geçici bir değişkende tutarak while ile vagonumuzun sonuna kadar
     * gezeriz ve boyut değişkeni ile kaç kere döndüğümüzü turarız. Sonuç olarak listemizin boyutu bulunur.
     * @return Listemizdeki ders sayısını döndürür
     */
    public int size(){
        Node temp=head;
        int boyut=0;
        while (temp!=null){
            if(temp.visible==true) {
                boyut++;
            }
            temp = temp.next;
        }
        return boyut;
    }
    /**
     * Listemizden bir eleman silmek için kullandığımız fonksiyondur
     * Silinecek vagonun bir öncesindeki vagonun next işaretçisine silinecek vagonun bir sonrasındaki vagonu
     * gösteririz ve son olarak silinecek olan vagonun nextini null yaparız. Sonuç olarak silinecek vagon ile
     * hiç bir bağımız kalmaz ve işlem başarılı olur.
     * @param kod silinecek dersin kodunu kullanıcıdan aldığımız parametredir
     * @return işlemin başarılı olup olmadığını döndüren boolean değişkendir.
     */
    public boolean remove(String kod){
        boolean state=false;
        Node current=head;
        Node temp=null;

        if(current.ders.getKod().equals(kod)){
            temp=current.next;
            head=temp;
            state=true;
        }
        else{
            while (current.next!=null){
                if (current.next.ders.getKod().equals(kod) && current.next.visible==true) {
                    temp = current.next;
                    current.next = temp.next;
                    temp.next = null;
                    state = true;
                    break;

                }
                current=current.next;
            }
        }

        return state;
    }
    /**
     * Listemizdeki derslerin 1 komutu ile sırayla gösterilmesini sağlayan fonksiyondur.
     * yine ilk vagonumuzu yani headı geçici bir değişkende tutarız ve while döngüsü ile kullanıcı her 1 e
     * bastığında listenin bir sonraki elemanına geçeriz.
     */
    public void next(){
        int sayac=2;
        Node temp=head;
        System.out.println("Listenin ilk dersi: "+temp.ders.getIsim());
        while (temp!=null){
            System.out.println("Sonraki dersi göstermek için (1) bu işlemi sonlandırmak için (0) rakamını tuşlayınız");
            int choose=scanner.nextInt();
            if (choose==1) {
                temp = temp.next;
                if(temp!=null) {
                    if(temp.visible==true) {
                        System.out.println(sayac + " numaralı dersin adı: " + temp.ders.getIsim());
                        sayac++;
                    }
                    else{
                        System.out.println("Bu dersin erişilebilirliği kapatılmıştır");
                        continue;
                    }
                }
                else{
                    System.out.println("Listede daha fazla ders bulunmamaktadır");
                }
            }
            if(choose==0){
                break;
            }
        }
    }
    /**
     * Aynı dönemde bulunan dersleri 1 komutu ile sırayla görmemizi sağlayan fonksiyondur
     * yine ilk vagonumuzu yani headı geçici bir değişkende tutarız ve while döngüsü ile kullanıcı her 1 e
     * bastığında aynı dönemde bulunan ders listesinin bir sonraki elemanına geçeriz. Ama bu sefer aynı dönemdeki
     * vagonların bağlı olduğu bir yapı kurduğumuz için en son vagona geldiğimizde işlem sonlanmaz ve il vagona
     * geçiş sağlanır.
     * @param semester Gösterilecek dönem bilgisinin firildiği değişkendir.
     *  ayrıca bakılacak nesnenin erişilebilirliği açık mı diye kontrolde sağlanır
     */
    public void NextInSemester(int semester){
        int sayac=0;
        int choose=-1;
        Node temp=head;
        System.out.println(semester+".yarıyıl dersleri\n");
        while (temp!=null){
            if(temp.ders.getSomestr()==semester && temp.visible==true){
                while (choose!=0){
                    System.out.println("Bir sonraki dersi görmek için 1 işlemi sonlandırmak için 0 basınız");
                    choose=scanner.nextInt();
                    System.out.println(temp.ders.getIsim()+" Dersin kodu: "+temp.ders.getKod()+" Dersin saati: "+temp.ders.getSaat()+" Dersin kredisi: "+temp.ders.getKredi()+" Dersin dönemi: "+temp.ders.getSomestr());
                    temp=temp.semesterNext;
                }
                break;

            }
            temp=temp.next;

        }
    }
    /**
     * Görüntülenmek istenen dönemin bütün derslerinin ekrana basılmasını sağlayan değişkendir.
     * yine ilk vagonumuzu yani headı geçici bir değişkende tutarız ve while döngüsü ile kulanıcının girdiği
     * döneme eşit olan derslerin tümünü ekrana çıktı olarak veririz.
     * ayrıca bakılacak nesnenin erişilebilirliği açık mı diye kontrolde sağlanır
     * @param semester kullanıcının görmek istediği dönem bilgisinin tutulduğu değişkendir.
     */
    public void listSemesterCourses(int semester) {
        int sayac = 1;
        Node temp = head;
        System.out.println(semester + ".yarıyıl dersleri\n");
        while (temp != null) {
            if (temp.ders.getSomestr() == semester && temp.visible==true) {
                System.out.println(sayac + " numaralı ders /////" + "Ders adı: " + temp.ders.getIsim() + " Ders saati: " + temp.ders.getSaat() + " Ders kodu: " + temp.ders.getKod() + " Ders kredisi: " + temp.ders.getKredi());
                sayac++;
            }
            temp=temp.next;
        }
    }
    /**
     *yine ilk vagonumuzu yani headı geçici bir değişkende tutarız ve while döngüsü ile kulanıcının girdiği
     * kodun listemizdeki kodlarla eşleşmesi durumunda eşleşen dersi ekrana bastırırız.
     * ayrıca bakılacak nesnenin erişilebilirliği açık mı diye kontrolde sağlanır. Eğer açık değilse kodu verilen
     * ders gösterilmez
     * @param code kullanıcının görmek istediği dersin kodunu girdiği değişkendir
     */
    public void getByCode(String code){
        Node temp = head;
        int sayac=1;
        System.out.println(code + "Koduna sahip olan bölüm dersleri\n");
        while (temp != null) {
            if (temp.ders.getKod().equals(code) && temp.visible==true) {
                System.out.println(sayac + " numaralı ders /////" + "Ders adı: " + temp.ders.getIsim() + " Ders saati: " + temp.ders.getSaat() + " Ders kodu: " + temp.ders.getKod() + " Ders kredisi: " + temp.ders.getKredi());
                sayac++;
            }
            temp=temp.next;
        }
    }
    /**
     * Verilen indexler arasındaki liste elemanlarını görmemizi sağlar.
     * oluşturduğumuz geçici temp değişkenine headı atarak while dögüsü ile listeyi döneriz istenen indexler
     * if bloğu ile kontrol edilerek görüntülenir.
     * @param start_index görülecek dersler listesinin başlangıç indexidir
     * @param last_index görülecek dersler listesinin bitiş indexidir
     */
    public void getByRange(int start_index, int last_index){
        Node temp=head;
        int sayac=1;
        while(temp!=null){
            if(sayac>=start_index && sayac<=last_index && temp.visible==true){
                System.out.println(temp.ders.getIsim());
            }
            sayac++;
            temp=temp.next;
        }
    }
    /**
     * Derslerin erişilebilirliğinin kapatıldığı fonksiyondur.
     *geçici temp değişkeninde headımızı tutarız ve while döngüsü ile tüm lüsteyi dönerek node içinde bulunan
     * visible değişkenini false yaparız bu sayede erişebilirliğini kaparız. Kontrol sağlarken erişilebilirliği
     * false olan nesneler linked list fonksiyonlarına erişememektedir.
     * @param isim kısıtlama yapılacak dersin isminin kullanıcıdan alındığı değişkendir.
     */
    public void Disable(String isim){
        Node temp = head;
        while (temp!=null){
            if (temp.ders.getIsim().equals(isim)){
                temp.visible=false;
            }
            temp=temp.next;
        }
    }
    /**
     * Derslerin erişilebilirliğinin açıldığı fonksiyondur.
     *geçici temp değişkeninde headımızı tutarız ve while döngüsü ile tüm lüsteyi dönerek node içinde bulunan
     * visible değişkenini true yaparız bu sayede erişebilirliğini açarız. Kontrol sağlarken erişilebilirliği
     * true olan nesneler linked list fonksiyonlarına erişebilmektedirler.
     * @param isim kısıtlaması kaldırılacak dersin isminin kullanıcıdan alındığı değişkendir.
     */
    public void Enable(String isim){
        Node temp = head;
        while (temp!=null){
            if (temp.ders.getIsim().equals(isim)){
                temp.visible=true;
            }
            temp=temp.next;
        }
    }
    /**
     * Kısıtlanmış derslerin listelendiği fonksiyondur geçici temp değişkeninde headımızı tutarız ve while döngüsü
     * ile tüm lüsteyi dönerek node içinde bulunan visible değişkeni false olanları ekrana bastırırız.
     */
    public void showDisabled(){
        System.out.println("ERİŞİLEBİLİRLİĞİ KAPATILMIŞ OLAN DERSLER");
        Node temp = head;
        while (temp!=null){
            if (temp.visible==false){
                System.out.println(temp.ders.getIsim());
            }
            temp=temp.next;
        }
    }
    /**
     * Erişilebilirliği açık veya kapalı olan nesneleri kontrol etmek için kullandığımız fonksiyondur.
     * @param isim erişilebilirliği kontrol edilecek değişkenin isim bilgisinin tutulduğu değişkendir
     * @return erişebilirlik bilgisini döndüren geri dönüş değeridir
     */
    public boolean visiblecheck(String isim){
        Node temp=head;
        boolean deg=true;
        while (temp!=null){
            if(temp.ders.getIsim().equals(isim)){
                if(temp.visible==true){
                    deg=true;
                    break;
                }
                else {
                    deg=false;
                    break;
                }
            }
            temp=temp.next;
        }
        return deg;
    }

}
