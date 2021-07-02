package com.company;

import java.util.HashMap;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {
    Random r=new Random();
    String siralia="sa";
    String siralib="sb";
    String siralic="sc";
    String siralid="sd";
    String siralie="se";
    String a="dizi";
    String b="dizii";
    String c="diziii";
    String d="diziiii";
    String e="diziiiii";
    ////////////////////////////DİZİLERİN OLUŞTURULMASI VE RANDOM DOLDURULMASI//////////////////////////////////
    HashMap<String,int[]> dizi = new HashMap<String,int[]>();
    for(int i=0;i<20;i++){
		dizi.put(a+i,new int[10000]);
    	for(int j=0;j<10000;j++){
    		dizi.get(a+i)[j]=r.nextInt(10000);
		}
	}
		for(int i=0;i<20;i++){
			dizi.put(b+i,new int[40000]);
			for(int j=0;j<40000;j++){
				dizi.get(b+i)[j]=r.nextInt(40000);
			}
		}
		for(int i=0;i<20;i++){
			dizi.put(c+i,new int[100000]);
			for(int j=0;j<100000;j++){
				dizi.get(c+i)[j]=r.nextInt(100000);
			}
		}
		for(int i=0;i<20;i++){
			dizi.put(d+i,new int[150000]);
			for(int j=0;j<150000;j++){
				dizi.get(d+i)[j]=r.nextInt(150000);
			}
		}
		for(int i=0;i<20;i++){
			dizi.put(e+i,new int[180000]);
			for(int j=0;j<180000;j++){
				dizi.get(e+i)[j]=r.nextInt(180000);
			}
		}

			dizi.put(siralia+0,new int[10000]);
			for(int j=0;j<10000;j++){
				dizi.get(siralia+0)[j]=j;
			}

			dizi.put(siralib+0,new int[40000]);
			for(int j=0;j<40000;j++){
				dizi.get(siralib+0)[j]=j;
			}


			dizi.put(siralic+0,new int[100000]);
			for(int j=0;j<100000;j++){
				dizi.get(siralic+0)[j]=j;
			}


			dizi.put(siralid+0,new int[150000]);
			for(int j=0;j<150000;j++){
				dizi.get(siralid+0)[j]=j;
			}


			dizi.put(siralie+0,new int[180000]);
			for(int j=0;j<180000;j++){
				dizi.get(siralie+0)[j]=j;
			}

		////////////////////////////DİZİLERİN OLUŞTURULMASI VE RANDOM DOLDURULMASI//////////////////////////////////


		Merges merges = new Merges();
		Heap heap = new Heap();
		Quicks quicks = new Quicks();
		Insertion insertion=new Insertion();
		Bubble bubble=new Bubble();
		Selection selection=new Selection();



		long toplamSure=0;
		for(int i=0;i<1;i++){
			long baslangicZamani = System.currentTimeMillis();
			quicks.sort(dizi.get(a+i),0,dizi.get(a+i).length-1);
			long bitisZamani = System.currentTimeMillis();
			toplamSure += bitisZamani - baslangicZamani;
		}
		System.out.println("10k  ortalama quick suresi: "+toplamSure/20.0+"ms");
		toplamSure=0;
		for(int i=0;i<20;i++){
			long baslangicZamani = System.currentTimeMillis();
			quicks.sort(dizi.get(b+i),0,dizi.get(b+i).length-1);
			long bitisZamani = System.currentTimeMillis();
			toplamSure += bitisZamani - baslangicZamani;
		}
		System.out.println("40k ortalama quick suresi: "+toplamSure/20.0+"ms");
		toplamSure=0;
		for(int i=0;i<20;i++){
			long baslangicZamani = System.currentTimeMillis();
			quicks.sort(dizi.get(c+i),0,dizi.get(c+i).length-1);
			long bitisZamani = System.currentTimeMillis();
			toplamSure += bitisZamani - baslangicZamani;
		}
		System.out.println("100k ortalama quick suresi: "+toplamSure/20.0+"ms");
		toplamSure=0;
		for(int i=0;i<20;i++){
			long baslangicZamani = System.currentTimeMillis();
			quicks.sort(dizi.get(d+i),0,dizi.get(d+i).length-1);
			long bitisZamani = System.currentTimeMillis();
			toplamSure += bitisZamani - baslangicZamani;
		}
		System.out.println("150k  ortalama quick suresi: "+toplamSure/20.0+"ms");
		toplamSure=0;
		for(int i=0;i<20;i++){
			long baslangicZamani = System.currentTimeMillis();
			quicks.sort(dizi.get(e+i),0,dizi.get(e+i).length-1);
			long bitisZamani = System.currentTimeMillis();
			toplamSure += bitisZamani - baslangicZamani;
		}
		System.out.println("180k ortalama quick suresi: "+toplamSure/20.0+"ms");

		toplamSure=0;
		long baslangicZamani = System.currentTimeMillis();
		bubble.BubbleSort(dizi.get(siralib+0));
		long bitisZamani = System.currentTimeMillis();
		toplamSure += bitisZamani - baslangicZamani;
		System.out.println("10k diziler icin ortalama sirali buble suresi: "+toplamSure+"ms");

		/*merges.Sort(dizi.get(a+"1"));
		heap.sort(dizi.get(a+"1"));
		quicks.sort(dizi.get(a+"1"), 0, dizi.get(a+"1").length - 1);
		insertion.sort(dizi.get(a+"1"));
		bubble.BubbleSort(dizi.get(a+"1"));
		selection.selectionSort(dizi.get(a+"1"));

		merges.Sort(dizi.get(b+"1"));
		heap.sort(dizi.get(b+"1"));
		quicks.sort(dizi.get(b+"1"), 0, dizi.get(b+"1").length - 1);
		insertion.sort(dizi.get(b+"1"));
		bubble.BubbleSort(dizi.get(b+"1"));
		selection.selectionSort(dizi.get(b+"1"));

		merges.Sort(dizi.get(c+"1"));
		heap.sort(dizi.get(c+"1"));
		quicks.sort(dizi.get(c+"1"), 0, dizi.get(c+"1").length - 1);
		insertion.sort(dizi.get(c+"1"));
		bubble.BubbleSort(dizi.get(c+"1"));
		selection.selectionSort(dizi.get(c+"1"));

		merges.Sort(dizi.get(d+"1"));
		heap.sort(dizi.get(d+"1"));
		quicks.sort(dizi.get(d+"1"), 0, dizi.get(d+"1").length - 1);
		insertion.sort(dizi.get(d+"1"));
		bubble.BubbleSort(dizi.get(d+"1"));
		selection.selectionSort(dizi.get(d+"1"));

		merges.Sort(dizi.get(e+"1"));
		heap.sort(dizi.get(e+"1"));
		quicks.sort(dizi.get(e+"1"), 0, dizi.get(e+"1").length - 1);
		insertion.sort(dizi.get(e+"1"));
		bubble.BubbleSort(dizi.get(e+"1"));
		selection.selectionSort(dizi.get(e+"1"));

		merges.Sort(dizi.get(siralia+"0"));
		heap.sort(dizi.get(siralia+"0"));
		quicks.sort(dizi.get(siralia+"0"), 0, dizi.get(siralia+"0").length - 1);
		insertion.sort(dizi.get(siralia+"0"));
		bubble.BubbleSort(dizi.get(siralia+"0"));
		selection.selectionSort(dizi.get(siralia+"0"));*/
















    }

}
