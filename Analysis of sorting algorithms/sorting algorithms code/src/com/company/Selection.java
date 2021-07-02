package com.company;

import java.util.Arrays;

/**
 * @author Emir Muhammet Aydemir
 * Selection sort çalışma mantığında ise dizinin ilk elemanı ile tüm elemanlar karşılaştırılır ve dizinin en
 * küçük elemanı başa getirilir. Sonrasında dizinin ikinci elemanı ile 2 den sonraki tüm elemanlar
 * karşılaştırılır. Bu şekilde tüm dizi sıralanmış olur. Bizim Selection sınıfımızdaki sort fonksiyonu bu
 * işlemi yerine getirmektedir.
 */

public class Selection {
    public void Sort(int[] array) {
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minId = i;
            for (int j = i+1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minId = j;
                }
            }
            // swapping
            int temp = array[i];
            array[i] = min;
            array[minId] = temp;
        }
    }
}
