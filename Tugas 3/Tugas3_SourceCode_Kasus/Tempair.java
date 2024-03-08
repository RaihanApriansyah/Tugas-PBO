//NIM = 13020220014
//Nama = Raihan Apriansyah
//Hari/Tanggal = Jumat 08/03/2024
//Waktu Pengerjaan = 20.54 - 21.03

import java.util.Scanner;

public class Tempair {
    public static void main(String[] args) {
        int T;
        Scanner masukan=new Scanner(System.in);

        System.out.print ("Contoh IF tiga kasus \n"); 
        System.out.print ("Temperatur (der. C) = "); 
        T=masukan.nextInt();
        if (T < 0) {
            System.out.print ("Wujud air beku \n"+ T);
        } else if ((0 <= T) && (T <= 100)){ 
            System.out.print ("Wujud air cair \n"+ T);
        } else if (T > 100){
            System.out.print ("Wujud air uap/gas \n"+ T);
        }
    }
}
