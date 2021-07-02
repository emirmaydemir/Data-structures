package com.company;

/**
 * @author Emir Muhammet Aydemir
 * Bubble sort çalışma mantığı her bir eleman bir yanındaki eleman ile karşılaştırılmaktadır.
 * Eğer soldaki eleman sağdakinden büyükse swap işlemi yapılmaktadır. Ve sonrasında bir sonraki elemanlar
 * karşılaştırılır. Bizim bubble sınıfımızdaki bubblesort fonksiyonumuz bu işlemi gerçekleştirmektedir.
 */
public class Bubble {
    public  void BubbleSort(int [] dizi)
    {
        int temp;
        for (int i=1; i<dizi.length; i++)
        {
            for(int j=0; j<dizi.length-i; j++)
            {
                if (dizi[j] > dizi [j+1])
                {
                    temp = dizi [j];
                    dizi [j] = dizi [j+1];
                    dizi [j+1] = temp;
                }
            }
        }
    }
}
