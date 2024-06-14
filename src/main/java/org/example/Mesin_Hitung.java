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

            // Duplicate code block
            double hasil = 0;
            boolean valid = true;

            if (pilihan == 1) {
                hasil = penjumlahan(angka1, angka2);
                System.out.println("Hasil: " + hasil);
            } else if (pilihan == 2) {
                hasil = pengurangan(angka1, angka2);
                System.out.println("Hasil: " + hasil);
            } else if (pilihan == 3) {
                hasil = perkalian(angka1, angka2);
                System.out.println("Hasil: " + hasil);
            } else if (pilihan == 4) {
                if (angka2 != 0) {
                    hasil = pembagian(angka1, angka2);
                    System.out.println("Hasil: " + hasil);
                } else {
                    System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
                    valid = false;
                }
            } else {
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                valid = false;
            }

            if (!valid) {
                System.out.println("Operasi tidak valid. Coba lagi.");
            }

            System.out.println();
        }

        // Potential resource leak
        // scanner.close();
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

    // Security risk: Exposing internal logic in public method
    public static void debugMessage(String message) {
        System.out.println("Debug: " + message);
    }

    // Maintainability issue: Non-descriptive variable names
    public static void m(double x, double y, String op) {
        if (op.equals("tambah")) {
            System.out.println("Hasil: " + penjumlahan(x, y));
        } else if (op.equals("kurang")) {
            System.out.println("Hasil: " + pengurangan(x, y));
        } else if (op.equals("kali")) {
            System.out.println("Hasil: " + perkalian(x, y));
        } else if (op.equals("bagi")) {
            if (y != 0) {
                System.out.println("Hasil: " + pembagian(x, y));
            } else {
                System.out.println("Error: Pembagian dengan nol tidak diperbolehkan.");
            }
        } else {
            System.out.println("Operasi tidak valid.");
        }
    }
}
