// Inventaris.java
public class Inventaris {
    private Barang[] daftar = new Barang[10];
    private int ukuranSaatIni = 0;

    public int getUkuranSaatIni() {
        return ukuranSaatIni;
    }

    public Barang getBarangAt(int index) {
        if (index >= 0 && index < ukuranSaatIni) {
            return daftar[index];
        }
        return null;
    }

    public void tambahBarang(Barang barang) {
        if (ukuranSaatIni < daftar.length) {
            daftar[ukuranSaatIni] = barang;
            ukuranSaatIni++;
            System.out.println("Barang berhasil ditambahkan.");
        } else {
            System.out.println("Inventaris penuh!");
        }
    }

    public void updateBarang(int index, Barang barangBaru) {
        if (index >= 0 && index < ukuranSaatIni) {
            daftar[index] = barangBaru;
            System.out.println("Barang berhasil diperbarui.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void hapusBarang(int index) {
        if (index >= 0 && index < ukuranSaatIni) {
            for (int i = index; i < ukuranSaatIni - 1; i++) {
                daftar[i] = daftar[i + 1];
            }
            daftar[ukuranSaatIni - 1] = null;
            ukuranSaatIni--;
            System.out.println("Barang berhasil dihapus.");
        } else {
            System.out.println("Index tidak valid.");
        }
    }

    public void tampilkanInventaris() {
        if (ukuranSaatIni == 0) {
            System.out.println("Inventaris kosong.");
            return;
        }
        System.out.println("=== Daftar Barang di Inventaris ===");
        for (int i = 0; i < ukuranSaatIni; i++) {
            System.out.println((i + 1) + ". " + daftar[i]);
        }
    }
}

