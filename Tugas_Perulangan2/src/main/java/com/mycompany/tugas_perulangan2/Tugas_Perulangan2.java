/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_perulangan2;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */

public class Tugas_Perulangan2 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int batasAwal, batasAkhir;
        int jumlahGanjil = 0;

        System.out.print("Masukkan batas awal: ");
        batasAwal = input.nextInt();

        System.out.print("Masukkan batas akhir: ");
        batasAkhir = input.nextInt();

        System.out.print("Bilangan ganjil: ");

        for (int i = batasAwal; i <= batasAkhir; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                jumlahGanjil++;
            }
        }

        System.out.println();
        System.out.println("Jumlah bilangan ganjil: " + jumlahGanjil);
    }
}