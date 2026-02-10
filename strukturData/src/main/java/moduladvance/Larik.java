/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package moduladvance;

/**
 *
 * @author Celvin Pati
 */
public class Larik {
    private int[] data;

    public Larik(int[] data) {
        this.data = data.clone();
    }

    public void mergeSort() {
        mergeSort(data, 0, data.length - 1);
    }

    private static void mergeSort(int[] data, int awal, int akhir) {
        if (awal < akhir) {
            int mid = awal + (akhir - awal) / 2;
            mergeSort(data, awal, mid);
            mergeSort(data, mid + 1, akhir);
            merge(data, awal, mid, akhir);
        }
    }

    private static void merge(int[] src, int awal, int mid, int akhir) {
        int n1 = mid - awal + 1;
        int n2 = akhir - mid;

        int[] kiri = new int[n1];
        int[] kanan = new int[n2];

        for (int i = 0; i < n1; i++)
            kiri[i] = src[awal + i];
        for (int j = 0; j < n2; j++)
            kanan[j] = src[mid + 1 + j];

        int i = 0, j = 0, k = awal;
        while (i < n1 && j < n2) {
            if (kiri[i] <= kanan[j]) {
                src[k] = kiri[i];
                i++;
            } else {
                src[k] = kanan[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            src[k] = kiri[i];
            i++;
            k++;
        }

        while (j < n2) {
            src[k] = kanan[j];
            j++;
            k++;
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int num : data) {
            sb.append(num).append(" ");
        }
        return sb.toString().trim();
    }

    // Uji Coba
    public static void main(String[] args) {
        int[] dataUji = {23, 56, 45, 12, 67, 86, 43, 66, 99, 25, 61, 5, 78, 76, 33, 63, 5, 8, 15, 20};
        Larik larik = new Larik(dataUji);
        System.out.println("Sebelum sorting: " + larik);

        larik.mergeSort();
        System.out.println("Setelah sorting: " + larik);
    }
}
    

