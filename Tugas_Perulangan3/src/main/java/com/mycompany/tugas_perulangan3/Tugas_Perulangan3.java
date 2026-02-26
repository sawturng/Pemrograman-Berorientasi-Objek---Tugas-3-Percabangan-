/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_perulangan3;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */

public class Tugas_Perulangan3 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;
        int hasil = 1;

        System.out.print("Masukkan nilai n (>=0): ");
        n = input.nextInt();

        System.out.print(n + "! = ");

        for (int i = n; i >= 1; i--) {
            hasil *= i;
            System.out.print(i);

            if (i > 1) {
                System.out.print("*");
            }
        }

        System.out.println(" = " + hasil);
    }
}