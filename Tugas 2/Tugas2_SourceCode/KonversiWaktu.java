//NIM = 13020220014
//Nama = Raihan Apriansyah
//Hari/Tanggal = Senin 04/03/2024
//Waktu Pengerjaan = 22.45 - 23.15

import java.util.Scanner;

public class KonversiWaktu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan total detik: ");
        int totalDetik = scanner.nextInt();

        int detikSekarang = totalDetik % 60;
        int totalMenit = totalDetik / 60;
        int menitSekarang = totalMenit % 60;
        int totalJam = totalMenit / 60;
        int jamSekarang = totalJam % 24;

        String waktuFormat = String.format("%02d:%02d:%02d", jamSekarang, menitSekarang, detikSekarang);

        System.out.println("Waktu sekarang: " + waktuFormat);

        scanner.close();
    }
}
