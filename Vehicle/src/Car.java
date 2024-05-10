class Car extends Vehicle{
    enum CarType{
        PREMIUM_CAR, FAMILY_CAR, CITY_CAR
    }
    private CarType carType;

    public Car(String brand, int year, double rentalPrice, CarType carType){
        super(brand, year, rentalPrice);
        this.carType = carType;
    }

    public CarType getCarType(){
        return this.carType;
    }

    public void displayinfo() {
        double discount = 0.0;
        if (carType == CarType.FAMILY_CAR) {
            discount = 5.0 / 100;
        } else if (carType == CarType.PREMIUM_CAR) {
            discount = 10.0 / 100;
        }

        if (getyear() < 2010) {
            discount += 0.1;
        }

        double discountPrice = getrentalPrice() * discount;
        double priceAfterDiscount = getrentalPrice() - discountPrice;

        System.out.println("Detail Mobil :");
        super.displayInfo();
        System.out.println("Tipe Mobil : " + getCarType());
        System.out.printf("Total Diskon : %.1f%n", discountPrice);
        System.out.println("Harga sewa setelah diskon : " + priceAfterDiscount);
        System.out.println("-----------------------------------------");
    }
}



