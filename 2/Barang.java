/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package minggu2;

/**
 *
 * @author Diah Putri Nofianti
 */
public class Barang {
    String namaBarang, jenisBarang;
    int stok, hargaSatuan;

    Barang() {
    }
    
    Barang(String nm, String jn, int st, int hs){
        namaBarang = nm;
        jenisBarang = jn;
        stok = st;
        hargaSatuan = hs;
    }
    
    void tampilBarang() {
        System.out.println("\nNama : " + namaBarang);
        System.out.println("Jenis : " + jenisBarang);
        System.out.println("Stok : " + stok);
        System.out.println("Harga Satuan : Rp. " + hargaSatuan);
    }
    
    void tambahStok(int n) {
        stok+=n;
    }
    
    void kurangStok(int n){
        if(stok >= n){
        stok-=n;
        }
    }
    
    int hitungTotal(int jml){
        return jml*hargaSatuan;
    }
    
}