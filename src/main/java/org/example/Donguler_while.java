package org.example;

import java.util.Scanner;

/**
 * Kaç kere döneceği belli olmayan, koşulun bir girdiye göre denetlendiği durumlarda
 *   While ya da do-while döngüsü kullanılır
 */

/**
 * Bu örnekte while döngüsü ile şifre kontrol örneği yap.
 * boolean kullan
 *
 */
public class Donguler_while {

    public static void main(String[] args) {

        PasswordControl();

    }
    public static void PasswordControl(){
        Scanner scanner = new Scanner(System.in);
        String customerPassword = "12345";
        boolean passwordSuccessfull = false;
        int sayac=3;
        while(!passwordSuccessfull) {

            System.out.println("Hesap şifrenizi giriniz:");
            String typedPassword = scanner.next();
            while (sayac>0){
                System.out.println("Şifrenizi doğru girmek için "+ sayac +" hakkınız kaldı");
                System.out.println("Şifrenizi giriniz ");
                typedPassword = scanner.next();

                if(customerPassword.equals(typedPassword)) {
                    passwordSuccessfull = true;
                    System.out.println("Sisteme giriş yaptınız !");
                    break;
                }
                else {
                    System.out.println("Şifreniz Yanlış");
                    sayac--;
                    if (sayac==0){
                        passwordSuccessfull = true;
                        System.out.println("Şifreniz bloke olmuştur");
                        break;
                    }

                }
            }

        }
    }

}
