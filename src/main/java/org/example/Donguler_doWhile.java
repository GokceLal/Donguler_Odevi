package org.example;

import java.util.Scanner;

/**
 * do-while döngüsünün içerisine en az bir kere girer fakat while döngüsünde koşul doğru olduğu sürece girer.
 */

/**
 * Bu örnekte alan hesaplama işlemi yapılmıştır.
 */
public class Donguler_doWhile {
    public static void main(String[] args) {
        AlanHesapla();

    }
    public static void AlanHesapla(){
        double ycap, alan;
        String input;
        char kontrol;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Yarı Çapı giriniz: ");
            ycap = sc.nextDouble();
            sc.nextLine();
            alan = ycap * ycap *3.14;
            System.out.println(
                    "Yarı çap = " + ycap + " Alan =  " + alan);
            System.out.println("\nDevam Edilsin mi?");
            System.out.print("Devam için E Çıkış Yapmak için H : ");
            input = sc.nextLine();
            kontrol = input.charAt(0);
        } while (kontrol == 'E' || kontrol == 'e');
    }
}
