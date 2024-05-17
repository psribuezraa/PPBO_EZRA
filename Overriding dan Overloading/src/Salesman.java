public class Salesman extends Pegawai {
    private int target, penjualan;

    public Salesman(String nama, String jabatan, char gender) {
        super(nama, jabatan, gender);
    }

    public void setTarget(int target) {
        this.target = target;
    }

    public void setPenjualan(int penjualan) {
        this.penjualan = penjualan;
    }

    public void setNip(String nip) {
        if (nip.startsWith("S")) {
            this.nip = nip;
        }
        else {
            System.out.println("NIP tidak valid untuk Salesman. Harus diawali dengan 'S'.");
        }
    }

    public void setNip(int nip) {
        this.nip = String.format("S%04d", nip);
    }

    public void displayinfo() {
        System.out.println("Jabatan: Salesman");
        System.out.println("Nama: " + getNama());
        System.out.println("Departemen: " + getJabatan());
        System.out.println("NIP: " + getNip());
        System.out.println("Gaji: " + getGaji());
        System.out.println("Gaji: " + getGaji() * 2);
        System.out.println("Cuti: " + (getCuti() + 5));
        System.out.println("===================================");
    }
}