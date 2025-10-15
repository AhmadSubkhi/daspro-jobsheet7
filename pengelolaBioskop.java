import java.util.Scanner;

public class pengelolaBioskop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pelanggan, harga = 50000, tiket, totalTiket = 0, i = 0;
        double bayar, totalPendapatan = 0;

        System.out.print("Berapa pelanggan hari ini? ");
        pelanggan = sc.nextInt();
        
        while(i < pelanggan) {
            System.out.print("Pelanggan ke-" + (i + 1) + " beli berapa tiket? ");
            tiket = sc.nextInt();

            if (tiket < 0 ) {
                System.out.println("Jumlah tiket tidak valid. Masukkan ulang jumlah tiket. ");
                continue;
            }

            if (tiket > 4 && tiket <= 10) {
                bayar = harga * tiket - (harga * 0.1);
                System.out.println("=== Selamat anda mendapat diskon 10%");
            } else if (tiket > 10){
                bayar = harga * tiket - (harga * 0.15);
                System.out.println("=== Selamat anda mendapat diskon 15%");
            } else {
                bayar = harga * tiket;
            } 

            totalTiket += tiket;
            totalPendapatan += bayar;

            i++;
        }

        System.out.println();
        System.out.println("Total tiket yang terjual hari ini: " + totalTiket + " tiket");
        System.out.println("Total pendapatan tiket hari ini: Rp. " + totalPendapatan);

        sc.close();
    }
}
