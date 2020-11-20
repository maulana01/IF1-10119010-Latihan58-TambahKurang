/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10119010.latihan58.tambahkurang;

/**
 *
 * @author Maulana Imam Malik
 * NAMA     : Maulana Imam Malik
 * KELAS    : IF1
 * NIM      : 10119010
 * Deskripsi Program : Program ini menampilkan penjumlahan dan pengurangan dengan konsep OOP
 */
public class IF110119010Latihan58TambahKurang {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JumlahBilangan penjumlahan;
        SelisihBilangan pengurangan;
        
        penjumlahan = new JumlahBilangan();
        penjumlahan.tampilHasilJumlah();
        
        pengurangan = new SelisihBilangan();
        pengurangan.tampilSelisih();
    }
    
}
