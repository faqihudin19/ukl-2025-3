package soal2;

import java.util.Scanner;

public class soalUKL3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan bilangan bulat positif: ");
        int n = scanner.nextInt();
        
        if (n < 0) {
            System.out.println("Bilangan harus positif.");
        } else {
            long faktorial = 1;
            for (int i = 1; i <= n; i++) {
                faktorial *= i;
            }
            System.out.println("Faktorial dari " + n + " adalah " + faktorial);
        }
        scanner.close();
    }
}
    

