/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.tatang.sulaeman.perhitunganlingkaran.tugas;

/**
 *
 * @author 
 * NAMA     : TATANG SULAEMAN
 * KELAS    : PBOIF2
 * NIM      : 10119068
 * Deskripsi program    : Menampilkan perhitungan lingkaran
 */
public class Main {
    public static void main(String[] args){
        Lingkaran dataLingkaran = new Lingkaran();
       
            System.out.println("----------Perhitungan Lingkaran----------");
            
            dataLingkaran.inputDiameter();
            System.out.println("----------Hasil Perhitungan Lingkaran----------"); 
            System.out.println("\"Jari-Jari Lingkaran\t= " + dataLingkaran.hitungJariJariLingkaran()+ "cm");
            System.out.println("Luas Lingkaran\t\t= " + dataLingkaran.hitungLuasLingkaran() + "cm");
            System.out.println("Keliling Lingkaran\t= " + dataLingkaran.hitungKelilingLingkaran() + "cm" );
            System.out.println("DIBUAT OLEH TATANG SULAEMAN");

        
    }
}
