public class Barang {
    String nama_barang;
    int hrg_barang;
    int jmlh_barang;

    Barang(String nama,int harga,int jmlh){
        this.nama_barang = nama;
        this.hrg_barang = harga;
        this.jmlh_barang = jmlh;
    }
    int totalHarga(){
        return hrg_barang * jmlh_barang;
    }
}