/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Celvin Pati
 */
public class hargaBensin {
   //  deklarasi kelas dengan nama "hargaBensin"
    // Semua kode program berada di dalam kelas ini

    public static void main(String[] args) {
        // metode main() adalah titik masuk program
        // eksekusi program dimulai di sini

        int hargaLiter = 6500;
        //deklarasikan variabel hargaLiter dengan nilai 6500

        int jumlah = 1;
        // deklarasikan variabel jumlah dan nilai awal 1

        System.out.println("Harga per liter Rp " + hargaLiter);
        // Mencetak teks "Harga per liter Rp " diikuti dengan nilai hargaLiter

        System.out.println("Jumlah liter\tHarga (Rp)");
        // Mencetak judul kolom "Jumlah liter" dan "Harga (Rp)"

        System.out.println("=================================");
        // Mencetak garis pembatas

        while (jumlah <= 20) {
            // Memulai loop while selama jumlah kurang dari atau sama dengan 20
            int totalHarga = jumlah * hargaLiter;
            // Menghitung total harga dengan mengalikan jumlah dengan hargaLiter
            System.out.println(jumlah + "\t\t" + totalHarga);
            // Mencetak jumlah liter dan total harga
            jumlah++;
            // Menambah nilai jumlah dengan 1 untuk loop selanjutnya
        }

        System.out.println("=================================");
        // Mencetak garis pembatas di akhir
    }//akhir metode utama
}//akhir klass hargaBensin

