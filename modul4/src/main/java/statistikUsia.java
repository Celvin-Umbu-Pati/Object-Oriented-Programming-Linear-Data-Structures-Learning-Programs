/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Celvin Pati
 */
import java.util.ArrayList; // Mengimpor kelas ArrayList untuk menyimpan data usia
import java.util.Scanner; // Mengimpor kelas Scanner untuk mengambil input dari pengguna

public class statistikUsia { // Mendefinisikan kelas bernama statistikUsia
    private static ArrayList<Integer> dataUsia = new ArrayList<>(); // Membuat daftar untuk menyimpan usia
    public static void main(String[] args) { // Metode utama untuk menjalankan program
        Scanner keyboard = new Scanner(System.in); // Membuat objek Scanner untuk membaca input dari pengguna
        int pilihan; // Variabel untuk menyimpan pilihan menu
        do { // Memulai loop untuk menampilkan menu
            System.out.println("Menu:"); // Menampilkan teks menu
            System.out.println("1. Memasukkan data usia"); // Opsi untuk memasukkan data usia
            System.out.println("2. Rata-rata"); // Opsi untuk menghitung rata-rata usia
            System.out.println("3. Deviasi standar"); // Opsi untuk menghitung deviasi standar usia
            System.out.println("4. Diagram batang"); // Opsi untuk menampilkan diagram batang usia
            System.out.println("5. Keluar"); // Opsi untuk keluar dari program
            System.out.println("Pilih menu (1-5): "); // Meminta pengguna memilih menu
            pilihan = keyboard.nextInt(); // Menerima input pilihan dari pengguna
            // Menggunakan switch untuk menentukan tindakan berdasarkan pilihan
            switch (pilihan) {
                case 1:
                    memasukkanDataUsia(keyboard); // Memanggil metode untuk memasukkan data usia
                    break;
                case 2:
                    hitungRataRata(); // Memanggil metode untuk menghitung rata-rata usia
                    break;
                case 3:
                    hitungDeviasiStandar(); // Memanggil metode untuk menghitung deviasi standar
                    break;
                case 4:
                    tampilkanDiagramBatang(); // Memanggil metode untuk menampilkan diagram batang
                    break;
                case 5:
                    System.out.println("Keluar dari program."); // Menampilkan pesan keluar
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi."); // Menampilkan pesan jika pilihan tidak valid
            }
        } while (pilihan != 5); // Loop berlanjut sampai pengguna memilih untuk keluar

        keyboard.close(); // Menutup Scanner setelah selesai
    }
    // Metode untuk memasukkan data usia
    private static void memasukkanDataUsia(Scanner scanner) {
        System.out.print("Masukkan usia (0-100) atau -1 untuk selesai: "); // Meminta pengguna memasukkan usia
        int usia; // Variabel untuk menyimpan usia yang dimasukkan
        while ((usia = scanner.nextInt()) != -1) { // Loop hingga pengguna memasukkan -1 untuk berhenti
            if (usia >= 0 && usia <= 100) { // Memeriksa apakah usia dalam rentang yang valid
                dataUsia.add(usia); // Menambahkan usia ke daftar jika valid
            } else {
                System.out.println("Usia harus dalam rentang 0-100."); // Menampilkan pesan jika usia tidak valid
            }
            System.out.print("Masukkan usia (0-100) atau -1 untuk selesai: "); // Meminta input lagi
        }
    }
    // Metode untuk menghitung rata-rata usia
    private static void hitungRataRata() {
        if (dataUsia.isEmpty()) { // Memeriksa apakah daftar usia kosong
            System.out.println("Data usia kosong."); // Menampilkan pesan jika tidak ada data
            return; // Menghentikan eksekusi metode
        }
        double total = 0; // Variabel untuk menyimpan total usia
        for (int usia : dataUsia) { // Loop untuk menjumlahkan semua usia
            total += usia; // Menambahkan usia ke total
        }
        double rataRata = total / dataUsia.size(); // Menghitung rata-rata
        System.out.println("Rata-rata usia: " + rataRata); // Menampilkan hasil rata-rata
    }

    // Metode untuk menghitung deviasi standar
    private static void hitungDeviasiStandar() {
        if (dataUsia.isEmpty()) { // Memeriksa apakah daftar usia kosong
            System.out.println("Data usia kosong."); // Menampilkan pesan jika tidak ada data
            return; // Menghentikan eksekusi metode
        }
        double rataRata = 0; // Variabel untuk menyimpan rata-rata usia
        for (int usia : dataUsia) { // Loop untuk menjumlahkan semua usia
            rataRata += usia; // Menambahkan usia ke rata-rata
        }
        rataRata /= dataUsia.size(); // Menghitung rata-rata

        double deviasiStandar = 0; // Variabel untuk menyimpan deviasi standar
        for (int usia : dataUsia) { // Loop untuk menghitung deviasi standar
            deviasiStandar += Math.pow(usia - rataRata, 2); // Menjumlahkan kuadrat selisih antara usia dan rata-rata
        }
        deviasiStandar = Math.sqrt(deviasiStandar / dataUsia.size()); // Menghitung deviasi standar
        System.out.println("Deviasi standar usia: " + deviasiStandar); // Menampilkan hasil deviasi standar
    }

    // Metode untuk menampilkan diagram batang usia
    private static void tampilkanDiagramBatang() {
        if (dataUsia.isEmpty()) { // Memeriksa apakah daftar usia kosong
            System.out.println("Data usia kosong."); // Menampilkan pesan jika tidak ada data
            return; // Menghentikan eksekusi metode
        }

        int[] kelompok = new int[5]; // Array untuk menghitung jumlah usia dalam kelompok

        // Mengelompokkan usia ke dalam kategori
        for (int usia : dataUsia) { // Loop untuk setiap usia dalam daftar
            if (usia <= 20) {
                kelompok[0]++; // Menambahkan hitungan untuk kelompok 0-20
            } else if (usia <= 40) {
                kelompok[1]++; // Menambahkan hitungan untuk kelompok 21-40
            } else if (usia <= 60) {
                kelompok[2]++; // Menambahkan hitungan untuk kelompok 41-60
            } else if (usia <= 80) {
                kelompok[3]++; // Menambahkan hitungan untuk kelompok 61-80
            } else {
                kelompok[4]++; // Menambahkan hitungan untuk kelompok 81-100
            }
        }

        // Menampilkan diagram batang untuk setiap kelompok usia
        System.out.println("Diagram Batang Usia:");
        System.out.println("0 - 20 : " + kelompok[0] + "*"); // Menampilkan kelompok 0-20
        System.out.println("21 - 40 : " + kelompok[1] + "*"); // Menampilkan kelompok 21-40
        System.out.println("41 - 60 : " + kelompok[2] + "*"); // Menampilkan kelompok 41-60
        System.out.println("61 - 80 : " + kelompok[3] + "*"); // Menampilkan kelompok 61-80
        System.out.println("81 - 100 : " + kelompok[4] + "*"); // Menampilkan kelompok 81-100
    }
}