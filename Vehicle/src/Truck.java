class Truck extends Vehicle{
    private int cargoCapacity;

    public Truck(String brand, int year, double rentalPrice, int cargoCapacity){
        super(brand, year, rentalPrice);
        this.cargoCapacity = cargoCapacity;
    }

    public int getcargoCapacity(){
        return cargoCapacity;
    }

    public void displayInfo() {
        double discount = 0.0;
        if (getcargoCapacity() >= 2000) {
            discount = 10.0 / 100;
        }

        if (getyear() < 2010) {
            discount += 0.1;
        }


        double discountPrice = getrentalPrice() * discount;
        double priceAfterDiscount = getrentalPrice() - discountPrice;

        System.out.println("Detail Truk :");
        super.displayInfo();
        System.out.println("Kapasitas Kargo : " + getcargoCapacity());
        System.out.printf("Total Diskon : %.1f%n", discountPrice);
        System.out.println("Harga sewa setelah diskon : " + priceAfterDiscount);
        System.out.println("-----------------------------------------");
    }
}