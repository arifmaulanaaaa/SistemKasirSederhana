import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Sistem Kasir Toko ===");

        System.out.println("Nama barang: ");
        String barang = input.nextLine();

        System.out.println("Harga satuan: ");
        double harga = input.nextDouble();

        System.out.println("Jumlah beli: ");
        int jumlah = input.nextInt();

        double total = harga * jumlah;
        double diskon = total * 0.5;
        double totalBayar = total - diskon;

        System.out.println("=== Struk Pembayaran ===");
        System.out.println("Item: " + barang);
        System.out.println("Harga: " + harga);
        System.out.println("Jumlah: " + jumlah);
        System.out.println("Total: " + total);
        System.out.println("Diskon: " + diskon);
        System.out.println("========================");
        System.out.println("Total bayar: " + totalBayar);

        input.close();
    }
}
