//NIM = 13020220014
//Nama = Raihan Apriansyah
//Hari/Tanggal = Senin 04/03/2024
//Waktu Pengerjaan = 22.21 - 

import javax.swing.JOptionPane;

public class JOptiNama{
    public static void main(String[] args) {
        String nim = JOptionPane.showInputDialog("Masukkan NIM:");
        String nama = JOptionPane.showInputDialog("Masukkan nama:");
        String jurusan = JOptionPane.showInputDialog("Masukkan jurusan:");
        String fakultas = JOptionPane.showInputDialog("Masukkan fakultas:");
        
        String message = "Data yang dimasukkan:\n" +
                "NIM: " + nim + "\n" +
                "Nama: " + nama + "\n" +
                "Jurusan: " + jurusan + "\n" +
                "Fakultas: " + fakultas;
        
        JOptionPane.showMessageDialog(null, message);
    }
}
