package Joobsheet.Praktikum;
import java.util.Scanner;


public class cafe22 {
    public static void main(String[] args) {
        
        Scanner input =new Scanner(System.in);

        boolean keanggotaan;
        int jumlahKopi, jumlahTeh, jumlahRoti;
        float hargaKopi = 12000, hargaTeh = 7000, hargaRoti = 20000, totalHarga, nominalBayar;
        float diskon = 10 / 100f;

        System.out.println("Masukkan Keanggotaan: ");
        keanggotaan = input.nextBoolean();

        System.out.println("Masukkan Jumlah Pembelian Kopi: ");
        jumlahKopi = input.nextInt();
        
        System.out.println("Masukkan Jumlah Pembelian Teh: ");
        jumlahTeh = input.nextInt();
        
        System.out.println("Masukkan Jumlah Pembelian Roti: ");
        jumlahRoti = input.nextInt();

        totalHarga = (jumlahKopi * hargaKopi) + (jumlahTeh * hargaTeh) + (hargaRoti + hargaRoti);

        nominalBayar = totalHarga - (diskon * totalHarga);

        System.out.println("Keanggotaan Pelanggan: "+ keanggotaan);
        System.out.println("Item Pembelian: "+ jumlahKopi+ " Kopi "+ jumlahTeh + " Teh " + jumlahRoti + "Roti");
        System.out.println("Nominal Bayar: " + nominalBayar);
        
    }
}
