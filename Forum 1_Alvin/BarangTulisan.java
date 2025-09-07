public class BarangTulisan extends Barang {
    private String jenisAlatTulis;

    public BarangTulisan(String nama, int jumlahStok, double harga, String jenisAlatTulis) {
        super(nama, jumlahStok, harga);
        this.jenisAlatTulis = jenisAlatTulis;
    }

    @Override
    public String getKategori() {
        return "Alat Tulis";
    }

    @Override
    public String toString() {
        return super.toString() + ", Jenis: " + jenisAlatTulis;
    }
}

