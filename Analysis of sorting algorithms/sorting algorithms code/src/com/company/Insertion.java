package com.company;
/**
 * @author Emir Muhammet Aydemir
 * Insertion sort çalışma mantığında ise bir sayıyı eline al solundaki sayılara bak Soldaki sayı elindeki sayıdan büyükse
 * bir sağa kaydır.Kendisinden küçük sayı bulunca boş bulunan indise yerleştir. Diğer sayıya geç şeklinde
 * olmaktadır. Bizim insertion sınıfımızdaki sort fonksiyonu bu işlemi gerçekleştirmektedir.
 */
public class Insertion {
    void sort(int arr[])
    {
        int n = arr.length;
        for (int i=1; i<n; ++i)
        {
            int deger = arr[i];
            int j = i-1;

            while (j>=0 && arr[j] > deger)
            {
                arr[j+1] = arr[j];
                j = j-1;
            }
            arr[j+1] = deger;
        }
    }
}

