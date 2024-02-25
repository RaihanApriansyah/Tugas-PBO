//NIM = 13020220014
//Nama = Raihan Apriansyah
//Hari/Tanggal = Rabu 21/02/2024
//Waktu Pengerjaan = 23.55 - 00.15

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import javax.swing.JOptionPane;

public class Bacakar {

    public static void main(String[] args) throws IOException {
        char cc;
        int bil;

        InputStreamReader isr = new InputStreamReader(System.in);
        BufferedReader dataIn = new BufferedReader(isr);
        BufferedReader datAIn = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("hello\n");
        System.out.print("baca 1 karakter : ");

        cc = (char) dataIn.read();

        System.out.print("baca 1 bilangan : ");
        bil = Integer.parseInt(datAIn.readLine());

        String kar = JOptionPane.showInputDialog("Karakter 1 : ");
        System.out.println(kar);

        JOptionPane.showMessageDialog(null, "hello");

        System.out.print(cc + "\n" + bil + "\n");
        System.out.print("bye \n");
    }
}

