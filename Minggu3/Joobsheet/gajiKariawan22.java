package Joobsheet;

import java.util.Scanner;

public class gajiKariawan22 {
    public static void main(String[] args) {
        int jamKerja, upahPerJam, gajikariawan;
        double persenBonus = 0.1, persenPajak = 0.05;

        Scanner input = new Scanner(System.in);
        jamKerja = input.nextInt();
        upahPerJam =input.nextInt();

        double totalGaji = jamKerja * upahPerJam;
        double bonus = (totalGaji+persenBonus);
        double pajak = persenPajak * (totalGaji+bonus);
        double gajiBersih = (totalGaji+bonus)-pajak;

        System.out.println(totalGaji);
        System.out.println(bonus);
        System.out.println(pajak);
        System.out.println(gajiBersih);
    }
}
