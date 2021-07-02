package com.company;

/**
 * @author Emir Muhammet Aydemir
 * Heap sortun ana mantığında öncelikle elimizdeki dizi ile bir ağaç yapısı oluştururuz. Ağaç yapısında dikkat
 * edilmesi gerekenler her bir parçanın altında bölünmüş 2 parça daha olması ve elemanların soldan sağa doğru
 * yerleştirilmesidir. Ağaca yerleştirilme işleminden sonra heapify işlemi uygulanır bu işlemde ise her parentin
 * çocukları ile durumuna bakılır. Parentin her zaman daha küçük olması gerekmektedir. Tabi diziyi küçükten
 * büyüğe sıralamak istiyorsak bu şekilde yaparız. Heapidfy işlemi sonucu ağacın en küçük elemanı en üste gelir
 * ve ağacın en altındaki eleman ile swap işlemine tutulup ağaçtan çıkartılır. Bunun sonucunda yeni bir diziye
 * yerleşir ve yeni dizimizdeki ilk eleman en küçük elemanımız olmuş olur. Heapify işlemi ağaçta tek eleman
 * kalana kadar devam eder. Bu şekilde dizi küçükten büyüğe sıralanmış olur. Bizim sınıfımızdaki heap ve heapify
 * fonksiyonu heapify işlemini gerçekleştirmektedir.
 */
public class Heap {
    private static int n;

    private int left(int i) {
        return (2 * i) + 1;
    }

    private int right(int i) {
        return (2 * i) + 2;
    }

    public int minimum(int[] array) {
        return array[array.length - 1]; // o(1)
    }

    public int maximum(int[] array) {
        return array[0]; // o(1)
    }

    public void sort(int [] array)
    {
        n = array.length-1;

        heapify(array); // O(n) tüm diziyi düzenle
// tüm sort işlemi

        for(int i = n; i >= 0; i --)
        {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            n = n - 1;
            heap(array,0);
        }
    }

    private void heapify(int[] array) {
        for (int i = n; i >= 0; i--) heap(array, i); // her heap sorgusu
    }

    private void heap(int[] array, int i) {
        int left = left(i); // şuanki indisin sol çocuğu
        int right = right(i);// şuanki indisin sağ çocuğunun indisi
        int largest = i; // kendisini büyükmüş gibi görüyoruz

        if ((left <= n) && (array[left] > array[largest])) // sol çocuğu büyükse en büyük sol oluyor
            largest = left;

        if ((right <= n) && (array[right] > array[largest])) // sağ ile büyüğü karşılaştırıyoruz
            largest = right; // büyükse en büyük sağ çocuk oluyor

        if (largest != i) // iki indis aynı olana kadar
        {
// indisler arası değiştirme, swap işlemi yapıyoruz
            int temp = array[i];
            array[i] = array[largest];
            array[largest] = temp;

            heap(array, largest); // değiştirilen indisleri kontrol ediyoruz
        }
    }

    public void print(int[] array) {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}

