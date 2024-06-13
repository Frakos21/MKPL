package org.example;
import java.util.Scanner;
public class Mesin_Hitung {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("==== Mesin Hitung =====");
            System.out.println("1. Penjumlahan");
            System.out.println("2. Pengurangan");
            System.out.println("3. Perkalian");
            System.out.println("4. Pembagian");
            System.out.println("5. Keluar");
            System.out.print("Pilih operasi (1-5): ");

            int pilihan = scanner.nextInt();

            if (pilihan == 5) {
                exit = true;
                System.out.println("Terima kasih telah menggunakan Mesin Hitung. Sampai jumpa!");
                continue;
            }

            System.out.print("Masukkan angka pertama: ");
            double angka1 = scanner.nextDouble();
            System.out.print("Masukkan angka kedua: ");
            double angka2 = scanner.nextDouble();

            double hasil = 0;
            boolean valid = true;

            switch (pilihan) {
                case 1:
                    hasil = penjumlahan(angka1, angka2);
                    break;
                case 2:
                    hasil = pengurangan(angka1, angka2);
                    break;
                case 3:
                    hasil = perkalian(angka1, angka2);
                    break;
                case 4:
                    if (angka2 != 0) {
                        hasil = pembagian(angka1, angka2);
                    } else {
                        System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                        valid = false;
                    }
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    valid = false;
            }

            if (valid) {
                System.out.println("Hasil: " + hasil);
            }
            System.out.println();
        }

        scanner.close();
    }

    public static double penjumlahan(double a, double b) {
        return a + b;
    }

    public static double pengurangan(double a, double b) {
        return a - b;
    }

    public static double perkalian(double a, double b) {
        return a * b;
    }

    public static double pembagian(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagian dengan nol tidak diperbolehkan.");
        }
        return a / b;
    }
}
