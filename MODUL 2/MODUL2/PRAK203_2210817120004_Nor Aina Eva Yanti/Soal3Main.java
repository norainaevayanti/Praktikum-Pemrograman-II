package MODUL2;
public class Soal3Main {
    public static void main(String[] args) {
        Pegawai p1 = new Pegawai(); // Menggunakan Pegawai sebagai nama class yang telah diperbaiki
        p1.nama = "Roi";
        p1.asal = "Kingdom of Orvel";
        p1.setJabatan("Assasin"); 
        p1.umur = 17 ; //Pada baris dibawah ini belum terdapat pendeklarasian pada umur

        System.out.println("Nama Pegawai: " + p1.getNama());
        System.out.println("Asal: " + p1.getAsal());
        System.out.println("Jabatan: " + p1.jabatan);
        System.out.println("Umur: " + p1.umur + " tahun");
    }
}