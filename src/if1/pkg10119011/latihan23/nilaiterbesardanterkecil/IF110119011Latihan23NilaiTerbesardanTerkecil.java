/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119011.latihan23.nilaiterbesardanterkecil;

import java.util.Scanner;

/**
 *
 * @author 
 *  Nama    : Reihan Wiyanda
 *  Kelas   : IF-1
 *  Nim     : 10119011
 */
public class IF110119011Latihan23NilaiTerbesardanTerkecil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int n;
        int [] nilai = new int [20];
        int i;
        String nama;
        
        System.out.println("===Program Nilai Terbesar dan Terkecil===");
        Scanner sc = new Scanner (System.in);
        System.out.print("Masukan nama petugas : ");
        nama = sc.nextLine();
        //
        System.out.print("Masukan banyaknya mahasiswa : ");
        n = sc.nextInt();
        
        for (i = 0; i < n; i++) {
            System.out.print("Masukan nilai mahasiswa ke-" + (i+1) + " : ");
            nilai[i] = sc.nextInt();
        }
        System.out.println("===Hasil Perhitungan===");
        for (i = 0; i < n; i++) {
            System.out.println("Nilai mahasiswa ke-" + (i+1) + " : " + nilai[i]);
    }
        int min = nilai [1];
        int max = nilai [1];
        
        for (i = 0; i < n; i++) {
            
            if (nilai[i] > max) {
                max = nilai[i];
                
            }else if (nilai[i] < min) {
                        min = nilai[i];
                        }
            }
        System.out.println("Nilai terbesar adalah : " + max);
        System.out.println("Nilai terkecil adalah : " + min);
        System.out.println("Nama petugas : " + nama);
    }  
}
