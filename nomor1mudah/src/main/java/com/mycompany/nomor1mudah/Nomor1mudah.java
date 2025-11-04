/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nomor1mudah;

/**
 *
 * @author LENOVO
 */
import java.util.Scanner;
public class Nomor1mudah {

    


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan berat paket (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan jarak tempuh (km): ");
        double jarak = input.nextDouble();

        System.out.print("Masukkan panjang (cm): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar (cm): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi (cm): ");
        double tinggi = input.nextDouble();

        double volume = panjang * lebar * tinggi; // cm^3
        double biayaPerKg;

        if (jarak <= 10) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }

        double totalBiaya = berat * biayaPerKg;

        if (volume > 100) {
            totalBiaya += 50000;
        }

      System.out.println("\n=== RINCIAN PENGIRIMAN ===");
        System.out.println("Volume paket : " + volume + " cm^3");
        System.out.println("Biaya pengiriman: Rp " + totalBiaya);
     }
}
