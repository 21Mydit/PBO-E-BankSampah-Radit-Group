public class Sampah {
    String namaJenis;
    String satuan;
    double hargaPerSatuan;

    public Sampah(String namaJenis, String satuan, double hargaPerSatuan) {
        this.namaJenis = namaJenis;
        this.satuan = satuan;
        this.hargaPerSatuan = hargaPerSatuan;
    }

    public void updateHarga(double hargaBaru) {
        this.hargaPerSatuan = hargaBaru;
    }
}
