import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Inventaris inventaris = new Inventaris();
        Scanner scanner = new Scanner(System.in);

        int pilihan;
        do {
            System.out.println("\n=== MENU INVENTARIS ===");
            System.out.println("1. Tampil Data");
            System.out.println("2. Tambah Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Selesai");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine(); // flush enter

            switch (pilihan) {
                case 1:
                    inventaris.tampilkanInventaris();
                    break;

                case 2:
                    System.out.print("Masukkan nama barang: ");
                    String nama = scanner.nextLine();
                    System.out.print("Masukkan stok: ");
                    int stok = scanner.nextInt();
                    System.out.print("Masukkan harga: ");
                    double harga = scanner.nextDouble();
                    scanner.nextLine();

                    System.out.print("Jenis barang? (1. Elektronik, 2. Alat Tulis, 3. Umum): ");
                    int jenis = scanner.nextInt();
                    scanner.nextLine();

                    Barang barang;
                    if (jenis == 1) {
                        System.out.print("Garansi (bulan): ");
                        int garansi = scanner.nextInt();
                        scanner.nextLine();
                        barang = new BarangElektronik(nama, stok, harga, garansi);
                    } else if (jenis == 2) {
                        System.out.print("Jenis alat tulis: ");
                        String jenisTulis = scanner.nextLine();
                        barang = new BarangTulisan(nama, stok, harga, jenisTulis);
                    } else {
                        barang = new Barang(nama, stok, harga);
                    }
                    inventaris.tambahBarang(barang);
                    break;

                case 3:
                    inventaris.tampilkanInventaris();
                    System.out.print("Pilih nomor data yang ingin diupdate: ");
                    int idxUpdate = scanner.nextInt() - 1;
                    scanner.nextLine();

                    System.out.print("Masukkan nama baru: ");
                    String namaBaru = scanner.nextLine();
                    System.out.print("Masukkan stok baru: ");
                    int stokBaru = scanner.nextInt();
                    System.out.print("Masukkan harga baru: ");
                    double hargaBaru = scanner.nextDouble();
                    scanner.nextLine();

                    Barang barangBaru = new Barang(namaBaru, stokBaru, hargaBaru);
                    inventaris.updateBarang(idxUpdate, barangBaru);
                    break;

                case 4:
                    inventaris.tampilkanInventaris();
                    System.out.print("Pilih nomor data yang ingin dihapus: ");
                    int idxHapus = scanner.nextInt() - 1;
                    inventaris.hapusBarang(idxHapus);
                    break;

                case 5:
                    System.out.println("Terima kasih. Program selesai.");
                    break;

                default:
                    System.out.println("Pilihan tidak valid.");
            }

        } while (pilihan != 5);

        scanner.close();
    }
}
