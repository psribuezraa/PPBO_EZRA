public class Barang {
    private String nama_barang;
    private int hrg_barang;
    private int jmlh_barang;

    public Barang(String nama,int harga,int jmlh){
        this.nama_barang = nama;
        this.hrg_barang = harga;
        this.jmlh_barang = jmlh;
    }

    public String getnama_barang() {
        return nama_barang;
    }

    public int getjmlh_barang() {
        return jmlh_barang;
    }

    int totalHarga(){
        return hrg_barang * jmlh_barang;
    }
}