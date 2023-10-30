/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package si_regpagi.pkg22166009.latihan26.programtunjangan;
import java.util.*;
import java.text.*;
/**
 *
 * @author HP
 * Nama     : Affa Muntazah
 * Kelas    : PBO 026
 * NIM      : 22166009
 * Deskripsi Program : Waktu Saat Ini
 */
public class SI_RegPagi22166009Latihan26ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Date HariSekarang = new Date( );
        SimpleDateFormat ft = 
        new SimpleDateFormat ("E, dd.MM.yyyy hh:mm:ss a zzz");

      System.out.println("Hari ini adalah hari: " + ft.format(HariSekarang));
    }
}