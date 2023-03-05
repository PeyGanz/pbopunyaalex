/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author angga
 */

public class Tugas1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }
    
   static void menu() {
       String pilih, ulang;
       double p,l,t;
       System.out.print("Menu Utama\n"
               + "==========\n"
               + "1. Hitung Balok\n"
               + "2. Hitung Tabung\n"
               + "3. Exit\n"
               + "Pilih: ");
       Scanner input =  new Scanner(System.in);
       pilih = input.nextLine();
       
       switch(pilih) {
           case "1":
               System.out.print("Input Panjang: ");
               p = input.nextDouble();
               System.out.print("Input Lebar: ");
               l = input.nextDouble();
               System.out.print("Input Tinggi: ");
               t = input.nextDouble();
               
               Balok bangunku = new Balok(p,l,t);
               bangunku.hitungLuas();               
               bangunku.hitungKeliling();
               bangunku.hitungVolume();
               bangunku.hitungLuasPermukaan();
               System.out.println("Luas Persegi Panjang= "+bangunku.getLuas());
               System.out.println("Keliling Persegi Panjang= "+bangunku.getKeliling());
               System.out.println("Volume Balok= "+bangunku.getVolume());
               System.out.println("Luas Permukaan Balok= "+bangunku.getLuasPermukaan());
            break;
            
            case "2":
               System.out.print("Input Tinggi: ");
               p = input.nextDouble();
               System.out.print("Input Jari - jari: ");
               l = input.nextDouble();
               
               Tabung tabungku = new Tabung(l,p);
               tabungku.hitungLuas();               
               tabungku.hitungKeliling();
               tabungku.hitungVolume();
               tabungku.hitungLuasPermukaan();
               System.out.println("Luas Lingkaran= "+tabungku.getLuas());
               System.out.println("Keliling Lingkaran= "+tabungku.getKeliling());
               System.out.println("Volume Tabung= "+tabungku.getVolume());
               System.out.println("Luas Permukaan Tabung= "+tabungku.getLuasPermukaan());
            break;
            
            default:
                System.out.println("Salah input");
            break;
       }
       System.out.print("Ulangi? (Ya: 1 || Tidak: 0)");
       ulang = input.next();
       
       if(ulang.equals("1")) menu();
   }
}