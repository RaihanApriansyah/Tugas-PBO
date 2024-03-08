//NIM = 13020220014
//Nama = Raihan Apriansyah
//Hari/Tanggal = Jumat 08/03/2024
//Waktu Pengerjaan = 19.35 - 19.40

import java.util.Scanner;

public class PrintRepeat {
	public static void main(String[] args) {
	int N;
	int i;
	Scanner masukan=new Scanner(System.in);

	System.out.print ("Nilai N >0 = ");
	N = masukan.nextInt();
	i = 1;
	System.out.print ("Print i dengan REPEAT: \n");
	do{
		System.out.print (i+"\n");
		i++;
	}
	while (i <= N);
	}
}
