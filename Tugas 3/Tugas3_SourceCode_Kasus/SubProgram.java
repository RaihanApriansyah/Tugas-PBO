//NIM = 13020220014
//Nama = Raihan Apriansyah
//Hari/Tanggal = Jumat 08/03/2024
//Waktu Pengerjaan = 20.43 - 20.53

import java.util.Scanner;

public class SubProgram {
    public static int maxab(int a, int b) {
        return ((a >= b) ? a : b);
    }

    public static void tukar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        System.out.println("Ke dua bilangan setelah tukar: a = " + a + " b = " + b);
    }

    public static void main(String[] args) {
        int a, b;
        Scanner masukan = new Scanner(System.in);
        System.out.print("Maksimum dua bilangan\n");
        System.out.print("Ketikkan dua bilangan, pisahkan dg RETURN : \n");
        a = masukan.nextInt();
        b = masukan.nextInt();
        System.out.println("Ke dua bilangan : a = " + a + " b = " + b);
        System.out.println("Maksimum = " + (maxab(a, b)));
        System.out.print("Tukar kedua bilangan...\n");
        tukar(a, b);
    }
}
