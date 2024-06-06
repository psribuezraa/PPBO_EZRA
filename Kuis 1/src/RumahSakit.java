import java.util.ArrayList;
import java.util.List;

public class RumahSakit {
    private String nama, alamat, noTelepon;
    private List<Dokter> listDokter;
    private List<Antrian> listAntrianPasien;

    public RumahSakit(String nama, String alamat, String noTelepon) {
        this.nama = nama;
        this.alamat = alamat;
        this.noTelepon = noTelepon;
        this.listDokter = new ArrayList<>();
        this.listAntrianPasien = new ArrayList<>();
    }

    public void tambahDokter(Dokter dokter) {
        boolean sudahTerdaftar = false;
        for (Dokter d : listDokter) {
            if (d.getIdDokter().equals(dokter.getIdDokter())) {
                sudahTerdaftar = true;
                break;
            }
        }
        if (sudahTerdaftar) {
            System.out.println("DOKTER SUDAH TERDAFTAR");
        } else {
            System.out.println("SUKSES");
            listDokter.add(dokter);
        }
    }

    public void tambahAntrian(Antrian antrian) {
        listAntrianPasien.add(antrian);
    }

    public void cekListDokter() {
        if (listDokter.isEmpty()) {
            System.out.println("BELUM ADA DOKTER YANG TERSEDIA SAAT INI");
        } else {
            System.out.println("BERIKUT LIST DOKTER YANG TERSEDIA SAAT INI");
            System.out.println("=============================================");
            for (Dokter dokter : listDokter) {
                System.out.println("1. Nama Dokter : " + dokter.getNama() + "," + " Dokter spesialis : " + dokter.getSpesialisasi());
            }
        }
    }

    public void cekAntrianPasien() {
        if (listAntrianPasien.isEmpty()) {
            System.out.println("Tidak ada antrian pasien.");
        } else {
            System.out.println("Daftar Antrian Pasien:");
            for (Antrian antrian : listAntrianPasien) {
                System.out.println("- " + antrian.getNomorAntrian() + ": " + antrian.getNamaPendaftar() + " (Keluhan: "
                        + antrian.getKeluhan() + ", Dokter: " + antrian.getDokter().getNama() + ")");
            }
        }
    }

    public Dokter cariDokter(String namaDokter) {
        for (Dokter dokter : listDokter) {
            if (dokter.getNama().equalsIgnoreCase(namaDokter)) {
                return dokter;
            }
        }
        return null;
    }

    public Antrian cariAntrianPasien(String namaPasien) {
        for (Antrian antrian : listAntrianPasien) {
            if (antrian.getNamaPendaftar().equalsIgnoreCase(namaPasien)) {
                return antrian;
            }
        }
        return null;
    }

    public void selesaikanAntrian(Antrian antrian) {
        listAntrianPasien.remove(antrian);
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getNoTelepon() {
        return noTelepon;
    }

    public List<Dokter> getListDokter() {
        return listDokter;
    }

    public List<Antrian> getListAntrianPasien() {
        return listAntrianPasien;
    }
}