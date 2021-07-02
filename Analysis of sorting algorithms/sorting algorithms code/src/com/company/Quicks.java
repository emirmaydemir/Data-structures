package com.company;

/**
 * @author Emir Muhammet Aydemir
 * Quick sorttaki ana mantık ise pivot seçimidir. Dizi elemanları soldan sağa yerleştirilir ve bir adet pivot
 * seçilir. Bu pivot seçiminden sonra i ve j adında iki adet sayaç tutulur. i=-1 ve j=0 dan başlatılır. Soldan
 * dizi elemanlarını pivot ile karşılaştırmaya başlarız pivottan küçük eleman gördüğümüzde i değeri aynı
 * kalırken j değeri 1 artar. Eğer pivottan küçük bir değer ile karşılaşırsak i değeri artar ve j nin bulunduğu
 * indisteki değer ile swap yaparlar. Sonrasında j artar ve işlemler aynı akışta devam eder. En son j  sayacı
 * pivotun bulunduğu indise gelince i değeri yine artar ve pivot ile yer değiştirir. Bu işlem sonucu pivotun
 * sağında pivottan büyük değerler. Pivotun solunda ise pivottan küçük değerler kalmaktadır. Pivotun sağından
 * ve solundan yeni pivotların seçilmesi ve aynı işlemlerin yapılması sonucu dizi sıralanacaktır. Bu arada j
 * sayacı her pivota ulaştığında i ve pivot değeri swap yapmaktaydı bu işlem sonucu swap yapan pivot değerinin
 * dizideki yeri kesinleşmiş olur ve onu sarı ile boyarız. Bizim kodumuzda ise partition fonksiyonu ile
 * bahsetmiş olduğum işlemler gerçekleşmektedir. Ve kodumuzda pivot elemanı olarak sürekli en sonda bulunan
 * eleman seçilmektedir.
 */

public class Quicks {
    int partition(int arr[], int low, int high) {
        /**
         * pivot değişkeni seçilmektedir.
         */
        int pivot = arr[high];
        int i = (low - 1);
        for (int j = low; j < high; j++) {

            if (arr[j] <= pivot) {
                i++;


                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }


        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void sort(int arr[], int low, int high) {
        if (low < high) {

            int pi = partition(arr, low, high);

            sort(arr, low, pi - 1);
            sort(arr, pi + 1, high);
        }
    }
}

