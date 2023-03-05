/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugas1;

import java.util.Scanner;

/**
 *
 * @author angga
 */
public class Menu {
       static void menu() {
       String pilih;
       System.out.println("Menu Utama\n"
               + "==========\n"
               + "1. Hitung Balok\n"
               + "2. Hitung Tabung\n"
               + "3. Exit\n"
               + "Pilih: ");
       Scanner input =  new Scanner(System.in);
       pilih = input.nextLine();
       
       switch(pilih) {
           case "1":
               System.out.println("Input");
            break;
       }
       menu();
   }
}
