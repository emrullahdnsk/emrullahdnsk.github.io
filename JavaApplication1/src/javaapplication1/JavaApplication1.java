/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
/*
        Scanner scanner = new Scanner(System.in);
        double r;
        System.out.println("Çemberin Yarıçapını girin :");
        r = scanner.nextInt();
        double alan =(r*r)*Math.PI;
        System.out.println("dairenin alanı :" + alan);
         */
        //kullanıcıdan n tane sayı girişi bu sayıların ortalamasını ekrana basan uygulama
        /*
        Scanner scanner = new Scanner(System.in);
        int n;
        double sayi;
        double toplam=0;
        System.out.println("Kaç tane sayı girilmesini istediğinizi yazınız:");
        n=scanner.nextInt();
        for(int i=0;i<n;i++){
        System.out.println("İstediğiniz sayı değerini giriniz:");
        sayi=scanner.nextDouble();
        toplam+=sayi;
        }
        System.out.println("Girilen sayıların ortalaması = "+(toplam/n));
         */
        /*
        double toplam=0;
        Scanner input = new Scanner(System.in);
        System.out.println("Kac tane sayi gireceksiniz");
        int ds=input.nextInt();
        for (int i = 0; i < ds; i++) 
        {
        System.out.println(ds +"sayi giriniz :");
        double sayi=input.nextDouble();
        toplam = toplam+sayi;
        }
        System.out.println("ortalama = "+toplam/ds);
         */
        //tek çift
        /*
        Scanner scanner = new Scanner(System.in);
        int sayi;
        double a=0;
        System.out.println("Sayıyı giriniz:");
        sayi=scanner.nextInt();
        for (int i = 0; i < sayi; i++) {
            if(i%2==0){
                a++;
                
            }
        }
        System.out.println("Toplam çift sayı adedi"+a);
        
        */
        
        
        
        
        
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi=input.nextInt();
        int bs=0;
        for (int dongu = 2; dongu <= sayi; dongu++) {
            
            for (int bolen = 2; bolen < sayi; bolen++) {
                    if (dongu%bolen==0) {
                        bs=bs+1;
                }
                  
            }
            if (bs<2) {
                System.out.println(dongu);
            }
            bs=0;
        }*/
         
        /*
        if (sayi%2==0) {
            System.out.println(sayi+" cift sayidir.");
        }
        else{
            System.out.println(sayi+" tek sayidir.");
        }
       
         */
 
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi= input.nextInt();
        int saniye;
        int dakika;
        dakika=sayi/60;
        saniye=sayi%60;
        System.out.println(dakika+" dakika "+saniye+" saniye");
         
 /*
        Scanner input = new Scanner(System.in);
        System.out.println("faiz:");
        int faizorani= input.nextInt();
        System.out.println("kredi miktari:");
        int kredimiktari= input.nextInt();
        System.out.println("yil sayisi:");
        int yil= input.nextInt();
        double aylikodeme;
        
        
        aylikodeme=(kredimiktari*faizorani)/(1-(1/(1+faizorani*12*yil)));
        System.out.println(aylikodeme);
         */
        //RASTGELE ÜRETİLEN 2 SAYIYININ TOPLAMINI KULLANICIYA SORUP KONTROL EDEN PROGRAM
        /*Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi giriniz ");
        int sayi = input.nextInt();
        if (sayi%5==0) {
            System.out.println("HiFive");
          
        }
        else if (sayi%2==0) {
            System.out.println("HiEven");
        }
         */
 /* 
        Scanner input =new Scanner(System.in);
        Random rsayi =new Random();
        int sayi1 = rsayi.nextInt(100);
        int sayi2 = rsayi.nextInt(100);
        int sonuc;
        int sayi;
        if (sayi1>=sayi2) {
            System.out.println(sayi1 + " - " + sayi2);
            sonuc = sayi1-sayi2;
            sayi=input.nextInt();
            if (sayi==sonuc) {
                System.out.println("Cevap Dogru");
            }
            else{
                System.out.println("Cevap YanlİS");
            }
        }
        else{
            System.out.println(sayi2 + " - " + sayi1);
            sonuc = sayi2-sayi1;
            sayi=input.nextInt();
            if (sayi==sonuc) {
                System.out.println("Cevap Dogru");
            }
            else{
                System.out.println("Cevap Yanlis");
            }
        }
         */
 /*
        Scanner input =new Scanner(System.in);
        System.out.println("Kilonuzu Giriniz :");
        double kilo = input.nextDouble();
        System.out.println("Boyunuzu Giriniz :");
        double boy = input.nextDouble();
        double indeks= kilo/(boy*boy);
        if (indeks<18.5) {
            System.out.println("Zayıf");
        }
        else if (indeks<25) {
            System.out.println("Normal");
        }
        else if (indeks<30) {
            System.out.println("Kilolu");
        }
        else{
         System.out.println("Obez");
        }
         */
 /*
        Scanner input =new Scanner(System.in);
        Random rsayi =new Random();
        int digit1 =rsayi.nextInt(9);     
        int digit2 =rsayi.nextInt(9);
        
        System.out.println(digit1);
        System.out.println(digit2);
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        
        if (sayi1==digit1||sayi1==digit2) {
            if (sayi2==digit1) {
                System.out.println("3000$");
            }
            else if (sayi2==digit2) {
                System.out.println("10000$");
            }
            else{
                System.out.println("1000$");
            }
        }
         */
 /*
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        switch (sayi % 12) {
            case 1:
                System.out.println("monkey");
                break;
            case 2:
                System.out.println("dog");
                break;
            case 3:
                System.out.println("pig");
                break;
            case 4:
                System.out.println("rat");
                break;
            case 5:
                System.out.println("ox");
                break;
            case 6:
                System.out.println("tiger");
                break;
            case 7:
                System.out.println("rabbit");
                break;
            case 8:
                System.out.println("dragon");
                break;
            case 9:
                System.out.println("snake");
                break;
            case 10:
                System.out.println("horse");
                break;
            case 11:
                System.out.println("sheep");
                break;
            
        }
         */
 /*
        Scanner input = new Scanner(System.in);
        Random rsayi = new Random();

        boolean cevap = false;
        int rakam1 = rsayi.nextInt(10);
        int rakam2 = rsayi.nextInt(10);
        int toplam = rakam1 + rakam2;
        int tahmin;

        while (cevap == false) {
            System.out.println(rakam1 + "+" + rakam2);
            tahmin = input.nextInt();
            if (tahmin == toplam) {
                cevap = true;
            }
        }
        
         */
 /*
        Scanner input = new Scanner(System.in);
        Random rsayi = new Random();
        int sayi = rsayi.nextInt(100);
        System.out.println("Tahmin giriniz");
        int tahmin = input.nextInt();
        while(tahmin!=sayi)
        {
            if (sayi>tahmin) {
                System.out.println("Daha büyük bir sayi giriniz");
                tahmin = input.nextInt();
            }
            else {
                System.out.println("Daha küçük bir sayi giriniz");
                tahmin = input.nextInt();
            }
        }
         */
        //100 DEN BÜYÜK 5 ASAL SAYI
        /*
        Scanner input = new Scanner(System.in);
        
        int count =0;
        System.out.println("100 den büyük bir asal sayi giriniz:");
        int sayi=input.nextInt();
        int bs=0;
        
        while(count<4){
        
            for (int dongu = 2; dongu <= sayi; dongu++) {
            
                for (int bolen = 2; bolen < sayi; bolen++) {
                        if (dongu%bolen==0) {
                        bs=bs+1;
                    }
                  
                }
                if (bs<2) {
                    System.out.println("100 den büyük bir asal sayi giriniz:");
                    sayi=input.nextInt();
                    count++;
                    break;
                }
            bs=0;
            }
        }
         */
 /*
        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
        int toplam =0;
        while (sayi!=0){
        
            toplam=sayi+toplam;
            sayi = input.nextInt();
        }
        System.out.println(toplam);
         */
 /*
        Scanner input = new Scanner(System.in);
        int toplam = 0;
        int sayi;

        do {
            sayi = input.nextInt();
            toplam += sayi;
        } while (sayi != 0);
        System.out.println(toplam);
         */
        // --------------   1   -------------
        /*
        Scanner input = new Scanner(System.in);
        System.out.println("sayi giriniz");
        int sayi = input.nextInt();
        for (int i = 0; i < sayi; i++) {
            System.out.println();
            for (int j = 0; j <= i; j++) {
                System.out.print("*" + " ");

            }
        }
        // --------------   2   -------------

        for (int i = sayi; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < i; j++) {
                System.out.print("*" + " ");

            }
        }
        // --------------   3   -------------

        for (int i = 0; i < sayi; i++) {
            System.out.println();
            for (int k = sayi; k >= i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print("*");
            }
        }
        // --------------   4   -------------

        for (int i = sayi; i >= 0; i--) {
            System.out.println();
            for (int j = i; j < sayi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");

            }
        }
        // -------------- BAKLAVA -------------
        
        for (int i = 0; i < sayi; i++) {
            System.out.println();
            for (int k = sayi; k >= i; k--) {
                System.out.print(" ");
            }

            for (int j = 0; j <= i; j++) {

                System.out.print(" *");
            }
        }
        for (int i = sayi; i >= 0; i--) {
            System.out.println();
            for (int j = i; j <= sayi; j++) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {
                System.out.print(" *");

            }
        }*/
    }

}
