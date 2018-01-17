/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projek9;

/**
 *
 * @author User
 */
import java.util.Scanner;
public class MesraHujungMinggu {
public static void main(String args[]){
 
    Scanner input=new Scanner(System.in);
    int umur;
    double harga=0.00;
    char jawab;
    String nama;
    int no_ahli = 0;
    
    System.out.print("Sila Masukkan Nama Anda: ");
    nama=input.nextLine();
    
    System.out.println("Ada kad ahli (Y/T) :-");
    jawab=input.findInLine(".").charAt(0);
    if (jawab == 'Y' || jawab == 'y'){
        System.out.print("Masukkan no.keahlian anda: ");
        no_ahli=input.nextInt();
    }
    
    System.out.print("Umur anda sekarang:  ");
    umur=input.nextInt();
    
    if (umur >=12 || umur < 65){
        harga=9.25;
    }
    if (umur <12 || umur >= 65){
        harga=5.25;
    }
    if ((jawab == 'Y' || jawab == 'y') && (umur >=12 && umur < 65)){
        harga=2.00;
    }
    
    System.out.println("****************WAYANG KITA*********************");
    System.out.println("                Hai "+nama+",");
    if (jawab == 'Y' || jawab == 'y'){
    System.out.println("         No. Keahlian anda : "+no_ahli);
}
    System.out.println("Sila bayar sebanyak RM "+harga+" . SELAMAT MENONTON!!");
    System.out.println("************************************************");
    
    }
}