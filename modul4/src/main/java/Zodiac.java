
import java.util.Scanner;//mengimport java until scanner

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class Zodiac {//awal kelas zodiac
    public static void main(String[] args) {//awa; metode utama
        Scanner keyboard = new Scanner(System.in);//objek scanner untuk input dari pengguna 

        // Input namaGusti
        
        System.out.print("Masukkan Nama Kamu: ");//meminta input nama pada pengguna
        String nama = keyboard.nextLine();//baca input dari pengguna

        // Input alamat
        System.out.print("Masukkan Alamat/Tempat Lahir Kamu: ");//meminta input alamat pada pengguna
        String alamat = keyboard.nextLine();//membaca input nama

        // Input tanggal dan bulan lahir
        System.out.print("Masukkan Tanggal Lahir Kamu (1-31): ");//meminta input tanggal lahir 
        int tanggal = keyboard.nextInt();//baca tanggal lahir
        System.out.print("Masukkan Bulan Lahir Kamu (1-12): ");//meminta input bulan lahir
        int bulan = keyboard.nextInt();//baca bulan lahir

        // Menentukan zodiak dan sifatnya
        String zodiak = "";//deklarasi varibel menyimpan nama zodiac
        String sifat = "";//deklarasi variabel untuk menyimpan sifat zodiac

        if ((bulan == 1 && tanggal >= 20) || (bulan == 2 && tanggal <= 18)) {
            zodiak = "Aquarius";//jika zodiac adalah aquarius
            sifat = "Inovatif, bebas, dan idealis.";//sifat zodiac A
        } else if ((bulan == 2 && tanggal >= 19) || (bulan == 3 && tanggal <= 20)) {
            zodiak = "Pisces";//jika zodiac pisces
            sifat = "Empatik, intuitif, dan artistik.";//sifat zodiac B
        } else if ((bulan == 3 && tanggal >= 21) || (bulan == 4 && tanggal <= 19)) {
            zodiak = "Aries";//jika zodiac Aries
            sifat = "Berani, penuh semangat, dan pemimpin.";//sifat zodiac C
        } else if ((bulan == 4 && tanggal >= 20) || (bulan == 5 && tanggal <= 20)) {
            zodiak = "Taurus";//jika zodiac Taurus
            sifat = "Murah hati, penyayang, dan praktis.";//Sifat zodiac D
        } else if ((bulan == 5 && tanggal >= 21) || (bulan == 6 && tanggal <= 20)) {
            zodiak = "Gemini";//jika zodiac Gemini
            sifat = "Fleksibel, cerdas, dan komunikatif.";//sifat zodiac E
        } else if ((bulan == 6 && tanggal >= 21) || (bulan == 7 && tanggal <= 22)) {
            zodiak = "Cancer";//jika Zodiac Cancer
            sifat = "Perasa, pelindung, dan sentimental.";//sifat zodiac F
        } else if ((bulan == 7 && tanggal >= 23) || (bulan == 8 && tanggal <= 22)) {
            zodiak = "Leo";//jika zodizc Leo
            sifat = "Percaya diri, kreatif, dan penuh cinta.";//sifat zodiac G
        } else if ((bulan == 8 && tanggal >= 23) || (bulan == 9 && tanggal <= 22)) {
            zodiak = "Virgo";//jika zodiac Virgo
            sifat = "Analitis, praktis, dan detail-oriented.";//sifat zodiac H
        } else if ((bulan == 9 && tanggal >= 23) || (bulan == 10 && tanggal <= 22)) {
            zodiak = "Libra";//jika zodiac Libra
            sifat = "Adil, sosial, dan romantis.";//sifat zodiac I
        } else if ((bulan == 10 && tanggal >= 23) || (bulan == 11 && tanggal <= 21)) {
            zodiak = "Scorpio";//jika zodiac Scorpio
            sifat = "Intens, misterius, dan bersemangat.";//sifat zodiac J
        } else if ((bulan == 11 && tanggal >= 22) || (bulan == 12 && tanggal <= 21)) {
            zodiak = "Sagitarius";//jika zodiac Sagitarius
            sifat = "Optimis, petualang, dan jujur.";//sifat zodiac K
        } else if ((bulan == 12 && tanggal >= 22) || (bulan == 1 && tanggal <= 19)) {
            zodiak = "Capricon";//jika sodiac Capricon
            sifat = "Disiplin, bertanggung jawab, dan ambisius.";//sifat zodiac L
        } else {
            System.out.println("Tanggal atau bulan tidak valid.");
            return;//menghentikan program jika tanggal&bulan tidak valid
        }

        // Output
        System.out.println("Kamu berbintang: "  + zodiak);//tampil zodiac pengguna
        System.out.println("Sifat kamu: "  + sifat);//tampil sifat zodiac
        System.out.println("alamat/tempat lahir Kamu: Di " + alamat);//tampil alamat pengguna
    }//akhir metode utama
}//akhir class zodiac

