public class BarangElektronik extends Barang {
    private int garansiBulan;

    public BarangElektronik(String nama, int jumlahStok, double harga, int garansiBulan) {
        super(nama, jumlahStok, harga);
        this.garansiBulan = garansiBulan;
    }

    @Override
    public String getKategori() {
        return "Elektronik";
    }

    @Override
    public String toString() {
        return super.toString() + ", Garansi: " + garansiBulan + " bulan";
    }
}

