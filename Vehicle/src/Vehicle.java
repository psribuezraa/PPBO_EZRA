public class Vehicle{
    private String brand;
    private int year;
    private double rentalPrice;

    public Vehicle(String brand, int year, double rentalPrice){
        this.brand = brand;
        this.year = year;
        this.rentalPrice = rentalPrice;
    }

    public String getbrand(){
        return brand;
    }

    public int getyear(){
        return year;
    }

    public double getrentalPrice(){
        return rentalPrice;
    }

    public void displayInfo() {
        System.out.println("Brand : " + getbrand());
        System.out.println("Year : " + getyear());
        System.out.println("Rental Price : " + getrentalPrice());
    }
}