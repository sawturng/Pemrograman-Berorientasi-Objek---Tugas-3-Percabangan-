/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.tugas_perulangan1;

import java.util.Scanner;

/**
 *
 * @author My MSI
 */

public class Tugas_Perulangan1 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n;

        System.out.print("Masukkan nilai n (>=1): ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
        }
    }
}