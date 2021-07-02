package com.company;

/**
 * @author Emir Muhammet Aydemir
 * Merge sort algoritmasının ana mantığı önce diziyi sürekli yarıya bölmektir. Dizinin her elemanı tek
 * kalana kadar divide işlemi yaparız. Sonrasında ise tek kalan parçaları birleştirmeye başlarız birleştirme
 * sırasında her parça birbiri ile karşılaştırılır ve küçük olan parça sol tarafta kalır. Karşılaştırma işlemi
 * sol taraftaki dizi parçaları dikkate alınarak yapılır. Eğer sol taraftaki parça büyük ise swap işlemi
 * gerçekleşmiş olur. Bizim merges sınıfımızda ise Divide sınıfı diziyi parçaya ayırmaya merge ve sort
 * fonksiyonlarımız ise parçaları küçükten büyüğe sıralı bir şekilde birleştirmeye yaramaktadır.
 */
public class Merges {

    private int[] array;
    private int[] temp;
    private int length;
    public void Sort(int[] nums)
    {
        this.length = nums.length;
        this.array = nums;
        this.temp = new int[length];
        Divide(0, length - 1);
    }
    private void Divide(int left, int right)
    {
        if (left < right)
        {
            int center = left + (right - left) / 2; // dizinin ortası
            Divide(left, center); // sol tarafı böl
            Divide(center + 1, right); // sağ tarafı böl
            Merge(left, right, center);
        }
    }
    private void Merge(int left, int right, int center)
    {
        for (int i = left; i <= right; i++) temp[i] = array[i]; // işlem yapılacak aralık geçici diziye atılır
        int a = left; // dizinin başlangıç noktası
        int b = center + 1; // bölüm noktası + 1 sağ kısmın başlangıç indisi
        int c = left; // değiştirilen parçanın indisi
        while(a <= center && b <= right) // sol kısım ortaya, diğer kısım bitişe gelene kadar
        {
            // sağ ve sol parçaların değerini karşılaştır
            if(temp[a] <= temp[b]) // küçükse eşit ise sol kısımdaki gelir.
            {
                array[c] = temp[a];
                a++; // bir sonraki indisler için
            }
            else
            {
                array[c] = temp[b]; // büyük ise sağ kısım ile yer değiştirir.
                b++; // bir sonraki indisler için
            }
            c++; // diğer indise geç
        }
        while(a <= center) // işlem görmemiş kısımları orta noktaya gelene kadar array'a aktarıyoruz
        {
            array[c] = temp[a];
            c++;
            a++;
        }
    }
}
