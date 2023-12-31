package org.example;

/**
 * for döngüsü daha çok tekrar sayısı belli olan döngülerde kullanılır.
 * Diziler gibi
 */

import java.util.Scanner;

/**
 * SORU:
 * -----------------------------
 * Java ile iki sayının EBOB ve EKOK değerlerini bulan program yazıyoruz.
 *
 * EBOB : İki ya da daha fazla doğal sayının ortak bölenlerinin en büyüğüne bu sayıların en büyük ortak böleni, kısaca EBOB‘u denir.
 *
 * ÖRNEK: 18 ve 24 sayılarının en büyük ortak bölenini adım adım bulalım.
 *
 * 18’in bölenleri : 1, 2, 3, 6, 9, 18
 *
 * 24’ün bölenleri : 1, 2, 3, 4, 6, 8, 12, 24
 *
 * Bu ortak bölenlerin en büyüğü 6 sayısı EBOB’tur.
 *
 * EKOK : İki ya da daha fazla doğal sayının ortak katlarının en küçüğüne bu sayıların en küçük ortak katı, kısaca EKOK‘u denir.
 *
 * ÖRNEK: 6 ve 8 sayılarının en küçük ortak katını adım adım bulalım.
 *
 * 6’nın katları : 6, 12, 18, 24, 30, 36, 42, 48, …
 *
 * 8’in katları : 8, 16, 24, 32, 40, 48, 56, 64, …
 *
 * Bu ortak katlardan en küçüğü 24 sayısı EKOK’tur.
 *
 * EKOK = (n1*n2) / EBOB
 */
public class Donguler_for {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz");
        int n1 = sc.nextInt();
        System.out.println("n2 sayısını giriniz");
        int n2 = sc.nextInt();

        EbobKontrol(n1 , n2);
        EkokKontrol(n1 , n2);



    }
    public static void EbobKontrol(int n1,int n2){
        int ebob=1;

        System.out.println("Ortak çarpanlar: ");


        for (int i = 1; i<=n1; i++){
            if ((n1%i==0)&&(n2%i==0)){
                System.out.println(i);
                ebob=i;
            }

        }
        System.out.println("----------------");
        System.out.println("Ebob = "+ebob);
    }
    public static void EkokKontrol(int n1 , int n2){
        int ekok =1;
        for (int i = 1 ; i<=(n1*n2); i++)
        {
            if((i%n1==0)&&(i%n2==0))
            {
                ekok = i;
                break; //Koymamız lazım UNUTMA

            }
        }
        System.out.println("------------------");
        System.out.println("Ekok = "+ekok);
    }
}
