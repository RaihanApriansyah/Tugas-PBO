//NIM = 13020220014
//Nama = Raihan Apriansyah
//Hari/Tanggal = Jumat 08/03/2024
//Waktu Pengerjaan = 20.29 - 20.37


import java.util.Scanner;

public class PrintXRepeat {
	public static void main(String[] args) {
	int Sum;
	int x;
	Scanner masukan=new Scanner(System.in);

	System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
	x = masukan.nextInt();
	if (x == 999){
		System.out.print("Kasus kosong \n");
		}else {
			Sum = 0;
			do{
				Sum = Sum + x;
				System.out.print ("Masukkan nilai x (int), akhiri dg 999 : ");
				x = masukan.nextInt();
				} while (x != 999);
				System.out.println ("Hasil penjumlahan = "+Sum);
			}
		}
}
