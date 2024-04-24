import java.util.ArrayList;
import java.util.List;

public class Toko {
    public enum TipeBarang {
        MEJA, KURSI, LEMARI
    }

    private List<Pembeli> antrian = new ArrayList<>();
    private Gudang gudangBarang  = new Gudang();

    public Gudang getGudangBarang() {
        return gudangBarang;
    }

    public void tambahAntrian(Pembeli pembeli) {
        antrian.add(pembeli);
        System.out.println("Berhasil menambahkan antrian");
    }

    public void selesaikanAntrian() {
        if (!antrian.isEmpty()) {
            Pembeli pembeli = antrian.get(0);
            TipeBarang tipeBarang = pembeli.getBarangBeli();
            int jumlahBarang = pembeli.getJumlahBarang();
            switch (tipeBarang) {
                case KURSI:
                    if (gudangBarang.barangTersedia(tipeBarang, jumlahBarang)) {
                        gudangBarang.keluarkanBarang(tipeBarang, jumlahBarang);
                        System.out.println(jumlahBarang + " " + tipeBarang.toString().toUpperCase() + " untuk memenuhi pesanan");
                    } else {
                        System.out.println("Tidak cukup " + tipeBarang.toString().toUpperCase() + " untuk memenuhi pesanan");
                    }
                    break;

                case MEJA:
                case LEMARI:
                    if (gudangBarang.barangTersedia(tipeBarang, jumlahBarang)) {
                        gudangBarang.keluarkanBarang(tipeBarang, jumlahBarang);
                        System.out.println(jumlahBarang + " " + tipeBarang.toString().toUpperCase() + " untuk memenuhi pesanan");
                    } else {
                        System.out.println("Tidak cukup " + tipeBarang.toString().toUpperCase() + " untuk memenuhi pesanan");
                    }
                    break;
            }
            antrian.remove(0);
            System.out.println("Antrian terdepan berhasil di selesaikan");
        } else {
            System.out.println("Antrian kosong");
        }
    }

    public void cekIsiAntrian() {
        if (!antrian.isEmpty()) {
            System.out.println("\nDaftar Antrian :");
            for (int i = 0; i < antrian.size(); i++) {
                Pembeli pembeli = antrian.get(i);
                System.out.println("Antrian ke-" + (i+1) + ", nama : " + pembeli.getNama() + ", barang di beli : " + pembeli.getBarangBeli().toString() + ", jumlah barang di beli : " + pembeli.getJumlahBarang());
            }
            System.out.println("");
        } else {
            System.out.println("\nAntrian kosong\n");
        }
    }
}