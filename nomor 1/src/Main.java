public class Main {
    public static void main(String[] args) {

        Barang barang1 = new Barang("Beras", 50000, 1);
        Barang barang2 = new Barang("Sabun", 10000, 1);
        Barang barang3 = new Barang("Sampo", 5000, 1);
        Barang barang4 = new Barang("Gula", 15000, 1);

        Keranjang keranjang1 = new Keranjang();
        keranjang1.tambahBarang(barang1);
        keranjang1.tambahBarang(barang2);
        keranjang1.tambahBarang(barang3);
        keranjang1.tambahBarang(barang4);

        System.out.println("========================");

        keranjang1.printHasil();

    }
}