public class orang {
    enum JENIS_KELAMIN {
        LAKI_LAKI, PEREMPUAN
    }

    private String nama, tanggalLahir;
    private JENIS_KELAMIN jenisKelamin;

    public orang(String nama, String tanggalLahir, JENIS_KELAMIN jenisKelamin) {
        this.nama = nama;
        this.tanggalLahir = tanggalLahir;
        this.jenisKelamin = jenisKelamin;
    }

    // Getter dan Setter
    public String getNama() {
        return nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public JENIS_KELAMIN getJenisKelamin() {
        return jenisKelamin;
    }
}