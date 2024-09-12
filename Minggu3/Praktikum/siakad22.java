package Joobsheet.Praktikum;
import java.util.Scanner;

public class siakad22 {
    public static void main(String[] args) {
    Scanner scanner =new Scanner(System.in);

        String nama, nim;
        char kelas;
        byte absen;
        double nilaiKuis, nilaiTugas, nilaiUjian, nilaiAkhir;

        System.out.println("Masukkan Nama:");
        nama = scanner.nextLine();
        System.out.println("Masukkan NIM:");
        nim = scanner.nextLine();
        System.out.println("Masukkan Kelas:");
        kelas = scanner.nextLine().charAt(0);
        System.out.println("Masukkan Nomor Absen:");
        absen = scanner.nextByte();
        System.out.println("Masukkan Nilai Kuis:");
        nilaiKuis = scanner.nextDouble();
        System.out.println("Masukkan Nilai Tugas:");
        nilaiTugas = scanner.nextDouble();
        System.out.println("Masukkan Nilai ujian:");
        nilaiUjian = scanner.nextDouble();

        nilaiAkhir = (nilaiKuis + nilaiTugas + nilaiUjian) /3;

        System.out.println("Nama: "+ nama);
        System.out.println("NIM: "+ nim);
        System.out.println("Kelas: "+ kelas);
        System.out.println("Absen: "+ absen);
        System.out.println("Nilai Akhir: "+ nilaiAkhir);

        
    }
}
