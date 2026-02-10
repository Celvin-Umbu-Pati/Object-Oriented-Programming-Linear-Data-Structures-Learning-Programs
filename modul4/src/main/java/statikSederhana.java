
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class statikSederhana {// Awal class statikSederhana
    public static void main(String[] args) { // awal metode utama
        Scanner keyboard = new Scanner(System.in); // Membuat objek Scanner untuk menerima input dari keyboard

        // Meminta pengguna untuk memasukkan jumlah data yang akan diolah
        System.out.print("Masukkan banyak data yang akan diolah: ");
        int N = keyboard.nextInt(); // Membaca jumlah data yang akan diproses dan menyimpannya dalam variabel N

        int totalData = 0; // Inisialisasi variabel untuk menyimpan total data
        int totalKuadrat = 0; // Inisialisasi variabel untuk menyimpan total kuadrat dari data
        int maks = (int) Double.NEGATIVE_INFINITY; // Inisialisasi variabel untuk data terbesar dengan nilai terkecil
        int min = (int) Double.POSITIVE_INFINITY; // Inisialisasi variabel untuk data terkecil dengan nilai terbesar

        int i = 0; // Variabel untuk menghitung jumlah iterasi
        while (i < N) { // Selama i kurang dari N, teruskan loop
            System.out.print("Masukkan data ke " + (i + 1) + ": "); // Meminta pengguna memasukkan data ke-i
            int data = (int) keyboard.nextDouble(); // Membaca input data dari pengguna

            // Menghitung total dan total kuadrat
            totalData += data; // Menambahkan data yang dimasukkan ke total data
            totalKuadrat += data * data; // Menambahkan kuadrat dari data yang dimasukkan ke total kuadrat

            // Menentukan data terbesar dan terkecil
            if (data > maks) { // Jika data yang dimasukkan lebih besar dari nilai maks saat ini
                maks = data; // Update nilai maks dengan data yang baru
            }
            if (data < min) { // Jika data yang dimasukkan lebih kecil dari nilai min saat ini
                min = data; // Update nilai min dengan data yang baru
            }

            i++; // Incrementi i untuk perulangan selanjutnya
        }

        // Menghitung statistik
        int rentang = (int) (maks - min); // Menghitung rentang data sebagai selisih antara data terbesar dan terkecil
        int rataRata = (int) (totalData / N); // Menghitung rata-rata dengan membagi total data dengan jumlah data
        int variansi = (int) ((totalKuadrat - (N * rataRata * rataRata)) / N); // Menghitung variansi
        int deviasiStandar = (int) Math.sqrt(variansi); // Menghitung deviasi standar sebagai akar kuadrat dari variansi

        // Menampilkan hasil perhitungan
        System.out.println("Data terbesar: " + maks); // Menampilkan data terbesar
        System.out.println("Data terkecil: " + min); // Menampilkan data terkecil
        System.out.println("Rentang data: " + rentang); // Menampilkan rentang data
        System.out.println("Rata-rata: " + rataRata); // Menampilkan rata-rata
        System.out.println("Variansi: " + variansi); // Menampilkan variansi
        System.out.println("Deviasi standar: " + deviasiStandar); // Menampilkan deviasi standar

    } // Akhir metode utama
} // Akhir kelas StatistikSederhana

