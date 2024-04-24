public class Pembeli {
    private String nama;
    private Toko.TipeBarang barangBeli;
    private int jumlahBarang;

    public Pembeli(String nama, Toko.TipeBarang barangBeli, int jumlahBarang ) {
        this.nama = nama;
        this.barangBeli = barangBeli;
        this.jumlahBarang = jumlahBarang;
    }

    public String getNama() {
        return nama;
    }

    public Toko.TipeBarang getBarangBeli() {
        return barangBeli;
    }

    public int getJumlahBarang() {
        return jumlahBarang;
    }
}