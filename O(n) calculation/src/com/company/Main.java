package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
	  int [][] m1=new int[5][5];
	  int [][] m2=new int[5][5];
	  int [][] toplam=new int[5][5];
	  Random rand = new Random();
	  for(int i=0;i<5;i++){// i=0'dan +1 geliyor i<5 den +6 geliyor i++'dan +5 geliyor toplam= 12
	      for(int j=0;j<5;j++){//j=0'dan +5 geliyor , j<5'den +30 geliyor j++'dan +25 geliyor=60
	          m1[i][j]=rand.nextInt(10);//25
	          m2[i][j]= rand.nextInt(10);//25
              toplam[i][j]=m1[i][j]+m2[i][j];//25
          }//147  burası toplamda 147 maliyet etmiştir.
      }
        System.out.print("1. matris");//+1
        System.out.println();//+1
        for(int i=0;i<5;i++){// i=0'dan +1 geliyor i<5 den +6 geliyor i++'dan +5 geliyor toplam= 12
            for(int j=0;j<5;j++){//j=0'dan +5 geliyor , j<5'den +30 geliyor j++'dan +25 geliyor=60
                System.out.print(m1[i][j] + "\t");//25
            }
            System.out.println();//5 kez ilk for döneceğinden +5 gelicek
        }//toplam=102 gelir

        System.out.println();//+1
        System.out.println();//+1
        System.out.println("2. matris");//+1
        for(int i=0;i<5;i++){// i=0'dan +1 geliyor i<5 den +6 geliyor i++'dan +5 geliyor toplam= 12
            for(int j=0;j<5;j++){//j=0'dan +5 geliyor , j<5'den +30 geliyor j++'dan +25 geliyor=60
                System.out.print(m2[i][j] + "\t");// n^2 den 25 kez dönecek
            }
            System.out.println();// n den + 5 gelir
        }//toplam = 102
        System.out.println("\n");//+1

        System.out.println("Toplam matrisi");//+1
        for(int i=0;i<5;i++){// i=0'dan +1 geliyor i<5 den +6 geliyor i++'dan +5 geliyor toplam= 12
            for(int j=0;j<5;j++){//j=0'dan +5 geliyor , j<5'den +30 geliyor j++'dan +25 geliyor=60
                System.out.print(toplam[i][j] + "\t");// n^2 den 25 kez dönecek
            }
            System.out.println();//+5 kez döner
        }//toplam =102


    }              // sonuç olarak toplamda maliyeti=460 birim geldi
}
