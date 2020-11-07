/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatang.sulaeman.perhitunganlingkaran.tugas;

import java.util.Scanner;
/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan perhitungan lingkaran
 */
public class Lingkaran {
    Scanner keyboard = new Scanner(System.in);
    String filterAngka;
    double diameterLingkaran;
    boolean kondisi = true;
    
    public double inputDiameter(){
        do {
            System.out.print("Masukan nilai diameter lingkaran : ");
            filterAngka = keyboard.nextLine();
            if(filterAngka.matches("[0-9]*")){
                diameterLingkaran = Integer.parseInt(filterAngka);
                kondisi = true;
            } else {
                System.out.println("Nilai Diameter Tidak Sesuai!!!");
                System.out.println("");
                kondisi = false ;
            }
        }while (!kondisi);
        return diameterLingkaran;
    }
    
    public double hitungJariJariLingkaran(){
        return diameterLingkaran/2;
    }
    
    public double hitungLuasLingkaran(){
        return 3.14*hitungJariJariLingkaran()*hitungJariJariLingkaran();
    }
    
    public double hitungKelilingLingkaran(){
        return 2* 3.14 * hitungJariJariLingkaran();
    }
}
