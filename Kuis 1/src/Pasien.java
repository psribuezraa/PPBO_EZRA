public class Pasien extends orang {
    private String pekerjaan, domisili;

    public Pasien(String nama, String tanggalLahir, JENIS_KELAMIN jenisKelamin, String pekerjaan, String domisili) {
        super(nama, tanggalLahir, jenisKelamin);
        this.pekerjaan = pekerjaan;
        this.domisili = domisili;
    }

    public void daftar(RumahSakit rumahSakit, String keluhan, String namaDokter, Antrian.tipePasiens tipePasien) {
        Dokter dokter = rumahSakit.cariDokter(namaDokter);
        if (dokter != null) {
            String nomorAntrian = dokter.getIdDokter() + "-" + (dokter.getAntrianPasien().size() + 1);
            Antrian antrian = new Antrian(nomorAntrian, this.getNama(), keluhan, dokter, tipePasien);
            rumahSakit.tambahAntrian(antrian);
            dokter.tambahAntrian(antrian);
            System.out.println("Pasien " + this.getNama() + " berhasil mendaftar ke dokter " + dokter.getNama());
        } else {
            System.out.println("Dokter " + namaDokter + " tidak ditemukan.");
        }
    }

    public void periksa(RumahSakit rumahSakit) {
        Antrian antrian = rumahSakit.cariAntrianPasien(this.getNama());
        if (antrian != null) {
            rumahSakit.selesaikanAntrian(antrian);
            antrian.getDokter().hapusAntrian(antrian);
            System.out.println("Pasien " + this.getNama() + " sudah selesai diperiksa oleh dokter "
                    + antrian.getDokter().getNama());
        } else {
            System.out.println("Pasien " + this.getNama() + " belum terdaftar di antrian.");
        }
    }

    public String getPekerjaan() {
        return pekerjaan;
    }

    public String getDomisili() {
        return domisili;
    }
}