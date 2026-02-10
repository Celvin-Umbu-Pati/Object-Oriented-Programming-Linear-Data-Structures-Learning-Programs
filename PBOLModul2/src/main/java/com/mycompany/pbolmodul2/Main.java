/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pbolmodul2;

/**
 *
 * @author Celvin Pati
 */
public class Main {
    public static void main(String[] args) {
        // 1. Objek kantor
        Kantor kantor = new Kantor();

        // 2. Objek manager
        Manager m = new Manager();
        m.setNama("Celvin");
        m.setNip("M.1111");
        m.setGolongan(3);
        m.setJumAnak(2);
        m.setJamKerja(10);
        m.setIstri(1);
        m.setStudi(false);

        kantor.setManager(m);

        // 3. Objek pegawai
        Marketing p1 = new Marketing();
        p1.setNip("P.1234");
        p1.setNama("Cia");
        p1.setGolongan(1);
        p1.setJamKerja(9);
        p1.setStudi(false);

        Honorer p2 = new Honorer();
        p2.setNip("P.4321");
        p2.setNama("Delta");
        p2.setGolongan(2);

        Marketing p3 = new Marketing();
        p3.setNip("P.5678");
        p3.setNama("Diana");
        p3.setGolongan(2);
        p3.setJamKerja(10);
        p3.setStudi(true);

        Pegawai[] daftar = {p1, p2, p3};
        kantor.setPegawai(daftar);

        // 4. Output
        System.out.println("Nama Manager : " + kantor.getManager().getNama());
        System.out.println("Daftar Pegawai");
        System.out.println("======================================");
        System.out.println("No.  NIP      Nama    Studi     Gaji");

        int i = 1;
        for (Pegawai p : kantor.getPegawai()) {
            String status = "-";
            if (p instanceof TugasBelajar) {
                status = ((TugasBelajar)p).isSelesai() ? "selesai" : "studi";
            }
            System.out.println(i + "   " + p.getNip() + "   " + p.getNama() + "   " + status + "   " + p.hitungGatot());
            i++;
        }
        System.out.println("======================================");
        System.out.println("Jumlah Gaji Kantor = " + kantor.hitGajiPeg());
    }
}
