public class Pegawai {
    private String nama, jabatan;
    private char gender;
    private double gaji;
    private int cuti;
    protected String nip;

    public Pegawai(String nama, String jabatan, char gender) {
        this.nama = nama;
        this.jabatan = jabatan;
        this.gender = gender;
    }

    public void setGaji(double gaji) {
        this.gaji = gaji;
    }

    public double getGaji() {
        return gaji;
    }

    public void setCuti(int cuti) {
        this.cuti = cuti;
    }

    public void setCuti(String alasan) {
        if (alasan.equalsIgnoreCase("Pernikahan")) {
            this.cuti = 12;
        }
        else if (alasan.equalsIgnoreCase("persalinan")) {
            this.cuti = 20;
        }
        else {
            this.cuti = 10;
        }
    }

    public int getCuti() {
        return cuti;
    }

    public void setNip(String nip) {
        if (nip.startsWith("P")) {
            this.nip = nip;
        }
        else {
            System.out.println("NIP tidak valid untuk Pegawai. Harus diawali dengan 'P'.");
        }
    }

    public void setNip(int nip) {
        this.nip = String.format("P%04d", nip);
    }

    public String getNip() {
        return nip;
    }

    public String getNama() {
        return nama;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void displayinfo() {
        System.out.println("Jabatan: " + this.getClass().getSimpleName());
        System.out.println("Nama: " + getNama());
        System.out.println("Departemen: " + getJabatan());
        System.out.println("NIP: " + getNip());
        System.out.println("Gaji: " + getGaji());
        System.out.println("Gaji: " + getGaji() * 2);
        System.out.println("Cuti: " + (getCuti() + 12));
        System.out.println("===================================");
    }
}