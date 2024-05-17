public class Manager extends Pegawai {
    public Manager(String nama, String jabatan, char gender) {
        super(nama, jabatan, gender);
    }

    public void setNip(String nip) {
        if (nip.startsWith("M")) {
            this.nip = nip;
        }
        else {
            System.out.println("NIP tidak valid untuk Manager. Harus diawali dengan 'M'.");
        }
    }

    public void setNip(int nip) {
        this.nip = String.format("M%04d", nip);
    }

    public void displayinfo() {
        System.out.println("Jabatan: Manager");
        System.out.println("Nama: " + getNama());
        System.out.println("Departemen: " + getJabatan());
        System.out.println("NIP: " + getNip());
        System.out.println("Gaji: " + getGaji());
        System.out.println("Gaji: " + getGaji() * 2);
        System.out.println("Cuti: " + (getCuti() + 2));
        System.out.println("===================================");
    }
}