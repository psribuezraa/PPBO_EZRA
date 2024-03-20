import java.util.ArrayList;
public class Keranjang {
    private ArrayList<Barang> list_barang;
    private int total_barang;
    private int jmlh_total;
    Keranjang(){
        list_barang = new ArrayList<Barang>();
        total_barang = 0;
    }
    void tambahBarang(Barang barangBaru){
        if(total_barang<5){
            list_barang.add(barangBaru);
            total_barang += barangBaru.getjmlh_barang();
            jmlh_total += barangBaru.totalHarga();
            System.out.println("Barang berhasil dimasukan keranjang");
        }
        else{
            System.out.println("Maaf keranjang penuh");
        }
    }
    void printHasil(){
        System.out.printf("Jumlah barang dalam keranjang sekarang: %d\n",total_barang);
        System.out.println("Barang pada keranjang:");
        for(Barang e:list_barang){
            System.out.printf("# %s, jumlah : %d\n",e.getnama_barang(),e.getjmlh_barang());
        }
        System.out.printf("Harga Total: %d",jmlh_total);
    }
}

