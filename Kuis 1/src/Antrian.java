public class Antrian {
    enum tipePasiens {
        BPJS, MANDIRI
    }

    private String nomorAntrian, namaPendaftar, keluhan;
    private Dokter dokter;
    private tipePasiens tipePasien;

    public Antrian(String nomorAntrian, String namaPendaftar, String keluhan, Dokter dokter, tipePasiens tipePasien) {
        this.nomorAntrian = nomorAntrian;
        this.namaPendaftar = namaPendaftar;
        this.keluhan = keluhan;
        this.dokter = dokter;
        this.tipePasien = tipePasien;
    }

    // Getter dan Setter
    public String getNomorAntrian() {
        return nomorAntrian;
    }

    public String getNamaPendaftar() {
        return namaPendaftar;
    }

    public String getKeluhan() {
        return keluhan;
    }

    public Dokter getDokter() {
        return dokter;
    }

    public tipePasiens getTipePasien() {
        return tipePasien;
    }
}