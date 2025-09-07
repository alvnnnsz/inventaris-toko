// Barang.java
public class Barang {
    private String nama;
    private int jumlahStok;
    private double harga;

    public Barang(String nama, int jumlahStok, double harga) {
        setNama(nama);
        setJumlahStok(jumlahStok);
        setHarga(harga);
    }

    // Getter & Setter (Encapsulation)
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        if (nama == null || nama.isEmpty()) {
            this.nama = "Tanpa Nama";
        } else {
            this.nama = nama;
        }
    }

    public int getJumlahStok() {
        return jumlahStok;
    }

    public void setJumlahStok(int jumlahStok) {
        if (jumlahStok < 0) {
            this.jumlahStok = 0; // validasi stok
        } else {
            this.jumlahStok = jumlahStok;
        }
    }

    public double getHarga() {
        return harga;
    }

    public void setHarga(double harga) {
        if (harga < 0) {
            this.harga = 0;
        } else {
            this.harga = harga;
        }
    }

    // Polymorphism: bisa dioverride oleh subclass
    public String getKategori() {
        return "Umum";
    }

    @Override
    public String toString() {
        return "Nama: " + nama + 
               ", Jumlah Stok: " + jumlahStok + 
               ", Harga: " + Abstraksi.formatHarga(harga) +
               ", Kategori: " + getKategori();
    }
}
